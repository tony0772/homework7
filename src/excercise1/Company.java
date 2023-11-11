package excercise1;

public class Company {
    private String name;
    private AdvertisementChannel advertismentChannel;

    public Company(String name, AdvertisementChannel advertismentChannel){
        this.name=name;
        this.advertismentChannel=advertismentChannel;
    }

    public String getName() {
        return name;
    }

    public AdvertisementChannel getAdvertismentChannel() {
        return advertismentChannel;
    }
}
