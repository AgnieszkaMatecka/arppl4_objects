package pl.sda.arp4.models.constructors.zad_dom;

public class Obywatel {
    private Plec plec;
    private String imie;
    private String nazwisko;
    private String pesel;

    public Obywatel(Plec plec, String imie, String nazwisko, String pesel) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "plec=" + plec +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public void przedstawSie() {
        System.out.println("Jestem " + plec + " Nazywam się " + imie + " " + nazwisko + ", legitymuję się nr PESEL " + pesel);
    }
}
