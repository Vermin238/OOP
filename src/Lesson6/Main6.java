package Lesson6;

public class Main6 {
    public static void main(String[] args) {
        Doc doc = new Doc("123", "It's data needed convert to...'");

        try {
            Report reportPDF = new ReportEntrypoint().create(doc, new PDFType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            Report reportJSON = new ReportEntrypoint().create(doc, new JSONType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            Report reportXML = new ReportEntrypoint().create(doc, new XMLType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
