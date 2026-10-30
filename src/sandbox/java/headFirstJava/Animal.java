package headFirstJava;

abstract class Animal {
    private int id;

    public int getId() {
        return id;
    }
    public abstract void go();

    public void makeSound(){
        System.out.print("Выполнен метод sound из класса Animal");
    }

}