package com.github.andreyaleshin.HeadFirstJava.DotComGame;

import java.util.ArrayList;

/**
 * Класс, который представляет из себя сайт.
 * Имеет 2 переменные экземпляра: locationCells - своё местоположение в массиве (3 последовательные ячейки),
 * numOfHits - кол-во попаданий "по себе"; и 2 метода: setLocationCells - сюда из класса DotComBust случайным
 * образом приходят 3 ячейки местоположения сайта, checkYourself - проверяет кол-во попаданий по себе (попал, промазал,
 * потопил).
 */
public class DotCom {

    // Добавляем ArrayList, т.к. из него проще удалять ячйки при "Попадании" в отличие от массива
    // Переменные экземпляра класса DotCom: ArrayList с ячейками, описывающими местоположение и
    private ArrayList<String> locationCells;
    // имя сайта
    private String name;

    // Сеттер, который обновляет местоположение "сайта" (случайный адрес, предоставляемый методом
    // placeDotCom() из класса GameHelper)
    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    // Простой сеттер для имени
    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {

        // Создаём переменную для хранения результата, который будем возвращать.
        // Присваиваем по умолчанию строковое значение "Missed"
        String result = "Missed";

        // Проверяем содержится ли загаданнная пользователем ячейка внутри ArrayList,
        // запрашивая её индекс. Если да, то вернётся её местоположение.
        // Если её нет в списке, то indexOf() возвращает -1
        int index = locationCells.indexOf(userInput);

        // Если индекс больше или равен 0, то загаданная пользователем ячейка определённо находится
        // в списке, поэтому удаляем её
        if (index >= 0) {

            // Применяем метод remove() из ArrayList для удаления элемента
            locationCells.remove(index);

            // Если список пустой, значит, это было роковое попадание!
            if (locationCells.isEmpty()) {
                result = "Drowned";
                System.out.println("You have drowned " + name + "!!!");
            } else {
                result = "Hit";
            }
        }

        // Возвращаем "Missed", "Hit" or "Drowned"
        return result; // Возвращаем результат в вызывающий метод

    }
}
