package class_2410_la83.week02_bloater.primitive_obsession.after;

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
            createWorkshopObject(new Workshop());
        } else if (eventType.equalsIgnoreCase("Seminar")) {
            createSeminarObject(new Seminar());
        } else if (eventType.equalsIgnoreCase("Training")) {
            createTrainingObject(new Training());
        }
    }

    private void createWorkshopObject(Workshop workshop) {
        System.out.println(workshop.toString());
    }

    private void createSeminarObject(Seminar seminar) {
        System.out.println(seminar.toString());
    }

    private void createTrainingObject(Training training) {
        System.out.println(training.toString());
    }

    public static void main(String[] args) {
        new Main();
    }
}
