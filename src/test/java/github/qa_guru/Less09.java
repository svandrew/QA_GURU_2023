package github.qa_guru;

public class Less09 {
    public static void main(String[] args) {
        int[] myArr = {3,4,76,7,8,6,23,32};

        //выводит все чётные и нечётные числа используя оператор %
        for (int i : myArr) {
            if (isEven(i)) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }

        System.out.println("================================================");

        //вычисления
        int a1 = 5;
        int a2 = 5;
        System.out.println(a1 + a2);

        byte b = 3;
        short s = 5;
        System.out.println(s - b);

        double d = 14.5;
        long l = 10;
        System.out.println(d * l);

        float f = 4.5f;
        double dVar = 10.5;
        System.out.println(dVar / f);

        System.out.println("================================================");

        //переполнение
        byte byteVar = 127;
        int intNumber = 2147483647;
        System.out.println((byte) (byteVar + 1)); //-128
        System.out.println(intNumber + 1); // -2147483648

        System.out.println("================================================");

        int var = 100;
        double doubleVar = 100.2;
        System.out.println(var + doubleVar); // 200.2

        System.out.println("================================================");

        //int with double
        sumIntAndDouble(2, 4);
        subIntAndDouble(10, 3);

        System.out.println("================================================");

        //switch case
        checkCountryByCapital("Madrid");
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void sumIntAndDouble (int num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void subIntAndDouble (int num1, double num2) {
        System.out.println(num1 - num2);
    }

    public static void checkCountryByCapital(String capital){
        switch (capital) {
            case "Moscow":
                System.out.println("Russia");
                break;
            case "Madrid":
                System.out.println("Spain");
                break;
            case "Rome":
                System.out.println("Italy");
                break;
            case "Lisbon":
                System.out.println("Portugal");
        }
    }
}