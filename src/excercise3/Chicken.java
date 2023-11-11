package excercise3;

public class Chicken implements Animal{
    @Override
    public String walk() {
        return "Chicken is walking";
    }

    @Override
    public String talk() {
        return "Cluck";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }
}
