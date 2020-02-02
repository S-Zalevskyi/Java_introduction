package loops;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;    // nextInt(10) говорит о псевдорандоме только до 9 от 0. Но никогда не рандомит 10.
                                                             // по этому плюсуем 1 то бы считалось не от 0.
        Scanner scanner = new Scanner(System.in);
        int tryCounter = 0;
        int inputNumber = -1;

        do {
            System.out.println("Podaj Liczbe");
            inputNumber = scanner.nextInt();
            tryCounter++;
        } while (randomNumber != inputNumber);              //повторить то что делает этот оператор!!! дает неправду если два значения совпадают.

        System.out.println("Zgadles za " + tryCounter + " razem!");
    }
}
