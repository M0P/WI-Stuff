public class BruchTest1 {


    public static void main(String[] args) {

        Bruch1 b1 = new Bruch1();
        Bruch1 b2 = new Bruch1();

        b1.einlesen();
        b2.einlesen();

        System.out.println("Multiplikation:" + b1.mul(b2));
        System.out.println("Division:" + b1.div(b2));
        System.out.println("Addition:" + b1.add(b2));
        System.out.println("Subtraktion:" + b1.sub(b2));
        System.out.println("Doublewert:" + b1.wert());
        System.out.println("Kehrwert:" + b1.kehrwert());
        System.out.println("negativ:" + b1.neg());
        //System.out.println("gekuerzt:"+b1.kuerze());
        System.out.println(b1.ggt(b1.zaehler, b1.nenner));

    }

}
