/**
 * User: Marc Date: 06.11.13 Time: 11:58
 */
public class DameFigur extends Spielfigur {

    private final String name = "Dame";

    public DameFigur(char x, int y, String f) {
        super(x, y, f);
    }

    public void ziehe(char richtung, int anzahl) {
        switch(richtung) {
            case '-':
                super.ziehe(-anzahl, 0);
                break;
            case '|':
                super.ziehe(0, -anzahl);
                break;
            case '/':
                super.ziehe(1 * anzahl, -1 * anzahl);
                break;
            case '\\':
                super.ziehe(1 * anzahl, 1 * anzahl);
                break;
            default:
                super.ziehe(0, 0);
                break;
        }
    }

    public boolean trifft(DameFigur figur2) {
        if(this.getXpos() == figur2.getXpos() && this.getYpos() == figur2.getYpos()) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.getFarbe() + "e Dame auf Feld " + this.getXpos() + this.getYpos();
    }
}
