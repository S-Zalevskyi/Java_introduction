package exercise;

public class User {

    private String name;
    private String lastName;
    private Integer age;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "name " + name + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age;
    }
}
