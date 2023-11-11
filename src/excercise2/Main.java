package excercise2;

public class Main {
    public static void main(String[] args) {
        ING ingStatement = new ING(14924, 24255);
        BT btStatement = new BT(134234, 252342);
        BRD brdStatement = new BRD(143252, 692834);

        Person person1 = new Person("Andrei", ingStatement);
        System.out.println(person1.getName()+ " has withdrawn:" + person1.getMoneyProvider().withdrawAmount() + " RON" + " from " + person1.getMoneyProvider().getName());
        System.out.println(person1.getName()+ " has deposited:" + person1.getMoneyProvider().depositAmount() + " RON" + " to " + person1.getMoneyProvider().getName());

        Person person2 = new Person("Marius", btStatement);
        System.out.println(person2.getName()+ " has withdrawn:" + person2.getMoneyProvider().withdrawAmount() + " RON" + " from " + person2.getMoneyProvider().getName());
        System.out.println(person2.getName()+ " has deposited:" + person2.getMoneyProvider().depositAmount() + " RON" + " to " + person2.getMoneyProvider().getName());
    }
}
