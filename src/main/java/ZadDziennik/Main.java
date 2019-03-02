package ZadDziennik;

//Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta
//
//        Klasa Dziennik powinna:
//        - posiadać (jako pole) listę Studentów.
//        - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
//        - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//        - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
//        - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
//        - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Double> ocenyStudent1 = new ArrayList<Double>(Arrays.asList(5.00, 4.00, 5.00));


        List<Student> listaStudents = new ArrayList<>();

        Student student = new Student("Mietek", "Kowalski",new ArrayList<Double>(Arrays.asList(5.00, 4.00, 5.00, 4.50)), "123456");
        Student student1 = new Student("Kasia", "Wielka",new ArrayList<Double>(Arrays.asList(3.00, 2.00, 5.00, 3.50)), "121256");
        Student student2 = new Student("Mirek", "Maly",new ArrayList<Double>(Arrays.asList(2.00, 3.00, 5.00, 4.50)), "1234557");
        Student student3 = new Student("Miska", "Nowak",new ArrayList<Double>(Arrays.asList(3.00, 4.00, 3.00, 3.50)), "1234998");

        listaStudents.add(student);
        listaStudents.add(student1);
        listaStudents.add(student2);
        listaStudents.add(student3);

        Dziennik dziennik = new Dziennik(listaStudents);
        System.out.println(dziennik);

        dziennik.usunStudenta(student);
        System.out.println(dziennik);

        dziennik.dodajStudenta(student);
        System.out.println(dziennik);
        System.out.println();
       dziennik.usunStudenta("121256");
        System.out.println(dziennik);
        System.out.println();
        System.out.println();
        System.out.println(dziennik.zwrocStudenta("1234998"));
        System.out.println();


        System.out.println(dziennik.podajSredniaStudenta("1234998"));


    }


}
