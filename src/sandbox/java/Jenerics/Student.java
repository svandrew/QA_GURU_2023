package Jenerics;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // ===== Поля =====
    private String name;
    private int age;
    private List<Integer> grades = new ArrayList<>();

    // ===== Конструктор =====
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ===== Обычные методы =====
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double averageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades)
            sum += g;
        return Math.round((double) sum / grades.size() * 1000.0) / 1000.0;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет), оценки: " + grades;
    }

    // ===== Generic-метод =====
    // <T> перед возвращаемым типом объявляет параметр типа для этого метода.
    // Метод возвращает последний элемент списка любого типа.
    public static <T> T getLast(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list == null)
            throw new IllegalArgumentException("Список не может быть NULL");
        if (list.isEmpty())
            return null;
        T a = list.get(0);
        for (T i : list)
            if (a.compareTo(i) < 0)
                a = i;
        return a;
    }

    // ===== Проверка =====
    @Nullable
    public static void main(String[] args) {
        Student s = new Student("Аня", 20);
        s.addGrade(7);
        s.addGrade(4);
        s.addGrade(3);

        System.out.println(s);
        System.out.printf("Средний балл: %.5f%n", s.averageGrade());
        System.out.println("Средний балл: " + s.averageGrade());

        // Один и тот же generic-метод работает с разными типами:
        Integer lastGrade = getLast(s.grades);                    // T = Integer
        String lastName = getLast(List.of("Аня", "Виктор"));     // T = String
        Student lastStud = getLast(List.of(s, new Student("Борис", 22)));   // T = Student

        String maxObject = getMax(List.of("Аня", "Виктор"));

        System.out.println("Последняя оценка: " + lastGrade);
        System.out.println("Последнее имя: " + lastName);
        System.out.println("Последний студент: " + lastStud.getName());

        System.out.println("Большее имя: " + maxObject);
        System.out.println(getMax(List.of(3, 17, 5, 9)));
        System.out.println(getMax(List.of("кот", "бегемот", "яблоко", "арбуз")));
        System.out.println(getMax(List.of(2.5, -1.0, 7.25)));
        System.out.println(getMax(new ArrayList<String>()));

        List<Integer> empty = new ArrayList<>();
        System.out.println(getMax(empty));
        List<Integer> nullInteger = null;
        System.out.println(getMax(nullInteger));

        int x = getMax(new ArrayList<Integer>());
    }
}