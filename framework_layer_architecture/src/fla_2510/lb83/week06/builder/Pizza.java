package fla_2510.lb83.week06.builder;

public class Pizza {
    private String bread, sauce, topping;
    private boolean extraCheese;

    public String getBread() {
        return bread;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    private Pizza(PizzaBuilder builder) {
        this.bread = builder.bread;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.extraCheese = builder.extraCheese;
    }

    public static class PizzaBuilder {
        private String bread, sauce, topping;
        private boolean extraCheese;

        public PizzaBuilder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public PizzaBuilder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}
