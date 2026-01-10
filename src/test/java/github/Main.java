package github;

import github.data.Country;
import github.data.ICard;
import github.data.VisaCard;

public class Main {

    public static void main(String[] args) {
        ICard visaCard = new VisaCard();
        visaCard.setBalance(100);
        System.out.println(visaCard.getPaymentSystem());

        visaCard.payInCountry(Country.RU, 50);
        System.out.println("Баланс после операции: " + visaCard.getBalance());

    }
}
