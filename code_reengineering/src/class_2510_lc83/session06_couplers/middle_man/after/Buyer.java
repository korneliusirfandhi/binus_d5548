package class_2510_lc83.session06_couplers.middle_man.after;

public class Buyer {

    public void doBuy(Seller seller) {
        seller.doSell();
    }
}
