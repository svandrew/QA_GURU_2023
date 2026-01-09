package github.qa_guru;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {

    @Test
    public void main1() {
        Map<Integer, Human> aMap = new HashMap<>();
        aMap.put(3434343, new Human("Dima", 33, "M"));
        aMap.put(2342323, new Human("Petr", 30, "M"));
        aMap.put(4535355, new Human("Ivan", 20, "M"));

        // Итерируемся по Мапе
        var keySet = aMap.keySet(); // возвращает список уникальных ключей мапы
        System.out.println("Set ключей " + keySet);
        System.out.println("Set ключей " + aMap.keySet());

        var values = aMap.values(); //
        System.out.println("Имена через Stream API:");
        values.stream()
                .map(Human::getName)
                .forEach(System.out::println);

        Set<Integer> passportNumbers = aMap.keySet(); // получили все ключи
        Collection<Human> humans = aMap.values(); // получили всех людей

        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet(); // Entry - это пара (ключ-занчение) - или pair (пара)

        for (Map.Entry<Integer, Human> entry : entrySet) {
            if (entry.getKey() == 2342323) {
                System.out.println("Нашли Петра: " + entry.getValue().getName());
            }

        }
    }
}
