package inheritance.figure;

public class Circle implements Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2); /*(r, 2.0) значит r в квадрате, pow значит что будет измерятся в double*/
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}

//(podstawa * wysokosc) *2
