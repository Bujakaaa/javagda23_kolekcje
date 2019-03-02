import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWprowadzenie {

    public static void main(String[] args) {
        String[] tablicaWczesniejsza = new String[]{"a", "b", "c"};
        List<String> strList = new ArrayList<>(Arrays.asList(tablicaWczesniejsza));
        // SOLID
        // I
        // L - Liskov Substitution
        // opcja 1:
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(5, 10, 15));
        // opcja 2:
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        System.out.println(lista2);
        lista2.remove(1); // usunie 2 z listy
        lista2.remove((Object) 1); // usunie 1 z listy
        // length => size()
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }
        System.out.println(lista2);
        lista2.add(0, 100);
        System.out.println(lista2);
        Integer[] tablica = lista2.toArray(new Integer[lista2.size()]);
        System.out.println("Tablica: " + Arrays.toString(tablica));
    }
}



