package Databases;

import databases.ConnectToSqlDB;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import static homePage.MainPage.*;

public class ConnectDB extends ConnectToSqlDB {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getFooterValues();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToMySql(list,"eBay", "");
    }

    public static List<String> getFooterValues() {
        List<String> footerList = new ArrayList<>();
        footerList.add("FAQ");
        footerList.add("eBay MainPage");
        footerList.add("CONTACT US");
        footerList.add("ACCOUNT ");
        footerList.add("JOBS");
        footerList.add("LEGAL NOTICES");
        return footerList;
    }
    public List<String> getUserDatafromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("MainPage", "");
        System.out.println(list);
        return list;
    }
    public List getFooterValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(faqLink);
        headerList1.add(netflixOriginalsLink);
        headerList1.add(contactUsLink);
        headerList1.add(accountLink);
        headerList1.add(jobsLink);
        headerList1.add(legalNoticesLink);

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
            list = connectToSqlDB.readDataBase("NetflixFooters", "Footers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}
