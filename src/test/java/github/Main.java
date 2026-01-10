package github;

import github.data.Country;
import github.data.ICard;
import github.data.UnionPayCard;

public class Main {

    public static void main(String[] args) {
        invoke(new UnionPayCard());
    }

    public static void invoke(ICard card) {
        card.setBalance(100);
        System.out.println(card.getPaymentSystem());

        card.payInCountry(Country.RU, 50);
        System.out.println("Баланс после операции: " + card.getBalance());

    }
}
