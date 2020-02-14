package exercise2.currency;

import java.util.Scanner;

public class Uah {

    protected void changeUah() {

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

        float euro = enterAmount * 0.038F;
        float dollar = enterAmount * 0.041F;
        float zl = enterAmount * 0.16F;
        float uah = enterAmount;

        switch (inputChangeTo) {
            case "eur":
                System.out.println(enterAmount + " UAH converted to EUR it: " + euro + " EUR");
                break;
            case "dol":
                System.out.println(enterAmount + " UAH converted to dollar it: " + dollar + " dollar");
                break;
            case "uah":
                System.out.println(enterAmount + " UAH converted to UAH it: " + uah + " UAH");
                break;
            case "zl":
                System.out.println(enterAmount + " UAH converted to ZL it: " + zl + " ZL");
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}