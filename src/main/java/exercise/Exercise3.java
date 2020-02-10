package exercise;

public class Exercise3{

    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Stanislav", "Salevskyi", 25),
                new User("Adam", "Lowiusz", 34),
                new User("Mateusz", "Nowak", 28),
                new User("Piotrek", "Reszkowski", 30),
                new User("Maciej", "Mojnowski", 21)
        };

        for (User user: users) {
            char firstLetterInLastName = user.getLastName().charAt(0);
            char firstLetterInName = user.getName().charAt(0);

            if(firstLetterInLastName == firstLetterInName)
            System.out.println(user);
        }

    }
}
