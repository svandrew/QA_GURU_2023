package headFirstJava;

public class RussianPassportData {
    private String seriesNumber;
    private String issuerCode;

    // Геттер: возвращает значение поля
    public String getSeriesNumber() {
        return seriesNumber;
    }

    // Сеттер: устанавливает значение поля
    public RussianPassportData setSeriesNumber(String serNumber) {
        //       seriesNumber = serNumber;
        this.seriesNumber = serNumber;
        return this;
    }

    public String getIssuerCode() {
        return issuerCode;
    }

    public RussianPassportData setIssuerCode(String issuerCode) {
        this.issuerCode = issuerCode;
        return this;
    }

    public static void main(String[] args) {
        RussianPassportData p1 = new RussianPassportData()
                .setIssuerCode("1234")
                .setSeriesNumber("567890");

        System.out.println(p1.getSeriesNumber() + " " + p1.getIssuerCode());
        System.out.println(p1.issuerCode);
    }
}