package class_2510_lc83.session12_hierarchy.unnecessary.after;

public class Main {
    public static void main(String[] args) {
        TrafficLight stopLight = new TrafficLight(LightColor.RED);
        System.out.println("Initial Light Color: " + stopLight.getLightColor().name());
    }
}
