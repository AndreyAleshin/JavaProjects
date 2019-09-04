package com.github.andreyaleshin.HeadFirstJava.CollectionsAndGenerics;

class Song implements Comparable<Song> {

    /*
    Четыре переменные эеземпляра для четырёх атрибутов песни, получаемых из файла.
     */
    String title;
    String artist;
    String rating;
    String bpm;

    /*
    HashSet (или кто-нибудь ещё, кто вызывет этот метод) передаёт сюда другой объект Song.
    title - это строка, а у строки есть переопределённый метод equals(). Нужно лишь спросить
    у переменной title, совпадает ли её значение с названием переданной песни.
     */
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    /*
    Здесь то же самое... Класс String содержит переопределённый метод hashCode(), поэтому вы просто
    можете вызвать его из переменной title и вернуть рез-т. hashCode() и equals() используют одну переменную.
     */
    public int hashCode() {
        return title.hashCode();
    }

    /*
    Метод sort() передаёт объект Song в compareTo(), чтобы увидеть, как тот соотносится
    с экземпляром Song, из которого вызван метод. Мы лишь перекладывем всю работу на объеты
    String, представляющие собой переменные title, т.к. знаем, что у String есть метод compareTo().
     */
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    Song(String title, String artist, String rating, String bpm) {

        /*
        Переменные, которые передаются в конструктор при создании нового объекта Song.
         */
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;

    }

    // Геттеры для 4-х атрибутов
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    /*
    Переопределяем toString(), потому что при вызове System.out.println(aSongObject) хотим
    увидеть название песни и исполнителя. Этот вызов происходит при выводе каждого элемента
    списка.
     */
    @Override
//    public String toString() {
//        return title + "/" + artist;
//    }
    public String toString() {
        return title;
    }

}
