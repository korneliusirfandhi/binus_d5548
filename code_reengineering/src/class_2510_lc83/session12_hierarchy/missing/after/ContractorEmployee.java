package class_2510_lc83.session12_hierarchy.missing.after;

public class ContractorEmployee extends Employee {
    @Override
    public double calculateBonus() {
        return super.getSalary() + 3000.0;
    }

    @Override
    public double calculateNettPay() {
        return super.getSalary() - 300.0;
    }
}
