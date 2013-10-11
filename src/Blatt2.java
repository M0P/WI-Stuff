public class Blatt2 {
    public static void main(String[] args) {
        double a, b, c, d, e;
        a = 8;
        b = 5;
        c = 7;
        d = 6;

        if (a >= b && a >= c && a >= d) System.out.println("e = " + a);
        else if (b >= a && b >= c && b >= d) System.out.println("e = " + b);
        else if (c >= a && c >= b && c >= d) System.out.println("e = " + c);
        else System.out.println("e = " + d);

        e = a;
        System.out.println(b > e ? c > e ? d > e ? d : c : b : e);

        int n = 2;
        int i = 3;
        while (i < 2 * n) {
            i++;
            System.out.println(3.14 / (2 * i - 1));
        }

        for (i = 3; i < 2 * n; ) {
            i++;
            System.out.println(3.14 / (2 * i - 1));
        }

        i = 3;

        do {
            i++;
            System.out.println(3.14 / (2 * i - 1));
        } while (i < 2 * n);

        int zahl = 16;
        int quer = 0;
        while (zahl != 0) {
            quer += zahl % 10;  // quer=quer+zahl%10;
            zahl /= 10;         //zahl = zahl/10
        }
        System.out.println(quer);

        zahl = 16;
        quer = 0;
        do {
            quer += zahl % 10;  // quer=quer+zahl%10;
            zahl /= 10;         //zahl = zahl/10
        } while (zahl != 0);
        System.out.println(quer);

        for (quer = 0, zahl = 16; zahl != 0; quer += zahl % 10, zahl /= 10) ;
        System.out.println(quer);


        for (int a1 = 0, b1 = 16; b1 != 0; a1 += b1 % 10, b1 /= 10) ;

        for (int l = 10, m = 10; l + m > 0; l -= 2, m--)
            System.out.println(l + m);

        //Fakultät
        long fak = 1; //Hihihihi
        int k = 5;
        while (k > 1) {
            fak *= k; //fak=fak*k
            k--;    //k=k-1;
        }
    }

}