package headFirstJava;

public class CharacterDemo {

    public static void main(String[] args) {
        char ch = 'A';
        char digit = '7';
        char space = ' ';
        char lowerCaseLetter = 'b';
        String text = "Java 21";

        System.out.println("=== Исходные данные ===");
        System.out.printf("ch: '%c', digit: '%c', space: '%c'%n", ch, digit, space);


        // ==========================================
        // 1. Проверка типа символа (is...)
        // Самые частые методы в автотестах при парсинге строк/ID
        // ==========================================
        System.out.println("\n=== Проверка типов (is...) ===");

        // Является ли буквой?
        var isLetter = Character.isLetter(ch);
        // true

        // Является ли цифрой?
        var isDigit = Character.isDigit(digit);
        // true

        // Является ли пробелом? (включает табуляцию, перевод строки и т.д.)
        var isWhitespace = Character.isWhitespace(space);
        // true

        // Является ли заглавной буквой?
        var isUpperCase = Character.isUpperCase(ch);
        // true

        // Является ли строчной буквой?
        var isLowerCase = Character.isLowerCase(lowerCaseLetter);
        // true

        System.out.printf("isLetter('A'): %b%n", isLetter);
        System.out.printf("isDigit('7'): %b%n", isDigit);
        System.out.printf("isWhitespace(' '): %b%n", isWhitespace);
        System.out.printf("isUpperCase('A'): %b%n", isUpperCase);
        System.out.printf("isLowerCase('b'): %b%n", isLowerCase);


        // ==========================================
        // 2. Преобразование регистра (to...Case)
        // Полезно для нормализации данных перед сравнением
        // ==========================================
        System.out.println("\n=== Преобразование регистра ===");

        // Перевод в нижний регистр
        var toLower = Character.toLowerCase(ch); // 'a'

        // Перевод в верхний регистр
        var toUpper = Character.toUpperCase(lowerCaseLetter); // 'B'

        System.out.printf("'A'.toLowerCase(): %c%n", toLower);
        System.out.printf("'b'.toUpperCase(): %c%n", toUpper);


        // ==========================================
        // 3. Работа с числами и строками (getNumericValue, toString)
        // Критически важно при обработке ID транзакций или сумм из строк
        // ==========================================
        System.out.println("\n=== Числовые значения и преобразование ===");

        // Получить числовое значение символа-цифры
        // Важно: возвращает int, а не char!
        var numericVal = Character.getNumericValue(digit); // 7 (int)

        // Безопасное преобразование char в String
        // Нельзя просто писать (String) ch — это ошибка компиляции или runtime
        var strFromChar = Character.toString(ch); // "A"

        System.out.printf("getNumericValue('7') = %d (тип: %s)%n", numericVal, ((Object)numericVal).getClass().getSimpleName());
        System.out.printf("toString('A') = \"%s\"%n", strFromChar);

        // ==========================================
        // 5. Пример использования в реальной задаче (Парсер ID)
        // Допустим, нужно очистить ID от лишних символов, оставив только цифры и буквы
        // ==========================================
        System.out.println("\n=== Практический пример: Очистка строки ===");

        var dirtyId = "ORD-2026#123!";
        var cleanIdBuilder = new StringBuilder();

        for (var c : dirtyId.toCharArray()) {
            // Оставляем только буквы и цифры, отбрасываем спецсимволы (-, #, !)
            if (Character.isLetterOrDigit(c)) {
                cleanIdBuilder.append(c);
            }
        }

        var cleanId = cleanIdBuilder.toString();
        System.out.printf("Было: \"%s\" -> Стало: \"%s\"%n", dirtyId, cleanId);
    }
}