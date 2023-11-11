package excercise3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.walk() + ". " + cat.talk() + ". " + cat.eat() + ".");
        Dog dog = new Dog();
        System.out.println(dog.walk() + ". " + dog.talk() + ". " + dog.eat() + ".");
        Mouse mouse = new Mouse();
        System.out.println(mouse.walk() + ". " + mouse.talk() + ". " + mouse.eat() + ".");
        Chicken chicken = new Chicken();
        System.out.println(chicken.walk() + ". " + chicken.talk() + ". " + chicken.eat() + ".");
        Duck duck = new Duck();
        System.out.println(duck.walk() + ". " + duck.talk() + ". " + duck.eat() + ".");
    }
}
