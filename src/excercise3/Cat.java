package excercise3;

import excercise1.AdvertisementChannel;

public class Cat implements Animal{

    @Override
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }
}
