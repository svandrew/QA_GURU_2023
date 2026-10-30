package headFirstJava;

public class NumberConversionExamples {

    public static void main(String[] args) {
        String strNumber = "12345";

        // Способ 1: Integer.parseInt() — Возвращает примитив int
        // Используется чаще всего для расчетов, индексов массивов
        int primitiveInt = Integer.parseInt(strNumber);
        System.out.println("primitiveInt: " + primitiveInt);

        // Способ 2: Integer.valueOf() — Возвращает объект Integer
        // Используется, когда нужен именно Object (например, в коллекциях List<Integer>)
        // ВАЖНО: valueOf кэширует значения от -128 до 127!
        int objectInteger = Integer.valueOf(strNumber);
        System.out.println("objectInteger: " + objectInteger);

        // Аналогично для других типов:
        long longVal = Long.parseLong("9999999999");   // Для больших чисел (ID в БД часто long)
        double doubleVal = Double.parseDouble("10.5");   // Для денег/процентов
        float floatVal = Float.parseFloat("3.14f");

        // Безопасный парсинг (Java 8+)
        // Если строка может быть null или не числом, лучше использовать Optional
        try {
            int safeParse = Integer.parseInt(null); // Уронит NullPointerException
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Ошибка парсинга: " + e.getMessage());
        }
    }
}