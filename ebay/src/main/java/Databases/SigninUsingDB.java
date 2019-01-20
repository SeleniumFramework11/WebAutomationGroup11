/*package Databases;
import homePage.MainPage;
import org.openqa.selenium.Keys;
import java.util.ArrayList;
import java.util.List;
public class SigninUsingDB {

    String email1="palash.us@live.com";
    //String email2="";
    String password1 ="!tweetMe";
    ArrayList<String> myData =new ArrayList();
    public ArrayList<String> dataBaseData()
    {
        myData.add(email1);
        myData.add(password1);
        return myData;

    }

    public void loginUsingDataFromDB() throws Exception
    {
        dataBaseData();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToSqlDB.connectToSqlDatabase();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(myData,"signInTable","DataSignIn");
        List<String> emails =connectToSqlDB.readDataBase("signInTable","DataSignIn");
        userNameField.sendKeys(emails.get(0), Keys.ENTER);
        passWordFiled.sendKeys(emails.get(1),Keys.ENTER);
    }
}*/
