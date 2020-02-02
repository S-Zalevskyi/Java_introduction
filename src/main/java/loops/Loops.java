package loops;

import javax.swing.*;

public class Loops {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        while (i <= 20) {

            sum += i;          // sum = sum + 1 равносильно
            i++;               // = i= i + i равносильно

        }
        System.out.println("Suma liczb od 0 do 20 to " + sum);

        i = 1;
        do {
            if (i % 2 == 0) {   // (i % 2 == 0 && i % 3 == 0) можно тоже так вписать
                System.out.println(i + " to liczba parzysta");
            }
            i++;
        }while (i <= 20);

        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " to sie dzieli na 2");
            }
            if (i % 3 == 0) {
                System.out.println( i + " to sie dzieli na 3 ");
            }
            i++;
        } while ( i <= 100 );
    }

}
