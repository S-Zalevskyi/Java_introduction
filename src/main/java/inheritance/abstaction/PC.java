package inheritance.abstaction;

public class PC implements Computer {


    @Override
    public void sendEmail(String adress, String content) {

        System.out.println("Sending email: " + content + ", to adress" + adress);

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet using PC");

    }
}
