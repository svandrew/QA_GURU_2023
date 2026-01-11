package github.data;

public class PhoneWallet implements ICard {
    private int balance;

    @Override
    public void payInCountry(Country country, int amount) {
        if (isBalanceGreaterOrEqualThan(amount)) {
            balance = balance - amount;
            System.out.printf("Перевод на %d принят! %n", amount);
        } else {
            System.out.println("Оплата отклонена!");
        }
    }

    @Override
    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Пополнение баланса невозможно");
            return;
        }
        else{
            System.out.println("Пополнение баланса: " + balance);
            this.balance = balance;
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public PaymentSystem getPaymentSystem() {
        return null;
    }

    protected boolean isBalanceGreaterOrEqualThan(int amount) {
        if (balance >= amount)
            return true;
        else
            return false;
    }
}