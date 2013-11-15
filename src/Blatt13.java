import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * User: Marc Date: 15.11.13 Time: 13:46
 */
public class Blatt13 {

    public Blatt13() {
        aufgabe48();
    }

    public Blatt13(double zahl1, String operator, double zahl2) {
        aufgabe47(zahl1, operator, zahl2);
    }

    public static void main(String[] args) {
        if(args.length >= 3) new Blatt13(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2]));
        else new Blatt13();
    }

    private void aufgabe48() {
        System.out.println("Geben Sie beliebig viele Strings Ihrer Wahl (einer pro Zeile) ein.\n" + "Beenden Sie Ihre" +
                                   " Eingaben mit \"Stop\".");
        Sammlung sammlung = new Sammlung();
        String eingabe = "";
        do {
            eingabe = MyMethods.readString("Eingabe: ");
            sammlung.fuegeHinzu(eingabe);
        } while(!eingabe.equals("Stop"));
        sammlung.entferne("Stop");
        System.out.println("Die Sammlung Ihre Eingaben lautet");
        Map sammlungsMap = new HashMap<String, Integer>();
        for(String s : sammlung.alsStringFeld()) {
            System.out.println("--> " + s);
            //Einlesen der Sammlung
            if(sammlungsMap.containsKey(s)) sammlungsMap.put(s, ((Integer) sammlungsMap.get(s)).intValue() + 1);
            else sammlungsMap.put(s, 1);
        }
        System.out.println("Nach dem Entfernen von Duplikaten und Sortieren lautet Ihre Sammlung");
        //Duplikate mit Hilfe der Map eliminieren
        Iterator cursor = sammlungsMap.entrySet().iterator();
        while(cursor.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry) cursor.next();
            int anzahlVorkommen = pair.getValue().intValue();
            while(anzahlVorkommen > 1) {
                sammlung.entferne(pair.getKey());
                anzahlVorkommen--;
            }
        }
        sammlung.sortieren();
        for(String s : sammlung.alsStringFeld())
            System.out.println("--> " + s);
    }

    private void aufgabe47(double zahl1, String operator, double zahl2) {
        switch(operator) {
            case "+":
                System.out.println("Ergebnis: " + (zahl1 + zahl2));
                break;
            case "-":
                System.out.println("Ergebnis: " + (zahl1 - zahl2));
                break;
            case "*":
                System.out.println("Ergebnis: " + (zahl1 * zahl2));
                break;
            case "/":
                System.out.println("Ergebnis: " + (zahl1 / zahl2));
                break;
            default:
                System.out.println("Falscher oder undefinierter Operator (+,-,*,/)!");
                break;
        }
    }

}
