package Jenerics;

/*
extends сужает использование возможных типов, можно задать только те что наследуются от заданного
в данном случае от Numbers
 */
public class BoxExtends<T extends Number> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T o) {
        item = o;
    }

    static Number sum(BoxExtends<? extends Number> c, BoxExtends<? extends Number> d) {
        return c.getItem().doubleValue() + d.getItem().intValue();
    }

    public static void main(String[] args) {
        BoxExtends<Float> b = new BoxExtends<>();
        b.setItem(5.8657f);
        System.out.printf("Объект b класса \"%s\", значение = %s ", b.getItem().getClass(), b.getItem());
        System.out.printf("Объект b класса \"%s\", значение = %s%n", b.getClass().getSimpleName(), b.getItem());


        BoxExtends<Integer> c  = new BoxExtends<>();
        c.setItem(10);
        String s = c.getItem().toString();
        System.out.println("Строковое значение = " + s);
        System.out.println(("Сумма = " + sum(b,c)));  // Float + Integer — работает благодаря ? extends Number

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("яблоко".compareTo("арбуз"));
        System.out.println("арбуз".compareTo("яблоко"));
        System.out.println("кот".compareTo("бегемот"));
        System.out.println("кот".compareTo("кот"));
        System.out.println("аяяяя".compareTo("б"));
        System.out.println("кот".compareTo("кит"));
        System.out.println("кот".compareTo("котик"));
        System.out.println("котик".compareTo("кот"));

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("я " + (int) 'я');
        System.out.println("а " + (int) 'а');
        System.out.println("к " + (int) 'к');
        System.out.println("б " + (int) 'б');
        System.out.println("и " + (int) 'и');
        System.out.println("о " + (int) 'о');

    }
}
