/**
 * User: Marc Date: 28.10.13 Time: 16:13
 */
public class Blatt9 {

    public static void main(String[] args) {
        //aufgabe33();
        aufgabe34();
    }

    private static void aufgabe34() {
        System.out.println("Geben Sie die Daten einer CD ein:");
        String titel = MyMethods.readString("Titel:");
        int minuten = MyMethods.readInt("Spieldauer:");
        boolean augeliehen = MyMethods.readBoolean("ausgeliehen:");
        System.out.println("Ausgabe:");
        System.out.println(new CD(titel, minuten, augeliehen).toString());
    }

    private static void aufgabe33() {
        int exp;
        if(MyMethods.readBoolean("Mit double rechnen? (true/false)")) {
            int basis = MyMethods.readInt("Basis (ganze Zahl) eingeben:");
            exp = MyMethods.readInt("Exponent (ganze Zahl) eingeben:");
            System.out.println(basis + " hoch" + exp + " = " + MyMath.hoch(basis, exp));

        }
        else {
            double basis = MyMethods.readDouble("Basis (double Zahl) eingeben:");
            exp = MyMethods.readInt("Exponent (ganze Zahl) eingeben:");
            System.out.println(basis + " hoch" + exp + " = " + MyMath.hoch(basis, exp));
        }
    }
}
