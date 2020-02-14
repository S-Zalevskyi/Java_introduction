package exercise2.lenghts;

import java.util.Scanner;

public class Meters {

    protected void changeMeters() {

        Scanner scanner = new Scanner(System.in);

        String inputChangeTo = scanner.nextLine();

        switch (inputChangeTo) {
            case "miles":
            case "cm":
            case "meters":
            case "km":
                System.out.println("Please enter the amount");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }

        int enterAmount = scanner.nextInt();

        float MILES = enterAmount / 1609F;
        float KM = enterAmount / 1000F;
        float METERS = enterAmount;
        float CM = enterAmount * 100F;

        switch (inputChangeTo) {
            case "miles":
                System.out.println(enterAmount + " meters converted to miles it: " + MILES + " miles");
                break;
            case "cm":
                System.out.println(enterAmount + " meters converted to centimeters it: " + CM + " centimeters");
                break;
            case "meters":
                System.out.println(enterAmount + " meters converted to meters it: " + METERS + " meters");
                break;
            case "km":
                System.out.println(enterAmount + " meters converted to kilometers it: " + KM + " kilometers");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}
