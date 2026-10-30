package headFirstJava;

class Dog extends Animal{
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println(name + " сказал гав, гав!");
    }

    public void eat() {
    }

    public void chaseCat() {
    }

    @Override
    public String toString() {
        return "Собака по имени " + name;
    }

    @Override
    public void go() {

    }
}