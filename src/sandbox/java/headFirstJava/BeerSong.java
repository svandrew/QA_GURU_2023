package headFirstJava;

public class BeerSong {
    public static void main(String[] args) {
        var beerNum = 4;
        String word = "бутылок (бутылки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "бутылка"; // В единственном числе – ОДНА бутылка.
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                // эта строка была лишней
 //               System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println();  // добавил для разделения куплетов
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}