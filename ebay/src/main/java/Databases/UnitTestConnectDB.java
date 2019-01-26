package Databases;


import java.io.IOException;
import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectToSQLdb connectToSqlDB = new ConnectToSQLdb();
        //connectToSqlDB.createTableFromStringToMySql("test","test");
        ConnectToSQLdb.connectToSqlDatabase();

    }
}
