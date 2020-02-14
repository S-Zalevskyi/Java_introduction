package exercise2.lenghts;

import java.util.Scanner;

public class Lenghts {

    Miles miles = new Miles();

    Km km = new Km();

    Meters meters = new Meters();

    Cm cm = new Cm();

    public void setLenghts() {

        Scanner scanner = new Scanner(System.in);

        String inputChange = scanner.nextLine();

        switch (inputChange) {
            case "miles":
                System.out.println("Good:) To miles/km/meters/cm?");
                miles.changeMiles();
                break;
            case "km":
                System.out.println("Good:) To miles/km/meters/cm?");
                km.changeKm();
                break;
            case "meters":
                System.out.println("Good:) To miles/km/meters/cm?");
                meters.changeMeters();
                break;
            case "cm":
                System.out.println("Good:) To miles/km/meters/cm?");
                cm.changeCm();
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}
