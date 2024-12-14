package class_2410_lb83.week12_hierarchy.unnecessary_hierarchy.after.solution2;

public class TrafficLight {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(ETrafficLightColor eTrafficLightColor) {
        this.color = eTrafficLightColor.name();
    }
}
