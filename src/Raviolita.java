import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Marc
 * Date: 07.10.13
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public class Raviolita {
    private int laenge;
    private int breite;
    private double laengeDiagonale;
    private double durchmesserBoden;
    private double flaecheBoden;
    private double flaecheMantel;
    private double flaecheDose;
    private double volumenDose;
    private Scanner scanner;

    public Raviolita() {
        laenge = readInt("Gib bitte die Länge der Dose an:");
        breite = readInt("Gib bitte die Breite der Dose an:");
        System.out.println("Die Länge der Diagonalen des Blechstücks beträgt: " + Math.sqrt(laenge * laenge + breite * breite));
        System.out.println("Der Durchmesser des Dosenbodens ist: " + laenge / Math.PI);
        System.out.println("Die Fläche des Doesenbodens beträgt: " + Math.PI * (laenge / Math.PI / 2) * (laenge / Math.PI / 2));
        System.out.println("Die Mantelfläche der Dose ist: " + laenge * breite);
        System.out.println("Die Gesamtfläche der Dose beträgt:" + (laenge * breite + 2 * Math.PI * (laenge / Math.PI / 2) * (laenge / Math.PI / 2)));
        System.out.println("Das Volumen der Dose ist: " + Math.PI * (laenge / Math.PI / 2) * (laenge / Math.PI / 2) * breite);
    }

    public static void main(String[] args) {
        new Raviolita();
    }

    private int readInt(String ausgabe) {
        scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            int wert = scanner.nextInt();
            System.out.println();
            return wert;
        } catch (InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readInt(ausgabe);
        }
    }
}
