package github.data;

public class CriptoCard implements ICard {

    int balance;
    public void payInCountry(Country country, int amount) {

    }

    @Override
    public void setBalance(int i) {
        if (i < 0) {
        }
        else {
            System.out.println("Пополнение баланса: " + i);
            this.balance = i;
        }
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public PaymentSystem getPaymentSystem() {
        return null;
    }


}
