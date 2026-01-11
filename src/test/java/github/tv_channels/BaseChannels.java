package github.tv_channels;

import java.util.*;

public abstract class BaseChannels {
    protected Country country;

    protected BaseChannels(Country country) {
        this.country = country;
    }

    protected abstract List<String> createListChannels();

    protected abstract HashMap<Integer, String> createMapChannels();

    protected abstract Set<String> createCategoryChannels();

    public abstract void addValueToList(String channelName, List<String> listChannels, Country country);

    public abstract void addValueToMap(String channelName, HashMap<Integer, String> map, Country country);

    public abstract void addValueToSet(String categoryName, HashSet<String> set, Country country);

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

    public void searchValueInSet(String categoryName, HashSet<String> set) {
        if (set.contains(categoryName)) {
            System.out.println("Категория "+ categoryName + " найдена");
        } else {
            System.out.println("Категория не найдена");
        }
    }

    public void deleteValueFromMap(String channelName, HashMap<Integer, String> map) {
        if (map.containsValue(channelName)) {
            for (var pair : map.entrySet()) {
                int key = pair.getKey();
                String value = pair.getValue();
                if (value.equals(channelName)) {
                    map.remove(key);
                    System.out.println("Удален канал: "+channelName);
                    return;
                }
            }
        } else {
            System.out.println("Канал не найден");
        }
    }

    public void deleteValueFromList(String channelName, List<String> listChannels) {
        if (listChannels.contains(channelName)) {
            while (listChannels.contains(channelName)) {
                for (int i = 0; i < listChannels.size(); i++) {
                    String value = listChannels.get(i);
                    if (listChannels.get(i).equals(channelName)) {
                        listChannels.remove(value);
                        System.out.println("Удален канал: " + value);
                    }
                }
            }
        } else {
            System.out.println("Каналы не найдены");
        }
    }

    public void deleteValueFromSet(String categoryName, HashSet<String> set) {
        set.remove(categoryName);
        System.out.println("Удалена категория: "+categoryName);
    }
}



