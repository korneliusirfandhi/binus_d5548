package class_2410_lb83.week06_couplers.middle_man.after;


import class_2410_lb83.week06_couplers.middle_man.before.Customer;
import class_2410_lb83.week06_couplers.middle_man.before.CustomerRepository;

public class Main {

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = new Customer();
        customerRepository.registerCustomer(customer);
        customerRepository.getByUsername("user1029");
    }
}
