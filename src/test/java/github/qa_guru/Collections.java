package github.qa_guru;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {
    @Test
    public void main1() {

        // <> - джененрик тип
        List<String> stringList = new ArrayList<>();
        stringList.add("Dima");
        stringList.addAll(Arrays.asList("Petr", "Ivan", "Victor", "Nick"));

        String str = stringList.get(0);
        System.out.println("Первый элемент: " + str);

        stringList.remove(0);
        System.out.println("Первый элемент после удаления: " + stringList.get(0));
        System.out.println("Список после удаления элементов1: " + stringList);

        stringList.remove("Ivan"); // удаляет первое вхождение
        System.out.println("Список после удаления элементов2: " + stringList);

        // Находим индекс не сузествующего Элемента
        var index0 = stringList.indexOf("арвроа");
        System.out.println("Индекс элемента: " + index0); // -1 если элемент не найден!!!

        // Находим индекс не существующего Элемента
        var index = stringList.indexOf("Petr");
        System.out.println("Индекс элемента: " + index);

        stringList.stream()
                .filter(s -> s.contains("i"))
                .forEach(System.out::println);

        // альтернативный вариант
        List<String> filteredList = stringList.stream()
                .filter(s -> s.toLowerCase().contains("i"))
                .collect(Collectors.toList());
        System.out.println(filteredList); // [Victor, Nick]

        for (var var : stringList){
            System.out.println("Вывод элементов списка перебором " + var.toUpperCase());
        }
        for (int i=0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        // SET (анаог list. но хранит только уникальные значения

        Set<Integer> stringSet = new HashSet<>();
        stringSet.add(1);
        stringSet.add(1);
        stringSet.add(3);
        System.out.println("Список SET " + stringSet); // [1, 3],  т.к. второе добавление не удалось

        Map <String, Integer> aMap = new HashMap<>(); // нужно занать как работает hashMap, для чего eaquals и hashCode
        // нужно занать различия между list, set и map
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
