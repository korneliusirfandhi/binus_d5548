package class_2410_lb83.week12_hierarchy.missing_hierarchy.before;

// missing hierarchy
// refactor : extract hierarchy
// jika banyak Role -> if else makin banyak
// perlu ada hierarchy baru (parent)
public class Battle {
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
