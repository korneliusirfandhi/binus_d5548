package class_2510_lc83.session06_couplers.message_chain.before;

import java.util.Optional;

public class Client {

    private static String getPlacementCity(Employee employee) {
        // resolve NPE potentially (Null Pointer Exception)
        return Optional.ofNullable(employee)
            .map(Employee::getOffice)
            .map(Office::getAddress)
            .map(Address::getCity)
            .map(City::getName)
            .orElse("No Placement");
    }

    private static String getInfo(Employee employee) {
        return "Onsite Location City = "
            + employee.getOffice().getAddress().getCity().getName(); // message chain
    }

    public static void main(String[] args) {
        City city = new City("Bekasi");
        Address address = new Address(city, "Jalan Lingkar Luar Summarecon Bekasi");
        Office office = new Office("BINUS Bekasi", address);
        Employee employee = new Employee("John Doe", office);
        System.out.println(getInfo(employee));
    }
}
