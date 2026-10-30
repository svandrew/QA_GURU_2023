package headFirstJava;

import java.util.Arrays;

class BooksTestDrive {
    public static void main(String[] args) {
        // Создаем массив ссылок на 3 книги
        Books [] myBooks = new Books[3];

        // ВАЖНО: Заполняем массив объектами, иначе будет NullPointerException
//        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0] = new Books("Плоды Java", "БобТорнтон");

        // Заполняем данные
//        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";

//        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        // Выводим информацию о книгах
        var x = 0;
        while (x < myBooks.length) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }

        // Бонус: проверка через Arrays.toString (выведет хеш-коды, если не переопределен toString)
        System.out.println("Массив книг: " + Arrays.toString(myBooks));
    }

    static class Books {
        String title;
        String author;

        Books(String title, String author) {
            this.title = title;   // Присваиваем полю title значение из параметра
            this.author = author; // Присваиваем полю author значение из параметра
        }

        Books(){}
    }
}