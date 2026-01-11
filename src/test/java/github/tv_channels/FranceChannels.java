package github.tv_channels;

import java.util.*;

public class FranceChannels extends BaseChannels {

    public FranceChannels() {
        super(Country.FR);
    }

    @Override
    public ArrayList<String> createListChannels() {
        ArrayList<String> channels = new ArrayList<>();
        Collections.addAll(channels, "Canal+", "LCI", "Paris Premiere", "CStar", "France News");
        return channels;
    }

    @Override
    public HashMap<Integer, String> createMapChannels() {
        HashMap<Integer, String> channelsMap = new HashMap<>();
        channelsMap.put(1, "Canal+");
        channelsMap.put(2, "LCI");
        channelsMap.put(3, "Paris Premiere");
        channelsMap.put(4, "CStar");
        channelsMap.put(5, "France News");
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
        if (country == Country.FR) {
            listChannels.add(channelName);
        } else {
            System.out.println("You can't add channels from another locale");
        }

    }

    @Override
    public void addValueToMap(String channelName, HashMap<Integer, String> map, Country country) {
        if (country == Country.FR) {
            map.put(map.size() + 1, channelName);
        } else {
            System.out.println("You can't add channels from another locale");
        }

    }

    @Override
    public void addValueToSet(String categoryName, HashSet<String> set, Country country) {
        if (country == Country.FR) {
            set.add(categoryName);
        } else {
            System.out.println("this category cannot be added to this locale");
        }
    }

}