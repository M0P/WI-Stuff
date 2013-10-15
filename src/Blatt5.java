import java.util.Scanner;

public class Blatt5 {

    private int[] zahlen;
    private Scanner scanner;

    public Blatt5() {
        aufgabe21();
        //aufgabe22();
        //aufgabe23();
    }

    public static void main(String[] args) {
        new Blatt5();
    }

    public void bubbleSort(int[] x) {
        boolean unsortiert = true;
        int temp;

        while (unsortiert) {
            unsortiert = false;
            for (int i = 0; i < x.length - 1; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    unsortiert = true;
                }
        }
    }

    private void aufgabe21() {
        int count = MyMethods.readInt("Wieviele Zahlen willst du sortieren? ");
        zahlen = new int[count];
        for (int i = 0; i < zahlen.length; i++)
            zahlen[i] = MyMethods.readInt((i + 1) + ". Zahl: ");
        bubbleSort(zahlen);
        for (int i : zahlen)
            System.out.print(i + " ");

    }

    public void aufgabe22() {
        int anzahl = MyMethods.readInt("Anzahl der Zeilen: ");
        int maxBreite = anzahl * 2 - 1;
        String zeile = "";
        for (int i = 0; i < anzahl; i++) {
            zeile = "";
            for (int j = 0; j <= maxBreite; j++)
                if (j < (maxBreite - (i * 2 - 1)) / 2 || j > ((maxBreite - (i * 2 - 1)) / 2) + (i * 2))
                    zeile += " ";
                else zeile += "*";
            System.out.println(zeile);
        }
        String letzteZeile = "";
        for (int i = 0; i < anzahl; i++)
            letzteZeile += " ";
        letzteZeile += "I";
        System.out.println(letzteZeile);
    }

    public void aufgabe23() {
        int n = 0;
        n = readUngeradeZahl("Ungerade Zahl zwischen 2 und 10:");
        int[][] quadrat = new int[n][n];
        int zeile = n / 2;
        int spalte = n / 2 + 1;
        for (int i = 1; i <= n * n; i++) {
            quadrat[zeile][spalte] = i;
            spalte++;
            zeile--;
            if (zeile < 0) zeile = n - 1;
            if (spalte == n) spalte = 0;
            if (quadrat[zeile][spalte] != 0) {
                zeile++;
                spalte++;
                if (zeile == n) zeile = 0;
                if (spalte == n) spalte = 0;
            }
        }
        //Ausgabe Quadrat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(quadrat[i][j] < 10 ? " " + quadrat[i][j] + " " : quadrat[i][j] + " ");
            System.out.println();
        }

    }

    private int readUngeradeZahl(String ausgabe) {
        int wert = MyMethods.readInt(ausgabe);
        while (wert < 2 || wert > 10 || wert % 2 == 0)
            wert = MyMethods.readInt(ausgabe);
        return wert;
    }
}
