/**
 * User: Marc Date: 24.10.13 Time: 21:59
 */
public class Blatt7 {

    private double[] aufgabe26Feld;

    public Blatt7() {
        aufgabe26();
        aufgabe27();
    }

    private void aufgabe27() {
        long zahl = MyMethods.readLong("Von welcher Zahl soll die \"Quersummenziffer\" berechnet werden?");
        int zaehler = 0;
        int anzStellen = (zahl + "").length();
        while(zahl > 10) {
            zahl = quersummer(zahl);
            zaehler++;
        }
        System.out.println("Die \"Quersummenziffer\" dieser Zahl berträgt: " + zahl);
        System.out.println("-----------------------");
        System.out.println("Statistik:");
        System.out.println("Die Zahl hatte " + anzStellen + " Ziffern und es wurden " + zaehler + " Durchläufe " +
                                   "benötigt.");
    }

    private long quersummer(long zahl) {
        long quersumme = 0;
        while(zahl > 10) {
            quersumme += zahl % 10;
            zahl /= 10;
        }
        return quersumme += zahl;
    }

    private void aufgabe26() {
        boolean stop = false;
        while(!stop) {
            int feldGroesse = MyMethods.readInt("Wieviele Komponenten soll das Feld besitzen?");
            aufgabe26Feld = new double[feldGroesse];
            readWerte(aufgabe26Feld);
            System.out.println("Die Varianz des Feldes beträgt: " + varianz(aufgabe26Feld));
            stop = !MyMethods.readBoolean("Soll ein weiteres Feld berechnet werden? (true/false)");
        }
    }

    private void readWerte(double[] feld) {
        for(int i = 0; i < feld.length; i++)
            feld[i] = MyMethods.readDouble("Welchen Wert besizt die " + (i + 1) + ". Komponente?");
    }

    private double mittelwert(double[] feld) {
        double summe = 0;
        for(double i : feld) summe += i;
        return 1.0 / feld.length * summe;
    }

    private double varianz(double[] feld) {
        double mittelwert = mittelwert(feld);
        double varianzsumme = 0;
        for(double i : feld) varianzsumme = varianzsumme + Math.pow(i - mittelwert, 2.0);
        return 1.0 / feld.length * varianzsumme;
    }

    public static void main(String[] args) {
        new Blatt7();
    }
}
