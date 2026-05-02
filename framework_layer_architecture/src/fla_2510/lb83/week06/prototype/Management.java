package fla_2510.lb83.week06.prototype;

public class Management extends IAcmePrototype {
    private String unit = "Management";
    private String research = "Research";
    private String plan = "Planning";
    private String operation = "Operations";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 201 -> this.dept = research;
            case 202 -> this.dept = plan;
            case 203 -> this.dept = operation;
            default -> this.dept = "Unrecognized Management";
        }
    }
}
