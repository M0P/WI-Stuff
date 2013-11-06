/**
 * User: Marc Date: 06.11.13 Time: 11:08
 */
public class Strecke {

    private Punkt p, q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    public void read() {
        p = new Punkt();
        q = new Punkt();
        System.out.println("1.Punkt (p)");
        p.read();
        System.out.println("2.Punkt (q)");
        q.read();

    }

    public double getLaenge() {
        if(p != null && q != null)
            return Math.sqrt(MyMath.hoch(p.getX() - q.getX(), 2) + MyMath.hoch(p.getY() - q.getY(), 2));
        else return -1;
    }

    public String toString() {
        return p + "_" + q;
    }

}
