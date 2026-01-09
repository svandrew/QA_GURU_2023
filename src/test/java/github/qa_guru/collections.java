package github.qa_guru;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collections {
    @Test
    public void main1() {

        // <> - джененрик тип
        List<String> stringList = new ArrayList<>();
        stringList.add("Dima");
        stringList.addAll(Arrays.asList("Petr", "Ivan"));
    }

    @Test
    public  void main2(){
        int[] arr = {1, 2, 3, 4, 5};

// Сумма
        int sum = Arrays.stream(arr).sum(); // 15
        System.out.println("Сумма: " + sum);

// Среднее
        double avg = Arrays.stream(arr).average().orElse(0); // 3.0
        System.out.println("Среднее: " + avg);

// Фильтрация
        int[] even = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray(); // [2, 4]
        System.out.println("Четные: " + Arrays.toString(even));

// Преобразование
        int[] squared = Arrays.stream(arr)
                .map(x -> x * x)
                .toArray(); // [1, 4, 9, 16, 25]
        System.out.println("в степени 2: " + Arrays.toString(squared));
    }

    @Test
    public void main3(){
        // Сам массив
        int[] numbers = {3, 2, 1};
        System.out.println(Arrays.toString(numbers));

// Встроенные свойства массива:
        int length = numbers.length; // 3
        int element = numbers[1]; // 2
        System.out.println("длинна массиыва "+length);
        System.out.println("значение элемента в индексе 1 = "+element);

// Методы класса Arrays:
        Arrays.sort(numbers); // сортировка
        System.out.println("Отсортированный список " + Arrays.toString(numbers));

        String str = Arrays.toString(numbers); // преобразование в строку
        System.out.println("Преобразованный список " + str);
    }
}
