package github.qa_guru;

import org.junit.jupiter.api.Test;

// https://github.com/qa-guru/knowledge-base/wiki/4.-%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B-Java

public class Conditions {
    @Test
    public void main1() {
        int a = 6;
        int b = 4;
        if (a > b) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }
    }

    @Test
    public void main2() {
        int a = 6;
        int b = 4;
        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (a < b) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }

    @Test
    public  void main3() {
        int num = 8;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
               break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
    }

    @Test // важен порядок, т.к. при нахождении нужного case программа будет заходить во все последующие, если не поставить break!!!
    public void main4(){
        int num = 3;
        int output = 0;
        switch(num){

            case 1:
                output = 3;
                break;
            case 2:
      //      case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                System.out.println("case 5: " + output);
                //        break;
            default:
                output = 24;
            case 3:
        }
        System.out.println("Final: " + output);
    }

}
