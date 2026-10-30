package headFirstJava;

public class Counter {
    private static int count = 1;

    public static void main(String[] args){
        System.out.println(count); //compile time error, пока count не static обратиться к ней без создания экземпляра класса нельзя

    }
}
