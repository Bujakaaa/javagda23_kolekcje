package ZadStudent;

public class Student {
    private String nrIndeksu;
    private String imie;
    private String nazwisko;
    private Plec plec;

    public Student (String nrIndeksu, String imie, String nazwisko, Plec plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu='" + nrIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }
}
