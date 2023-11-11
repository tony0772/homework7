package excercise3;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String talk() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }
}
