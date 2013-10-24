import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMethods {

    public static double sqr(double x) {
        return x * x;
    }

    public static int quersumme(int k) {
        int qs = 0;
        while(k != 0) {
            qs = qs + k % 10;
            k /= 10;
        }
        return qs;
    }

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

    public static long readLong(String ausgabe) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            return scanner.nextLong();
        } catch(InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readLong(ausgabe);
        }
    }

    public static String readString(String ausgabe) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            return scanner.next();
        } catch(InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readString(ausgabe);
        }
    }

    public static boolean readBoolean(String ausgabe) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            return scanner.nextBoolean();
        } catch(InputMismatchException e) {
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readBoolean(ausgabe);
        }
    }

    public static double readDouble(String ausgabe) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(ausgabe);
            double wert = scanner.nextDouble();
            return wert;
        } catch(InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Du hast eine invalide Eingabe getätigt!");
            return readInt(ausgabe);
        }
    }
}
