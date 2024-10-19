package class_2410_lb83.week06_couplers.middle_man.before;

public class CustomerRepository {
    public Customer getByUsername(String username) {
        Customer customer = new Customer();
        // ....
        return customer;
    }

    public void registerCustomer(Customer customer) {
        // ....
    }
}
