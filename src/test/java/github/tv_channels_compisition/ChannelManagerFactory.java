package github.tv_channels_compisition;

import java.util.List;
import java.util.Map;

public class ChannelManagerFactory {

    private static final Map<String, List<String>> DEFAULT_CHANNELS = Map.of(
            "RU", List.of("Первый", "Россия 1", "НТВ"),
            "US", List.of("CNN", "HBO", "NBC")
    );

    public static ChannelManager createForCountry(Country countryCode) {
        List<String> defaults = DEFAULT_CHANNELS.getOrDefault(countryCode.toString().toUpperCase(), List.of());
        return new ChannelManager(countryCode, defaults);
    }
}
