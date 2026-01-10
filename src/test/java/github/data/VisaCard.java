package github.data;

public class VisaCard extends Card {

    public VisaCard() {
        super(PaymentSystem.VISA);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
