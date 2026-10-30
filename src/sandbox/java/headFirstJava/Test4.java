package headFirstJava;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void callSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {

        Animal cat1 = new Cat();
//        cat1.play();
//        System.out.println(cat1.getId());
//        cat1.jump();
//        cat1.age = 10;
        callSound(cat1);

        Animal dog1 = new Dog();
        callSound(dog1);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());

        animals.forEach(Test4::callSound);

//        Animal r = new Cat();
//        r.play();
//        r.getId();
//        //       r.jump(); // так не вызовется
//        ((Cat) r).jump();  // делаем приведение типов и вызываем
//        ((Cat) r).age = 14;
//        r.makeSound();
    }
}
