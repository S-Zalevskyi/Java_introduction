package classes.basics.exercise;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3.0D,1.0D);
        Point point2 = new Point(4.0,7.0);

        double distance = Point.distance(point1,point2); //Point название класса, метод distance
        System.out.println(distance);

        distance = point1.distanceTo(point2);
        System.out.println(distance);
        //аналог
        distance = point2.distanceTo(point1);
        System.out.println(distance);

        PointCollectnio pointCollectnio = new PointCollectnio();
        pointCollectnio.addPoints(point1);
        pointCollectnio.addPoints(point1, point2);
        pointCollectnio.addPoints(new Point[] {point1, point2});
        pointCollectnio.addPoints(new Point( 5.0D, 7.0D));
        pointCollectnio.printMaxMinPoints();
        pointCollectnio.printStats();
    }
}