package class_2410_lb83.week06_couplers.middle_man.after;

import class_2410_lb83.week06_couplers.middle_man.before.Customer;

public class CustomerRepository {
    public class_2410_lb83.week06_couplers.middle_man.before.Customer getByUsername(String username) {
        class_2410_lb83.week06_couplers.middle_man.before.Customer customer = new class_2410_lb83.week06_couplers.middle_man.before.Customer();
        // ....
        return customer;
    }

    public void registerCustomer(Customer customer) {
        // ....
    }
}
