package class_2410_la83.week06_couplers.message_chain.after;

public class A {
    private B bObj;

    public void show() {
        String name = bObj.getName();
        // ....
    }

    public B getbObj() {
        return bObj;
    }

    public void setbObj(B bObj) {
        this.bObj = bObj;
    }
}
