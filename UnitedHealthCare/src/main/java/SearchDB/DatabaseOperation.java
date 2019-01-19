package SearchDB;

import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //connectToSqlDB.();

        //connectToSqlDB.();
    }
    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("ABOUT");
        headerList.add("WAYS TO GET");
        headerList.add("HELP");
        headerList.add("SHOP");
        headerList.add("CAREERS");
        headerList.add("HBO INSPIRES");
        return headerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemlist", "headers");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement ABOUT;
    @FindBy(xpath = "//a[contains(text(),'Ways to Get')]")
    WebElement WAYS_TO_GET;
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    WebElement HELP;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement SHOP;
    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElement CAREERS;
    @FindBy(xpath = "//a[contains(text(),'HBO Inspires')]")
    WebElement HBOINSPIRES;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(ABOUT);
        headerList1.add(WAYS_TO_GET);
        headerList1.add(HELP);
        headerList1.add(SHOP);
        headerList1.add(CAREERS);
        headerList1.add(HBOINSPIRES);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = null;
        try {
            list = connectToSqlDB.readDataBase("headerList", "headers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}