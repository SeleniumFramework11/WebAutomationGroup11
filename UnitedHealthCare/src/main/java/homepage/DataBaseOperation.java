package homepage;

import base.BaseUtil;
import databases.ConnectToSqlDB;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseOperation {

    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static void insertDataIntoDB(){
        //List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
    }

    public List<String> getItemValue(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Honey");
        itemsList.add("Toothpaste");
        itemsList.add("ear-ring");
        itemsList.add("ps4games");
        itemsList.add("macAir");

        return itemsList;
    }

    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        //insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("ItemList","items");
        for(String st:list){
            System.out.println(st);
        }

    }
}
