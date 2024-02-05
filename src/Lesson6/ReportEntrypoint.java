package Lesson6;

public class ReportEntrypoint {
    public Report create(Doc doc, ReportType reportType) {
        return new Report(reportType.create(doc));
    }
}
