public class Rechnen {

    /**
     * Liest die Komponenten (Zähler und Nenner) der Bruchzahl durch eingabe von der Konsole ein und weist diese einer
     * Instanz eines Bruchzahl Objektes zu
     *
     * @param zahl
     *         die Instanz des Bruchzahl Objektes für welches die Werte eingelesen werden sollen
     */
    public void einlesen(Bruchzahl zahl) {
        zahl.setZaehler(Blatt8.readInt("Bitte den Zähler eingeben:"));
        int nenner;
        do nenner = Blatt8.readInt("Bitte den Nenner eingeben (ungleich 0):"); while(nenner == 0);
        zahl.setNenner(nenner);
    }

    /**
     * Gibt die Variablen zaehler des Objektes durch einen Divisionsstrich (/) getrennt auf dem Bildschirm aus
     *
     * @param zahl
     *         die Instanz des Bruchzahl Objektes welches ausgegeben werden soll
     */
    public void ausgeben(Bruchzahl zahl) {
        System.out.println(zahl.getZaehler() + "/" + zahl.getNenner());
    }

    /**
     * Gibt die Variablen zaehler des Objektes durch einen Divisionsstrich (/) getrennt und zusätzlich Dezimal auf dem
     * Bildschirm aus
     *
     * @param zahl
     *         die Instanz des Bruchzahl Objektes welches ausgegeben werden soll
     */
    public void ausgebenExtended(Bruchzahl zahl) {
        System.out.println(zahl.getZaehler() + "/" + zahl.getNenner() + " (" + wert(zahl) + ")");
    }

    /**
     * Dividiert den Zähler und Nenner eines Bruchzahlobjektes durcheinander
     *
     * @param bruchzahl
     *         die Instanz des Bruchzahl Objektes welches brechnet werden soll
     *
     * @return des Ergebnis der Division Zähler/Nenner
     */
    public double wert(Bruchzahl bruchzahl) {
        return (double) bruchzahl.getZaehler() / bruchzahl.getNenner();
    }

    /**
     * Berechnet den Kehrwert einer Bruchzahl
     *
     * @param bruchzahl
     *         die Instanz des Bruchzahl Objektes welches brechnet werden soll
     *
     * @return eine neue Instanz eines Bruchzahl Objektes mit den Kehrwerten des übergebenen Objektes
     */
    public Bruchzahl kehrwert(Bruchzahl bruchzahl) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(bruchzahl.getNenner());
        neueBruchzahl.setNenner(bruchzahl.getZaehler());
        return neueBruchzahl;
    }

    /**
     * Berechnet den Kehrwert einer Bruchzahl
     *
     * @param bruchzahl
     *         die Instanz des Bruchzahl Objektes welches brechnet werden soll
     *
     * @return eine neue Instanz eines Bruchzahl Objektes mit negierten Werten des übergebenen Objektes
     */
    public Bruchzahl neg(Bruchzahl bruchzahl) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(bruchzahl.getZaehler() * -1);
        neueBruchzahl.setNenner(bruchzahl.getNenner());
        return neueBruchzahl;
    }

    /**
     * Kürzt eine Bruchzahl
     *
     * @param bruchzahl
     *         die Instanz des Bruchzahl Objektes welches gekürzt werden soll
     *
     * @return eine neue Instanz eines Bruchzahl Objektes welches gekürzt ist
     */
    public Bruchzahl kuerzen(Bruchzahl bruchzahl) {
        int ggt = ggt(bruchzahl.getNenner(), bruchzahl.getZaehler());
        if(bruchzahl.getZaehler() < 0 && bruchzahl.getNenner() < 0) {
            bruchzahl.setNenner(bruchzahl.getNenner() * -1);
            bruchzahl.setZaehler(bruchzahl.getZaehler() * -1);
        }
        bruchzahl.setNenner(bruchzahl.getNenner() / ggt);
        bruchzahl.setZaehler(bruchzahl.getZaehler() / ggt);
        return bruchzahl;
    }

    public int ggt(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while(x != y) if(x > y) x -= y;
        else y -= x;
        return x;
    }

    /**
     * multipliziert 2 Bruchzahlen miteinander
     *
     * @param zahl1
     *         die Instanz des 1. Bruchzahl Objektes
     * @param zahl2
     *         die Instanz des 2. Bruchzahl Objektes
     *
     * @return eine neue gekürzte Instanz von Bruchzahl, als Ergebnis der Multiplikation
     */
    public Bruchzahl mul(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getZaehler());
        neueBruchzahl.setNenner(zahl1.getNenner() * zahl2.getNenner());
        return kuerzen(neueBruchzahl);
    }

    /**
     * dividiert 2 Bruchzahlen miteinander
     *
     * @param zahl1
     *         die Instanz des 1. Bruchzahl Objektes
     * @param zahl2
     *         die Instanz des 2. Bruchzahl Objektes
     *
     * @return eine neue gekürzte Instanz von Bruchzahl, als Ergebnis der Division
     */
    public Bruchzahl div(Bruchzahl zahl1, Bruchzahl zahl2) {
        // division=multiplikation mit kehrwert
        return mul(zahl1, kehrwert(zahl2));
    }

    /**
     * addiert 2 Bruchzahlen
     *
     * @param zahl1
     *         die Instanz des 1. Bruchzahl Objektes
     * @param zahl2
     *         die Instanz des 2. Bruchzahl Objektes
     *
     * @return eine neue gekürzte Instanz von Bruchzahl, als Ergebnis der Addition
     */
    public Bruchzahl add(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setNenner(zahl2.getNenner() * zahl1.getNenner());
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getNenner() + zahl2.getZaehler() * zahl1.getNenner());
        return kuerzen(neueBruchzahl);
    }

    /**
     * subtrahiert 2 Bruchzahlen
     *
     * @param zahl1
     *         die Instanz des 1. Bruchzahl Objektes
     * @param zahl2
     *         die Instanz des 2. Bruchzahl Objektes
     *
     * @return eine neue gekürzte Instanz von Bruchzahl, als Ergebnis der Subtraktion
     */
    public Bruchzahl sub(Bruchzahl zahl1, Bruchzahl zahl2) {
        return add(zahl1, neg(zahl2));
    }

}
