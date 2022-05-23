package pl.sda.arp4.objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // wypisanie wszystkich dostępnych opcji ENUM
        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);
        }
        Scanner scanner = new Scanner(System.in);
        // użytkownik wpisuje coś do scannera
        // a w wyniku chcę otrzymać zmienną typu RodzajPojazdu
        RodzajPojazdu typ = null;

        while (typ == null) {
            System.out.println("Podaj rodzaj pojazdu:");
            String rodzajString = scanner.next();

            try {
                // zamiast pisać if/else dla wszystkich rodzajów i porównywać
                // możemy zastosować metodę .valueOf która wygenerowana jest
                // dla każdego typu wyliczeniowego(enum)
                typ = RodzajPojazdu.valueOf(rodzajString.toUpperCase());

            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje...");
            }
        }

        System.out.println(typ);

//        if (rodzajString.equalsIgnoreCase("osobowy")) {
//            typ = RodzajPojazdu.OSOBOWY;
//        } else if (rodzajString.equals("ciezarowy")) {
//            typ = RodzajPojazdu.CIEZAROWY;
//        } else if (rodzajString.equals("jednoslad")) {
//            typ = RodzajPojazdu.JEDNOSLAD;
//        }
//
//        if (rodzajString.equalsIgnoreCase("1")) {
//            typ = RodzajPojazdu.OSOBOWY;
//        } else if (rodzajString.equals("2")) {
//            typ = RodzajPojazdu.CIEZAROWY;
//        } else if (rodzajString.equals("3")) {
//            typ = RodzajPojazdu.JEDNOSLAD;
//        }

    }
}
