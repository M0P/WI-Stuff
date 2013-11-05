/**
 * Created with IntelliJ IDEA.
 * User: marc
 * Date: 05.11.13
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class Sound {

    private String raum;
    private int laut, bass, hoch;

    public Sound(String raum, int laut, int bass, int hoch) {
        this.raum = raum;
        this.laut = laut;
        this.bass = bass;
        this.hoch = hoch;

    }

    public int getLautstaerke() {
        return laut;
    }

    public void verstaerke(String regler, int wert) {
        switch (regler) {
            case "baesse":
                bass += wert;
                break;
            case "hoehen":
                hoch += wert;
                break;
            default:
                laut += wert;
                break;
        }
    }

    public String toString() {
        return "Anlage im Raum " + raum + ": la: " + laut + ", ba: " + bass + ", ho: " + hoch;
    }
}
