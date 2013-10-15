import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] f = {1, 2};
        int a = 3;
        int s = abc(a, f);
        System.out.println(f[1] + "");
        System.out.println(a);
        System.out.println(s);
        //Aufgabe 1
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);
        System.out.println(10 % 3);


        //Aufgabe 3
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib deinen Namen ein:");
        String name = scan.next();
        System.out.println();
        System.out.print("Gib dein Alter ein:");
        int alter;
        try {
            alter = scan.nextInt();
        } catch (InputMismatchException re) {
            System.out.println("Da du ein falsches Alter eingegeben hast bist du nun nur noch 1 Jahr alt!");
            alter = 1;
        }
        System.out.println();

        System.out.println("Du heißt " + name + " und bist " + alter + " Jahr(e) alt, dies sind ca. " + alter * 365 + " Tage");


        //Aufgabe 4
        int zeitInSek = 158036521;
        int minute = 60;
        int stunde = 60 * minute;
        int tag = 24 * stunde;
        int jahr = 365 * tag;

        System.out.print("Gib eine Zahl in Sekunden an:");
        Scanner scanner = new Scanner(System.in);
        try {
            zeitInSek = scanner.nextInt();
        } catch (InputMismatchException re) {
            System.out.println("Da du keine korrekte Zahl eingegeben hast wird der Beispiel Wert benutzt!");
        }
        System.out.println();

        System.out.println(zeitInSek + " Sekunden entsprechen:");
        System.out.println(zeitInSek / jahr);
        zeitInSek = zeitInSek % jahr;
        System.out.println(zeitInSek / tag);
        zeitInSek = zeitInSek % tag;
        System.out.println(zeitInSek / stunde);
        zeitInSek = zeitInSek % stunde;
        System.out.println(zeitInSek / minute);
        zeitInSek = zeitInSek % minute;
        System.out.println(zeitInSek);

        //Aufgabe 6

        double x1 = Math.pow(10.0, 20.0);
        double x2 = 1223;
        double x3 = Math.pow(10.0, 18.0);
        double x4 = Math.pow(10.0, 15.0);
        double x5 = 3;
        double x6 = Math.pow(10.0, 12.0) * -1;
        double y1 = Math.pow(10.0, 20.0);
        double y2 = 2;
        double y3 = Math.pow(10.0, 22.0) * -1;
        double y4 = Math.pow(10.0, 13.0);
        double y5 = 2111;
        double y6 = Math.pow(10.0, 16.0);
        System.out.println(x1 * y1 + x2 * y2 + x3 * y3 + x4 * y4 + x5 * y5 + x6 * y6);

        double x = 192119201;
        double y = 35675640;
        System.out.println(1 / 107751 * (1682 * x * Math.pow(y, 4.0) + 3 * Math.pow(x, 3.0) + 29 * x * y * y - 2 * Math.pow(x, 5.0) + 832));

        System.out.println((x * y * y) / (107751) * (1682 * y * y + 29) + Math.pow(x, 3.0) / 107751 * (3 - 2 * x * x) + 832 / 107751);


    }

    private static int abc(int a, int[] f) {
        int temp = 0;
        for (int i = 0; i < f.length; i++) {
            temp = temp + a * f[i];
            a++;
        }
        f[1] = 5;
        return temp;
    }
}
