package ExcelSheet;
import base.BaseUtil;
import excelutility.ExcelReader;
import reporting.TestLogger;
import java.io.IOException;
public class ReadFiles extends BaseUtil {
    ExcelReader er = new ExcelReader();
    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = "Q:\\WebAutomationGroup11\\Netflix.com\\src\\main\\java\\ExcelSheet\\Movies.xlsx";
        String[] data = er.fileReader2(path, 0);
        return data;
    }
}
