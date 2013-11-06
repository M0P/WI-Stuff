/**
 * User: Marc Date: 06.11.13 Time: 11:37
 */
public class BruchTest {

    public static void main(String[] args) {
        Bruch b1 = new Bruch();
        Bruch b2 = new Bruch();
        b1.einlesen();
        b2.einlesen();
        System.out.println(b1.mul(b2));
        System.out.println(b1.div(b2));
        System.out.println(b1.add(b2));
        System.out.println(b1.sub(b2));
        System.out.println(b1.wert());
        System.out.println(b1.kehrwert());
        System.out.println(b1.neg());
        System.out.println(b1.kuerze());

    }
}
