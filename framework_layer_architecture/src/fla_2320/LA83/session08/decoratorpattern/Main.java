package fla_2320.LA83.session08.decoratorpattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Scenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        System.out.println("- Price : $ " + home.getPrice());

        System.out.println("\nScenario-2: Making a basic home. Then adding a playground.");
        home = new BasicHome();
        // decorator pattern usage sample
        home = new Playground(home);
        System.out.println("- Price : $ " + home.getPrice());

        System.out.println("\nScenario-3: Making a basic home. Then adding two playgrounds.");
        home = new BasicHome();
        home = new Playground(home);
        home = new Playground(home);
        System.out.println("- Price : $ " + home.getPrice());

        System.out.println("\nScenario-4: Making a basic home. Then adding a playgrounds and swimming pool.");
        home = new BasicHome();
        home = new Playground(home);
        home = new SwimmingPool(home);
        System.out.println("- Price : $ " + home.getPrice());

        System.out.println("\nScenario-5: Making an advanced home. Then adding a playgrounds and swimming pool.");
        home = new AdvancedHome();
        home = new Playground(home);
        home = new SwimmingPool(home);
        System.out.println("- Price : $ " + home.getPrice());

    }
}
