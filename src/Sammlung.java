import java.util.ArrayList;
import java.util.Collections;

/**
 * Die Klasse Sammlung dient der Darstellung und Manipulation einer Sammlung von Zeichenketten.
 *
 * @author Dietmar Ratz
 * @version 19.08.2008
 */
public class Sammlung {

    private ArrayList<String> worte;

    /**
     * erzeugt eine zun�chst leere Sammlung.
     */
    public Sammlung() {
        worte = new ArrayList<String>();
    }

    /**
     * nimmt den String <code>s</code> in die Sammlung auf.
     *
     * @param s
     *         aufzunehmender String
     */
    public void fuegeHinzu(String s) {
        worte.add(s);
    }

    /**
     * entfernt den String <code>s</code> aus der Sammlung.
     *
     * @param s
     *         zu entfernender Wert
     */
    public void entferne(String s) {
        worte.remove(s);
    }

    /**
     * liefert genau dann den Wert <code>true</code> zur�ck, wenn der String <code>s</code> in der Sammlung enthalten
     * ist.
     *
     * @param s
     *         zu �berpr�fender Wert
     *
     * @return <code>true</code>, falls der String <code>s</code> in der Sammlung enthalten ist, und <code>false</code>,
     *         andernfalls.
     */
    public boolean enthaelt(String s) {
        return worte.contains(s);
    }

    /**
     * liefert die komplette Sammlung als <code>String</code>-Feld zur�ck.
     *
     * @return <code>null</code>, falls die Sammlung keine Strings enth�lt.
     */
    public String[] alsStringFeld() {
        return worte.toArray(new String[0]);
    }

    /**
     * sortiert die Sammlung alphabetisch.
     */
    public void sortieren() {
        Collections.sort(worte);
    }

}
