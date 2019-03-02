import ZadStudent.Plec;
import ZadStudent.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//package ZadStudent;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
////5. Stwórz klasę Student która posiada pola:
////nr indeksu
////imie
////nazwisko
////płeć (wartość enum)
////
////W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
////Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
////
////a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
////b. Spróbuj wypisać elementy stosując pętlę foreach
////c. Wypisz tylko kobiety
////d. Wypisz tylko mężczyzn
////e. Wypisz tylko indeksy osób
//
//
//
//Collapse 
public class Main {
    public static void main(String[] args) {

        List<Student> listaStudents = new ArrayList<>();

        listaStudents.add(new Student("1434563", "Jan", "Kowalski", Plec.MEZCZYZNA));
        listaStudents.add(new Student("14343563", "Kasia", "Wielka", Plec.KOBIETA));
        listaStudents.add(new Student("14341233", "Basia", "Nowak", Plec.KOBIETA));
        listaStudents.add(new Student("14345134", "Mietek", "Kim", Plec.MEZCZYZNA));

        System.out.println(listaStudents);
        System.out.println();
        for (Student st : listaStudents) {
            System.out.println("Nr indeksu: " + st.getNrIndeksu() + ". Imię: " + st.getImie() + ". Nazwisko: " + st.getNazwisko() + ". Płeć: " + st.getPlec());
        }
        System.out.println();

          System.out.println("Kobiety: ");

        for (Student stk : listaStudents) {
            if (stk.getPlec()==(Plec.KOBIETA)) { // mozna zrobiv nienaturalnie (odwrotnie!) z equals: Plec.Kobieta.equals(stk.getPlec);
                                                //jak zrobic w tej samej kolejnosci  to w przypadku gdzie plec to null wyskoczy exception (ERROR).
                System.out.println(stk);
            }
        }
        System.out.println();
        System.out.println("Mężczyźni: ");

        for (Student stm : listaStudents) {
            if (stm.getPlec()==(Plec.MEZCZYZNA)) {
                System.out.println(stm);
            }
        }
        System.out.println();
            System.out.println("Indeksy: ");
            for (Student sti : listaStudents) {
                System.out.println(sti.getNrIndeksu());
            }

    }
}

