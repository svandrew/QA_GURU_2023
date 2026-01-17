package github.tv_channels_compisition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static github.tv_channels_compisition.Country.RU;

public class Main {
    public static void main(String[] args) {

//        ChannelProvider russian = ChannelFactory.createRussianChannels();
 //       ChannelProvider russian = ChannelFactory.createForCountry(RU);
 //       System.out.println(russian.getChannels()); // [Первый, Россия 1, ...]

        ChannelManager manager = ChannelManagerFactory.createForCountry(RU);
          System.out.println("Получена копия списка каналов страны: \n" + manager.getChannels()); // [Первый, Россия 1, ...]
// Поиск
        System.out.println(manager.findChannels("рос")); // [Россия 1]

// Добавление
        manager.addChannel("Моя ТВ");

// Удаление
        manager.removeChannel("НТВ");

// Показать всё
        System.out.println(manager.getChannels());
// [Первый, Россия 1, Моя ТВ]

        //списки

//        russian.("ТНТ", channels);
//        russian.addValueToList("МатчТВ", channels, Country.RU);
//        russian.searchValueInList("СТС", channels);


        //map
//        mapChannels = unitedStatesTv.createMapChannels();
//        unitedStatesTv.searchValueInMap("FOX", mapChannels);
//        unitedStatesTv.addValueToMap("FOX NEWS", mapChannels, Country.USA);
//        unitedStatesTv.deleteValueFromMap("DallasTv", mapChannels);


        //множества
//        category = franceTv.createCategoryChannels();
//        franceTv.addValueToSet("cartoons", category, Country.FR);
//        franceTv.searchValueInSet("cartoons", category);
//        franceTv.deleteValueFromSet("cartoons", category);

    }
}