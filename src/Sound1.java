public class Sound1 {

    private String raum;
    private int    lautstaerke;
    private int    baesse;
    private int    hoehe;

    public Sound1(String raum, int lautstaerke, int baesse, int hoehe) {
        this.raum = raum;
        this.lautstaerke = lautstaerke;
        this.baesse = baesse;
        this.hoehe = hoehe;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void verstaerke(String regler, int wert) {
        if(regler.equals("lautstaerke")) {
            lautstaerke = lautstaerke + wert;
        }

        else if(regler.equals("baesse")) {
            baesse = baesse + wert;
        }
        else if(regler.equals("hoehe")) hoehe = hoehe + wert;
    }

    public String toString() {
        return "Anlage im Raum: " + raum + " la: " + lautstaerke + " ba: " + baesse + " ho: " + hoehe;
    }


}
