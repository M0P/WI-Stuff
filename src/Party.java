/**
 * Created with IntelliJ IDEA.
 * User: marc
 * Date: 05.11.13
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class Party {
    public static void main(String[] args) {
        CD[] cdf;
        int anzahlCD = MyMethods.readInt("Wie viele CDs willst du eingeben?");
        cdf = new CD[anzahlCD];
        einlesen(cdf);
        sortieren(cdf);
        vorhandeneAusgeben(cdf);

    }

    public static void einlesen(CD[] cdf) {
        for (int i = 0; i < cdf.length; i++) {
            String titel = MyMethods.readString("Titel:");
            int minuten = MyMethods.readInt("Spieldauer:");
            boolean augeliehen = MyMethods.readBoolean("ausgeliehen:");
            cdf[i] = new CD(titel, minuten, augeliehen);
        }

    }

    public static void sortieren(CD[] cdf) {
        for (int i = 0; i < cdf.length - 2; i++) {
            int max_index = i;
            for (int j = i; j < cdf.length; j++) {
                max_index = cdf[j].getSpielDauerMinuten() > cdf[max_index].getSpielDauerMinuten() ? j : max_index;
            }
            CD temp = cdf[i];
            cdf[i] = cdf[max_index];
            cdf[max_index] = temp;
        }
    }

    public static void vorhandeneAusgeben(CD[] cdf) {
        for (CD cd : cdf)
            if (!cd.isAusleihStatus())
                System.out.println(cd.toString());
    }
}
