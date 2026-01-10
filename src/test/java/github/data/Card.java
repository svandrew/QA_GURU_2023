package github.data;

public abstract class Card implements ICard {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    protected Card(PaymentSystem pS) {
        this.paymentSystem = pS;
    }

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

    public int getBalance() {
        return balance;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() != 16)
            return;
        else {
            this.cardNumber = cardNumber;
        }
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    protected boolean isBalanceGreaterOrEqualThan(int amount) {
        if (balance >= amount)
            return true;
        else
            return false;
    }

    public void payInCountry(Country country, int amount) {
        if (isCountryValidForTheseCard(country) && isBalanceGreaterOrEqualThan(amount)) {
            balance = balance - amount;
            System.out.printf("Перевод на %d принят! %n", amount);
        } else {
            System.out.println("Оплата отклонена!");
        }
    }

    protected abstract boolean isCountryValidForTheseCard(Country country);

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
