package Jenerics;

/* как это было раньше до 5 java
 */
public class BoxOld {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object o) {
        item = o;
    }

    public static void main(String[] args) {
        BoxOld b = new BoxOld();
        b.setItem(5);

        BoxOld c = new BoxOld();
        c.setItem("car");

        //       System.out.println(b.getItem().toString());
        System.out.println(b.getItem().getClass());
        System.out.println(c.getItem().getClass());
    }


}
