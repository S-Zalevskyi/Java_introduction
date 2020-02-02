package classes.basics;

 class User {
     String name;
     String lastName;
     int age;

     User(String name, String lastName, int age) {   // () <<< параметры конструктора/метода без которых он не будет работать в нашем случае в Test
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
}
