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
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zaplacono rachunek? " + isPaidTxt);
        isPaid = true;
        isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A moze teraz juz zaplacone? " + isPaidTxt);
        //pokazalizmy przyklad prawdy i nie prawdy. Dodalismy jeszcze "string"

        int index = 1;
        String name = "Stanislav";
        char letter = name.charAt(index);
        //ta metode .charAt() musze powtuzyc. Niby pokazuje na co mam zwrocic uwage. Czyli na jaka literke.
        System.out.println((index + 1) + " literka w imieniu " + name + " to " + letter);

        // shift + F6 to kombinacja za pomoca ktorej mozemy zmieniac nazwe zmniennych albo czegokolwiek, na raz,
        // w roznych miejscach. A nie po koleje. W koncu klikamy enter.
        // prefix to poczatek slow.

        String prefix = "St";
        boolean isStaringWith = name.startsWith(prefix);
        //ta metoda .starWith() robi takie cos c ow koncu jest zrobione:). Musze powtuzyc bo dobrze nie zrozumialem.
        System.out.println("czy imie " + name + " zaczyna sie od " + prefix + "? : " + isStaringWith);

        String myName = "Sstanislav";
        boolean startLetterName = myName.startsWith(prefix);
        String myNameTxt = startLetterName ? "tak" : "nie";
        System.out.println( "Czy moje imie " + myName + " zaczyna sie na " + prefix + "? : " + myNameTxt);
        //dodalem tu juz samodzielnie taka opcje zeby wynik byl "tak" czy "nie". Biarac przyklad popredniego.
    }

}
