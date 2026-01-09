package github.qa_guru;

import org.junit.jupiter.api.Test;

public class massivies {
    @Test
    public void main1() {
        int numElement = 1;
        int [] array0  = {100, 150, -1, 98};
        int [] array1 = {54, 67, -3, 34};

        int [] [] array2 = {array0, array1}; // Массив массивов

        System.out.println("Длинна массива: " + array0.length);
        System.out.printf("%d Элемент массива: %d%n", numElement+1, array0[numElement]);

        String[] arrayStr = new String[] {"Dima", "Vasya"};

        for (int i=0; i < array0.length; i++) {
            System.out.println(array0[i]);
        }

        for (int i=array0.length - 1; i >= 0; i--) {
            System.out.println(array0[i]);
        }
    }
}
