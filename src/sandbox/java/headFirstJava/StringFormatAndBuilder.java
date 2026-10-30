package headFirstJava;

class StringFormatAndBuilder {
    static int a = 10;
    static double b = 34.5466;
    static float c = 1.54645F;
    static String e = "Виталий";

    public static void main(String[] args) {

        // ==========================================
        // 1. Вариант с printf (Рекомендуемый для консоли)
        // Использует %n для кроссплатформенного переноса строки
        // ==========================================
        System.out.printf("=== ПРИМЕР 1: printf ===%n");
        System.out.printf(
                "Привет %s,%n" +
                        "значение Integer a = %d,%n" +
                        "значение Double b = %.3f,%n" +
                        "значение Float c = %.2f%n",
                e, a, b, c
        );
        System.out.println(); // Пустая строка для разделения блоков


        // ==========================================
        // 2. Вариант с String.format + println
        // Менее эффективен по памяти, но удобно сохранять в переменную
        // ==========================================
        System.out.println("=== ПРИМЕР 2: String.format ===");
        String formattedMessage = String.format(
                "Привет %s,\n" +      // Здесь можно использовать \n, так как выводим в консоль IDE
                        "значение Integer a = %d,\n" +
                        "значение Double b = %.3f,\n" +
                        "значение Float c = %.2f",
                e, a, b, c
        );
        System.out.println(formattedMessage);
        System.out.println();


        // ==========================================
        // 3. Текст-блоки (Text Blocks) - Java 15+
        // Идеально для JSON, SQL или многострочных логов
        // Переносы строк сохраняются автоматически
        // ==========================================
        System.out.println("=== ПРИМЕР 3: Text Blocks ===");
        String textBlockOutput = """
                Привет %s,
                значение Integer a = %d,
                значение Double b = %.3f,
                значение Float c = %.2f
                """.formatted(e, a, b, c); // Метод .formatted() работает как String.format

        System.out.print(textBlockOutput); // print вместо println, так как в блоке уже есть \n в конце
        System.out.println();


        // ==========================================
        // 4. Системный разделитель (System.lineSeparator())
        // Обязателен при записи в файлы (.txt, .csv, reports)
        // ==========================================
        System.out.println("=== ПРИМЕР 4: File Output Simulation ===");
        String lineSep = System.lineSeparator();

        System.out.println("Линейный сепаратор" + lineSep + "продолжение строки");

        StringBuilder fileContentBuilder = new StringBuilder();
        fileContentBuilder.append("Header Data").append(lineSep);
        fileContentBuilder.append("User: ").append(e).append(lineSep);
        fileContentBuilder.append("Score A: ").append(a).append(lineSep);
        fileContentBuilder.append("Price B: ").append(b).append(lineSep);

        // Имитация записи в файл (просто печатаем то, что записали бы)
        System.out.println(fileContentBuilder.toString());
        System.out.println("(Этот текст корректно откроется в любом редакторе на любой ОС)");
    }
}
