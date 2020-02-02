package conditions;

import java.util.Scanner;

public class CurrencyConverter {

    static final float EUR = 4.31F;
    static final float USD = 3.90F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj ile masz zlotych");
        int plnAmount = scanner.nextInt();

        System.out.println("Podaj walute [EUR USD]");
        scanner.nextLine(); //вписуем это что бы программа работала поправно. Потому что после int plnAmount = scanner.nextInt();
                            // как то там не вписуется следующая строка. Проверь как работает с и без.
        String currencySymbol = scanner.nextLine();
        float multiplier = 0.0F;
        switch (currencySymbol) {
            case "EUR": //Здесь вставляется двоиточие
                multiplier = EUR;
                break;
            case "USD":
                multiplier = USD;
                break;
            default:
                System.out.println("Wybrano nieznana walute:" + currencySymbol);
        }

        System.out.println("PLN to " + (plnAmount / multiplier) + " " + currencySymbol);
    }
}
