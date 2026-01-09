package github.qa_guru;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

// https://proglang.su/java/operators

public class Operators {
    @Test
    public void main1() {
        byte a = 127;
        byte b = 20;
        int c = 25;
        int d = 25;
        double f = 5.99; //64 bytes must have
        System.out.println("a + b = " + (a + b));
        System.out.println("(byte)(a + b) = " + (byte) (a + b)); // -109   ( 147 - 256 = -109)
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));
        System.out.println();
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " + (d++));
        System.out.println("d     = " + (d));
        System.out.println("++d   = " + (++d));
        System.out.println();
        c = 25;
        System.out.println("c + f = " + (c + f));
        int varInt = 25;
        double varDouble = 2.99d;
        System.out.println("varInt + varDouble = " + (varInt + varDouble));
    }

    @Test
    public void main2() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

    }

    @Test // Побитовые операторы
    public void main3() {
        byte a = 127;    /* 60 = 0011 1100 */
        byte b = 13;    /* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

    @Test //Логические операторы
    public void main4() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a && b));

        System.out.println("a || b = " + (a || b));

        System.out.println("!(a && b) = " + !(a && b));
    }

    @Test // Операторы присвоения
    public void main5() {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c);

        c += a;
        System.out.println("c += a  = " + c);

        c -= a;
        System.out.println("c -= a = " + c);

        c *= a;
        System.out.println("c *= a = " + c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);

        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);

        c <<= 2;
        System.out.println("c <<= 2 = " + c); // побитовый сдвиг 5 в двоичной системе: 00000101  (это 5 в десятичной) >> 00001010

        c >>= 2;
        System.out.println("c >>= 2 = " + c);

        c >>= 2;
        System.out.println("c >>= a = " + c);

        c &= a;
        System.out.println("c &= 2  = " + c);

        c ^= a;
        System.out.println("c ^= a   = " + c);

        c |= a;
        System.out.println("c |= a   = " + c);
    }

    @Test // Тернарный оператор или условный оператор (?:)
    public void main6() {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Значение b: " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Значение b: " + b);
    }

    @Test // Оператор instanceof
    public void main7() {
        String name = "Олег";
        Integer s = 1;
        // Следующее вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println("Результат проверки: " + result);

        boolean resultInt = s instanceof Integer;
        System.out.println("Результат проверки: " + result);
    }

    @Test // Для BigDecimal используйте методы add(), subtract(), multiply(), divide()
    public void main8() {
        BigDecimal price = new BigDecimal("5.99");
        BigDecimal quantity = new BigDecimal("3");

        // Вычисления
        BigDecimal total = price.multiply(quantity);
        BigDecimal withTax = total.multiply(new BigDecimal("1.20")); // +20% НДС

        // Округление
        BigDecimal rounded = withTax.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Price:  " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal:" + total); // 17.97
        System.out.println("With tax (20%): " + withTax); // 21.564
        System.out.println("Rounded: " + rounded); // 21.56

        // Форматирование для разных локалей
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        System.out.println("US format: " + usFormat.format(rounded)); // $21.56
        System.out.println("EU format: " + euroFormat.format(rounded)); // 21,56 €
    }

    @Test    //public static void main(String[...] args) warar massive
    public void main9() {
        // примитивные переменные
        byte varByte = 127; //-128 ....... 127
        short varShort = 32767; // -32788 ....... 32767
        int varInt = 99_999; // -2 в 31 степени ..... 2 в 31 степени -1 must have
        long varLong = 999999L; // -2 в 64 степени ...... до 2 в 64 степени -1
        // Floating point data
        float varFloat = 0.1f; //32bytes
        double varDouble = 1.99d; //64 bytes must have
        //операции с переменными
        System.out.println(varByte + varShort);
        System.out.println(varInt - varLong);
        System.out.println(varByte / varFloat);
        System.out.println(varByte % varShort);
        // переполнение
        System.out.println((byte) (varByte + 1));
        System.out.println((short) (varShort + varLong));
        //вычисления с int и double
        System.out.println("Usual price for this goods is " + (varInt + varDouble) + " USD, ");
        System.out.println("but your special price for this goods is ");
        System.out.print(varInt - varDouble);
        System.out.print(" USD\n");

        System.out.println("#######");

        int intTen = 10;
        float floatTwoHalf = 3.333333333F;

        System.out.println("Int делим на float " + (intTen / floatTwoHalf));
        System.out.println("Int остаток от деления на float " + intTen % floatTwoHalf);
        System.out.println("#######");
    }
}