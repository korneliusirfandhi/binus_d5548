package class_2510_lc83.session06_couplers.message_chain.before;

public class Office {
    private String name;
    private Address address;

    public Office(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
