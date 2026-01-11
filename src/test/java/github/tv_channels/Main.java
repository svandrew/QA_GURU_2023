package github.tv_channels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> channels;
        HashMap<Integer, String> mapChannels;
        HashSet<String> category;

        RussianChannels russianTv = new RussianChannels();
        UnitedStatesChannels unitedStatesTv = new UnitedStatesChannels();
        FranceChannels franceTv = new FranceChannels();

        //списки
        channels = russianTv.createListChannels();
        russianTv.deleteValueFromList("ТНТ", channels);
        russianTv.addValueToList("МатчТВ", channels, Country.RU);
        russianTv.searchValueInList("СТС", channels);


        //map
        mapChannels = unitedStatesTv.createMapChannels();
        unitedStatesTv.searchValueInMap("FOX", mapChannels);
        unitedStatesTv.addValueToMap("FOX NEWS", mapChannels, Country.USA);
        unitedStatesTv.deleteValueFromMap("DallasTv", mapChannels);


        //множества
        category = franceTv.createCategoryChannels();
        franceTv.addValueToSet("cartoons", category, Country.FR);
        franceTv.searchValueInSet("cartoons", category);
        franceTv.deleteValueFromSet("cartoons", category);

    }
}