package dataProviderUtilityWithXlsReader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class XlsReaderTest {

    public static void main(String[] args) throws Exception{
        String excelFilePath = "/Users/mohammadsharkar/Desktop/Rest 11172018/newTofael/FrameWorkTofaelSeptember2018/H&M/data/HnMDataReader.xls";
        FileInputStream fileInputStream = new FileInputStream(excelFilePath);

        Workbook workbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet1 = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet1.rowIterator();

        while (rowIterator.hasNext()){
            Row nextRow = rowIterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();

                switch (cell.getCellType()){
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue());
                    /*case Cell.CELL_TYPE_BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());*/
                    /*case Cell.CELL_TYPE_NUMERIC:
                        System.out.println(cell.getNumericCellValue());*/

                        break;
                }
                System.out.print("         ");
            }
            System.out.println("");
        }
        workbook.close();
        fileInputStream.close();
    }
}