package exercise2.lenghts;

import java.util.Scanner;

public class Miles {

    protected void changeMiles() {

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

        float MILES = enterAmount;
        float KM = enterAmount * 1.609F;
        float METERS = enterAmount * 1609F;
        float CM = enterAmount * 160934F;

        switch (inputChangeTo) {
            case "miles":
                System.out.println(enterAmount + " miles converted to miles it: " + MILES + " miles");
                break;
            case "cm":
                System.out.println(enterAmount + " miles converted to centimeters it: " + CM + " centimeters");
                break;
            case "meters":
                System.out.println(enterAmount + " miles converted to meters it: " + METERS + " meters");
                break;
            case "km":
                System.out.println(enterAmount + " miles converted to kilometers it: " + KM + " kilometers");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}
