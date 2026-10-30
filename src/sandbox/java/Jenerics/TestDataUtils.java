package Jenerics;

import net.datafaker.Faker;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import static org.apache.commons.lang3.ArrayUtils.addFirst;

public class TestDataUtils {

    public static final Faker FAKER_RU = new Faker(new Locale("ru", "RU"));
    public static final Faker FAKER_EN = new Faker(new Locale("en", "US"));

    @SuppressWarnings("unchecked")
    public static <T> List<T> getRandomElements(List<T> list, int elementsCount) {
        if (elementsCount > list.size()) {
            throw new IllegalArgumentException("Количество запрашиваемых элементов больше, чем значений в списке " + list);
        }
        return (List<T>) List.copyOf(FAKER_RU.options().subset(elementsCount, list.toArray()));
    }

    public static <T> T getRandomElement(T first, T... elements) {
        return getRandomElement(List.of(addFirst(elements, first)));
    }

    public static <T> T getRandomElement(List<T> list) {
        return list.get(FAKER_RU.number().numberBetween(0, list.size()));
    }

    public static <T> T getRandomElement(List<T> list, Predicate<T> condition) {
        return getRandomElement(list.stream().filter(condition).toList());
    }

    public static <T> List<T> getRandomElements(List<T> list, Predicate<T> condition, int count) {
        return getRandomElements(list.stream().filter(condition).toList(), count);
    }

    public static String generateMaskedCardNumber() {
        return FAKER_RU.regexify("[0-9]{4} [0-9]{2}\\*{2} \\*{4} [0-9]{4}");
    }
}
