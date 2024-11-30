package class_2410_lb83.week08_abstraction.imperative_abstraction.after;

public class Report {
    private String title, content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Report create(String title, String content) {
        Report report = new Report();
        report.setTitle(title);
        report.setContent(content);
        return report;
    }

    public void print() {
        // do any code here
        // ...
    }
}
