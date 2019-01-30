package testExcelreader;
import base.BaseUtil;
import com.relevantcodes.extentreports.ExtentReports;
import excelread.ExcelRead2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class TestExcelRead extends BaseUtil {
    ExcelRead2 excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelRead2();
        reports = ExtentManager.getInstance();
        setUrl("https://www.macys.com");
    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
        excelReaderPage.navigateBack();
    }
}
