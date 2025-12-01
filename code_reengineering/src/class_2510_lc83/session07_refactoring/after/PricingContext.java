package class_2510_lc83.session07_refactoring.after;

// R2: Context object for Data Clumps (Smell 4)
// Encapsulates parameters that used to travel together.
class PricingContext {
    private final boolean applyVipDiscount;
    private final int currentHour;

    public PricingContext(boolean applyVipDiscount, int currentHour) {
        this.applyVipDiscount = applyVipDiscount;
        this.currentHour = currentHour;
    }

    public boolean isVip() { return applyVipDiscount; }
    public boolean isMorning() { return currentHour < 12; }
}




