package github.data;

public interface ICard {

    void payInCountry(Country country, int amount);
    void setBalance(int i);
    int getBalance();
    PaymentSystem getPaymentSystem();
}
