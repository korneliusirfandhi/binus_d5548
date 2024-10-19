package class_2410_la83.week06_couplers.middle_man.before;

// middle man -> class perantara delegation ke class CustomerRepository
// (refactor : remove middle man) -> tanpa ada perantara
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerByUsername(String username) {
        return customerRepository.getByUsername(username);
    }

    public void createCustomerData(Customer customer) {
        customerRepository.createCustomer(customer);
    }

}
