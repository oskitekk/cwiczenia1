import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // =========================
        // ZADANIE 1
        // =========================
        System.out.println("=== Zadanie 1 ===");

        System.out.print("Podaj dodatnia liczbe calkowita: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i += 2) {
            System.out.print(i);

            if (i + 2 <= n1) {
                System.out.print(", ");
            }
        }

        System.out.println();


        // =========================
        // ZADANIE 2
        // =========================
        System.out.println("\n=== Zadanie 2 ===");

        System.out.print("Podaj dodatnia liczbe calkowita: ");
        int n2 = scanner.nextInt();

        int potega = 1;

        while (potega <= n2) {
            System.out.println(potega);

            // Zabezpieczenie przed przepelnieniem typu int
            if (potega > n2 / 2) {
                break;
            }

            potega *= 2;
        }


        // =========================
        // ZADANIE 3
        // =========================
        System.out.println("\n=== Zadanie 3 ===");
        System.out.println("Podawaj liczby. Wpisz 0, aby zakonczyc.");

        int suma = 0;
        int liczba;

        do {
            System.out.print("Podaj liczbe: ");
            liczba = scanner.nextInt();

            suma += liczba;

        } while (liczba != 0);

        System.out.println("Suma podanych liczb: " + suma);


        // =========================
        // ZADANIE 4
        // =========================
        System.out.println("\n=== Zadanie 4 ===");
        System.out.println("Podawaj liczby. Wpisz 0, aby zakonczyc.");

        int najmniejsza = 0;
        int najwieksza = 0;
        boolean podanoLiczbe = false;

        while (true) {

            System.out.print("Podaj liczbe: ");
            int liczba4 = scanner.nextInt();

            if (liczba4 == 0) {
                break;
            }

            if (!podanoLiczbe) {
                najmniejsza = liczba4;
                najwieksza = liczba4;
                podanoLiczbe = true;
            } else {

                if (liczba4 < najmniejsza) {
                    najmniejsza = liczba4;
                }

                if (liczba4 > najwieksza) {
                    najwieksza = liczba4;
                }
            }
        }

        if (podanoLiczbe) {

            int sumaMinMax = najmniejsza + najwieksza;
            double sredniaMinMax = sumaMinMax / 2.0;

            System.out.println("Najmniejsza liczba: " + najmniejsza);
            System.out.println("Najwieksza liczba: " + najwieksza);
            System.out.println("Suma najmniejszej i najwiekszej: " + sumaMinMax);
            System.out.println("Srednia najmniejszej i najwiekszej: " + sredniaMinMax);

        } else {
            System.out.println("Nie podano zadnej liczby.");
        }


        // =========================
        // ZADANIE 5
        // =========================
        System.out.println("\n=== Zadanie 5 ===");
        System.out.println("Gra: Za duzo, za malo");

        Random random = new Random();

        int wylosowana = random.nextInt(100) + 1;
        int odpowiedz;

        do {

            System.out.print("Zgadnij liczbe od 1 do 100: ");
            odpowiedz = scanner.nextInt();

            if (odpowiedz > wylosowana) {
                System.out.println("Podales za duza wartosc");
            } else if (odpowiedz < wylosowana) {
                System.out.println("Podales za mala wartosc");
            } else {
                System.out.println("Gratulacje");
            }

        } while (odpowiedz != wylosowana);


        // =========================
        // ZADANIE 6
        // =========================
        System.out.println("\n=== Zadanie 6 ===");

        System.out.print("Podaj znak wypelnienia prostokata: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj pozycje x lewego gornego rogu: ");
        int x = scanner.nextInt();

        System.out.print("Podaj pozycje y lewego gornego rogu: ");
        int y = scanner.nextInt();

        System.out.print("Podaj dlugosc boku a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj dlugosc boku b: ");
        int b = scanner.nextInt();


        // Przesuniecie prostokata w dol
        for (int i = 1; i < y; i++) {
            System.out.println();
        }

        // Rysowanie kolejnych wierszy prostokata
        for (int wiersz = 0; wiersz < b; wiersz++) {

            // Przesuniecie prostokata w prawo
            for (int spacja = 1; spacja < x; spacja++) {
                System.out.print(" ");
            }

            // Rysowanie jednego wiersza
            for (int kolumna = 0; kolumna < a; kolumna++) {
                System.out.print(znak);
            }

            System.out.println();
        }


        // =========================
        // ZADANIE 7
        // =========================
        System.out.println("\n=== Zadanie 7 ===");

        System.out.print("Podaj wysokosc choinki: ");
        int wysokosc = scanner.nextInt();

        for (int wiersz = 1; wiersz <= wysokosc; wiersz++) {

            // Spacje przed gwiazdkami
            for (int spacja = 1; spacja <= wysokosc - wiersz; spacja++) {
                System.out.print(" ");
            }

            // Gwiazdki
            for (int gwiazdka = 1; gwiazdka <= 2 * wiersz - 1; gwiazdka++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // =========================
        // ZADANIE 8
        // =========================
        System.out.println("\n=== Zadanie 8 ===");

        System.out.print("Podaj liczbe, dla ktorej policzyc silnie: ");
        int n8 = scanner.nextInt();

        if (n8 < 0) {
            System.out.println("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        } else {

            long silnia = 1;

            for (int i = 1; i <= n8; i++) {
                silnia *= i;
            }

            System.out.println("Silnia liczby " + n8 + " wynosi: " + silnia);
        }


        // =========================
        // ZADANIE 9
        // =========================
        System.out.println("\n=== Zadanie 9 ===");

        System.out.print("Podaj slowo: ");
        String slowo = scanner.next();

        boolean palindrom = true;

        for (int i = 0; i < slowo.length() / 2; i++) {

            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Slowo jest palindromem.");
        } else {
            System.out.println("Slowo nie jest palindromem.");
        }


        // =========================
        // ZADANIE 10
        // =========================
        System.out.println("\n=== Zadanie 10 ===");

        petlaGlowna:
        for (int i = 1; i <= 10; i++) {

            // Pomijamy nieparzyste wartosci petli glownej
            if (i % 2 != 0) {
                continue;
            }

            System.out.println("Petla glowna, i = " + i);

            for (int j = 1; j <= 10; j++) {

                System.out.println("j = " + j);

                if (j > i) {
                    continue petlaGlowna;
                }
            }
        }


        scanner.close();
    }
}