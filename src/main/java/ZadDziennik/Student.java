package ZadDziennik;


import java.util.List;

public class Student {
   private String imie;
   private String nazwisko;
   private  List<Double> listaOcen;
   private String nrIndeksu;

    public Student(String imie, String nazwisko, List<Double> listaOcen, String nrIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaOcen = listaOcen;
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(String nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", listaOcen=" + listaOcen +
                ", nrIndeksu='" + nrIndeksu + '\'' +
                '}';
    }
}