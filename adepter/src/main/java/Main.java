import reportgenerator.ReportGenerator;
import reportgenerator.adapterexcel.ExcelReportAdapter;
import reportgenerator.adapterpdf.PDFReportAdapter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = selectFormat();
        reportGenerator.generateReport("Report for: " + new Date().toString());
    }

    public static ReportGenerator selectFormat() {
        System.out.println("Выбираем формат: PDF, XLS");
        String format = Reader.scan.nextLine().toLowerCase();
        return setGenerator(format);
    }

    public static ReportGenerator setGenerator(String format) {
        ReportGenerator reportGenerator;
        switch (format) {
            case "pdf":
                System.out.println("==== Your choice: PDF ====");
                reportGenerator = new PDFReportAdapter();
                return reportGenerator;
            case "xls":
                System.out.println("==== Your choice: XLS ====");
                reportGenerator = new ExcelReportAdapter();
                return reportGenerator;
            default:
                System.out.println("неизвестный формат");
                return null;
        }
    }
}

