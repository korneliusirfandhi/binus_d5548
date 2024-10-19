package class_2410_la83.week06_couplers.middle_man.before;

public class CustomerRepository {
    public Customer getByUsername(String username) {
        Customer customer = new Customer();
        // ....
        return customer;
    }

    public void createCustomer(Customer customer) {
        // ....
    }
}
