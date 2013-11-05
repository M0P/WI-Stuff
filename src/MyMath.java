/**
 * User: Marc Date: 28.10.13 Time: 16:14
 */
public class MyMath {

    public static int hoch(int basis, int exp) {
        return (int) hoch((double) basis, exp);
    }

    public static double hoch(double basis, int exp) {
        if(exp > 0) return exp > 1 ? basis * hoch(basis, exp - 1) : basis;
        else return exp < 1 ? hoch(basis, exp + 1) / basis : basis;
    }

}
