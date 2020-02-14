package exercise2.currency;

import java.util.Scanner;

public class Zl {

    protected void changeZl() {

        Scanner scanner = new Scanner(System.in);

        String inputChangeTo = scanner.nextLine();

        switch (inputChangeTo) {
            case "eur":
            case "dol":
            case "uah":
            case "zl":
                System.out.println("Please enter the amount");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }

        int enterAmount = scanner.nextInt();

        float euro = enterAmount * 0.24F;
        float dollar = enterAmount * 0.26F;
        float zl = enterAmount;
        float uah = enterAmount * 6.24F;

        switch (inputChangeTo) {
            case "eur":
                System.out.println(enterAmount + " ZL converted to EUR it: " + euro + " EUR");
                break;
            case "dol":
                System.out.println(enterAmount + " ZL converted to dollar it: " + dollar + " dollar");
                break;
            case "uah":
                System.out.println(enterAmount + " ZL converted to UAH it: " + uah + " UAH");
                break;
            case "zl":
                System.out.println(enterAmount + " ZL converted to ZL it: " + zl + " ZL");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}