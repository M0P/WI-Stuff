import java.util.InputMismatchException;
import java.util.Scanner;

public class Blatt8 {

    public static void main(String[] args) {
        aufgabe28();
        aufgabe29();
        aufgabe30();
        aufgabe31();
    }

    /**
     * Testmethode für Aufgabe 31
     */
    private static void aufgabe31() {
        Rechnen rechnen = new Rechnen();
        //Grundrechenarten
        Bruchzahl bzahl1 = new Bruchzahl();
        Bruchzahl bzahl2 = new Bruchzahl();

        System.out.println("Erste Bruchzahl");
        rechnen.einlesen(bzahl1);
        System.out.println("Zweite Bruchzahl");
        rechnen.einlesen(bzahl2);

        System.out.print("Multiplikation: ");
        rechnen.ausgebenExtended(rechnen.mul(bzahl1, bzahl2));
        System.out.print("Division: ");
        rechnen.ausgebenExtended(rechnen.div(bzahl1, bzahl2));
        System.out.print("Addition: ");
        rechnen.ausgebenExtended(rechnen.add(bzahl1, bzahl2));
        System.out.print("Subtraktion: ");
        rechnen.ausgebenExtended(rechnen.sub(bzahl1, bzahl2));
    }

    /**
     * Testmethode für Aufgabe 30
     */
    private static void aufgabe30() {
        Rechnen rechnen = new Rechnen();
        Bruchzahl bruchzahl = new Bruchzahl();
        rechnen.einlesen(bruchzahl);
        System.out.println(rechnen.wert(bruchzahl));
        System.out.println("Ungekürzt:");
        rechnen.ausgeben(bruchzahl);
        System.out.println("Gekürzt:");
        rechnen.ausgeben(rechnen.kuerzen(bruchzahl));
    }

    /**
     * Testmethode für Aufgabe 29
     */
    private static void aufgabe29() {
        Rechnen rechnen = new Rechnen();
        Bruchzahl bruchzahl = new Bruchzahl();
        rechnen.einlesen(bruchzahl);
        System.out.println(rechnen.wert(bruchzahl));
        rechnen.ausgeben(bruchzahl);
    }

    /**
     * Testmethode für Aufgabe 28
     */
    private static void aufgabe28() {
        int zahl1 = readInt("1. Zahl: ");
        int zahl2 = readInt("2. Zahl: ");
        System.out.println("Das ggt von " + zahl1 + " und " + zahl2 + " beträgt:" + new Rechnen().ggt(zahl1, zahl2));
    }

    /**
     * Liest einen Integer von der Konsole ein
     *
     * @param ausgabe
     *
     * @return den eingelesenen Wert
     */
    public static int readInt(String ausgabe) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            return scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readInt(ausgabe);
        }
    }
}

