package class_2410_lb83.week06_couplers.message_chain.after;

public class A {
    private B bObj;

    public B getbObj() {
        return bObj;
    }

    public void setbObj(B bObj) {
        this.bObj = bObj;
    }

    public void message() {
        String value = bObj.getValue();
        // ....
    }
}
