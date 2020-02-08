package classes.basics;


public class Test {

    public static void main(String[] args) {
        String nazwisko = "Zalevskyi";
        User adam = new User("Adam",nazwisko,17);  // <<<< должно быть 3 параметра того типа который подали

//        adam.name = "Adam";
//        adam.lastName = "Kowalski";
//        adam.age = 17;

        System.out.println(adam.name);                // adam.name это мы обращаемся к классу user и в нем к полю name.
        System.out.println(adam.lastName);
        System.out.println(adam.age);

        User jozek = new User("Jozek", "Nowak",42);     // <<< с параметрами

//        jozek.name = "Jozek";
//        jozek.lastName = "Nowak";              при помощи конструктора этого обьекта мы можем этого не писать
//        jozek.age = 42;

        jozek.introduce();                       // <<<< .introduce  что б не писать постоянно sout

        User cloneJozek = new User(jozek);       //пример конструтора клонирующего на безе jozek (подали 1 параметр)
        cloneJozek.introduce();
        cloneJozek.name = "Robert";             // так можно изменить какойто параметр в клоне
        cloneJozek.age = 20;
        System.out.println("Po zmnianie imiona: ");
        cloneJozek.introduce();

        System.out.println("###TEST WIEKU###");
        System.out.println("Czy Adam jest dorosly?: " + adam.isAdult());
        //User.minAge = 15;  можем измеить минимальный возраст конкретно но так никто не делает
        System.out.println("Czy Jozek jest dorosly?: " + jozek.isAdult());
        System.out.println("Czy Robert jest dorosly?: " + cloneJozek.isAdult());
    }

}
