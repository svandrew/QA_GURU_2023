package headFirstJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounts {

    public static char firstUnique(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (counts.containsKey(c)) {
                int count = counts.get(c) + 1;
                counts.put(c, count);
            } else {
                counts.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> el : counts.entrySet()) {
            if (el.getValue() == 1) {
                return el.getKey();
            }
        }
        return '_';
    }
    public static char firstUn(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("В строке нет уникальных символов: " + s);
    }


    public static void main(String[] args) {
        //        System.out.println(firstUnique("казак"));
        System.out.println(firstUnique("abbc"));
//        System.out.println(firstUnique("a"));
 //       System.out.println(firstUnique(""));
//        System.out.println(firstUnique("А роза упала на лапу Азора"));
//        System.out.println(firstUnique("арозаупаланалапуазора"));
//        System.out.println(firstUnique("А роза упала на лапу Азора!"));
//        System.out.println(firstUnique("ёа"));
        System.out.println(firstUnique("swiss"));
        System.out.println(firstUn("swiss"));
    }
}