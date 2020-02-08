package inheritance.bank;

public class StandardBankAccount extends AbstractBankAccount {

    public StandardBankAccount(String owner, int cashAmount) {
        super(owner, cashAmount);
    }

    @Override
    protected int getMaxAmount() {
        return cashAmount;
    }

   /* @Override     можно сделать в такой способ
    public int withdraw(int amount) {
        if (cashAmount >= amount) {
            cashAmount -= amount; //cashAmount = cashAmount - amount
            return amount;
        } else {
            System.out.println(" Nie masz takiej kwoty na koncie! Pozostalo: " + cashAmount);
            return 0;
        }
    }*/
}
