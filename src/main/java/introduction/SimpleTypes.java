package introduction;

public class SimpleTypes {

    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to " +lottoReward);

        short dayOfMonth = 29;
        System.out.println("Dzien miesiaca to " + dayOfMonth + "grudnia");
        dayOfMonth = 23;
        System.out.println("Dzien miesiaca to " + dayOfMonth + "sierpnia");
        //nazwy zmienne zaczynamy pisac z malej literki.

        final float PI_PI = 3.14F;
        final float MAX_SIZE = 10;
        //nazwy stalych piszemy wielkiemy literamy. Przepis "final" pokazuje ze to stale znaczenia. Zmienia zmnienna na stale.
        System.out.println("Liczba PI to " + PI_PI);

        double footSize = 23.123d;
        System.out.println("Rozmiar stopy bedzie " + footSize + "cm.");

        boolean isPaid = false;
        System.out.println("Czy zaplacono rachunek?" + isPaid);
        isPaid = true;
        System.out.println("A moze teraz juz zaplacone? " + isPaid);
        //pokazalizmy przyklad prawdy i nie prawdy.
    }

}
