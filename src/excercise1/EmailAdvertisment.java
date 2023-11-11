package excercise1;

public class EmailAdvertisment implements AdvertisementChannel{
    private static final String TYPE_OF_CHANNEL = "'s advertisement is made through Email";
    @Override
    public String typeOfChannel() {
        return TYPE_OF_CHANNEL;
    }
}
