public class Bruch1 {

    public int zaehler;
    public int nenner;

    public Bruch1(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public Bruch1() {

    }

    public static int ggt(int zaehler, int nenner) {
        if(zaehler == 0) return nenner;
        if(nenner == 0) return zaehler;
        int x = Math.abs(zaehler);
        int y = Math.abs(nenner);
        while(x != y) if(x > y) x = x - y;
        else y = y - x;
        return x;

    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Bruch1 kuerze() {
        Bruch1 a = new Bruch1(zaehler, nenner);
        zaehler = zaehler / ggt(zaehler, nenner);
        nenner = nenner / ggt(zaehler, nenner);
        return a;
    }

    public void einlesen() {
        zaehler = MyMethods.readInt("Bitte geben sie einen Z�hler ein:");
        nenner = 0;
        while(nenner == 0) {
            nenner = MyMethods.readInt("Bitte geben Sie einen Nenner(ungleich 0) ein:");


        }

    }

    public Bruch1 kehrwert() {
        Bruch1 a = new Bruch1(nenner, zaehler);
        return a;
    }

    public Bruch1 neg() {
        Bruch1 a = new Bruch1(zaehler * -1, nenner);
        return a;
    }

    public double wert() {
        return (double) zaehler / nenner;
    }

    public Bruch1 mul(Bruch1 b) {
        Bruch1 a = new Bruch1(zaehler * b.zaehler, nenner * b.nenner);
        return a;
    }

    public Bruch1 div(Bruch1 b) {

        return mul(b.kehrwert());
    }

    public Bruch1 add(Bruch1 b) {
        Bruch1 a = new Bruch1(zaehler * b.zaehler + b.zaehler * nenner, nenner * b.nenner).kuerze();
        return a;
    }

    public Bruch1 sub(Bruch1 b) {
        Bruch1 a = new Bruch1(zaehler - b.zaehler, nenner - b.nenner);
        return a;
    }


}