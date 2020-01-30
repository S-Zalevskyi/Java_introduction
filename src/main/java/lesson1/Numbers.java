package lesson1;

import java.util.Scanner;

public class Numbers {
    // byte a;            2^8 = 256                             (от -128 до 127)
    //short b;            2^16 = 65.538                         (от -32.768 до 32.767)
    //int c;              2^32 = 4.294.967.296                  (от 2.147.483.648 до 2.147.483.647)
    //long d;             2^64 = 18.446.744.073.709.551.616     (от 9223372036854775808 до 9223372036854775807)

    //char e;             2^16 = 65.538                         (от 0 до 65.537) кодировка Unicode

    //float f;            2^32  (от ~-1,4*10^45 до ~3,4*10^38)
    //double g;           2^64  (от ~-4,9*10-324 до ~1,8*10^308)

    //boolean h;          8 bit (в массивах) и 32bit (не в массивах)
    //1 байт это 8бит. 1 бит это 0 или 1.

    public static void main(String[] args) {
        int maxLanes = 10;
        int minLanes = 1;
        System.out.println("Maksymalna ilosc linij to " + maxLanes + " , a minimalna to " + minLanes + " !");

        long maxRate = 23_434L;
        long minRate = 19_300L;
        System.out.println("Maksymarna wartosc tego objektu sklada " + maxRate + " a minimalna wartosc " + minRate + " !");

        short maxWindows = 4;
        short minWindows = 1;
        System.out.println( "Maksymum okien to " + maxWindows + " , minimum " + minWindows + " !" );

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() % 7);

        System.out.println("Ile bedzie " + number1 + " + " + number2 + " ?");

    }

}
