package class_2410_la83.week12_hierarchy.missing_hierarchy.after;

import class_2410_la83.week12_hierarchy.missing_hierarchy.before.Hero;

public class Mage extends Hero implements IAttack {
    private double hp;

    @Override
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
