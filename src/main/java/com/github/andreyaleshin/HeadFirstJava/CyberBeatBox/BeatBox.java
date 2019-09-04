package com.github.andreyaleshin.HeadFirstJava.CyberBeatBox;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.event.*;

/**
 * Класс, который представляет собой некое подобие проигрываетля, где можно задать и
 * проиграть мелодию.
 * Head First (c.450, 680)
 */
public class BeatBox {

    JFrame theFrame;
    JPanel mainPanel;
    JList incomingList;
    JTextField userMessage;
    ArrayList<JCheckBox> checkboxList; // Храним флажки в массиве ArrayList
    int nextNum;
    Vector<String> listVector = new Vector<String>();
    String userName;
    ObjectOutputStream out;
    ObjectInputStream in;
    HashMap<String, boolean[]> otherSeqsMap = new HashMap<String, boolean[]>();

    Sequencer sequencer;
    Sequence sequence;
    Sequence mySequence = null;
    Track track;

    /*
    Это названия инструментов в виде строкового массива, предназначенные для создания меток
    в пользовательском интерфейсе (на каждый ряд).
     */
    String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare",
            "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga",
            "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open High Conga"};

    /*
    Эти числа представляют собой фактические барабанные клавиши. Канал барабана - это что-то
    вроде фортепиано, только каждая клавиша на нём - отдельный барабан. Номер 35 - это клавиша для
    Bass drum, а 42 - Closed Hi-Hat и т.д.
     */
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};


    public static void main(String[] args) {

        /*
        Используем аргумент командной строки в качестве имени, которое будет выводится на экране
         */
        new BeatBox().startUp("Anker"); // args[0] - пользовательский идентификатор (отображаемое имя)
    }

    public void startUp(String name) {

        userName = name;

        /*
        Открывем соединение с сервером. Настройка сети и ввода/вывода, создание и запуск потока для
        чтения сообщений.
         */
        try {

            Socket socket = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            Thread remote = new Thread(new RemoteReader());
            remote.start();

        } catch (Exception ex) {
            System.out.println("Couldn't connect - you'll have to play alone.");
        }

        setUpMidi();
        buildGUI();

    }

    public void buildGUI() {

        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkboxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);


        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton sendIt = new JButton("Send It");
        sendIt.addActionListener(new MySendListener());
        buttonBox.add(sendIt);

//        JButton restore = new JButton("Restore");
//        restore.addActionListener(new MyReadInListener());
//        buttonBox.add(restore);

        userMessage = new JTextField();
        buttonBox.add(userMessage);

        /*
        JList - компонент, где отображаются входящие сообщения, которые можно выбирать из списка,
        а не только просматривать. Благодаря этому можно загружать и воспроизводить прикрепляемые к
        ним музыкальные шаблоны.
         */
        incomingList = new JList();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        incomingList.setListData(listVector); // Нет начальных данных

        Box nameBox = new Box(BoxLayout.Y_AXIS);

        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);

        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        /*
        Создаём флажки и присваиваем им значения false (чтобы они не были установлены),
        а затем добавляем их в массив ArrayList и на панель.
         */
        for (int i = 0; i < 256; i++) {

            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);

        }

        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);

    }

    public void setUpMidi() {

        // Midi-код для получения синтезатора секвенсора и дорожки.
        try {

            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
    Преобразуем состояния флажков в MIDI-события и добавляем
    их на дорожку.
     */
    public void buildTrackAndStart() {

        /*
        Создаём ArrayList из 16 элементов, чтобы хранить значения для каждого инструмента
        на все 16 тактов.
         */
        ArrayList<Integer> trackList = null;

        // Избавляемся от старой дорожки и создаём новую
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        /*
        Делаем это для каждого из 16 рядов (т.е. для Bass, Congo и т.д.)
         */
        for (int i = 0; i < 16; i++) {

            trackList = new ArrayList<Integer>();

            // Делаем это для каждого такта текущего ряда
            for (int j = 0; j < 16; j++) {

                JCheckBox jc = (JCheckBox) checkboxList.get(j + (16 * i));

                /*
                Установлен ли флажок на этом такте? Если да, то помещаем значение клавиши в
                текущую ячеёку массива (ячейку, которая представляет такт). Если нет, то
                инструмент не должен играть в этом такте, поэтому присвоем ему 0.
                 */
                if (jc.isSelected()) {

                    /*
                    Задаём клавиш, которая представляеи инструмент (Bass, Hi-hat и т.д.).
                    Массив содержит MIDI-числа для каждого инструмента.
                    */
                    int key = instruments[i];
                    trackList.add(key);

                } else {
                    trackList.add(null); // Этот слот в треке должен быть пустым
                }
            }

            /*
            Для этого инструмента и для всех 16 тактов создаём события и добавляем
            их на дорожку.
             */
            makeTracks(trackList);
            //track.add(makeEvent(176, 1, 127, 0, 16));

        }

        /*
        Мы всегда должны быть уверены, что событие на 16 такте существует (они идут от 0 до 15).
        Иначе BeatBox может не пройти все 16 тактов, перед тем как заново начнёт последовательность
         */
        track.add(makeEvent(192, 9, 1, 0, 15));

        try {

            sequencer.setSequence(sequence);

            /*
            Позволяет задать кол-во повторений цикла или, как в этом случае,
            непрерывный цикл.
             */
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);

        } catch (Exception e) {  // Теперь мы проигрываем мелодию!
            e.printStackTrace();
        }

    }


    // Внутренние классы-слушатели для кнопок
    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            buildTrackAndStart();
        }
    }

    public class MyStopListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            sequencer.stop();
        }
    }

    public class MyUpTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {

            float tempoFactor = sequencer.getTempoFactor();

            /*
            Коэффициент темпа определяет темп синтезатора. По умолчанию он равен 1.0,
            поэтому щелчком кнопки мыши можно изменить его на +/- 3%.
             */
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));

        }
    }

    public class MyDownTempoListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {

            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));

        }
    }

    public class MySendListener implements ActionListener {

        // Всё это происходит при нажатии кнопки, после чего срабатывает ActionEvent
        public void actionPerformed(ActionEvent a) {

            // Создаём булев массив для хранения состояния каждого флажка
            boolean[] checkboxState = new boolean[256];

            /*
            Пробегаем через checkboxList (ArrayList, содержащий состояния флажков), считываем
            состояния и добавляем полученные значения в булев массив.
             */
            for (int i = 0; i < 256; i++) {

                JCheckBox check = (JCheckBox) checkboxList.get(i);

                if (check.isSelected()) {
                    checkboxState[i] = true;
                }

            }

            /*
            Здесь всё похоже на SimpleChatClient, но есть и кое-что новое: вместо отправки строкового
            сообщения мы сериализовываем два объекта (строковое сообщение и музыкальный шаблон) и
            записываем их в исходящий поток сокета (на сервер).
             */
            String messageToSend = null;
            try {

                out.writeObject(userName + nextNum++ + ": " + userMessage.getText());
                out.writeObject(checkboxState);

            } catch (Exception ex) {
                System.out.println("Sorry dude. Couldn't send it to the server.");
            }
            userMessage.setText("");

        }

    }

    public class MyListSelectionListener implements ListSelectionListener {

        /*
        ListSelectionListener срабатывает, когда пользователь выбирает сообщения из списка. При
        этом мы сразу загружаем соответствующий музыкальный шаблон (хранящийся в переменной otherSeqsMap
        типа HashMap) и указывем проигрывать его. Добавили несколько условий if из-за особенностей,
        связанных с получением событий ListSelectionListener.
         */
        public void valueChanged(ListSelectionEvent le) {

            if (!le.getValueIsAdjusting()) {
                String selected = (String) incomingList.getSelectedValue();

                if (selected != null) {

                    // Переходим к отображению и изменяем последовательность
                    boolean[] selectedState = (boolean[]) otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    buildTrackAndStart();

                }

            }

        }

    }

    public class RemoteReader implements Runnable {

        /*
        Задача потока - читать данные, присылаемые сервером. В этом коде под данными понимаются
        два сериализованных объекта: строковое сообщение и музыкальная последовательность (ArrayList
        с состоянием флажков).
         */
        boolean[] checkboxState = null;
        String nameToShow = null;
        Object obj = null;

        /*
        Когда приходит сообщение, мы считываем (десериализовываем) два объекта (само сообщение и ArrayList
        с булевыми состояниями флажков) и добавляем полученный результат в компонент JList. Добавление
        происходит в 2 этапа: помещаем данные списка в объект Vector (устаревший аналог ArrayList), а
        затем используем его в качестве источника, который говорит JList, что именно нужно отображать.
         */
        public void run() {

            try {

                while ((obj = in.readObject()) != null) {
                    System.out.println("Got an object from server");
                    System.out.println(obj.getClass());
                    String nameToShow = (String) obj;
                    checkboxState = (boolean[]) in.readObject();
                    otherSeqsMap.put(nameToShow, checkboxState);
                    listVector.add(nameToShow);
                    incomingList.setListData(listVector);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }

    public class MyPlayMineListener implements ActionListener {

        /*
        Этот метод вызывется, когда пользователь выбирает пункт из списка. Мы немедленно
        устанавливаем выбранный шаблон.
         */
        public void actionPerformed(ActionEvent a) {
            if (mySequence != null) {
                sequence = mySequence; // Восстановление до оригинальной последовательности
            }
        }

    }

    public void changeSequence(boolean[] checkboxState) {

        for (int i = 0; i < 256; i++) {
            JCheckBox check = (JCheckBox) checkboxList.get(i);
            if (checkboxState[i]) {
                check.setSelected(true);
            } else {
                check.setSelected(false);
            }
        }

    }

//    public class MyReadInListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent a) {
//
//            boolean[] checkboxState = null;
//
//            try {
//
//                FileInputStream fileIn = new FileInputStream(new File("Checkbox.ser"));
//                ObjectInputStream is = new ObjectInputStream(fileIn);
//
//                /*
//                Считываем объект из файла и определяем его как булев массив (readObject() возвр-ет
//                ссылку на тип Object).
//                 */
//                checkboxState = (boolean[]) is.readObject();
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//
//            /*
//            Теперь восстанавливаем состояние каждого флажка в ArrayList, содержащий объекты JCheckBox
//            (checkboxList).
//             */
//            for (int i = 0; i < 256; i++) {
//
//                JCheckBox check = (JCheckBox) checkboxList.get(i);
//
//                if (checkboxState[i]) {
//                    check.setSelected(true);
//                } else {
//                    check.setSelected(false);
//                }
//
//            }
//
//            /*
//            Здесь мы останавливаем проигрывание мелодии и восстанавливаем посл-то, используя
//            новые состояния флажков в ArrayList.
//             */
//            sequencer.stop();
//            buildTrackAndStart();
//
//        }
//
//    }


    /*
    Метод создаёт события для одного инструмента за каждый проход цикла для всез 16 тактов.
    Можно получить int[] для Bass drum, и каждый элемент массива будет содержать либо клавишу
    этого инструмента, либо ноль. Если это ноль, то инструмент не должен играть на текущем такте.
    Иначе нужно создать событие и добавить его в дорожку.
     */
    public void makeTracks(ArrayList<Integer> list) {

        Iterator it = list.iterator();

        for (int i = 0; i < 16; i++) {

            Integer num = (Integer) it.next();

            if (num != null) {

                // Создаём события включения и выключения и добавляем их в дорожку
                int numKey = num.intValue();
                track.add(makeEvent(144, 9, numKey, 100, i));
                track.add(makeEvent(128, 9, numKey, 100, i + 1));
            }

        }

    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {

        MidiEvent event = null;

        try {

            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return event;
    }


}
