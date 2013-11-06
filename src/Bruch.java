/**
 * User: Marc Date: 06.11.13 Time: 11:22
 */
public class Bruch {

    private int zaehler, nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public Bruch() {}

    public static int ggt(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while(x != y) if(x > y) x -= y;
        else y -= x;
        return x;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Bruch kuerze() {
        int ggt = ggt(nenner, zaehler);
        Bruch gekuerzt = new Bruch(zaehler, nenner);
        if(gekuerzt.getZaehler() < 0 && gekuerzt.getNenner() < 0) {
            gekuerzt.setNenner(gekuerzt.getNenner() * -1);
            gekuerzt.setZaehler(gekuerzt.getZaehler() * -1);
        }
        gekuerzt.setNenner(gekuerzt.getNenner() / ggt);
        gekuerzt.setZaehler(gekuerzt.getZaehler() / ggt);
        return gekuerzt;
    }

    public Bruch kehrwert() {
        return new Bruch(nenner, zaehler);
    }

    public Bruch neg() {
        return new Bruch(zaehler * -1, nenner);
    }

    public double wert() {
        return (double) zaehler / nenner;
    }

    public Bruch mul(Bruch zahl2) {
        Bruch neueBruchzahl = new Bruch();
        neueBruchzahl.setZaehler(zaehler * zahl2.getZaehler());
        neueBruchzahl.setNenner(nenner * zahl2.getNenner());
        return neueBruchzahl.kuerze();
    }

    public Bruch add(Bruch zahl2) {
        Bruch neueBruchzahl = new Bruch();
        neueBruchzahl.setNenner(zahl2.getNenner() * nenner);
        neueBruchzahl.setZaehler(zaehler * zahl2.getNenner() + zahl2.getZaehler() * nenner);
        return (neueBruchzahl).kuerze();
    }

    public Bruch sub(Bruch zahl2) {
        return add(zahl2.neg());
    }

    public Bruch div(Bruch zahl2) {
        // division=multiplikation mit kehrwert
        return mul(zahl2.kehrwert()).kuerze();
    }

    public void einlesen() {
        zaehler = MyMethods.readInt("Zähler:");
        do {
            nenner = MyMethods.readInt("Nenner:");
        } while(nenner == 0);
    }
}
