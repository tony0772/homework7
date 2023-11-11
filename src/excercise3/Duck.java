package excercise3;

public class Duck implements Animal{

    @Override
    public String walk() {
        return "Duck is walking";
    }

    @Override
    public String talk() {
        return "Quack";
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }
}
