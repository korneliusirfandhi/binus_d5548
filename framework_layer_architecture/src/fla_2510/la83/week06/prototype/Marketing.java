package fla_2510.la83.week06.prototype;

public class Marketing extends IAcmeProtoype {

    private String unit = "Marketing";
    private String sales = "sales";
    private String promotion = "promotion";
    private String strategic =  "strategic planning";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 101:
                this.dept = sales;
                break;
            case 102:
                this.dept = promotion;
                break;
            case 103:
                this.dept = strategic;
                break;
            default:
                this.dept = "Unrecognized Marketing";
        }
    }
}
