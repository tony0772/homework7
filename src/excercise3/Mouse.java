package excercise3;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "Mouse is walking";
    }

    @Override
    public String talk() {
        return "Squeak";
    }

    @Override
    public String eat() {
        return "Mouse is eating";
    }
}
