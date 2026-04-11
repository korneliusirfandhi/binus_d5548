package fla_2510.la83.week06.prototype;

public class Engineering extends IAcmeProtoype {

    private String unit = "Engineering";
    private String development = "programming";
    private String design = "design";
    private String sysAdmin =  "system administration";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 301:
                this.dept = development;
                break;
            case 302:
                this.dept = design;
                break;
            case 303:
                this.dept = sysAdmin;
                break;
            default:
                this.dept = "Unrecognized Engineering";
        }
    }
}
