package inheritance.animal;

public class Horse extends Animal{

    private int rating;

    public Horse (String name, int age, int rating) { /*<<<<<<< так строим конструктор*/
        super (name, age);
        this.rating = rating;
    }

    @Override
    public void voice () {
        //Обращаемся к voice который в Animal
        System.out.println("Horse " +  getName() + " says: 'ihaha'");

    }

    public void ride (int speed) {
        System.out.println("Hourse " + getName() + ", with rating: " + rating + ", rides with: " + speed + " km/h");
    }
}
