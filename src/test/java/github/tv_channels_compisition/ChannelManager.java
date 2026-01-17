package github.tv_channels_compisition;

import java.util.*;
import java.util.stream.Collectors;

public class ChannelManager {
    private final Country country;
    private final List<String> channels; // изменяемый список

    public ChannelManager(Country country, List<String> initialChannels) {
        this.country = country;
        this.channels = new ArrayList<>(initialChannels); // копируем, чтобы не сломать оригинал
    }

    // 🔍 Поиск по частичному совпадению (регистронезависимый)
    public List<String> findChannels(String query) {
        if (query == null || query.isEmpty()) {
            return new ArrayList<>(channels);
        }
        String lowerQuery = query.toLowerCase();
        return channels.stream()
                .filter(chan -> chan.toLowerCase().contains(lowerQuery))
                .collect(Collectors.toList());
    }

    // ➕ Добавление канала
    public void addChannel(String channel) {
        if (channel != null && !channel.trim().isEmpty() && !channels.contains(channel)) {
            channels.add(channel.trim());
        }
    }

    // ➖ Удаление канала
    public boolean removeChannel(String channel) {
        return channels.remove(channel);
    }

    // 📋 Получить копию текущего списка (чтобы не дать прямой доступ к внутренностям)
    public List<String> getChannels() {
        return new ArrayList<>(channels);
    }

    public Country getCountry() {
        return country;
    }
}
