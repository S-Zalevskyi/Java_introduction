package exercise2.currency;

import java.util.Scanner;

public class Euro {

    protected void changeEuro() {

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

        float euro = enterAmount;
        float dollar = enterAmount * 1.08F;
        float zl = enterAmount * 4.25F;
        float uah = enterAmount * 26.51F;

        switch (inputChangeTo) {
            case "eur":
                System.out.println(enterAmount + " EUR converted to EUR it: " + euro + " EUR");
                break;
            case "dol":
                System.out.println(enterAmount + " EUR converted to dollar it: " + dollar + " dollar");
                break;
            case "uah":
                System.out.println(enterAmount + " EUR converted to UAH it: " + uah + " UAH");
                break;
            case "zl":
                System.out.println(enterAmount + " EUR converted to ZL it: " + zl + " ZL");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}