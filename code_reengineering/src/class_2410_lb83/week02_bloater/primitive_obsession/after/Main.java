package class_2410_lb83.week02_bloater.primitive_obsession.after;

import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);
    private Event event = new Event();

    public Main() {
        System.out.print("Jenis Event : ");
        String eventType = in.nextLine();
        if (eventType.equalsIgnoreCase("Workshop")) {
            event = new Workshop();
        } else if (eventType.equalsIgnoreCase("Seminar")) {
            event = new Seminar();
        } else if (eventType.equalsIgnoreCase("Training")) {
            event = new Training();
        }
        System.out.println(event.showEventType());
    }

    public static void main(String[] args) {
        new Main();
    }
}
