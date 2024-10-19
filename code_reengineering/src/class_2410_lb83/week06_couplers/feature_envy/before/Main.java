package class_2410_lb83.week06_couplers.feature_envy.before;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setNik("12345");
        employee.setName("Karyawan Panutan");

        Contact contact = new Contact();
        contact.setPhone("6281728910121");
        contact.setEmail("contact@mail.co.id");

        System.out.println(employee.getContactInfo(contact));
    }
}
