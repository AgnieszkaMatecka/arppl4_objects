package pl.sda.arp4.objects.domowestring;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        // 6. Napisz program który wczytuje od użytkownika tekst,
        // a następnie dla tego tekstu zamienia wszystkie wystąpienia przecinków (“, “)
        // na słowo “makarena”. (replaceAll)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        System.out.println(tekst);
        String tekstBezPrzecinka = tekst.replaceAll(",", " makarena ");
        tekstBezPrzecinka = tekstBezPrzecinka.replaceAll("  ", " ");

        System.out.println(tekstBezPrzecinka);
    }
}
