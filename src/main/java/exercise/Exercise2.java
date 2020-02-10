package exercise;

public class Exercise2 {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Stanislav", "Zalevskyi", 25),
                new User("Adam", "Lowiusz", 34),
                new User("Mateusz", "Nowak", 28),
                new User("Piotrek", "Reszkowski", 30),
                new User("Maciej", "Wojnowski", 21)
        };

        double ages = 0D;
        for (User user : users) {
            ages += user.getAge();
        }

        System.out.println("Srednie znaczenie to " + (ages / users.length));
    }
}
