package class_2410_lb83.week12_hierarchy.missing_hierarchy.after;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage();
        mage.setHp(1000);

        Battle battle = new Battle();

        Fighter fighter = new Fighter();
        fighter.setHp(1000);
        fighter.setArmor(0.5);

        battle.attack(mage, 50);
        System.out.println("HP Mage    : " + mage.getHp());

        battle.attack(fighter, 50);
        System.out.println("HP Fighter : " + fighter.getHp());
    }
}
