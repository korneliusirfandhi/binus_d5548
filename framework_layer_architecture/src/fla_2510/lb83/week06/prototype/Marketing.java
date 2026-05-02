package fla_2510.lb83.week06.prototype;

public class Marketing extends IAcmePrototype {
    private String unit = "Marketing";
    private String sales = "Sales";
    private String promotion = "promotion";
    private String strategic = "strategic planning";

    @Override
    public void setDept(int dept) {
        switch (dept) {
            case 101 -> this.dept = sales;
            case 102 -> this.dept = promotion;
            case 103 -> this.dept = strategic;
            default -> this.dept = "Unrecognized Marketing";
        }
    }
}
