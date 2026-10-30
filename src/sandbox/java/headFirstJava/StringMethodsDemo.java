package headFirstJava;

public class StringMethodsDemo {

    public static void main(String[] args) {

        // Исходные данные для примеров
        String rawInput = "  User Name: Ivanov_Ivan  ";
        String emailTemplate = "user_{id}@domain.com";
        String csvData = "100,200,300,400";
        String htmlText = "<div>Hello <b>World</b></div>";

        System.out.println("=== 1. Очистка и нормализация (Trim & Strip) ===");
        // Trim убирает пробелы только с краев (старый способ)
        // strip() (Java 11+) убирает любые юникод-пробельные символы (табуляция, неразрывный пробел)
        String cleanedName = rawInput.strip();
        System.out.printf("Original: '%s'%nCleaned: '%s'%n", rawInput, cleanedName);


        System.out.println("\n=== 2. Поиск и проверка наличия (Contains & IndexOf) ===");
        // contains() — самый частый метод в Selenide/JUnit для проверки текста элемента
        Boolean hasKeyword = cleanedName.contains("Ivan");

        // indexOf() возвращает позицию первого вхождения (-1 если не найдено)
        int colonPos = cleanedName.indexOf(":");

        System.out.printf("Contains 'Ivan': %b%nPosition of ':': %d%n", hasKeyword, colonPos);


        System.out.println("\n=== 3. Извлечение подстрок (Substring) ===");
        // substring(startIndex) — от индекса до конца
        // substring(startIndex, endIndex) — от start до end (не включая end!)
        String labelPart = cleanedName.substring(0, colonPos);       // "User Name"
        String valuePart = cleanedName.substring(colonPos + 1).strip(); // "Ivanov_Ivan"

        System.out.printf("Label: '%s'%nValue: '%s'%n", labelPart, valuePart);


        System.out.println("\n=== 4. Замена символов и строк (Replace & ReplaceAll) ===");
        // replace(char old, char new) или replace(CharSequence, CharSequence) — точное совпадение
        String formattedEmail = emailTemplate.replace("{id}", "999");

        // replaceAll(regex, replacement) — использует регулярные выражения!
        // Пример: удаление всех HTML тегов из строки
        String plainText = htmlText.replaceAll("<[^>]*>", "");

        System.out.printf("Formatted Email: %s%nPlain Text from HTML: %s%n", formattedEmail, plainText);


        System.out.println("\n=== 5. Разбиение на части (Split) ===");
        // split() возвращает массив строк. Часто используется для парсинга CSV или URL параметров
        String[] numbersArray = csvData.split(",");

        // Важно: split("") разбивает строку на отдельные символы
        String[] charsArray = "ABC".split("");

        System.out.printf("CSV parts count: %d%nFirst part: %s%nLast part: %s%n",
                numbersArray.length, numbersArray[0], numbersArray[numbersArray.length - 1]);
        System.out.println();

        int i = 0;
        for (String c : charsArray) {
            System.out.println(i + " элемент - " + c);
            i++;
        }

        System.out.println("\n=== 6. Проверка начала/конца (StartsWith & EndsWith) ===");
        // Критично для валидации форматов (URL, телефоны, ID транзакций)
        String url = "https://qa-guru.ru/login";
        Boolean isSecureHttp = url.startsWith("https://");
        Boolean isLoginPage = url.endsWith("/login");

        System.out.printf("Is Secure HTTPS: %b%nIs Login Page: %b%n", isSecureHttp, isLoginPage);


        System.out.println("\n=== 7. Сравнение строк (Equals vs EqualsIgnoreCase) ===");
        // equals() — чувствительно к регистру
        // equalsIgnoreCase() — игнорирует регистр (лучше для сравнения заголовков, статусов)
        String expectedStatus = "SUCCESS";
        String actualStatusFromApi = "success";

        Boolean strictMatch = expectedStatus.equals(actualStatusFromApi);      // false
        Boolean looseMatch = expectedStatus.equalsIgnoreCase(actualStatusFromApi); // true

        System.out.printf("Strict match: %b%nLoose match: %b%n", strictMatch, looseMatch);


        System.out.println("\n=== 8. Конкатенация и форматирование (Join & Format) ===");
        // String.join(delimiter, elements...) — удобный склейщик коллекций/массивов
        String joinedIds = String.join("-", "A", "B", "C"); // "A-B-C"

        // formatted() / String.format() — вставка переменных в шаблон
        var reportLine = "User: %s | Status: %s | Balance: %.2f".formatted(valuePart, actualStatusFromApi, 1500.50);

        System.out.printf("Joined IDs: %s%nReport Line: %s%n", joinedIds, reportLine);


        System.out.println("\n=== 9. Практический кейс для автотестов: Парсинг цены ===");
        // Допустим, со страницы спарсили текст "$ 1 234,56 USD"
        String messyPriceText = "$ 1 234,56 USD";

        // 1. Удаляем валюту и лишние пробелы
        var pureNumberStr = messyPriceText
                .replace("$", "")
                .replace("USD", "")
                .replace(" ", "")   // удаляем разделитель тысяч
                .replace(",", ".")  // заменяем десятичный разделитель на точку
                .trim();            // на всякий случай чистим края

        // 2. Преобразуем в число (Double.parseDouble)
        double priceAsDouble = Double.parseDouble(pureNumberStr);

        System.out.printf("Raw text: '%s'%nParsed double: %.2f%n", messyPriceText, priceAsDouble);
    }
}
