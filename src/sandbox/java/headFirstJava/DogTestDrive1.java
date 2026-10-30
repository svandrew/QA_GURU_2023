package headFirstJava;

public class DogTestDrive1 {
    public static void main(String[] args) {
//        Dog [] pets;
//        pets = new Dog[7];
//        pets[0] = new Dog();
//        pets[1] = new Dog();
//
//        System.out.println("Массив собак: " + Arrays.toString(pets));
//        System.out.println("Собака: " + pets[0]);
//        System.out.println("Собака: " + pets[0].toString());


        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        // перебираем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
