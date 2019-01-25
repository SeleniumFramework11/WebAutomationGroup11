package employees;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestAllEmployees {
    @Test
    public void callAllEmployeeResources(){
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }


    // @Test
    public void badCallAllEmployeeResources(){
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources809898");
            statusCode = response.getStatusCode();
        }catch(Exception ex){
        }
        Assert.assertEquals(statusCode, 404);
    }

    //@Test
    public void serverErrorCallAllEmployeeResources(){
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").then().statusCode(500).extract().response();
            statusCode = response.getStatusCode();
        }catch(Exception ex){
        }
        Assert.assertEquals(statusCode, 501);
    }
}

