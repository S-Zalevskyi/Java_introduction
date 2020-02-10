package inheritance.figure;

public class Triangle implements Figure {

    private double wysokosc;
    private double dol;

    public Triangle(double wysokosc, double dol) {
        this.wysokosc = wysokosc;
        this.dol = dol;
    }

    @Override
    public double area() {
        return (wysokosc * dol) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "wysokosc=" + wysokosc +
                ", dol=" + dol +
                '}';
    }
}
