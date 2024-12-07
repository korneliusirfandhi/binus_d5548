package class_2410_lb83.week12_hierarchy.missing_hierarchy.before;

public class Fighter extends Hero {
    private double hp;
    private double armor; // percentage

    public void attack(double damage) {
        hp -= armor * damage;
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
