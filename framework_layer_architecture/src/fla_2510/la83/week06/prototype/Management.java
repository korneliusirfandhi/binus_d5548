package fla_2510.la83.week06.prototype;

public class Management extends IAcmeProtoype {

    private String unit = "Management";
    private String research = "research";
    private String plan = "planning";
    private String operation = "operations";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 201:
                this.dept = research;
                break;
            case 202:
                this.dept = plan;
                break;
            case 203:
                this.dept = operation;
                break;
            default:
                this.dept = "Unrecognized Management";
        }
    }
}
