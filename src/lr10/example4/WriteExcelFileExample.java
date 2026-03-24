package lr10.example4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook  = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Товары");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dateRow1 = sheet.createRow(1);
        dateRow1.createCell(0).setCellValue("Книга");
        dateRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dateRow1.createCell(2).setCellValue(500.0);

        Row dateRow2 = sheet.createRow(2);
        dateRow2.createCell(0).setCellValue("Компьютер");
        dateRow2.createCell(1).setCellValue("Процессор: Intel Core i7");
        dateRow2.createCell(2).setCellValue(25000.0);

        String filePath = "src/lr10/examples/example4/example.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
