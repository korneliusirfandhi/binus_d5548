package class_2410_lb83.week10_encapsulation.leaky_encapsulation.before;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }

}
