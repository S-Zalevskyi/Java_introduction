package classes.basics.exercise;

public class PointCollectnio {

    Point[] points = new Point[100]; //создали таблицу со 100 ячейками
    int pointNumber = 0;

    void addPoints(Point... points) {
        for (Point newPoint: points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }

    }

    void printStats() {
        for (int i = 0; i < pointNumber; i++) {

        }
    }

    void printMaxMinPoints() {
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;
        for (int i = 0; i < pointNumber; i++) {
            Point point1 = points[i];
            for (int j = 0; j < pointNumber; j++) {
                Point point2 = points[j];
                if (point1 == point2)   {
                    continue;
                }
                double distance = point1.distanceTo(point2);
                if(distance < min) {
                    min = distance;
                }
                if (distance > max) {
                    max = distance;
                }
            }
        }
    }

    void printPoint(Point point) {
        System.out.println("Point(x: " + point.getX() + ", y: " + point.getY() + ")");
    }
}
