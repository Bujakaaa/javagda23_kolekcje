package ZadanieListaInt;

import java.util.*;

public class ZadListaMoje {
    public static void main(String[] args) {

        Random generator = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(generator.nextInt(100));
        }
        System.out.println(lista);

        double suma = 0;  //bo int/int= int a my chcemy miec srednia double
        for (Integer l : lista) {
            suma += l;
        }
        System.out.println("Suma: " + suma);

        System.out.println("Średnia: " + (suma / lista.size()));

        //kopia
        List<Integer> kopia = new ArrayList<>(lista);
        // List<Integer> kopia = list <- to nie jest kopia to jest nowa nazwa

        Collections.sort(lista);
        System.out.println(lista);

        double mediana = 0;

        if (lista.size() %2 == 0) {
            mediana = ((lista.get(lista.size() / 2 -1)) + (lista.get(lista.size() /2)))/2.0;
        }
        else {
            mediana = lista.get(lista.size() / 2);
        }

        System.out.println("Mediana: "+ mediana);


        //MIN i MAX
        int indeks=0;
       // Integer max = Integer.MIN_VALUE;
        int max = kopia.get(0); int indeksMax=0;
        int min = kopia.get(0); int indeksMin=0;

        for (int j = 0; j < kopia.size(); j++) {
            if (kopia.get(j) > max) {
                max = kopia.get(j);
                indeksMax=j;
            }
        }
        indeks=kopia.indexOf(max);
        System.out.println("MAX: "+ max + ". Indeks: " + indeks);

       // Integer min = Integer.MAX_VALUE;
        for (int j = 0; j < kopia.size(); j++) {
            if (kopia.get(j) < min) {
                min = kopia.get(j);
                indeksMin=j;
            }
        }
        indeks= kopia.indexOf(min);
        System.out.println("MIN:" + min + ". Indeks: " +indeks);
        System.out.println(indeksMax);
        System.out.println(indeksMin);

    }
}

