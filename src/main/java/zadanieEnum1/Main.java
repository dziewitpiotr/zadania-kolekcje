package enum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj plec: ");
        String plec1 = scanner.nextLine();
        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj pesel: ");
        long pesel = scanner.nextLong();

        Plec wynikPlci = Plec.valueOf(plec1.trim().toUpperCase());

        Obywatel obywatel1 = new Obywatel(wynikPlci, imie, nazwisko, pesel);
        System.out.println(obywatel1);

    }
}
