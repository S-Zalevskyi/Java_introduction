package arrays;

import javax.swing.*;
import java.util.SplittableRandom;

public class Exercise2 {

    public static void main(String[] args) {
        String[] names = new String[]{
                "Ala",
                "Ola",
                "Andrzej",
                "Brumhilda",
                "Dozydar",
                "Gniewomir",
                "Slawomir",
                "Mscislaw",
                "Stanislaw",
                "Bronislaw",
                "Wiercislaw",
                "Pietronela",
                "Kunegunda"
        };
        /*
        Zad1: Wypisz imiona zenskie.
        Zad2: wypisz imiona zenskie nie dluzsze niz 3 znaki.
        Zad3: wypisz imiona slowianskie (koncza sie na "slaw" lub "mir"
        Zad4: znajdz najdluzsze imie

        используем петлю for each
         */

        for (String name: names) {
           if (name.endsWith("a")) {
               System.out.println("Imiona zenskie podane w tablice to: " + name);
           }
        }

        for (String name: names) {
            if (name.endsWith("slaw")) {
                System.out.println("Imiona ktore koncza sie na 'slaw' to: " + name);
            }
            if (name.endsWith("mir")) {
                System.out.println("A imiona ktore koncza sie na 'mir' to: " + name);
            }
        }

        int longestNameLenht = 0;                        //задание 4.
        for (String name: names) {
            if (longestNameLenht < name.length()) {
                longestNameLenht = name.length();
            }
        }

        for (String name: names) {                       //это дает на то что бы в случае 2 наибольших показывала 2 а не 1
            if (longestNameLenht == name.length()) {
                System.out.println(name);
            }
        }

        for (int i = 0; i < names.length ; i++) {        //альтернатива 1 заданию. Только тут мы использовали индексы. т.е. "i"
            if (names[i].endsWith("mir")) {
                break;                                   //pszerywa aktualne instrukcije. Закончит показывать таблицу на первом слове в конце которого мир
            }
            System.out.println(names[i]);
        }
    }

}
