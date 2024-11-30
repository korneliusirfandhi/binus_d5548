package class_2410_la83.week10_encapsulation.leaky_encapsulation.before;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    // refactor
    public List<ToDo> getToDoList() {
        // Shallow copy
        // Creates a new array or object, but only copies the reference address,
        // not the elements within the array or object.
        // Shallow copies are faster and use less memory,
        // but can lead to unintended changes.
        return toDoList;
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
