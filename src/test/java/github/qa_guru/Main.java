package github.qa_guru;

import java.util.*;

public class Main {
    public static void main(String... args) {
        // Типы данных
        // логический
        boolean varBoolean = false;
        // целочисленные
        byte varByte = 100; // -128 ... 127  (-2 ^ 7 ... (2 ^ 7) -1)
        short varShort = 1000; // -321768  ... 321767
        int varInt = 100_000_000;
        long varLong = 0L;
        // символ (под капотом тоже число)
        char varChar = 'f';
        //  числа с плавающей точкой
        float varFloat = 0.0F;
        double varDouble0 = 36.0;
        String varString0 = "Selenide";
        String varString1 = "Selenide";

        int coinNominal = 3;
        String coinCurrency = "RUB";

        // Операторы
        // Операторы математические
        int result = 10;
        result = result + 1;
        result += 1;
        result = ++result;

        // Операторы сравнения
        // > < >= <= == !=

        // Логические операторы
        // && || !, ^
        if (coinCurrency.equals("RUB")) {
            System.out.println("Это рубль!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("Это долар!");
        } else {
            System.out.println("Ничего не подошло");
        }

        switch (coinCurrency) {
            case "RUB": {
                System.out.println("Это рубль!");
                break;
            }
            case "USD": {
                System.out.println("Это долар!");
                break;
            }
            default: {
                System.out.println("Ничего не подошло");
            }
        }

        // МАССИВЫ
        String[] arrayStr = new String[]{"Dima", "Vasya"};  // массив стригов

        int[] arrayQ = {100, 150, -1, 90, 80, 345, 43534}; // массив целочисленных

        // ЦИКЛЫ
        // for - когда известно точное количество итераций

        // while - когда количество итераций неизвестно, зависит от условия

        // do-while - когда нужно выполнить код минимум 1 раз

        // for-each - для перебора элементов массивов или коллекций

        for (int i = 0; i < arrayQ.length; i++) {   // обычный цикл FOR
            if (arrayQ[i] != -1) {
                continue;
            }
            // Сложное вычисление
            System.out.println("Радуемся, нашли: " + arrayQ[i]);
            break;
        }

        for (int i = arrayQ.length - 1; i >= 0; i--) {
            System.out.println(arrayQ[i]);
        }
        int q = 1;
        for (int var1 : arrayQ) {  // For-each для работы с массивами/коллекциями
            System.out.printf("Цикл For-each элемент %d с инщдексом %d: %d%n", q, q - 1, var1);
            q++;
        }

        System.out.println(arrayQ[0]);
        System.out.println(arrayQ[1]);
        System.out.println(arrayQ[2]);
        System.out.println(arrayQ[3]);

        // Проверка условия перед выполнением
        int counter = 0;
        while (counter < 3) {  // цикл WHILE
            System.out.println("Счетчик: " + counter);
            counter++;
        }
        // Вывод: 0, 1, 2


        // WHILE DO
        // Пример: гарантированное выполнение
        int attempts = 0;
        do {
            System.out.println("Попытка №" + (attempts + 1));
            attempts++;
        } while (attempts < 0);
        // Вывод: всегда выполнится 3 раза

        // continue - пропускает текущую итерацию
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропускаем четные числа
            }
            System.out.print(i + " ");
        }         // Вывод: 1 3 5 7 9


        // Пример бесконечного цикла с условием выхода
        int count = 0;
        while (true) {
            count++;
            System.out.println("Проход " + count);
            if (count >= 10) {
                System.out.println("Достигнут предел!");
                break;
            }
        }

        // Метки для вложенных циклов
        outerLoop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Прерываем оба цикла");
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("###################");


        List<Integer> stringList = new ArrayList<>();
        stringList.add(12); //boxing
        stringList.addAll(Arrays.asList(34, 3534));


        for (int var : stringList) { //unboxing
            System.out.println(var);
        }

        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }

        Set<Integer> stringSet = new HashSet<>();
        stringSet.add(1);
        stringSet.add(10);

    }


    public static String someMethod(String... args) {
        return "";
    }
}