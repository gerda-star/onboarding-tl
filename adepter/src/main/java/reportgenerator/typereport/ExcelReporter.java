package reportgenerator.typereport;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReporter {

    public void createExcelFile(String content) {
        Workbook book = new HSSFWorkbook();

        Sheet sheet = book.createSheet("report");
        Row row = sheet.createRow(0);
        Cell title = row.createCell(0);
        title.setCellValue(content);

        try {
            book.write(new FileOutputStream("report.xls"));
            book.close();
            System.out.println("Excel отчет сформирован");
        } catch (FileNotFoundException e) {
            System.out.println("no");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("no");
            e.printStackTrace();

        }

    }

}
