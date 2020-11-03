package com.myCompany;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> books = new LinkedList<>();

        books.add("Чайка по имени Джонатан Ливингстон");
        books.add("Иллюзии");
        books.add("Хакеры сновидений");
        books.add("Таймменеджмент");
        books.add("Мастер и Маргарита");

        books.addFirst(books.getFirst());
        books.addLast(books.getLast());

        books.removeFirstOccurrence(books.getFirst());
        books.removeLastOccurrence(books.getLast());

        for (String book : books){
            System.out.println(book);
        }
    }
}
