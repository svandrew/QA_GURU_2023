package Jenerics;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T o) {
        item = o;
    }

    public static void main(String[] args) {
        Box <Integer> b = new Box<>();
        b.setItem(5);

        Box <String> c = new Box <String>();
        c.setItem("car");


        //       System.out.println(b.getItem().toString());
        System.out.printf("Объект b класса \"%s\", значение = %s ", b.getItem().getClass(), b.getItem());
        System.out.println();
        System.out.printf("Объект c класса \"%s\", значение = %s ", c.getItem().getClass(), c.getItem());
    }


}
