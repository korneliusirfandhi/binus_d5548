package class_2410_lb83.week10_encapsulation.leaky_encapsulation.after;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public List<ToDo> getToDoList() {
        List<ToDo> list = new ArrayList<>();
        for (ToDo toDo : toDoList) {
            list.add(toDo.clone());
        }
        return list;
    }

}
