package inheritance.abstaction;

public class SmartPhone implements Phone,Computer {


    @Override
    public void sendEmail(String adress, String content) {

        System.out.println("Sending email: " + content + ", to adress: " + adress);

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet using SmartPhone.");

    }

    @Override
    public void sendSMS(int number, String content) {

        System.out.println("Sending sms to: " + ", with content: '" + "' using SmartPhone.");

    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + ", using SmartPhone.");
    }
}
