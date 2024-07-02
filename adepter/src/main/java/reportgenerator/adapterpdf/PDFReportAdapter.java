package reportgenerator.adapterpdf;

import reportgenerator.ReportGenerator;
import reportgenerator.typereport.PDFReporter;

public class PDFReportAdapter implements ReportGenerator {
    PDFReporter reporter = new PDFReporter();

    @Override
    public void generateReport(String bodyReport) {
        reporter.createPDFFile(bodyReport);
    }
}
