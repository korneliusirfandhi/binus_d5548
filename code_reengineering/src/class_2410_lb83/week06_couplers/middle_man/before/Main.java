package class_2410_lb83.week06_couplers.middle_man.before;

public class Main {

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        Customer customer = new Customer();
        customerService.saveCustomerData(customer);
        customerService.getCustomerByUsername("user1029");
    }
}
