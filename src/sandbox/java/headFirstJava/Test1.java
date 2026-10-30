package headFirstJava;

public class Test1 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }

        int a = 5;
        int b = a++;

        System.out.println("");
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);

        int c = 5;
        int d = ++c;

        System.out.println("");
        System.out.println("c= "+ c);
        System.out.println("d= "+ d);

        int [] arr = {1,2,4,5,6,6,89};

        for (int i=0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }

        System.out.println("");

        for (var el: arr){
            System.out.print(" "+el);
        }
    }
}
