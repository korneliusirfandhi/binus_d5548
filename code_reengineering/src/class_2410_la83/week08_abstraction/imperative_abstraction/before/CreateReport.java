package class_2410_la83.week08_abstraction.imperative_abstraction.before;

// imperative -> ketika sebuah proses / operation dijadikan sebuah class
// move method
public class CreateReport {
    public Report create(String title, String content) {
        Report report = new Report();
        report.setTitle(title);
        report.setContent(content);
        return report;
    }
}
