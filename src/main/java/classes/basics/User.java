package classes.basics;

 public class User {
     public String name;
     String lastName;
     int age;

     static final int MIN_AGE = 18;   /*создали статическую переменную (minAge), потомм сдлали посотянную MIN_AGE вписав
     final которую уже не можно будет заменить потмо в test*/


     public  User(String name, String lastName, int age) {   // () <<< параметры конструктора/метода без которых он не будет работать в нашем случае в Test
         this.name = name;
         this.lastName = lastName;
         this.age = age;
     }

     User(User other) {        //создаем конструктор копирования
         name = other.name;
         lastName = other.lastName;
         age = other.age;
     }

     void introduce () {

         System.out.println("imie: " + this.name + ", nazwisko: " + lastName + ", wiek: " + age); //можно с this а можно и без
     }

     boolean isAdult() {
         boolean isAdult = age >= MIN_AGE; //то чот зтатичное пишется под наклоном
         return isAdult;
     }
}
