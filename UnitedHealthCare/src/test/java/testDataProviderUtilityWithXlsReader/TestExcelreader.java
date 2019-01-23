package testDataProviderUtilityWithXlsReader;

import base.BaseUtil;
import com.relevantcodes.extentreports.ExtentReports;
import dataProviderUtilityWithExcelReader.ExcelReader2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class TestExcelreader extends BaseUtil {
    ExcelReader2 excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReader2();
        reports = ExtentManager.getInstance();
        setUrl("https://www.uhc.com/");

    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
        excelReaderPage.navigateBack();
    }
}
