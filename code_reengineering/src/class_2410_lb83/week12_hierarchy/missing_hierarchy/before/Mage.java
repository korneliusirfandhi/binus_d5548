package class_2410_lb83.week12_hierarchy.missing_hierarchy.before;

public class Mage extends Hero {
    private double hp;

    public void attack(double damage) {
        hp -= damage;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
