//package ZadDziennik;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class DziennikPawla {
//
//    private List<Student> studentList = new ArrayList<>();
//
//    public void dodajStudenta(Student student) {
//        studentList.add(student);
//    }
//
//    public void usunStudenta(Student student) {
//        studentList.remove(student);
//    }
//
//    public void usunStudenta(String index) {
//        // Concurrent modification exception - wyjątek który wydarzy się kiedy podczas iteracji zmodyfikujemy kolekcje
////        Iterator<Student> iterator = studentList.iterator();
////        while (iterator.hasNext()) {
////            Student student = iterator.next();
////            if (student.getNumerIndeksu().equals(index)) {
////                iterator.remove();
////            }
////        }
//
////        for (int i = 0; i < studentList.size(); i++) {
////            if (studentList.get(i).getNumerIndeksu().equals(index)) {
////                studentList.remove(i);
////                i--;
////            }
////        }
//
//        for (Student student : studentList) { // 0, 1, 2,.... Iterator
//            if (student.getNumerIndeksu().equals(index)) {
//                studentList.remove(student);
//                break; // zapobiega dalszej iteracji (oraz concurrent modification exception)
//            }
//        }
//    }
//
//    public Optional<Student> zwrocStudenta(String index) {
//        for (Student student : studentList) {
//            if (student.getNrIndeksu().equals(index)) {
//                return Optional.of(student); // opakowanie typu Optional
//            }
//        }
//        return Optional.empty();
//    }
//
//    public Optional<Double> podajSredniaStudenta(String index) {
//        Optional<Student> studentOptional = zwrocStudenta(index);
//        if (studentOptional.isPresent()) {
//            Student student = studentOptional.get();
//            double suma = 0.0;
//            for (Double aDouble : student.getListaOcen()) {
//                suma += aDouble;
//            }
//            return Optional.of(suma / student.getListaOcen().size());
//        }
//        return Optional.empty(); // nie udało się znaleźć studenta
//    }
//}
//}
