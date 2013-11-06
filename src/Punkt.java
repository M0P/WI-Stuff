/**
 * User: Marc Date: 06.11.13 Time: 11:07
 */
public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read() {
        x = MyMethods.readDouble("Wert x:");
        y = MyMethods.readDouble("Wert y:");
    }

    public String toString() {
        return "(" + x + ", s" + y + ")";
    }

}

