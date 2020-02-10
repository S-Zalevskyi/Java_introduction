package inheritance.abstaction;

public class Test {

    public static void main(String[] args) {

        Phone nokia = new Nokia3310(5);
        nokia.makeCall(33344455);
        nokia.sendSMS(33344455, "Cesc Maciej, co slychac?");
        /* ((Nokia3310)nokia).playSnake();   это плохой способ и так стараются не делать*/

        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("makeevka2344@gmail.com", "Cesc jak sie masz?");

        Phone smartPhone = new SmartPhone();
        smartPhone.sendSMS(33344455, "Hello kitty.");
        smartPhone.makeCall(33344455);

        Computer smartPhone2 = new SmartPhone();
        smartPhone2.sendEmail("makeevka2344@gmail.com","Cesc!!!");
        smartPhone2.browseInternet();
    }


}
