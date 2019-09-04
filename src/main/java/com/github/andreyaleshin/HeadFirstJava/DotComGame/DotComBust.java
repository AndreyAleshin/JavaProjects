package com.github.andreyaleshin.HeadFirstJava.DotComGame;

import java.util.ArrayList;

/**
 * Класс, в котором представлена полная реализиция самой игры "Потопи сайт" (аналог "Морского боя").
 * Он создаёт объекты DotCom ("сайты"), получает пользовательский ввод и
 * "играет" пока все "сайты" не будут потоплены.
 */
public class DotComBust {

    // Объявляем и инициализируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    // Создаём ArrayList только для объектов DotCom
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {

        // Создадим три объекта DotCom и присвоим им имена, а затем поместим в ArrayList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // Выводим краткие инструкции для пользователя
        System.out.println("Your target is to drown 3 \"sites\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them for the minimum number of moves.");

        // Повторяем с каждым объектом DotCom в списке
        for (DotCom dotComToSet : dotComsList) {

            // Запрашиваем у вспомогательного объекта адрес "сайта"
            ArrayList<String> newLocation = helper.placeDotCom(3);

            // Вызываем сеттер из объекта DotCom, чтобы передать ему местоположение,
            // которое только что получили от вспомогательного объекта
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {

        // До тех пор пока список объектов DotCom не станет пустым
        while (!dotComsList.isEmpty()) {

            // Получаем пользовательский ввод
            String userGuess = helper.getUserInput("Do your move: ");

            // Вызываем наш метод checkUserGuess
            checkUserGuess(userGuess);
        }
        finishGame(); // Вызываем наш метод finishGame для подведения итогов
    }

    private void checkUserGuess(String userGuess) {

        // Инкрементируем кол-во попыток, которые сделал пользователь
        numOfGuesses++;

        // Подразумеваем промах, пока не выяснили обратного
        String result = "Missed";

        // Повторяем это для всех объектов DotCom в списке
        for (DotCom dotComToTest : dotComsList) {

            // Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Hit")) {
                // Выбираемся из цикла раньше времени, нет смысла проверять другие "сайты"
                break;
            }
            if (result.equals("Drowned")) {
                // В "сайт" попали 3 раза, так что удаляем его из списка
                // и выходим из цикла
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        // Выводим для пользователя результат
        System.out.println(result);
    }

    private void finishGame() {

        // Выводим сообщение о том, что пользователь прошёл игру
        System.out.println("All the \"sites\" are gone to the bottom! " +
                "Your shares are now worth nothing.");

        if (numOfGuesses <= 18) {
            System.out.println("It took you only " + numOfGuesses + " attempts.");
            System.out.println("You managed to get out before your investments got sunk.");
        } else {
            System.out.println("It took you a lot of time. " + numOfGuesses + " attempts.");
            System.out.println("Now your investments are deep in the ocean.");
        }
    }

    public static void main(String[] args) {

        // Создаём игровой объект
        DotComBust game = new DotComBust();

        // Говорим игровому объекту подготовить игру
        game.setUpGame();

        // Говорим игровому объекту начать главный игровой цикл (продолжаем запрашивать
        // пользовательский ввод и проверять полученные данные)
        game.startPlaying();

    }
}
