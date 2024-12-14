package class_2410_la83.week12_hierarchy.missing_hierarchy.before;

public class BattleService {
    // missing hierarchy
    // - extract new hierarchy
    public void attack(Hero hero, double damage) {
        if (hero instanceof Fighter) {
            ((Fighter) hero).attack(damage);
        } else if (hero instanceof Mage) {
            ((Mage) hero).attack(damage);
        } else {
            System.out.println("Hero role is not matched.");
        }
    }
}
