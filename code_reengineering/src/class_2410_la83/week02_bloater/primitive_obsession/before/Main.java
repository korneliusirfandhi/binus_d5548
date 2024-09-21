package class_2410_la83.week02_bloater.primitive_obsession.before;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private Event event = new Event();

    public Main() {
        setEventType();
    }

    private void setEventType() {
        System.out.print("Event Type : ");
        String eventType = scanner.nextLine();
        if (eventType.equalsIgnoreCase("Workshop")) {
            event.setWorkshop(true);
        } else if (eventType.equalsIgnoreCase("Seminar")) {
            event.setSeminar(true);
        } else if (eventType.equalsIgnoreCase("Training")) {
            event.setTraining(true);
        }
        System.out.println(event.toString(eventType));
    }

    public static void main(String[] args) {
        new Main();
    }
}
