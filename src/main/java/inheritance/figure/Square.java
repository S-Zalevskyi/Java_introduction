package inheritance.figure;

public class Square implements Figure {

    private double s;

    public Square(double s) {
        this.s = s;
    }


    @Override
    public double area() {
        return Math.pow(s, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                '}';
    }
}
