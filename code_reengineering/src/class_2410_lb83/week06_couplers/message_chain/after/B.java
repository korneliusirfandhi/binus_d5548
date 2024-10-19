package class_2410_lb83.week06_couplers.message_chain.after;

public class B {
    private C cObj;

    public String getValue() {
        return cObj.getValue();
    }

    public C getcObj() {
        return cObj;
    }

    public void setcObj(C cObj) {
        this.cObj = cObj;
    }
}
