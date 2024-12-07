package class_2410_lb83.week12_hierarchy.missing_hierarchy.after;

public class Battle {
    public void attack(Hero hero, double damage) {
        if (hero instanceof IAttack) {
            ((IAttack) hero).attack(damage);
        } else {
            System.out.println("Hero role is not matched.");
        }
    }
}
