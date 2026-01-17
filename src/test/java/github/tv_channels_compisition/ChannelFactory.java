package github.tv_channels_compisition;

import java.util.List;

public class ChannelFactory {

    public static ChannelProvider createRussianChannels() {
        return new ChannelProvider(
                Country.RU,
                List.of("Первый", "Россия 1", "НТВ", "ТНТ")
        );
    }

    public static ChannelProvider createAmericanChannels() {
        return new ChannelProvider(
                Country.USA,
                List.of("CNN", "Fox News", "HBO", "NBC")
        );
    }

    // Можно добавить метод с параметром:
    public static ChannelProvider createForCountry(Country countryCode) {
        switch (countryCode.toString().toLowerCase()) {
            case "ru":
                return createRussianChannels();
            case "us":
                return createAmericanChannels();
            default:
                throw new IllegalArgumentException("Unsupported country: " + countryCode);
        }
    }
}