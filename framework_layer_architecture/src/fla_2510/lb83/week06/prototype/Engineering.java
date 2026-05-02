package fla_2510.lb83.week06.prototype;

public class Engineering extends IAcmePrototype {
    private String unit = "Marketing";
    private String development = "programming";
    private String design = "design";
    private String sysAdmin = "system administration";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 301 -> this.dept = development;
            case 302 -> this.dept = design;
            case 303 -> this.dept = sysAdmin;
            default -> this.dept = "Unrecognized Engineering";
        }
    }
}
