package tableAutomation;


import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class Group11TableAutomation extends BaseUtil {
    Group11TableAutomation table;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        table = PageFactory.initElements(driver, Group11TableAutomation.class);
        setUrl("https://www.fishersci.com/shop/products/fisherbrand-sureone-beveled-pipet-tips-universal-fit-1-200-l-16/p-4332187#?keyword=tips>");
    }


    @Test(enabled = true, priority = 1)
    public void readTable(){
        String table = getTextByCss(".general_table.product_table.responsive_table");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(table);
    }
    @Test(enabled = true, priority = 2)
    public void readAnyRowOfTable(){
        String row = getTextByCss(".general_table.product_table.responsive_table th:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(row);
    }
    @Test(enabled = true, priority = 3)
    public void readCellOfARowOfATable(){
        String cell = getTextByCss(".general_table.product_table.responsive_table td:nth-child(2)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test(enabled = true, priority = 4)
    public void readAllRowOfTable(){
        List<WebElement>listOfWebElement=getListOfWebElementsByCss(".general_table.product_table.responsive_table tr");
        List<String>rows = getListOfString(listOfWebElement);
        for(String st: rows){
            System.out.println(st);
        }
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(rows); //question: why all are in single line
    }
}
