/**
 * User: Marc Date: 06.11.13 Time: 12:18
 */
public class DSpiel {

    private final DameFigur beute;
    private       DameFigur jaeger;

    public DSpiel() {
        System.out.println("Positionieren Sie die Beute");
        int[] position = readPosition();
        beute = new DameFigur((char) position[0], position[1], MyMethods.readString("Farbe der Figur?"));
        Bildschirm.loeschen();
        System.out.println("Die Beute steht. Positionieren Sie den Jäger");
        position = readPosition();
        jaeger = new DameFigur((char) position[0], position[1], MyMethods.readString("Farbe der Figur?"));
        if(beute.trifft(jaeger)) {
            sieg();
        }
        game();
    }

    public static void main(String[] args) {
        new DSpiel();
    }

    public void game() {
        String jaegerfarbe = jaeger.getFarbe();
        for(int i = 10; i > 0; i--) {
            System.out.println("Sie haben noch " + i + " Dame-Züge um die Beute-Figur zu treffen");
            System.out.println("Bewegen Sie ihre Dame der Farbe " + jaegerfarbe + " auf dem Feld " + jaeger.getXpos()
                                       + jaeger.getYpos());
            int[] bewegung = readBewegung();
            jaeger.ziehe((char) bewegung[0], bewegung[1]);
            if(beute.trifft(jaeger)) sieg();
            System.out.println("Leider kein Treffer!");
            System.out.println();
        }
        System.out.println("Beute nicht gefunden! Sie (als Jaeger haben verloren)");
    }

    public void sieg() {
        System.out.println("Treffer! Sie (als Jaeger) haben gewonnen");
        System.exit(0);
    }

    public int[] readBewegung() {
        String eingabeRichtung = MyMethods.readString("Wollen Sie waagrecht (-), senkrecht (|) oder diagonal (/, " +
                                                              "" + "\\) ziehen?");
        int[] bewegung = new int[2];
        switch(eingabeRichtung) {
            case "-":
                bewegung[0] = '-';
                bewegung[1] = MyMethods.readInt("Wieviele Felder ziehen? (< 0 nach links, > 0 nach rechts)");
                return bewegung;
            case "|":
                bewegung[0] = '|';
                bewegung[1] = MyMethods.readInt("Wieviele Felder ziehen? (> 0 nach oben, < 0 nach unten)");
                return bewegung;
            case "/":
                bewegung[0] = '/';
                bewegung[1] = MyMethods.readInt("Wieviele Felder ziehen? (> 0 nach oben rechts, < 0 nach unten links)");
                return bewegung;
            case "\\":
                bewegung[0] = '\\';
                bewegung[1] = MyMethods.readInt("Wieviele Felder ziehen? (> 0 nach unten rechts, < 0 nach oben links)");
                return bewegung;
        }
        return readBewegung();
    }

    private int[] readPosition() {
        boolean loop;
        int[] feld = new int[2];
        do {
            loop = false;
            String spalte = MyMethods.readString("Spalte (A bis H) der Figur:");
            switch(spalte) {
                case "a":
                case "A":
                    feld[0] = 'A';
                    break;
                case "b":
                case "B":
                    feld[0] = 'B';
                    break;
                case "c":
                case "C":
                    feld[0] = 'C';
                    break;
                case "d":
                case "D":
                    feld[0] = 'D';
                    break;
                case "e":
                case "E":
                    feld[0] = 'E';
                    break;
                case "f":
                case "F":
                    feld[0] = 'F';
                    break;
                case "g":
                case "G":
                    feld[0] = 'G';
                    break;
                case "H":
                case "h":
                    feld[0] = 'H';
                    break;
                default:
                    loop = true;
            }
        } while(loop);
        while(feld[1] < 1 || feld[1] > 8) feld[1] = MyMethods.readInt("Zeile (1 bis 8) der Figur:");
        return feld;
    }
}
