package github.data;

public class UnionPayCard extends Card {

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN) // Только Китай
            return true;
        else
            return false;
    }
    //  return country == Country.CN; // более короткая запись условия
}
