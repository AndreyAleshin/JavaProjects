//package com.brainacad.andreyaa.headFirstJava.QuizCards;
//
//import java.util.*;
//import java.awt.event.*;
//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//
///**
// * Класс для вывода на экран GUI для "постройки" (создания и сохранения) вопросов-ответов на флеш-картах,
// * включая создание и регистрацию слушателей для событий.
// * Head First (c. 480)
// */
//public class QuizCardBuilder {
//
//    private JTextArea question;
//    private JTextArea answer;
//    private ArrayList<QuizCard> cardList;
//    private JFrame frame;
//
//
//    public static void main(String[] args) {
//        QuizCardBuilder builder = new QuizCardBuilder();
//        builder.go();
//    }
//
//    public void go() {
//
//        // Формируем GUI
//        frame = new JFrame("Quiz Card Builder");
//        JPanel mainPanel = new JPanel();
//        Font bigFont = new Font("sanserif", Font.BOLD, 24);
//
//        question = new JTextArea(6, 20);
//        question.setLineWrap(true);
//        question.setWrapStyleWord(true);
//        question.setFont(bigFont);
//
//        JScrollPane qScroller = new JScrollPane(question);
//        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//        answer = new JTextArea(6, 20);
//        answer.setLineWrap(true);
//        answer.setWrapStyleWord(true);
//        answer.setFont(bigFont);
//
//        JScrollPane aScroller = new JScrollPane(answer);
//        aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//
//        JButton nextButton = new JButton("Next Card");
//
//        cardList = new ArrayList<QuizCard>();
//
//        JLabel qLabel = new JLabel("Question");
//        JLabel aLabel = new JLabel("Answer");
//
//        mainPanel.add(qLabel);
//        mainPanel.add(qScroller);
//        mainPanel.add(aLabel);
//        mainPanel.add(aScroller);
//        mainPanel.add(nextButton);
//
//        nextButton.addActionListener(new NextCardListener());
//
//        /*
//        Мы создаём объект JMenuBar и добавляем в него меню File с пунктами New и Save. Затем
//        говорим главной панели, что она должна использовать JMenuBar. Пункты меню могут запускать
//        ActionEvent.
//         */
//        JMenuBar menuBar = new JMenuBar();
//        JMenu fileMenu = new JMenu("File");
//        JMenuItem newMenuItem = new JMenuItem("New");
//        JMenuItem saveMenuItem = new JMenuItem("Save");
//
//        newMenuItem.addActionListener(new NewMenuListener());
//        saveMenuItem.addActionListener(new SaveMenuListener());
//
//        fileMenu.add(newMenuItem);
//        fileMenu.add(saveMenuItem);
//        menuBar.add(fileMenu);
//
//        frame.setJMenuBar(menuBar);
//        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
//        frame.setSize(500, 600);
//        frame.setVisible(true);
//
//    }
//
//    /*
//    Добавляем текущую карточку в список и очищаем текстовые области. Срабатывает при нажатии
//    пользователем кнопки Next Card.
//     */
//    public class NextCardListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ev) {
//
//            QuizCard card = new QuizCard(question.getText(), answer.getText());
//            cardList.add(card);
//            clearCard();
//
//        }
//
//    }
//
//    /*
//    Очищаем список карточек и тектовые области. Запускается при выборе команды New (создать) из
//    меню File. Означает, что пользователь хочет создать новый набор.
//     */
//    public class NewMenuListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ec) {
//
//            cardList.clear();
//            clearCard();
//
//        }
//    }
//
//    /*
//    Вызываем диалоговое окно, позволяющее пользователю называть и сохранять набор. Запускается
//    при выборе команды Save из меню File. Означает, что пользователь хочет сохранить все карточки
//    в текущем списке в виде набора (например, набор карточек о квантовой механике, небольшие факты
//    про Голливуд, правила языка Java и т.д.)
//     */
//    public class SaveMenuListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent ev) {
//
//            QuizCard card = new QuizCard(question.getText(), answer.getText());
//            cardList.add(card);
//
//            /*
//            Вызывается диалоговое окно, и программа останавливается на этой строке, пока
//            пользователь не выберет меню Save. Всю навигацию, выбор файла и т.д. за вас выполняет
//            класс JFileChooser.
//             */
//            JFileChooser fileSave = new JFileChooser();
//            fileSave.showSaveDialog(frame);
//            saveFile(fileSave.getSelectedFile());
//
//        }
//
//    }
//
//    /*
//    Очистка текстовых областей.
//     */
//    private void clearCard() {
//
//        question.setText("");
//        answer.setText("");
//        question.requestFocus();
//
//    }
//
//    /*
//    Метод, который непосредственно записывает файл (вызывается обработчиком событий класса Save-
//    MenuListener). Аргумент - это объект File, который сохраняется пользователем.
//     */
//    private void saveFile(File file) {
//
//        try {
//
//            // Мы соединяем BufferedWriter с новым FileWriter для более эффективной записи.
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//
//            /*
//            Пробегаем через ArrayList с карточками и записываем их по одной на строку, разделяя
//            вопрос и ответ символом "/" и в конце добавляя символ новой строки "\n".
//             */
//            for (QuizCard card : cardList) {
//                writer.write(card.getQuestion() + "/");
//                writer.write(card.getAnswer() + "\n");
//            }
//            writer.close();
//        } catch (IOException ex) {
//            System.out.println("Couldn't write the cardList out");
//            ex.printStackTrace();
//        }
//    }
//
//}
