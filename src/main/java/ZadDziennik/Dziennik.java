package ZadDziennik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dziennik {

    private List<Student> listaStudentow= new ArrayList<>();
    private Student student;
    private double suma=0;
    private double srednia=0;

    public Dziennik(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void setListaStudentow(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public void dodajStudenta(Student student) {
        listaStudentow.add(student);
    }

    public void usunStudenta(Student student) {
        listaStudentow.remove(student);
    }

    public void usunStudentaPoIndeksie (String indeks) {
        for (Student student : listaStudentow) {
            if (student.getNrIndeksu().equals(indeks)) {
                listaStudentow.remove(student);
            } else {
                System.out.println("Brak studenta!");
            }
        }
    }

    public void usunStudenta (String indeks) {
        Iterator<Student> iterator = listaStudentow.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNrIndeksu().equals(indeks)) {
                iterator.remove();
            }
        }
    }

    public void znajdzStudenta (String indeks) {
        for (Student s : listaStudentow) {
            if (indeks.equals(s.getNrIndeksu())) {
                student = s;
            }
        }
    }

    public Student zwrocStudenta (String indeks) {
        znajdzStudenta(indeks);
        return student;
    }

    public Student zwrocStudentaPawel (String indeks) {
        for (Student s : listaStudentow) {
            if (indeks.equals(s.getNrIndeksu())) {
                return s;
            }
        }
        return null;
    }


//    public void policzSrednia (String indeks) {
//        for (Student s : listaStudentow) {
//            if (indeks.equals(s.getNrIndeksu())) {
//                student = s;
//            }
//        }
//            for (int i = 0; i < student.getListaOcen().size(); i++) {
//                suma += student.getListaOcen().get(i);
//
//                srednia = suma/student.getListaOcen().size();
//
//            }
//
//        System.out.println("Suma ocen: " + suma);
//        System.out.println("Ilość ocen: "+ student.getListaOcen().size());
//    }

    //
//         public double podajSredniaStudenta (String indeks) {
//        policzSrednia(indeks);
//        return srednia;
//         }

    public Double podajSredniaStudenta (String indeks) {
        Student student= zwrocStudenta(indeks);
        if (student != null) {
            double suma =0.0;
            for (Double aDouble: student.getListaOcen()) {
                suma += aDouble;
            }
            return suma/student.getListaOcen().size();
        }
        return null;
    }


//        for (Student s: listaStudentow) {
//        if (indeks.equals(s.getNrIndeksu())) {
//            double sredniaOk=0;
//            s.getListaOcen();
//                for (int i = 0; i <s.getListaOcen().size() ; i++) { s.getListaOcen().toArray()
//                    double liczba=
//                    double srednia += liczba;
//                   int ilosc= s.getListaOcen().size();
//                   sredniaOk=srednia/ilosc;
//                }
//                System.out.println(sredniaOk);


    @Override
    public String toString() {
        return "Dziennik{" +
                "listaStudentow=" + listaStudentow +
                ", student=" + student +
                '}';
    }
}