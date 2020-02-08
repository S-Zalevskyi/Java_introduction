package inheritance.bank;

public class Test {

    public static void main(String[] args) {
        AbstractBankAccount account1 = new StandardBankAccount("Stanislav", 200);
        System.out.println("Pobralem: " + account1.withdraw(50) + "zl. Pozostalo: " + account1.cashAmount );
        System.out.println("Pobralem: " + account1.withdraw(30) + "zl. Pozostalo: " + account1.cashAmount );
        System.out.println("Pobralem: " + account1.withdraw(90) + "zl. Pozostalo: " + account1.cashAmount );
        System.out.println("Pobralem: " + account1.withdraw(70) + "zl. Pozostalo: " + account1.cashAmount );
        System.out.println("Pobralem: " + account1.withdraw(50) + "zl. Pozostalo: " + account1.cashAmount );

        AbstractBankAccount account = new DebitBankAccount("Stanislav", 200, 100);
        System.out.println("Pobralem: " + account.withdraw(50) + "zl. Pozostalo: " + account.cashAmount );
        System.out.println("Pobralem: " + account.withdraw(30) + "zl. Pozostalo: " + account.cashAmount );
        System.out.println("Pobralem: " + account.withdraw(90) + "zl. Pozostalo: " + account.cashAmount );
        System.out.println("Pobralem: " + account.withdraw(70) + "zl. Pozostalo: " + account.cashAmount );
        System.out.println("Pobralem: " + account.withdraw(50) + "zl. Pozostalo: " + account.cashAmount );
        System.out.println("Pobralem: " + account.withdraw(30) + "zl. Pozostalo: " + account.cashAmount );
    }
}
