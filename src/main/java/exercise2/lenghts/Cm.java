package exercise2.lenghts;

import java.util.Scanner;

public class Cm {

    protected void changeCm() {

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

        float MILES = enterAmount / 160934F;
        float KM = enterAmount / 100_000F;
        float METERS = enterAmount / 100F;
        float CM = enterAmount;

        switch (inputChangeTo) {
            case "miles":
                System.out.println(enterAmount + " centimeters converted to miles it: " + MILES + " miles");
                break;
            case "cm":
                System.out.println(enterAmount + " centimeters converted to centimeters it: " + CM + " centimeters");
                break;
            case "meters":
                System.out.println(enterAmount + " centimeters converted to meters it: " + METERS + " meters");
                break;
            case "km":
                System.out.println(enterAmount + " centimeters converted to kilometers it: " + KM + " kilometers");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}
