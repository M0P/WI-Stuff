import java.util.InputMismatchException;
import java.util.Scanner;

public class Raviolita {

    private int     laenge;
    private int     höhe;
    private double  laengeDiagonale;
    private double  durchmesserBoden;
    private double  flaecheBoden;
    private double  flaecheMantel;
    private double  flaecheDose;
    private double  volumenDose;
    private Scanner scanner;

    public Raviolita() {
        laenge = readInt("Gib bitte die Länge der Dose an:");
        höhe = readInt("Gib bitte die Breite der Dose an:");

        //Berechnungen
        laengeDiagonale = Math.sqrt(laenge * laenge + höhe * höhe);
        durchmesserBoden = laenge / Math.PI;
        flaecheBoden=Math.PI * (durchmesserBoden / 2) * (durchmesserBoden / 2);
        flaecheMantel=laenge * höhe;
        flaecheDose=flaecheMantel+2*flaecheBoden;
        volumenDose=flaecheBoden* höhe;

        //Ausgaben
        System.out.println("Die Länge der Diagonalen des Blechstücks beträgt: " +laengeDiagonale);
        System.out.println("Der Durchmesser des Dosenbodens ist: " + durchmesserBoden);
        System.out.println("Die Fläche des Doesenbodens beträgt: " +flaecheBoden);
        System.out.println("Die Mantelfläche der Dose ist: " +flaecheMantel);
        System.out.println("Die Gesamtfläche der Dose beträgt:" + flaecheDose);
        System.out.println("Das Volumen der Dose ist: " + volumenDose);
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
