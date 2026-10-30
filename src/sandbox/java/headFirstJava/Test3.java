package headFirstJava;

public class Test3 {

    public static void main(String[] args) {
        var mike = new Hello(5, "Mike");
        var kati = new Hello();


        System.out.println(mike.num);
        System.out.println(mike.name);

        System.out.println(kati.num);
        System.out.println(kati.name);
    }

    //     @Setter
    public static class Hello {
        private int num; // Этот num - это поля класса Hello, видно внутри всего класса
        public String name;
        public String color;
        public int age;

//        public Hello (){}

        public Hello (){
            this (7,"Kati");
        }

        public Hello(int num, String name){
            this.num = num;
            this.name = name;
        }
    }

}
