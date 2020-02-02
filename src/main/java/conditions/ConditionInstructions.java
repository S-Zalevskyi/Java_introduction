package conditions;

import java.util.Scanner;

public class ConditionInstructions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in эот знаит что даешь порграмме вход в систему  пользователю
                                                  // что бы мог что-то ввестию

        System.out.println("Cesc, jak masz na imie? ");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
        if (name.endsWith("a")) {
            System.out.println("Zgaduje, ze jestes kobieta.");
        } else { // можна опустить надпись ниже но так есть стандарт и проще читать. ЗАПОМНИ
            System.out.println("Zgaduje, ze jestes mezczyzna.");
        }

        System.out.println( "Ile masz lat?");
        int age = scanner.nextInt();
        String ending = "Lat";
        switch (age % 10) {  //или можно вписать if ( age < 10 || age > 20) но лучше разобраться с операторами!!!!
            case 2:
            case 3:
            case 4:
                ending = "Lata";
                break;
            default:
                ending = "Lat";
        }

        System.out.println("Fajnie ze masz " + age + " " + ending + "!");
        if (age >= 18) {
            System.out.println("Jestes osoba dorosla");
        } else if (age >= 21) {
            System.out.println("Jestes osoba dorosla w USA");
        } else {
            System.out.println("Jestes niepelnoletni");
        }

    }

}
