package exercise2;

import exercise2.currency.Currency;
import exercise2.lenghts.Lenghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to convert?");
        System.out.println("press (1) - [Сurrency]");
        System.out.println("press (2) - [Lengths]");

        int input = scanner.nextInt();


        if (input == 1) {
            System.out.println("What currency do you want to convert? [zl/dol/eur/uah]");
        }
        if (input == 2) {
            System.out.println("What lengths do you want to convert? [miles/km/meters/cm]");
        }

        if (input == 1) {
            Currency currency = new Currency();
            currency.setCurrency();
        } else {
            Lenghts lenghts = new Lenghts();
            lenghts.setLenghts();
        }
    }
}
