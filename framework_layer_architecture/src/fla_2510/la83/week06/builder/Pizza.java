package fla_2510.la83.week06.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private List<String> toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.toppings = builder.toppings;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "size='" + size + '\'' +
            ", dough='" + dough + '\'' +
            ", sauce='" + sauce + '\'' +
            ", toppings=" + toppings +
            '}';
    }

    public static class Builder {
        private String size;
        private String dough;
        private String sauce;
        private List<String> toppings = new ArrayList<>();

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
