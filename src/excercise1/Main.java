package excercise1;

public class Main {
    public static void main(String[] args) {
        FacebookAdvertisment firstAdvertisement = new FacebookAdvertisment();
        EmailAdvertisment secondAdvertisement = new EmailAdvertisment();
        PrintAdvertisement thirdAdvertisement = new PrintAdvertisement();

        Company firstCompany = new Company("Apple", firstAdvertisement);
        Company secondCompany = new Company("Stratec", secondAdvertisement);
        Company thirdCompany = new Company("Genpact", thirdAdvertisement);

        System.out.println(firstCompany.getName() + firstCompany.getAdvertismentChannel().typeOfChannel());
        System.out.println(secondCompany.getName() + secondCompany.getAdvertismentChannel().typeOfChannel());
        System.out.println(thirdCompany.getName() + thirdCompany.getAdvertismentChannel().typeOfChannel());
    }
}
