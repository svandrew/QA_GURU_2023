package github.tv_channels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public abstract class BaseChannels {
    protected Country country;

    protected BaseChannels(Country country) {
        this.country = country;
    }

    protected abstract List<String> createListChannels();

    protected abstract HashMap<Integer, String> createMapChannels();

    protected abstract HashSet<String> createCategoryChannels();

    public abstract void addValueToList(String channelName, List<String> listChannels, Country country);

    public abstract void addValueToMap(String channelName, HashMap<Integer, String> map, Country country);

    public abstract void addValueToSet(String categoryName, HashSet<String> set, Country country);

    public void deleteValueFromList(String channelName, List<String> listChannels) {
        if (listChannels.contains(channelName)) {
            while (listChannels.contains(channelName)) {
                for (int i = 0; i < listChannels.size(); i++) {
                    String value = listChannels.get(i);
                    if (listChannels.get(i).equals(channelName)) {
                        listChannels.remove(value);
                    }
                }
            }
        } else {
            System.out.println("Каналы не найдены");
        }
    }

    public void searchValueInList(String channelName, List<String> listChannels) {
        if (listChannels.contains(channelName)) {
            System.out.println("Канал" + " " + channelName + " " + "найден");
        } else {
            System.out.println("Канал не найден");
        }
    }

    public void searchValueInMap(String channelName, HashMap<Integer, String> map) {
        if (map.containsValue(channelName)) {
            System.out.println("Канал" + " " + channelName + " " + "найден");
        } else {
            System.out.println("Канал не найден");
        }
    }

    public void deleteValueFromMap(String channelName, HashMap<Integer, String> map) {
        if (map.containsValue(channelName)) {
            for (var pair : map.entrySet()) {
                int key = pair.getKey();
                String value = pair.getValue();
                if (value.equals(channelName)) {
                    map.remove(key);
                    return;
                }
            }
        } else {
            System.out.println("Канал не найден");
        }
    }

    public void deleteValueFromSet(String categoryName, HashSet<String> set) {
        set.remove(categoryName);
    }

    public void searchValueInSet(String categoryName, HashSet<String> set) {
        if (set.contains(categoryName)) {
            System.out.println("Категория найдена");
        } else {
            System.out.println("Категория не найдена");
        }
    }
}



