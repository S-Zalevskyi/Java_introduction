package arrays;

public class Exercise {

    public static void main(String[] args) {

        int [] numbers = new int [] {23,43,56,45,23,45,64,12,23,21,11,};
        //znajdz maksymalna i minimalna wartosc w tablice.

        int max = Integer.MIN_VALUE;
        max = numbers[0]; //просто ничего не может быть в таблице меньше 0
        int min = Integer.MAX_VALUE;
        min = numbers[0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }

            if (min > numbers[i]) {
                min = numbers[i];
            }
            mean += numbers[i];
        }
        mean /= numbers.length;
        System.out.println("Min: " + min + ", max: " + max + ", mean; " + mean);

        for (int elem: numbers) {   // создали int elem и указали в ней таблицу numbers и из той таблицы взяли числа кратные 3.
                                    //эта петля только для типа int.

            if (elem % 3 == 0) {
                System.out.println(elem + " jest podzielny przez 3");
            }
                                        //ПОВТОРИТЬ!!!
        }

    }

}
