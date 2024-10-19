package class_2410_lb83.week06_couplers.middle_man.before;

// middle man -> perantara ke class CustomerRepository
// refactor = remove middle man, class Main call method langsung ke class CustomerRepository
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerByUsername(String username) {
        return customerRepository.getByUsername(username);
    }

    public void saveCustomerData(Customer customer) {
        customerRepository.registerCustomer(customer);
    }

}
