package github.tv_channels_compisition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChannelProvider {
    private final Country country;
    private final List<String> channels;

    public ChannelProvider(Country country, List<String> channels) {
        this.country = country;
        this.channels = List.copyOf(channels); // защищаем от изменений извне
    }

    public Country getCountry() {
        return country;
    }

    public List<String> getChannels() {
        return channels; // неизменяемая копия — безопасно!
    }
}



