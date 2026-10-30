package headFirstJava;

public class Cat extends Animal {

    protected int age;
    protected int name;


    public void play() {
        System.out.println("Выполнен метод Тест из класса Hello");
    }

    public void jump() {
        System.out.println("Выполнен метод Jump из класса Hello");
    }

    @Override
    public void go() {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" мяу");
    }

}