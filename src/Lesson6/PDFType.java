package Lesson6;

public class PDFType implements ReportType{
    @Override
    public byte[]create (Doc doc) {
        throw new UnsupportedOperationException("Unimplemented method 'create' PDF");
    }
}