package class_2410_la83.week10_encapsulation.leaky_encapsulation.after;

public class ToDo {
    private String name;

    public ToDo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ToDo clone() {
        return new ToDo(name);
    }
}
