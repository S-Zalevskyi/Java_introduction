package exercise2.currency;

import java.util.Scanner;

public class Currency {

    Dollar dollar = new Dollar();

    Euro euro = new Euro();

    Uah uah = new Uah();

    Zl zl = new Zl();

    public void setCurrency() {

        Scanner scanner = new Scanner(System.in);

        String inputChange = scanner.nextLine();

        switch (inputChange) {
            case "eur":
                System.out.println("Good:) To eur/dol/zl/uah?");
                euro.changeEuro();
                break;
            case "dol":
                System.out.println("Good:) To eur/dol/zl/uah?");
                dollar.changeDollar();
                break;
            case "uah":
                System.out.println("Good:) To eur/dol/zl/uah?");
                uah.changeUah();
                break;
            case "zl":
                System.out.println("Good:) To eur/dol/zl/uah?");
                zl.changeZl();
                break;
            default:
                System.out.println("Data entry error. Try again.");
        }
    }
}