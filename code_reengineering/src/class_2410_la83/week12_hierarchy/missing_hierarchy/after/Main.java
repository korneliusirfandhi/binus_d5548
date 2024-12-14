package class_2410_la83.week12_hierarchy.missing_hierarchy.after;

public class Main {

    public static void main(String[] args) {
        Mage mage = new Mage();
        mage.setHp(1000);

        Fighter fighter = new Fighter();
        fighter.setHp(1000);
        fighter.setArmor(0.1);

        BattleService battleService = new BattleService();
        battleService.attack(mage, 50);
        System.out.println(mage.getHp());

        battleService.attack(fighter, 50);
        System.out.println(fighter.getHp());
    }
}
