package classes.basics;


public class Test {

    public static void main(String[] args) {
        String nazwisko = "Zalevskyi";
        User adam = new User("Adam",nazwisko,36);  // <<<< должно быть 3 параметра того типа который подали

//        adam.name = "Adam";
//        adam.lastName = "Kowalski";
//        adam.age = 36;

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
        cloneJozek.introduce();
    }

}
