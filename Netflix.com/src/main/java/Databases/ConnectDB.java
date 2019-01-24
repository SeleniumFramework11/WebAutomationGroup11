package Databases;
import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
public class ConnectDB extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getFooterValues();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"netflixfooters", "footers");
    }
    public static List<String> getFooterValues() {
        List<String> footerList = new ArrayList<>();
        footerList.add("FAQ");
        footerList.add("Netflix Originals");
        footerList.add("Contact Us");
        footerList.add("Account");
        footerList.add("Jobs");
        footerList.add("Legal Notices");
        return footerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("NetflixFooters", "Footers");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "//span[.='FAQ']")
    public static WebElement faqLink2;
    @FindBy (xpath = "//span[.='Netflix Originals']")
    public static WebElement netflixOriginalsLink2;
    @FindBy (xpath = "//span[.='Contact Us']")
    public static WebElement contactUsLink2;
    @FindBy (xpath = "//span[.='Account']")
    public static WebElement accountLink2;
    @FindBy (xpath = "//span[.='Jobs']")
    public static WebElement jobsLink2;
    @FindBy (xpath = "//span[.='Legal Notices']")
    public static WebElement legalNoticesLink2;

    public List getFooterValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(faqLink2);
        headerList1.add(netflixOriginalsLink2);
        headerList1.add(contactUsLink2);
        headerList1.add(accountLink2);
        headerList1.add(jobsLink2);
        headerList1.add(legalNoticesLink2);
        List<String> list = new ArrayList<>();
        for (int i = 0; i<headerList1.size();i++){
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args){
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = null;
        try {
            list = connectToSqlDB.readDataBase("NetflixFooters", "Footers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}
