package inheritance.abstaction;

public class Nokia3310 implements Phone{

    private int batteryLevel;

    public Nokia3310(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void sendSMS(int number, String content) {

        System.out.println("Sending sms to: " + ", with content: '" + "' using nokia 3310.");

    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + ", using Nokia 3310");

    }

    public void playSnake () {
        System.out.println("Playing snake on Nokia 3310");
    }
}
