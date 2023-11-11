package excercise1;

public class FacebookAdvertisment implements AdvertisementChannel{
    private static final String TYPE_OF_CHANNEL = "'s advertisement is made through Facebook";


    @Override
    public String typeOfChannel() {
        return TYPE_OF_CHANNEL;
    }
}
