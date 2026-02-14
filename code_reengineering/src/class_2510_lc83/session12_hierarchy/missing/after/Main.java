package class_2510_lc83.session12_hierarchy.missing.after;

public class Main {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setEmployeeId("PTE001");
        partTimeEmployee.setName("Alice");
        partTimeEmployee.setSalary(5000.0);

        ContractorEmployee contractorEmployee = new ContractorEmployee();
        contractorEmployee.setEmployeeId("CE001");
        contractorEmployee.setName("Bob");
        contractorEmployee.setSalary(8000.0);

        PayrollService payrollService = new PayrollService();

        System.out.println("Part-Time Employee:");
        System.out.println("ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Salary: " + partTimeEmployee.getSalary());
        System.out.println("Bonus: " + payrollService.calculateBonus(partTimeEmployee));
        System.out.println("Nett Pay: " + payrollService.calculateNettPay(partTimeEmployee));

        System.out.println("\nContractor Employee:");
        System.out.println("ID: " + contractorEmployee.getEmployeeId());
        System.out.println("Name: " + contractorEmployee.getName());
        System.out.println("Salary: " + contractorEmployee.getSalary());
        System.out.println("Bonus: " + payrollService.calculateBonus(contractorEmployee));
        System.out.println("Nett Pay: " + payrollService.calculateNettPay(contractorEmployee));
    }
}
