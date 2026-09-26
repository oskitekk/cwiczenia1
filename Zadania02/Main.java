import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // =========================
        // ZADANIE 1
        // =========================
        System.out.println("=== Zadanie 1 ===");

        System.out.print("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }


        // =========================
        // ZADANIE 2
        // =========================
        System.out.println("\n=== Zadanie 2 ===");

        System.out.print("Podaj pierwszy bok: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugi bok: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj trzeci bok: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z tych bokow mozna zbudowac trojkat.");
        } else {
            System.out.println("Z tych bokow nie mozna zbudowac trojkata.");
        }


        // =========================
        // ZADANIE 3
        // =========================
        System.out.println("\n=== Zadanie 3 ===");

        System.out.print("Podaj pierwsza liczbe: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj druga liczbe: ");
        double liczba2 = scanner.nextDouble();

        if (liczba1 > liczba2) {
            System.out.println("Najwieksza liczba: " + liczba1);
        } else if (liczba2 > liczba1) {
            System.out.println("Najwieksza liczba: " + liczba2);
        } else {
            System.out.println("Liczby sa rowne.");
        }


        // =========================
        // ZADANIE 4
        // =========================
        System.out.println("\n=== Zadanie 4 ===");

        System.out.print("Podaj pierwsza liczbe: ");
        double l1 = scanner.nextDouble();

        System.out.print("Podaj druga liczbe: ");
        double l2 = scanner.nextDouble();

        System.out.print("Podaj trzecia liczbe: ");
        double l3 = scanner.nextDouble();

        double najwieksza = l1;

        if (l2 > najwieksza) {
            najwieksza = l2;
        }

        if (l3 > najwieksza) {
            najwieksza = l3;
        }

        System.out.println("Najwieksza liczba: " + najwieksza);


        // =========================
        // ZADANIE 5
        // =========================
        System.out.println("\n=== Zadanie 5 ===");

        System.out.print("Podaj numer miesiaca: ");
        int miesiac = scanner.nextInt();

        switch (miesiac) {
            case 1:
                System.out.println("Styczen");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecien");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpien");
                break;
            case 9:
                System.out.println("Wrzesien");
                break;
            case 10:
                System.out.println("Pazdziernik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzien");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
        }


        // =========================
        // ZADANIE 6
        // =========================
        System.out.println("\n=== Zadanie 6 ===");

        System.out.print("Podaj swoje imie: ");
        String imie = scanner.next();

        if (imie.equals("Oskar")) {
            System.out.println("Masz takie samo imie jak ja.");
        } else {
            System.out.println("Masz inne imie niz ja.");
        }


        // =========================
        // ZADANIE 7
        // =========================
        System.out.println("\n=== Zadanie 7 ===");

        System.out.print("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();

        boolean pelnoletni = wiek >= 18 ? true : false;

        System.out.println("Czy jestes pelnoletni: " + pelnoletni);


        // =========================
        // ZADANIE 8
        // =========================
        System.out.println("\n=== Zadanie 8 ===");

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok jest przestepny.");
        } else {
            System.out.println("Rok nie jest przestepny.");
        }


        // =========================
        // ZADANIE 9
        // =========================
        System.out.println("\n=== Zadanie 9 ===");

        System.out.print("Podaj wage w kg: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost w metrach, np. 1,80: ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidlowa");
        } else {
            System.out.println("nadwaga");
        }


        // =========================
        // ZADANIE 10
        // =========================
        System.out.println("\n=== Zadanie 10 ===");

        double cena;

        do {
            System.out.print("Podaj cene towaru od 100 do 10000 zl: ");
            cena = scanner.nextDouble();

            if (cena < 100 || cena > 10000) {
                System.out.println("Nieprawidlowa cena. Sprobuj ponownie.");
            }

        } while (cena < 100 || cena > 10000);


        int liczbaRat;

        do {
            System.out.print("Podaj liczbe rat od 6 do 48: ");
            liczbaRat = scanner.nextInt();

            if (liczbaRat < 6 || liczbaRat > 48) {
                System.out.println("Nieprawidlowa liczba rat. Sprobuj ponownie.");
            }

        } while (liczbaRat < 6 || liczbaRat > 48);


        double oprocentowanie;

        if (liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

        double cenaZOprocentowaniem = cena + (cena * oprocentowanie);
        double rata = cenaZOprocentowaniem / liczbaRat;

        System.out.println("Miesieczna rata wynosi: " + rata + " zl");


        // =========================
        // ZADANIE 11
        // =========================
        System.out.println("\n=== Zadanie 11 ===");
        System.out.println("Prosty kalkulator");

        System.out.print("Podaj pierwsza liczbe: ");
        double pierwsza = scanner.nextDouble();

        System.out.print("Podaj symbol dzialania (+, -, *, /): ");
        char dzialanie = scanner.next().charAt(0);

        System.out.print("Podaj druga liczbe: ");
        double druga = scanner.nextDouble();

        switch (dzialanie) {

            case '+':
                System.out.println("Wynik: " + (pierwsza + druga));
                break;

            case '-':
                System.out.println("Wynik: " + (pierwsza - druga));
                break;

            case '*':
                System.out.println("Wynik: " + (pierwsza * druga));
                break;

            case '/':
                if (druga == 0) {
                    System.out.println("Nie mozna dzielic przez zero.");
                } else {
                    System.out.println("Wynik: " + (pierwsza / druga));
                }
                break;

            default:
                System.out.println("Podano nieprawidlowy symbol dzialania.");
        }


        scanner.close();
    }
}