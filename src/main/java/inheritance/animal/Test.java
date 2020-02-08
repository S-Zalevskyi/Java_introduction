package inheritance.animal;

public class Test {

    public static void main(String[] args) {
     /*   Animal animal = new Animal("Zenek", 2);
        animal.voice();*/

        Lion simba = new Lion("Simba", 3);
/*        simba.setAge(3);
        simba.setName("Simba");*/
        simba.voice();
  /*      simba.roar();*/

        Horse horse = new Horse("Tomek", 5 , 9);
 /*       horse.setName("Tomek");
        horse.setAge(5);*/
        horse.ride(10);

        Animal animal2 = new Lion("Zdzisiek", 20);
        Animal animal3 = new Horse("Antek", 7, 9);

        System.out.println("#################################"); /*Способ полиморфизма. Делает тоже что и написали выше
                                                                   только в более коротки способ */
        Animal [] zoo = new Animal[] {simba, horse, animal2,animal3};
        for (Animal ani: zoo) {
            ani.voice();
        }
    }
}
