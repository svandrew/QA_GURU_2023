package headFirstJava;

public class CompareToDemo {
    public static void main(String[] args) {
        var cardNameA = "Alpha Card";
        var cardNameB = "Beta Card";

        // Сравниваем строки лексикографически (по алфавиту)
        int result = cardNameA.compareTo(cardNameB);

        if (result < 0) {
            System.out.println("'Alpha' идет раньше 'Beta'");
        } else if (result > 0) {
            System.out.println("'Alpha' идет после 'Beta'");
        } else {
            System.out.println("Строки равны");
        }

        // ВАЖНО: compareTo чувствителен к регистру!
        // 'a' имеет код меньше, чем 'A'. Поэтому "apple".compareTo("Apple") вернет положительное число.
        // Для игнорирования регистра используй equalsIgnoreCase() или приводи к одному регистру.
    }
}