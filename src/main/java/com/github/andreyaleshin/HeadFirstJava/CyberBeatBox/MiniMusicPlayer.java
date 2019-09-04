package com.github.andreyaleshin.HeadFirstJava.CyberBeatBox;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer {

    static JFrame f = new JFrame("My first musical clip");
    static MyDrawPanel myDrawPanel;

    public static void main(String[] args) {
        MiniMusicPlayer mini = new MiniMusicPlayer();
        mini.go();
    }

    public void setUpGui() {
        myDrawPanel = new MyDrawPanel();
        f.setContentPane(myDrawPanel);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

    public void go() {
        setUpGui();

        try {

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            /*
            Регистрируем события синтезатором. Метод, отвечающий за регистрацию, принимает объект
            слушателя и целочисленный массив, представляющий собой список событий ControllerEvent,
            которые нам нужны. Нас интересует только одно событие - *127.
             */
            sequencer.addControllerEventListener(myDrawPanel, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i += 4) {
                r = (int) ((Math.random() * 50) + 1);

                track.add(makeEvent(144, 1, r, 100, i));

                track.add(makeEvent(176, 1, 127, 0, i));

                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(250);
            sequencer.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

//    /*
//    Метод обратботки события (из интрефейса слушателя события ControllerEvent). При каждом получении
//    события мы пишем в комндной строке слово "ля".
//     */
//    public void controlChange(ShortMessage event) {
//        System.out.print("ля ");
//    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {

        MidiEvent event = null;

        try {

            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {
        }

        return event;

    }

    /*
    Панель для рисованя - слушатель.
     */
    class MyDrawPanel extends JPanel implements ControllerEventListener {

        /*
        Присваиваем флагу значение Ложь и будем устанавливать Правда,
        когда получим событие.
         */
        boolean msg = false;

        public void controlChange(ShortMessage event) {

            /*
            Получили событие, поэтому присваиваем флагу значение Правда
            и вызываем repaint().
             */
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {

            /*
            Мы должны исп-ть флаг, потому что другие объекты могут запустить repaint(),
            а мы хотим рисовать только тогда, когда произойдёт событие ControllerEvent.
             */
            if (msg) {

                Graphics2D g2 = (Graphics2D) g;

                // Код для генерации случайного цвета и рисования полупроизвольного прямоугольника
                int r = (int) (Math.random() * 255);
                int gr = (int) (Math.random() * 255);
                int b = (int) (Math.random() * 255);

                g.setColor(new Color(r, gr, b));

                int ht = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x, y, ht, width);

                msg = false;

            }

        }

    }
}
