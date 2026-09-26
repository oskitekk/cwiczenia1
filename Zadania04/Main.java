import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // =========================
        // ZADANIE 1
        // =========================
        System.out.println("=== Zadanie 1 ===");

        int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};
        int[] tablicaNieparzysta = {1, 2, 3, 4, 5};

        System.out.println("Co drugi element pierwszej tablicy:");

        for (int i = 0; i < tablicaParzysta.length; i += 2) {
            System.out.print(tablicaParzysta[i] + " ");
        }

        System.out.println();

        System.out.println("Co drugi element drugiej tablicy:");

        for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
            System.out.print(tablicaNieparzysta[i] + " ");
        }

        System.out.println();


        // =========================
        // ZADANIE 2
        // =========================
        System.out.println("\n=== Zadanie 2 ===");

        int[] liczby2 = {12, 5, 83, -4, 25, 41, 7};

        int najwieksza = liczby2[0];

        for (int i = 1; i < liczby2.length; i++) {
            if (liczby2[i] > najwieksza) {
                najwieksza = liczby2[i];
            }
        }

        System.out.println("Najwieksza liczba: " + najwieksza);


        // =========================
        // ZADANIE 3
        // =========================
        System.out.println("\n=== Zadanie 3 ===");

        String[] slowa3 = {"Java", "programowanie", "tablice", "szkola"};

        for (String slowo : slowa3) {
            System.out.println(slowo.toUpperCase());
        }


        // =========================
        // ZADANIE 4
        // =========================
        System.out.println("\n=== Zadanie 4 ===");

        String[] slowa4 = new String[5];

        for (int i = 0; i < slowa4.length; i++) {
            System.out.print("Podaj slowo " + (i + 1) + ": ");
            slowa4[i] = scanner.next();
        }

        System.out.println("Slowa w odwrotnej kolejnosci i zapisane od tylu:");

        for (int i = slowa4.length - 1; i >= 0; i--) {

            String odwrocone = "";

            for (int j = slowa4[i].length() - 1; j >= 0; j--) {
                odwrocone += slowa4[i].charAt(j);
            }

            System.out.println(odwrocone);
        }


        // =========================
        // ZADANIE 5
        // =========================
        System.out.println("\n=== Zadanie 5 ===");

        int[] liczby5 = new int[8];

        for (int i = 0; i < liczby5.length; i++) {
            System.out.print("Podaj liczbe " + (i + 1) + ": ");
            liczby5[i] = scanner.nextInt();
        }

        // Proste sortowanie rosnace
        for (int i = 0; i < liczby5.length - 1; i++) {

            for (int j = 0; j < liczby5.length - 1 - i; j++) {

                if (liczby5[j] > liczby5[j + 1]) {

                    int tymczasowa = liczby5[j];
                    liczby5[j] = liczby5[j + 1];
                    liczby5[j + 1] = tymczasowa;
                }
            }
        }

        System.out.println("Liczby po sortowaniu:");

        for (int liczba5 : liczby5) {
            System.out.print(liczba5 + " ");
        }

        System.out.println();


        // =========================
        // ZADANIE 6
        // =========================
        System.out.println("\n=== Zadanie 6 ===");

        int[] liczby6 = new int[5];

        for (int i = 0; i < liczby6.length; i++) {
            System.out.print("Podaj liczbe " + (i + 1) + ": ");
            liczby6[i] = scanner.nextInt();
        }

        for (int liczba6 : liczby6) {

            if (liczba6 < 0) {
                System.out.println(
                        "Nie mozna policzyc silni liczby " + liczba6
                );
            } else {

                long silnia = 1;

                for (int i = 1; i <= liczba6; i++) {
                    silnia *= i;
                }

                System.out.println(
                        liczba6 + "! = " + silnia
                );
            }
        }


        // =========================
        // ZADANIE 7
        // =========================
        System.out.println("\n=== Zadanie 7 ===");

        String[] tablica1 = {"Ala", "ma", "kota"};
        String[] tablica2 = {"Ala", "ma", "kota"};

        boolean takieSame = true;

        if (tablica1.length != tablica2.length) {
            takieSame = false;
        } else {

            for (int i = 0; i < tablica1.length; i++) {

                if (!tablica1[i].equals(tablica2[i])) {
                    takieSame = false;
                    break;
                }
            }
        }

        if (takieSame) {
            System.out.println("Tablice sa takie same.");
        } else {
            System.out.println("Tablice nie sa takie same.");
        }


        // =========================
        // ZADANIE 8
        // =========================
        System.out.println("\n=== Zadanie 8 ===");

        Random random = new Random();

        int[] liczby8 = new int[10];

        // Losowanie liczb od -10 do 10
        for (int i = 0; i < liczby8.length; i++) {
            liczby8[i] = random.nextInt(21) - 10;
        }

        System.out.println("Zawartosc tablicy:");

        for (int liczba8 : liczby8) {
            System.out.print(liczba8 + " ");
        }

        System.out.println();

        int minimum = liczby8[0];
        int maksimum = liczby8[0];
        int suma8 = 0;

        for (int liczba8 : liczby8) {

            if (liczba8 < minimum) {
                minimum = liczba8;
            }

            if (liczba8 > maksimum) {
                maksimum = liczba8;
            }

            suma8 += liczba8;
        }

        double srednia = (double) suma8 / liczby8.length;

        int mniejszeOdSredniej = 0;
        int wiekszeOdSredniej = 0;

        for (int liczba8 : liczby8) {

            if (liczba8 < srednia) {
                mniejszeOdSredniej++;
            } else if (liczba8 > srednia) {
                wiekszeOdSredniej++;
            }
        }

        System.out.println("Najmniejsza liczba: " + minimum);
        System.out.println("Najwieksza liczba: " + maksimum);
        System.out.println("Srednia: " + srednia);

        System.out.println(
                "Liczb mniejszych od sredniej: " + mniejszeOdSredniej
        );

        System.out.println(
                "Liczb wiekszych od sredniej: " + wiekszeOdSredniej
        );

        System.out.println("Tablica w odwrotnej kolejnosci:");

        for (int i = liczby8.length - 1; i >= 0; i--) {
            System.out.print(liczby8[i] + " ");
        }

        System.out.println();


        // =========================
        // ZADANIE 9
        // =========================
        System.out.println("\n=== Zadanie 9 ===");

        int[] liczby9 = new int[20];

        // Tablica pomocnicza do zliczania wystapien.
        // Indeks odpowiada konkretnej liczbie.
        int[] wystapienia = new int[11];

        for (int i = 0; i < liczby9.length; i++) {

            // Losujemy liczby od 1 do 10
            liczby9[i] = random.nextInt(10) + 1;

            wystapienia[liczby9[i]]++;
        }

        System.out.println("Wylosowana tablica:");

        for (int liczba9 : liczby9) {
            System.out.print(liczba9 + " ");
        }

        System.out.println();

        System.out.println("Liczba wystapien:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    i + " wystepuje " + wystapienia[i] + " razy."
            );
        }


        scanner.close();
    }
}