package github.tv_channels;

import java.util.*;

public class UnitedStatesChannels extends BaseChannels {

    public UnitedStatesChannels() {
        super(Country.USA);
    }

    @Override
    public List<String> createListChannels() {
        ArrayList<String> channels = new ArrayList<>();
        Collections.addAll(channels, "FOX", "ABC East", "New York today", "DallasTv", "The Movies Channel");
        return channels;
    }

    @Override
    public HashMap<Integer, String> createMapChannels() {
        HashMap<Integer, String> channelsMap = new HashMap<>();
        channelsMap.put(1, "FOX");
        channelsMap.put(2, "ABC East");
        channelsMap.put(3, "New York today");
        channelsMap.put(4, "DallasTv");
        channelsMap.put(5, "The Movies Channel");
        return channelsMap;
    }

    @Override
    public HashSet<String> createCategoryChannels() {
        HashSet<String> category = new HashSet<>();
        Collections.addAll(category, "Culture", "Sports", "Movies", "Music", "Science");
        return category;
    }

    @Override
    public void addValueToList(String channelName, List<String> listChannels, Country country) {
        if (country == Country.USA) {
            listChannels.add(channelName);
        } else {
            System.out.println("You can't add channels from another locale");
        }

    }

    @Override
    public void addValueToMap(String channelName, HashMap<Integer, String> map, Country country) {
        if (country == Country.USA) {
            map.put(map.size() + 1, channelName);
            System.out.println("Добавлен канал: " +channelName);
        } else {
            System.out.println("You can't add channels from another locale");
        }

    }

    @Override
    public void addValueToSet(String categoryName, HashSet<String> set, Country country) {
        if (country == Country.USA) {
            set.add(categoryName);
        } else {
            System.out.println("this category cannot be added to this locale");
        }
    }

}