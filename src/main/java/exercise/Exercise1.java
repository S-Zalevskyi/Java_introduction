package exercise;

public class Exercise1 {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Stanislav", "Zalevskyi", 25),
                new User("Adam", "Lowiusz", 34),
                new User("Mateusz", "Nowak", 28),
                new User("Piotrek", "Reszkowskicddd", 30),
                new User("Piotrek", "Reszkowskicdddkjghjgh", 30),
                new User("Maciej", "Wojnowski", 21)
        };

        User longestUser = users[0];
        for (User user : users) {
            int actualUserLength = user.getLastName().length() + user.getName().length();
            int actualLongestLength = longestUser.getLastName().length() + longestUser.getName().length();

            if (actualLongestLength < actualUserLength) {
                longestUser = user;
            }
        }
        System.out.println("Uzytkownik z najdluzszym imeniem i nazwiskiem to " + longestUser);

    }
}
