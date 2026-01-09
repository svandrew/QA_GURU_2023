package github.qa_guru;

class Human {

    private String name;
    private int age;
    private String sex;

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {  // т.к. есть @Getter
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getSex() {        return sex;
    }
}