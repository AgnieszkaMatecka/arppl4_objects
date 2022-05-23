package pl.sda.arp4.models.constructors.zad_dom;

import java.util.Scanner;

public class MainObywatel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plec plec = null;

        do {
            System.out.println("Podaj Płeć (M lub K): ");
            String plecNapis = scanner.nextLine().toUpperCase();
            if (plecNapis.equals("M") || plecNapis.equals("MĘŻCZYZNA")) {
                plec = Plec.MĘŻCZYZNA;
            } else if (plecNapis.equals("K") || plecNapis.equals("KOBIETA")) {
                plec = Plec.KOBIETA;
            } else {
                System.out.println("Nie ma takiej płci, podaj M lub K");
            }
        } while (plec == null);

        System.out.println("Podaj Imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        String pesel = scanner.nextLine();

        Obywatel obywatel = new Obywatel(plec, imie, nazwisko, pesel);
        obywatel.przedstawSie();
    }

}