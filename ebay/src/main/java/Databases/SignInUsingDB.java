package Databases;

import homePage.MainPage;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class SignInUsingDB extends MainPage {
    String eMail = "alrafifahad96@gmail.com";
    String pw = "Rafi1122";
    ArrayList<String> myData =new ArrayList();
    public ArrayList<String> dataBaseData()
    {
        myData.add(eMail);
        myData.add(pw);
        return myData;

    }

    public void loginUsingDataFromDB() throws Exception
    {
        dataBaseData();
        ConnectToSQLdb connectToSqlDB = new ConnectToSQLdb();
        ConnectToSQLdb.connectToSqlDatabase();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(myData,"signInTable","DataSignIn");
        List<String> emails =connectToSqlDB.readDataBase("signInTable","DataSignIn");
        userID.sendKeys(emails.get(0), Keys.ENTER);
        passWord.sendKeys(emails.get(1),Keys.ENTER);
    }


}
