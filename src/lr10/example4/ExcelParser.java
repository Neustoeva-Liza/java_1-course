package lr10.example4;

import org.apache.poi.ooxml.POIXMLException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelParser {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nЧтение Excel файла");
            try {
                String path = getInput("Введите путь к файлу", "src/lr10/example4/example.xlsx");
                String sheet = getInput("Введите название листа", "Товары");
                readExcel(path, sheet);
                if (!askRepeat("Хотите прочитать другой файл?")) break;
            } catch (Exception e) {
                handleError(e);
                if (!askRepeat("Хотите попробовать снова?")) break;
            }
        }
        System.out.println("Программа завершена.");
        scanner.close();
    }

    private static String getInput(String prompt, String defaultValue) {
        System.out.print(prompt + " (Enter - " + defaultValue + "): ");
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }

    private static void readExcel(String path, String sheetName) throws IOException {
        try (FileInputStream fis = new FileInputStream(path);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            System.out.println("Файл открыт: " + path);
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                System.out.println("\nДоступные листы:");
                for (int i = 0; i < workbook.getNumberOfSheets(); i++)
                    System.out.println("   - " + workbook.getSheetName(i));
                throw new IllegalArgumentException("Лист '" + sheetName + "' не найден");
            }

            System.out.println("Лист '" + sheetName + "' найден\n");

            int rows = 0, cells = 0;
            for (Row row : sheet) {
                rows++;
                for (Cell cell : row) {
                    System.out.print(getCellValue(cell) + "\t");
                    cells++;
                }
                System.out.println();
            }
            System.out.printf("\nГотово!");
        }
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "[ ]";
        switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue();
            case NUMERIC:
                double num = cell.getNumericCellValue();
                return num == (long) num ? String.valueOf((long) num) : String.valueOf(num);
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            default: return "[ ]";
        }
    }

    private static void handleError(Exception e) {
        System.out.print("\nОШИБКА: ");
        if (e instanceof java.io.FileNotFoundException)
            System.out.println("Файл не найден! Проверьте путь.");
        else if (e instanceof POIXMLException)
            System.out.println("Неверный формат! Используйте .xlsx файл.");
        else if (e instanceof IllegalArgumentException)
            System.out.println(e.getMessage());
        else
            System.out.println(e.getMessage());
    }

    private static boolean askRepeat(String message) {
        System.out.print(message + " (да/нет): ");
        String ans = scanner.nextLine().trim().toLowerCase();
        return ans.equals("да") || ans.equals("yes") || ans.equals("y") || ans.equals("д");
    }
}
