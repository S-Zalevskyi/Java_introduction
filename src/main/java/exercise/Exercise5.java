package exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        LocalDate currentTime = LocalDate.now();

        String format = "yyyy/MM/dd";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        System.out.println("Wpisz swoja date urodzenia w formacie yyyy/MM/dd");

        Scanner scanner = new Scanner(System.in);
        String bornDate = scanner.nextLine();

        LocalDate someDateParsed = LocalDate.parse(bornDate, formatter);

        Period roznica = Period.between(someDateParsed,currentTime);
        int years = roznica.getYears();
        System.out.println("Gratulacje masz - " + years + " lat!");
    }
}
