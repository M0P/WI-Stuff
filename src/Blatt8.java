public class Blatt8 {

    public static void main(String[] args) {
        int zahl1 = MyMethods.readInt("1. Zahl: ");
        int zahl2 = MyMethods.readInt("2. Zahl: ");
        Rechnen rechnen = new Rechnen();
        System.out.println("Das ggt von " + zahl1 + " und " + zahl2 + " beträgt:" + rechnen.ggt(zahl1, zahl2));
        Bruchzahl bruchzahl = new Bruchzahl();
        rechnen.einlesen(bruchzahl);
        rechnen.ausgeben(bruchzahl);
        System.out.println(rechnen.wert(bruchzahl));
        rechnen.kuerzen(bruchzahl);
        rechnen.ausgeben(bruchzahl);

        //Grundrechenarten
        //Bruchzahl 1
        Bruchzahl bzahl1 = new Bruchzahl();
        Bruchzahl bzahl2 = new Bruchzahl();
        rechnen.einlesen(bzahl1);
        rechnen.einlesen(bzahl2);
        rechnen.ausgeben(rechnen.kuerzen(rechnen.mul(bzahl1, bzahl2)));
        rechnen.ausgeben(rechnen.kuerzen(rechnen.div(bzahl1, bzahl2)));
        rechnen.ausgeben(rechnen.add(bzahl1, bzahl2));
        rechnen.ausgeben(rechnen.kuerzen(rechnen.add(bzahl1, bzahl2)));
        rechnen.ausgeben(rechnen.kuerzen(rechnen.sub(bzahl1, bzahl2)));
    }
}
