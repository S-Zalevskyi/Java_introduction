package inheritance.figure;

public class Test {

    public static void main(String[] args) {
        Figure[] figures = new Figure[]{

                new Circle(4.5D),
                new Square(5.6D),
                new Triangle(3.5D, 5.5D),
                new Circle(6.7D),
                new Circle(2.2D),
        };

        for (Figure figure: figures) {

//            sum += figure.area(); !!!!!!!

            System.out.println("Summa powierzchni to ");

        }

    }
}
