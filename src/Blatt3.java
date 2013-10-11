import java.util.InputMismatchException;
import java.util.Scanner;

public class Blatt3 {
    private Scanner scanner;
    private int tag, monat, jahr, jahrhundert, jahrzehnte_jahre, wochentag_wert, zahl;
    private String wochentag, datum;
    private int laufzeit, zeilenSterne, zerlegeZahl;
    private double geldAusgang, geldJahresWert, zins;

    public Blatt3() {
        // aufgabe10();
        // aufgabe11();
        // aufgabe12();
        // aufgabe13();
        // aufgabe14();
        aufgabe15();
    }

    public static void main(String[] args) {
        new Blatt3();
    }

    private void aufgabe15() {
        System.out.println("Willkommen beim Zahlenraten\n\nIch denke mit eine Zahl zwischen 0 und 100. Rate diese Zahl!\n");
        int zufallsZahl = (int) (99 * Math.random() + 1);
        int spielerzahl = 0;
        int zaehler = 0;
        while (spielerzahl != zufallsZahl) {
            zaehler++;
            spielerzahl = readInt(zaehler + ". Versuch:");
            if (spielerzahl < zufallsZahl) System.out.println("Meine Zahl ist größer!");
            else if (spielerzahl > zufallsZahl) System.out.println("Meine Zahl ist kleiner!");

        }
        System.out.println("Du hast die Zahl beim " + zaehler + ". Versuch erraten!");


    }

    public void aufgabe11() {
        zahl = readInt("Gib bitte eine Zahl ein:");
        System.out.print("Die Vielfachen: ");
        for (int i = 1; i < 11; i++)
            System.out.print(zahl * i + " ");
        System.out.println();
    }

    public void aufgabe10() {
        tag = readInt("Gib einen Tag ein:");
        monat = readInt("Gib einen Monat (1-12) ein:");
        jahr = readInt("Gib ein Jahr ein:");
        datum = tag + "." + monat + "." + jahr;
        if (monat <= 2) {
            monat += 10;
            jahr--;
        } else monat -= 2;
        jahrhundert = jahr / 100;
        jahrzehnte_jahre = jahr % 100;
        wochentag_wert = ((26 * monat - 2) / 10 + tag + jahrzehnte_jahre + jahrzehnte_jahre / 4 + jahrhundert / 4 - 2 * jahrhundert) % 7;
        if (wochentag_wert < 0) wochentag_wert += 7;
        switch (wochentag_wert) {
            case 0:
                wochentag = "Sonntag";
                break;
            case 1:
                wochentag = "Montag";
                break;
            case 2:
                wochentag = "Dienstag";
                break;
            case 3:
                wochentag = "Mittwoch";
                break;
            case 4:
                wochentag = "Donnerstag";
                break;
            case 5:
                wochentag = "Freitag";
                break;
            case 6:
                wochentag = "Samstag";
                break;
            default:
                wochentag = "Feiertag";
                break;
        }
        System.out.println("Der " + datum + " war ein " + wochentag);
    }

    private void aufgabe12() {
        geldAusgang = readDouble("Gib den Ausgangsgeldwert ein:");
        zins = readDouble("Gib den Zinssatz ein:");
        laufzeit = readInt("Gib die Laufzeit ein:");
        geldJahresWert = geldAusgang;
        for (int i = 0; i < laufzeit; i++) {
            geldJahresWert += geldJahresWert * zins;
            System.out.println("Wert nach " + (i + 1) + " Jahren:" + geldJahresWert);
        }
    }

    private void aufgabe13() {
        zeilenSterne = readInt("Anzahl der Zeilen:");
        for (int i = 0; i < zeilenSterne; i++) {
            String sterne = "";
            for (int j = -1; j < i; j++)
                sterne += "*";
            System.out.println(sterne);
        }
    }

    private void aufgabe14() {
        zerlegeZahl = readInt("Positive ganze Zahl:");
        while (zerlegeZahl > 0) {
            int letzteZiffer = zerlegeZahl % 10;
            zerlegeZahl /= 10;
            switch (letzteZiffer) {
                case 0:
                    System.out.println("null");
                    break;
                case 1:
                    System.out.println("eins");
                    break;
                case 2:
                    System.out.println("zwei");
                    break;
                case 3:
                    System.out.println("drei");
                    break;
                case 4:
                    System.out.println("vier");
                    break;
                case 5:
                    System.out.println("fuenf");
                    break;
                case 6:
                    System.out.println("sechs");
                    break;
                case 7:
                    System.out.println("sieben");
                    break;
                case 8:
                    System.out.println("acht");
                    break;
                case 9:
                    System.out.println("neun");
                    break;

            }
        }
    }

    private int readInt(String ausgabe) {
        scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            int wert = scanner.nextInt();
            return wert;
        } catch (InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readInt(ausgabe);
        }
    }

    private double readDouble(String ausgabe) {
        scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            double wert = scanner.nextDouble();
            return wert;
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readInt(ausgabe);
        }
    }
}
