package class_2410_lb83.week12_hierarchy.unnecessary_hierarchy.after.solution2;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficStop = new TrafficLight();
        trafficStop.setColor(ETrafficLightColor.RED);

        TrafficLight trafficCautious = new TrafficLight();
        trafficCautious.setColor(ETrafficLightColor.YELLOW);

        TrafficLight trafficGo = new TrafficLight();
        trafficGo.setColor(ETrafficLightColor.GREEN);

        System.out.println(trafficStop.getColor());

    }
}
