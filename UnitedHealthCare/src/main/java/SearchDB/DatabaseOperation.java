package SearchDB;

import databases.ConnectToSqlDB;
import homepage.EmployerPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperation extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertDataFromArrayListToSqlTable();
        //connectToSqlDB.insertDataFromArrayListToSqlTable();
    }
    public static List<String> getHeaderValue() {
        List<String> headerList = new ArrayList<>();
        headerList.add("Employer");
        headerList.add("Dental Insurance");
        headerList.add("Vision Insurance");
        headerList.add("Medical Insurance");
        //headerList.add("C");
        headerList.add("Car Insurance");
        return headerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("itemlist", "headers");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//a[contains(text(),'Employer')]")
    WebElement Employer;
    @FindBy(xpath = "//a[contains(text(),'Dental Insurance')]")
    WebElement dentalInsurance;
    @FindBy(xpath = "//a[contains(text(),'Vision Insurance')]")
    WebElement visionInsurance;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement Shop;
    @FindBy(xpath = "//a[contains(text(),'Careers')]")
    WebElement CAREERS;
    @FindBy(xpath = "//a[contains(text(),'Car insurance')]")
    WebElement carInsurance;

    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(Employer);
        headerList1.add(dentalInsurance);
        headerList1.add(visionInsurance);
        headerList1.add(Shop);
        headerList1.add(CAREERS);
        headerList1.add(carInsurance);


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