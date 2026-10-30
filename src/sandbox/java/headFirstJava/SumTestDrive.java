package headFirstJava;

public class SumTestDrive {
    public static void main(String[] args) {
 //       var s = new MathFunctions();
 //       System.out.println("Сумма двух целых значений = " + s.sum(1,5));
        System.out.println("Сумма двух целых значений = " + MathFunctions.sum(1,5));

        System.out.println(MathFunctions.sumEl("Сумма набора значений = %d",2,3,4,5,6,8));
    }
}
