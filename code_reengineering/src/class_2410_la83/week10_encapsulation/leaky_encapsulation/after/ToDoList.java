package class_2410_la83.week10_encapsulation.leaky_encapsulation.after;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    public List<ToDo> getToDoList() {
        // Deep copy
        // Creates a new copy of the original object and all of its data,
        // and does not share any data with the original.
        // Deep copies are more expensive in terms of performance
        // and use more memory and processing time,
        // but ensure that the copied object is fully independent.
        List<ToDo> list = new ArrayList<>();
        for (ToDo toDo : toDoList) {
            list.add(toDo.clone());
        }
        return list;
    }

    public void add(ToDo toDo) {
        toDoList.add(toDo);
    }

    public ToDo getByName(String name) {
        for (ToDo toDo : toDoList) {
            if (toDo.getName().equals(name)) {
                return toDo;
            }
        }
        return null;
    }

}
