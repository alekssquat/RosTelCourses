package Lesson2Java1;

public class Main {
    public static void main(String[] args) {
        Animal cat1 =new Cat();
        Cat cat2=new Cat();
        Dog dog1=new Dog();

        cat1.voice();
        cat2.voice();
        cat2.getOnTree();
        dog1.voice();
    }
}
