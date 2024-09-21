package class_2410_lb83.week02_bloater.primitive_obsession.before;

import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);
    private Event event = new Event();

    public Main() {
        System.out.print("Jenis Event : ");
        String eventType = in.nextLine();
        if (eventType.equalsIgnoreCase("Workshop")) {
            event.setWorkshop(true);
        } else if (eventType.equalsIgnoreCase("Seminar")) {
            event.setSeminar(true);
        } else if (eventType.equalsIgnoreCase("Training")) {
            event.setTraining(true);
        }
        System.out.println(event.showEventType());
    }

    public static void main(String[] args) {
        new Main();
    }
}
