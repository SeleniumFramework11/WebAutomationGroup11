package dataProviderUtilityWithXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static XlsReader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new XlsReader("/Users/mohammadsharkar/Desktop/tk/BlueGrass/OfficeDepot/data/OfficeDepotDataReader.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  email = reader.getCellData("Sheet1", "email",rowNum );
            String passCode = reader.getCellData("Sheet1","passCode", rowNum);
            //String message = reader.getCellData("Sheet1","message", rowNum);
            //Object obj[] = {email,passCode, message};
            Object obj[] = {email, passCode};
            myData.add(obj);
        }
        return  myData;
    }
}