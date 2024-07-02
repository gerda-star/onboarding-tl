package reportgenerator.adapterexcel;

import reportgenerator.ReportGenerator;
import reportgenerator.typereport.ExcelReporter;

public class ExcelReportAdapter implements ReportGenerator {
    ExcelReporter reporter = new ExcelReporter();

    @Override
    public void generateReport(String bodyReport) {
        reporter.createExcelFile(bodyReport);

    }
}
