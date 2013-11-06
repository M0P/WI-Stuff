/**
 * User: Marc Date: 06.11.13 Time: 14:33
 */
public class FarbFernseher extends Fernseher {

    private int farbwert;

    public FarbFernseher(String ra, int vo, int pr, int farbwert) {
        super(ra, vo, pr);
        this.farbwert = Math.max(0, Math.min(farbwert, 50));
    }

    @Override
    public void change(String einstell, int wert) {
        if(einstell.equals("color")) {
            farbwert = farbwert + wert;
            farbwert = Math.max(0, Math.min(farbwert, 50));
        }
        else super.change(einstell, wert);
    }

    @Override
    public String toString() {
        return super.toString() + ", farbe=" + farbwert;
    }

    public boolean istAngenehmerAls(FarbFernseher tv2) {
        if(this.getVolume() < tv2.getVolume() && this.farbwert < 40 && this.farbwert > tv2.farbwert) return true;
        return false;
    }
}
