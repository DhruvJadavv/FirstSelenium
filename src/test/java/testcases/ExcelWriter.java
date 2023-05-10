package testcases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;

public class ExcelWriter {

    public static void main(String[] args) {

        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet
        Sheet sheet = workbook.createSheet("Data");

        // Create a new row
        Row row = sheet.createRow(0);

        
        for(int i =0;i<5;i++) {
        	Cell cell= row.createCell(i);
            cell.setCellValue(i);
        }

        // Write the workbook to a file
        try {
            FileOutputStream outputStream = new FileOutputStream(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\datagenerated.xlsx"));
            workbook.write(outputStream);
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
