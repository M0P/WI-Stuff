public class Rechnen {
    public void einlesen(Bruchzahl zahl) {
        zahl.setZaehler(MyMethods.readInt("Bitte den Zähler eingeben:"));
        int nenner = 0;
        do
            nenner = MyMethods.readInt("Bitte den Zähler eingeben:");
        while (nenner == 0);
        zahl.setNenner(nenner);
    }

    public void ausgeben(Bruchzahl zahl) {
        System.out.println(zahl.getZaehler() + "/" + zahl.getNenner());
    }

    public double wert(Bruchzahl bruchzahl) {
        return (double) bruchzahl.getZaehler() / bruchzahl.getNenner();
    }

    public Bruchzahl kehrwert(Bruchzahl bruchzahl) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(bruchzahl.getNenner());
        neueBruchzahl.setNenner(bruchzahl.getZaehler());
        return neueBruchzahl;
    }

    public Bruchzahl neg(Bruchzahl bruchzahl) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(bruchzahl.getZaehler() * -1);
        return neueBruchzahl;
    }

    public Bruchzahl kuerzen(Bruchzahl bruchzahl) {
        int ggt = ggt(bruchzahl.getNenner(), bruchzahl.getZaehler());
        if (bruchzahl.getZaehler() < 0 && bruchzahl.getNenner() < 0) {
            bruchzahl.setNenner(bruchzahl.getNenner() * -1);
            bruchzahl.setZaehler(bruchzahl.getZaehler() * -1);
        }
        bruchzahl.setNenner(bruchzahl.getNenner() / ggt);
        bruchzahl.setZaehler(bruchzahl.getZaehler() / ggt);
        return bruchzahl;
    }

    public int ggt(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (x != y)
            if (x > y) x -= y;
            else y -= x;
        return x;
    }

    public Bruchzahl mul(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getZaehler());
        neueBruchzahl.setNenner(zahl1.getNenner() * zahl2.getNenner());
        return neueBruchzahl;
    }

    public Bruchzahl div(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getNenner());
        neueBruchzahl.setNenner(zahl1.getNenner() * zahl2.getZaehler());
        return neueBruchzahl;
    }

    public Bruchzahl add(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getNenner() + zahl2.getZaehler() * zahl1.getNenner());
        neueBruchzahl.setNenner(zahl2.getNenner() * zahl1.getNenner());
        return neueBruchzahl;
    }

    public Bruchzahl sub(Bruchzahl zahl1, Bruchzahl zahl2) {
        Bruchzahl neueBruchzahl = new Bruchzahl();
        neueBruchzahl.setZaehler(zahl1.getZaehler() * zahl2.getNenner() - zahl2.getZaehler() * zahl1.getNenner());
        neueBruchzahl.setNenner(zahl2.getNenner() * zahl1.getNenner());
        return neueBruchzahl;
    }

}
