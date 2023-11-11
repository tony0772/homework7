package excercise1;

public class PrintAdvertisement implements AdvertisementChannel{
    private static final String TYPE_OF_CHANNEL = "'s advertisement is made through printing";
    @Override
    public String typeOfChannel() {
        return TYPE_OF_CHANNEL;
    }
}
