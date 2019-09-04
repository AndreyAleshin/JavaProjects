package com.github.andreyaleshin.HeadFirstJava.CollectionsAndGenerics;

import java.util.*;
import java.io.*;

/**
 * Класс сортирует имена песен и исполнителей в алфавитном порядке (названия песен и исполнителей
 * находятся в текстовом файле SongList.txt в пакете с данным классом).
 * Head First (c. 561).
 */
public class JukeBox {


    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox().go();
    }

//    /*
//    Создаём вложенный класс, реализующий Comparator (тип параметра совпадает с типом, который мы
//    собираемся сравнивать: в данном случае это Song).
//     */
//    class ArtistComparator implements Comparator<Song> {
//
//        public int compare(Song one, Song two) {
//
//            /*
//            Перекладывем всю работу по сравнению на строковые объекты, т.к. они уже умеют сортироваться
//            в алфавитном порядке.
//             */
//            return one.getArtist().compareTo(two.getArtist());
//        }
//
//    }

    public void go() {

        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        /*
        Создаём экземпляр TreeSet вместо HashSet. Вызов конструктора без аргументов означает, что для сортировки
        будут использоваться методы compareTo() из каждого элемента. Но мы можем передать Comparator. Можно
        добавить все песни из HashSet с помощью метода addAll(). Допустимо также добавлять каждую песню
        отдельно, используя вызов songSet(), как мы это делали с ArrayList.
         */
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);

//        /*
//        HashSet используется даюбы избежать дубликатов.
//         */
//        HashSet<Song> songSet = new HashSet<Song>();
//
//        /*
//        Метод, который принимает другую коллекцию и использует её, чтобы заполнить HashSet. Результат такой
//        же, как и при добавлении каждый песни отдельно (только намного проще).
//         */
//        songSet.addAll(songList);
//        System.out.println(songList);
//
////        /*
////         Создаём экземпляр вложенного класса Comparator. Вызываем метод sort(), передаём ему список и
////         ссылку на новый объект Comparator.
////         */
////        ArtistComparator artistComparator = new ArtistComparator();
////        Collections.sort(songList, artistComparator);
////        System.out.println(songList);

    }

    void getSongs() {

        try {

            File file = new File("D:\\PROGRAMMING\\Brain Academy\\Java Development\\" +
                    "Projects\\JavaProjects\\src\\main\\java\\com\\brainacad\\andreyaa\\HeadFirstJava\\" +
                    "CollectionsAndGenerics\\SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    void addSong(String lineToParse) {

        String[] tokens = lineToParse.split("/");

        /*
        Создаём новый объект Song с помощью четырёх лексем (4 составляющие каждой стоки файла, содержащие
        информацию о песне), затем добавляем этот объект в список.
         */
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);

    }

}
