package introduction;

public class Strings {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "Ala ma kota";

        System.out.println("Text1: " + text + ", text2: " + text2);

        //Ctr+d copy linije
        //Ctrl+/ robi komentarz

        System.out.println("Czy obie zmienne to to samo? " + (text.equals(text2)));
        //dla typow referencyjnych uzywamy .equals zeby sie porowniac, a nie operator "==".
        // "==" ten operator dla typow prostych uzywamy.

        StringBuilder builder = new StringBuilder();
        builder.append("Ala ");
        builder.append("ma ");
        builder.append("kota ");
        String resultText = builder.toString();
        System.out.println("Napis utworzony przez buildera: " + resultText);

        int index5 = 4;
        char char5 = resultText.charAt(index5);
        System.out.println("5 znak w tekscie buildera to: " + char5);

        String startText = "Ala";
        boolean startTextAla = resultText.startsWith(startText);
        System.out.println("Czy text z buildera zaczyna sie na 'Ala' ? : - " + startTextAla);

        String text3 = "Litwo ojczyzno moja!";
        System.out.println("Ilosc znakow w napisie ' " + text3 + " '  to - " + text3.length());

        String abc = "abcdefg";
        String d = "d";
        System.out.println("Literka 'd' stoi na " +  abc.indexOf(d) + " miejscu w slowie");

        String maMleko = "Ala ma kota, kot ma mleko.";
        String wycinek = maMleko.substring(6,11);       // wpisalismy od 6 do 11 znaku. Musielismy wytnac od 7 do 12.
                                                        // Ale zaczyna sie liczba od 0.
        System.out.println("Wyczinek z napisu ' " + maMleko + " '  to - " + "' " + wycinek + " '");


    }

}
