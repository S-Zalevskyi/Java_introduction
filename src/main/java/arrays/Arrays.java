package arrays;

public class Arrays {

    public static void main(String[] args) {

        int [] ages = new int[3];  //[] это декларует таблицу то есть показывает что это таблица
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 50;

        int [] heights = new int [] {12, 50, 23, 34, 45, 56, 23, 12, 23}; //

        System.out.println("Element 1 to " + ages[0]);
        System.out.println("Element 2 to " + ages[1]);
        System.out.println("Element 3 to " + ages[2]);

        System.out.println("Wielkosc tablicy: " + ages.length);  // .length для точной характеристики ищи в гугле.

        System.out.println("Uzyjmy petli");

        int i = 0;
        while (i < heights.length) {
            System.out.println("Element " + (i + 1) + " to " + heights[i]);
            i++; // показывает что i увеличивается на 1 за каждым разом пока не закончятся условия что б не крутилось до бесконечности.
        }
    }



}
