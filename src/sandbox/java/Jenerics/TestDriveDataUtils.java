package Jenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static Jenerics.TestDataUtils.getRandomElements;

public class TestDriveDataUtils {

    public static void main(String[] args){
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(getRandomElements(List.of("a", "b"), 2));
//        }
//
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(getRandomElements(List.of("a", "b", "c", "d"), 2));
//        }

        var list = List.of("as", "fgd", "gfd", "aaa", "ccc");
        List<String> result = new ArrayList<>(getRandomElements(list, 2));

        System.out.println(result);

        Collections.shuffle(result);

        System.out.println(result);
    }
}
