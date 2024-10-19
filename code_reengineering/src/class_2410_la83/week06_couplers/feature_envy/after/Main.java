package class_2410_la83.week06_couplers.feature_envy.after;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setNik("12345");
        employee.setName("Karyawan Sample");

        Contact contact = new Contact();
        contact.setEmail("mail@gogo.com");
        contact.setPhone("628199921231");

        System.out.println(employee.getContactInfo(contact));
    }
}
