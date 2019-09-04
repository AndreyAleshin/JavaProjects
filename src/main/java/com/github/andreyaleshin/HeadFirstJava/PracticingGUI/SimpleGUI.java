package com.github.andreyaleshin.HeadFirstJava.PracticingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // оператор импорта для пакета, в котором хранятся ActionListener и ActionEvent

/**
 * Простой класс для ознакомления с графическим пользовательским интерфейсом посредством Swing.
 * Head First (с. 383).
 */
public class SimpleGUI {

    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {

        SimpleGUI gui = new SimpleGUI();
        gui.go();

    }

    public void go() {

        /*
        Создаём фрейм и кнопку. Передаём конструктору кнопки текст, который будет на ней
        отображаться.
         */
        frame = new JFrame();
        label = new JLabel("I'm a new label!");

        /*
        Кнопка будет передавать события только тем, кто реализует ActionListener.
        Регистрируем нашу заинтересованность в кнопке. Код говорит кнопке: "Добавь меня
        к своему списку слушателей". Передаваемый аргумент ДОЛЖЕН быть объектом класса,
        реализуемого ActionListener.
         */
        JButton labelButton = new JButton("Change label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change circle");
        colorButton.addActionListener(new ColorListener());

        MyDrawPanel drawPanel = new MyDrawPanel();

        /*
        Добавляем кнопки на панель фрейма.
         */
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label); // изменяющаяся надпись

        /*
        Эта строка завершает работу программы при закрытии окна (если не добавите её, то
        приложение будет "висеть" на экране вечно).
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
        Присваиваем фрейму размер в пикселях.
         */
        frame.setSize(600, 600);

        /*
        И наконец делаем фрейм видимым (если вы пропустите этот шаг, то, выполнив данный код,
        ничего не увидите).
         */
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener {

        /*
        Реализуем метод actionPerformed() интерфейса ActionListener во внутреннем классе.
        Это фактический метод обработки событий!
        */
        public void actionPerformed(ActionEvent event) {

            /* Кнопка вызывает этот метод, чтобы известить о наступлении события. Она
             отправляет объект ActionEvent как аргумент, но он нам не нужен. Достаточно знать,
             что событие произошло.
             */
            label.setText("Ouch!");

        }
    }

    class ColorListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }

    }
}

class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

//        // Depicting orange rectangle
//        g.setColor(Color.orange);
//        g.fillRect(20, 50, 100, 100);
//
//        // Depicting JPEG image
//        Image image = new ImageIcon("D:\\Pictures\\Mirror's Edge\\1.png").getImage();
//        g.drawImage(image, 3, 4, this);

//        // Drawing a circle of arbitrary color on a black background
//        g.fillRect(0,0,this.getWidth(),this.getHeight());
//
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);

        // Depicting a circle with a random color gradient (using Graphics2D)
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // black background

        GradientPaint gradient = new GradientPaint(150, 150, startColor,
                250, 250, endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(100, 100, 200, 200);

    }

}
