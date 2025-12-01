package class_2510_lc83.session06_couplers.middle_man.before;

// middle man
public class Broker {
    private Seller seller;
    public void buy() {
        seller.doSell();
    }
}
