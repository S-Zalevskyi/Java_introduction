package exercise;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz imie, nazwisko i wiek przez spacie!");

        String usrString = scanner.nextLine();
        String[] data = usrString.split(" ");

        int age = Integer.valueOf(data[2]);  //int age = Integer.parseInt( data [2]); аналог
        User user = new User(data[0], data[1], age);

        System.out.println(user);
    }

}
