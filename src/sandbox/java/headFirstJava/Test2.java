package headFirstJava;

public class Test2 {

    public static void main(String[] args) {
        var hello = new Hello();
        hello.setNum(7);
        hello.setAge(14);
        hello.setName("Piter");
        hello.setColor("Red");

        System.out.println(hello.num);
        System.out.println(hello.name);
        System.out.println(hello.color);
        System.out.println(hello.age);
    }

    //     @Setter
    public static class Hello {
        private int num; // Этот num - это поля класса Hello, видно внутри всего класса
        public String name;
        public String color;
        public int age;

        public void setNum(int num) {  // этот num - это аргумент и виден только внутри функции
            this.num = num;  //  this обязательно нужен, если название поля и переменной совпадают
            // лучше ВСЕГДА указывать this, т.к. название поля может быть объявлено в суперклассе и мы его сейчас не видим, поэтому не знаем совпадат они или нет
        }

        public void setAge(int age) {
            age = age;  // age будет 0, т.к. у переменной age изз параметра satAge приоритет выше и JVM возьмет ее и присвоит ей значение снова ее, т.е. 0 (ноль)
        }

        public void setName(String name) {
            this.name = name;  // this обязательно нужен, если название поля и переменной совпадают
        }

        public void setColor(String varColor) {
            color = varColor;  // this можно не использовать, если название поля и переменной разные и JVM сама поймет что есть что.
        }
    }
}
