package ZadListaStringow;

//Stwórz oddzielnego maina, a w nim kolejną listę STRING'ów. Wykonaj zadania: (UWAGA! STRING, NIE INT ANI LONG)
//        - dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355, 2222, 1111, 3546, 138751,
//        235912 (jako stringi) (dodaj je posługując się metodą Arrays.asList())
//
//        Przykład użycia Arrays.asList():
//        ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
//        Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać na liście String’ów.
//
//        - określ indeks elementu 138751 posługując się metodą indexOf
//        - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
//        - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
//        - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
//        - wykonaj ponownie powyższe sprawdzenia.
//        - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w oddzielnej linii).
//        Sprawdź działanie aplikacji.
//

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] tablica = new String[]{"10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"};
        List<String> tablicaString = new ArrayList<>(Arrays.asList(tablica));
        System.out.println(tablicaString);
        System.out.println();
        System.out.println("Indeks liczby 138751 to: " + tablicaString.indexOf("138751"));
        System.out.println();


        if (tablicaString.contains("67888")) {
            System.out.println("Tak, liczba 67888 istnieje.");
        } else {
            System.out.println("Nie ma liczby 67888");
        }

        if (tablicaString.contains("67889")) {
            System.out.println("Tak, liczba 67889istnieje.");
        } else {
            System.out.println("Nie ma liczby 67889.");
            System.out.println();

            System.out.println("Usuń liczbę:  67888 ");
            tablicaString.remove("67888");
            System.out.println(tablicaString);
        }

        for (String l : tablicaString) {
            System.out.print(l + ", ");
        }
        System.out.println();
        for (String l : tablicaString) {
            System.out.println(l);
        }
    }
}



