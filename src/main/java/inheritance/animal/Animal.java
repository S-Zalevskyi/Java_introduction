package inheritance.animal;

public abstract class Animal extends Object {  /*<<<<<<<<<<<<<<<<<<< extends Object не должно быть написано
                                            Java пишет за нас сама*/

    private String name;
    private int age;

    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public abstract void voice ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
