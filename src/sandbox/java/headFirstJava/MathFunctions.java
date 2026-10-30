package headFirstJava;

public class MathFunctions {

    // Метод sum принимает два параметра: int a и Integer b
    // Внутри метода значения параметров изменяются, но это не влияет на вызывающий код
    @Deprecated
    public static int sum(int a, Integer b) {
        a = 10;
        b = 20;
        return a + b;
    }

    // Метод sumEl принимает строку a и переменное количество целых чисел num
    // Вычисляет сумму всех переданных чисел и подставляет ее в строку a
    public static String sumEl(String a, int... num) {
        // int[] num2 = num;
        // три точки задают переменное число аргументов
        // такой элемент задается в параметрах только один раз и только в конце
        int summa = 0;
        for (int i : num) {
            summa += i;
        }
        return String.format(a, summa);
    }

}
