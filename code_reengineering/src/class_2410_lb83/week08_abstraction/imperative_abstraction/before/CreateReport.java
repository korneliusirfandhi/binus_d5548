package class_2410_lb83.week08_abstraction.imperative_abstraction.before;

// imperative = ketika operation dijadikan sebuah class
// move method
public class CreateReport {
    public Report create(String title, String content) {
        Report report = new Report();
        report.setTitle(title);
        report.setContent(content);
        return report;
    }
}
