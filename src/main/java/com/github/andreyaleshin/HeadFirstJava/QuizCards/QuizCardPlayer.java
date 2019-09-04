//package com.brainacad.andreyaa.headFirstJava.QuizCards;
//
//import java.util.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//
///**
// * Игровой движок, который будет загружать набор флеш-карт и разыгрывать их для пользователя.
// * Head First (c. 486)
// */
//public class QuizCardPlayer {
//
//    private JTextArea display;
//    private JTextArea answer;
//    private ArrayList<QuizCard> cardList;
//    private QuizCard currentCard;
//    private int currentCardIndex;
//    private JFrame frame;
//    private JButton nextButton;
//    private boolean isShowAnswer;
//
//
//    public static void main(String[] args) {
//        QuizCardPlayer reader = new QuizCardPlayer();
//        reader.go();
//    }
//
//    public void go() {
//
//        // Формируем GUI
//        frame = new JFrame("Quiz Card Player");
//        JPanel mainPanel = new JPanel();
//        Font bigFont = new Font("sanserif", Font.BOLD, 24);
//
//        display = new JTextArea(10, 20);
//        display.setFont(bigFont);
//        display.setLineWrap(true);
//        display.setWrapStyleWord(false);
//
//        JScrollPane qScroller = new JScrollPane(display);
//        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//        nextButton = new JButton("Show Question");
//
//        mainPanel.add(qScroller);
//        mainPanel.add(nextButton);
//
//        nextButton.addActionListener(new NextCardListener());
//
//        JMenuBar menuBar = new JMenuBar();
//        JMenu fileMenu = new JMenu("File");
//        JMenuItem loadMenuItem = new JMenuItem("Load card set");
//
//        loadMenuItem.addActionListener(new OpenMenuListener());
//        fileMenu.add(loadMenuItem);
//        menuBar.add(fileMenu);
//
//        frame.setJMenuBar(menuBar);
//        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
//        frame.setSize(640, 500);
//        frame.setVisible(true);
//
//    }
//
//    public class NextCardListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ev) {
//
//            /*
//            Проверяем значение флага isShowAnswer, чтобы узнать, что сейчас отображается -
//            вопрос или ответ, и в завис-ти от рез-та выполняем соотв-щие действия.
//             */
//            if (isShowAnswer) {
//
//                // Показываем ответ, т.к. вопрос уже был увиден
//                display.setText(currentCard.getAnswer());
//                nextButton.setText("Next Card");
//                isShowAnswer = false;
//
//            } else {
//
//                // Показываем следующий вопрос
//                if (currentCardIndex < cardList.size()) {
//                    showNextCard();
//                } else {
//
//                    // Больше карточек нет!
//                    display.setText("That was the last card");
//                    nextButton.setEnabled(false);
//
//                }
//
//            }
//
//        }
//
//    }
//
//    public class OpenMenuListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ev) {
//
//            JFileChooser fileOpen = new JFileChooser();
//            fileOpen.showOpenDialog(frame);
//            loadFile(fileOpen.getSelectedFile());
//
//        }
//
//    }
//
//    /*
//    Вызываем файловое окно, позволяющее выбирать файл для открытия.
//     */
//    private void loadFile(File file) {
//
//        cardList = new ArrayList<QuizCard>();
//
//        try {
//
//            /*
//            Создаём BufferedReader, связанный с новым FileReader. Предоставляем объекту FileReader
//            объект File, выбранный пользователем в окне открытия файла.
//             */
//            BufferedReader reader = new BufferedReader(new FileReader(file));
//
//            String line = null;
//
//            /*
//            Читаем по одной строке за один раз, передавая рез-т в метод makeCard(), который разделяет
//            его и преобразует в настоящий объект QuizCard, а затем добавляет в ArrayList.
//             */
//            while ((line = reader.readLine()) != null) {
//                makeCard(line);
//            }
//
//            reader.close();
//
//        } catch (Exception ex) {
//
//            System.out.println("Couldn't read the card file");
//            ex.printStackTrace();
//
//        }
//
//        // Пришло время показать первую карточку
//        showNextCard();
//
//    }
//
//    private void makeCard(String lineToParse) {
//
//        /*
//        Каждая строка текста соответствует одной флеш-карте, но нам нужно разделить вопрос и ответ.
//        Для этого исп-ем метод split() из класса String, который разбивает строку на 2 лексемы (одна
//        для вопроса и одна для ответа).
//         */
//        String[] result = lineToParse.split("/");
//
//        QuizCard card = new QuizCard(result[0], result[1]);
//
//        cardList.add(card);
//        System.out.println("Made a card");
//
//    }
//
//    private void showNextCard() {
//
//        currentCard = cardList.get(currentCardIndex);
//        currentCardIndex++;
//
//        display.setText(currentCard.getQuestion());
//
//        nextButton.setText("Show answer");
//
//        isShowAnswer = true;
//
//    }
//
//
//}
