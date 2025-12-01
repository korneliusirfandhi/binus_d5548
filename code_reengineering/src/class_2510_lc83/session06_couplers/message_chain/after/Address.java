package class_2510_lc83.session06_couplers.message_chain.after;

public class Address {
    private String street;
    private City city;

    public Address(City city, String street) {
        this.city = city;
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
