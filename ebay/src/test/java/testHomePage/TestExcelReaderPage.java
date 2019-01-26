package testHomePage;

import base.BaseUtil;
import base.BaseUtil;
import com.relevantcodes.extentreports.ExtentReports;

import helper.ExcelReader2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reporting.ExtentManager;

public class TestExcelReaderPage extends BaseUtil {
    ExcelReader2 excelReaderPage;
    ExtentReports reports;
    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReader2();
        reports = ExtentManager.getInstance();
        setUrl("https://www.ebay.com/");

    }
    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
    }
}