package inheritance.bank;

public abstract class AbstractBankAccount {

    protected String owner;
    protected int cashAmount;

    public AbstractBankAccount(String owner, int cashAmount) { // alt+insert
        this.owner = owner;
        this.cashAmount = cashAmount;
    }

    public int withdraw(int amount) {
        if (getMaxAmount() >= amount) {
            cashAmount -= amount; //cashAmount = cashAmount - amount
            return amount;
        } else {
            System.out.println(" Nie masz takiej kwoty na koncie! Pozostalo: " + cashAmount);
            return 0;
        }
    }

    protected abstract int getMaxAmount();

    public String getOwner() {
        return owner;
    }

    public int getCashAmount() {
        return cashAmount;
    }

}
