package class_2410_la83.week06_couplers.message_chain.after;

public class B {
    private C cObj;

    public String getName() {
        return cObj.getName();
    }

    public C getcObj() {
        return cObj;
    }

    public void setcObj(C cObj) {
        this.cObj = cObj;
    }
}
