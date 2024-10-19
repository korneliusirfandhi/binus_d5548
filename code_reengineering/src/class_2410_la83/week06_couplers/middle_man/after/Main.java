package class_2410_la83.week06_couplers.middle_man.after;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.getByUsername("TestingKKZ");
        customerRepository.createCustomer(customer);
    }

}
