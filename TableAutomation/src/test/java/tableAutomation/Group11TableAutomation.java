package tableAutomation;


import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class Group11TableAutomation extends BaseUtil {

    @Test(enabled = false, priority = 1)
    public void readTable(){
        String table = getTextByCss(".stiboGridTable");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(table);
    }
    @Test(enabled = false, priority = 2)
    public void readAnyRowOfTable(){
        String row = getTextByCss("#stiboGridTable tr:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(row);
    }
    @Test(enabled = false, priority = 3)
    public void readCellOfARowOfATable(){
        String cell = getTextByCss("#stiboGridTable tr:nth-child(3) td:nth-child(2)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test(enabled = true, priority = 4)
    public void readAllRowOfTable(){
        List<WebElement>listOfWebElement=getListOfWebElementsByCss("#stiboGridTable tr");
        List<String>rows = getListOfString(listOfWebElement);
        for(String st: rows){
            System.out.println(st);
        }
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(rows); //question: why all are in single line
    }
}