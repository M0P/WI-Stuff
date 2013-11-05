public class TestSound {
    public static void main(String[] args) {
        int laut, bass, hoch;
        String raum;
        Sound anlage;

        System.out.println("Daten fuer eine Anlage einlesen");
        raum = MyMethods.readString("Raum-Bezeichnung: ");
        laut = MyMethods.readInt("Standard-Einstellung fuer die Lautstaerke: ");
        bass = MyMethods.readInt("Standard-Einstellung fuer die Baesse: ");
        hoch = MyMethods.readInt("Standard-Einstellung fuer die Hoehen: ");
        System.out.println();

        // Anlage erzeugen
        anlage = new Sound(raum, laut, bass, hoch);

        System.out.println("Daten der Anlage ausgeben");
        System.out.println(anlage);
        System.out.println();

        System.out.println("Die Anlage wird nun anders eingestellt");
        System.out.println("(Baesse um 4 erhoeht, Hoehen um 2 erniedrigt)");
        anlage.verstaerke("baesse", 4);
        anlage.verstaerke("hoehen", -2);
        System.out.println();

        System.out.println("Daten der neu eingestellten Anlage ausgeben");
        System.out.println(anlage);
    }
}

