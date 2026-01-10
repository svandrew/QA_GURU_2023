package github;

import github.data.Card;
import github.data.Country;
import github.data.VisaCard;

public class Main {

    public static void main(String[] args) {
        Card visaCard = new VisaCard();
        visaCard.setBalance(100);
        System.out.println(visaCard.getPaymentSystem());

        visaCard.payInCountry(Country.RU, 50);
        System.out.println("Баланс после операции: " + visaCard.getBalance());

    }
}
