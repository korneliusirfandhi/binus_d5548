package class_2410_la83.week12_hierarchy.missing_hierarchy.after;

import class_2410_la83.week12_hierarchy.missing_hierarchy.before.Hero;

public class Fighter extends Hero implements IAttack {
    private double hp;
    private double armor; // percentage

    public void attack(double damage) {
        hp -= damage * armor;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
