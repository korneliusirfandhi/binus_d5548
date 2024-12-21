package class_2410_la83.week12_hierarchy.deep_hierarchy.after;

public class BoardOfManagement extends Manager {
    public void takeDecision() {
        System.out.println("Director is allowed to approve or reject the strategy.");
    }
    
    public void decideTactical() {
        System.out.println("VP formulate any tactical strategies.");
    }

    public void leadCompany() {
        System.out.println("CEO leads the overall company.");
    }
}
