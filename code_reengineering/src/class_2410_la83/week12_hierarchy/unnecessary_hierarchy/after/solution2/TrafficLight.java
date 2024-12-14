package class_2410_la83.week12_hierarchy.unnecessary_hierarchy.after.solution2;

public class TrafficLight {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(ELightColor color) {
        this.color = color.name();
    }
}
