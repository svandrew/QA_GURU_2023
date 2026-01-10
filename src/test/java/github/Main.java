package github;

import github.data.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== VisaCard ===");
        invoke(new VisaCard());

        System.out.println("\n=== UnionPayCard ===");
        invoke(new UnionPayCard());

        System.out.println("\n=== MasterCard ===");
        invoke(new MasterCard());

        System.out.println("\n=== PhoneWallet ===");
        invoke(new PhoneWallet());
    }

    public static void invoke(ICard card) {
        card.setBalance(100);
        System.out.println("Платежная система: " + card.getPaymentSystem());

        card.payInCountry(Country.RU, 50);
        System.out.println("Баланс после операции: " + card.getBalance());

    }
}
