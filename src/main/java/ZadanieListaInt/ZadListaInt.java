package ZadanieListaInt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ZadListaInt {

    // Stwórz listę Integerów. Wykonaj zadania:
    //    - dodaj do listy 5 elementów ze scannera
    //    - dodaj do listy 5 elementów losowych
    //    - wypisz elementy
    //Sprawdź działanie aplikacji.


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę");
            lista.add(scanner.nextInt());
        }
        System.out.println(lista);


        Random generator = new Random();
        List<Integer> lista2 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            lista2.add(generator.nextInt());
        }
        System.out.println(lista2);
    }
}

