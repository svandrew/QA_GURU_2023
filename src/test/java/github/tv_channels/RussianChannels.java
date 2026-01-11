package github.tv_channels;

import java.util.*;

public class RussianChannels extends BaseChannels {

    public RussianChannels() {
        super(Country.RU);
    }

    @Override
    public List<String> createListChannels() {
        return new ArrayList<>(List.of("Первый", "ТНТ", "СТС", "НТВ", "ТВ3");
    }

    @Override
    public HashMap<Integer, String> createMapChannels() {
        HashMap<Integer, String> channelsMap = new HashMap<>();
        channelsMap.put(1, "Первый");
        channelsMap.put(2, "ТНТ");
        channelsMap.put(3, "СТС");
        channelsMap.put(4, "НТВ");
        channelsMap.put(5, "ТВ3");
        return channelsMap;
    }

    @Override
    public HashSet<String> createCategoryChannels() {
        HashSet<String> category = new HashSet<>();
        Collections.addAll(category, "Культура", "Спорт", "Кино", "Новости", "Детские");
        return category;
    }

    @Override
    public void addValueToList(String channelName, List<String> listChannels, Country country) {
        if (country == Country.RU) {
            listChannels.add(channelName);
        } else {
            System.out.println("нельзя добавлять каналы из другой локалии");
        }

    }

    @Override
    public void addValueToMap(String channelName, HashMap<Integer, String> map, Country country) {
        if (country == Country.RU) {
            map.put(map.size() + 1, channelName);
        } else {
            System.out.println("нельзя добавлять каналы из другой локалии");
        }

    }

    @Override
    public void addValueToSet(String categoryName, HashSet<String> set, Country country) {
        if (country == Country.RU) {
            set.add(categoryName);
        } else {
            System.out.println("данную категорию нельзя добавить в эту локалию");
        }
    }

}