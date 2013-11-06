/**
 * User: Marc Date: 06.11.13 Time: 11:42
 */
public class BruchRechner {


    public static void main(String[] args) {
        boolean loop = true;
        Bruch b1 = new Bruch(0, 0);
        Bruch b2 = new Bruch(0, 0);
        String intent = "    ";
        while(loop) {
            System.out.println("Bruch 1: " + b1);
            System.out.println("Bruch 2: " + b2 + "\n");
            System.out.println("Aktionen:");
            System.out.println(intent + "x: beenden");
            System.out.println(intent + "1: Bruch 1 eingeben");
            System.out.println(intent + "2: Bruch 2 eingeben");
            System.out.println(intent + "b: Brüche kürzen");
            System.out.println(intent + "+,-,*,/: Grundrechenarten");
            System.out.println(intent + "n: Bruch 1 negativ");
            System.out.println(intent + "k: Kehrwert von Bruch 1");
            System.out.println(intent + "d: Double-Wert von Bruch 1");
            String eingabe = MyMethods.readString("Auswahl:");
            switch(eingabe) {
                case "x":
                    loop = false;
                    break;
                case "1":
                    b1.einlesen();
                    break;
                case "2":
                    b2.einlesen();
                    break;
                case "b":
                    b1 = b1.kuerze();
                    b2 = b2.kuerze();
                    break;
                case "+":
                    printR(b1.add(b2));
                    break;
                case "-":
                    printR(b1.sub(b2));
                    break;
                case "*":
                    printR(b1.mul(b2));
                    break;
                case "/":
                    printR(b1.div(b2));
                    break;
                case "n":
                    b1 = b1.neg();
                    break;
                case "k":
                    b1 = b1.kehrwert();
                    break;
                case "d":
                    System.out.println("Ergebnis: " + b1.wert());
                    break;
            }
        }
    }

    public static void printR(Bruch b) {
        System.out.println("Ergebnis: " + b);
    }
}
