package excercise2;

public class Person {
    private String name;
    private MoneyProvider moneyProvider;

    public Person(String name, MoneyProvider moneyProvider) {
        this.name = name;
        this.moneyProvider = moneyProvider;
    }

    public String getName() {
        return name;
    }

    public MoneyProvider getMoneyProvider() {
        return moneyProvider;
    }
}
