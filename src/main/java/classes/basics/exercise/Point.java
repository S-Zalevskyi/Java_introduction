package classes.basics.exercise;

public class Point {

    private double x;
    private double y;

    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2)); //измерение дистанции
    }

    public double distanceTo(Point other) {  //название конструктора может быть такая же как у пред. Они отличаются по параметрам
        return distance(this, other);   //this всегда имеет тот тип в которым есть напсиан. В данном случае типа Point!!!
    }

    public String toString() {
        return "Point (x: " + x + ", y: " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
