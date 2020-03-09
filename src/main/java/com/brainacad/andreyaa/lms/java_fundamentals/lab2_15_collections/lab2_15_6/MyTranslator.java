package com.brainacad.andreyaa.lms.java_fundamentals.lab2_15_collections.lab2_15_6;

import java.util.*;

class MyTranslator {

    private HashMap<String, String> dictionary = new HashMap<>();

    void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    String translate(String en) {
        return dictionary.get(en);
    }

}


class Main {

    public static void main(String[] args) {

        MyTranslator translator = new MyTranslator();

        translator.addNewWord("cat", "кот");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("mouse", "мышь");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово или предложение:");
        String word = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(word);
        List<String> strings = new ArrayList<>();

        while (stringTokenizer.hasMoreElements()) {
            strings.add((String) stringTokenizer.nextElement());
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(translator.translate(iterator.next()) + " ");
        }

    }

}
