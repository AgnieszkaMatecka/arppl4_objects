package pl.sda.arp4.objects.domowestring;

import java.util.Locale;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        // Napisz aplikację która przyjmuje od użytkownika tekst,
        // a następnie zamienia cały tekst na:
        // same duże litery
        // same małe litery
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst:");
        String tekst = scanner.nextLine();

        System.out.println(tekst);

        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.toUpperCase());
    }
}
