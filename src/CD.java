/**
 * User: Marc Date: 28.10.13 Time: 16:47
 */
public class CD {

    private String titel;
    private int spielDauerMinuten;
    private boolean ausleihStatus;

    public CD(String titel, int spielDauer, boolean ausgeliehen) {
        this.titel = titel;
        this.spielDauerMinuten = spielDauer;
        this.ausleihStatus = ausgeliehen;
    }

    public int getSpielDauerMinuten() {
        return spielDauerMinuten;
    }

    public String getTitel() {
        return titel;
    }

    public boolean isAusleihStatus() {
        return ausleihStatus;
    }

    public String toString() {
        return titel + " (" + spielDauerMinuten + ".0 Minuten)";
    }
}
