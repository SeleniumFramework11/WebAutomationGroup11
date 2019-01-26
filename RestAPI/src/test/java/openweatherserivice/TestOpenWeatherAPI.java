package openweatherserivice;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.BaseUtil.convertToString;
import static io.restassured.RestAssured.given;

public class TestOpenWeatherAPI {
    public static String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
    @Test
    public void callOpenWeatherMapApi() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get(url).then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void badCallOpenWeatherMapApi() {

        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        Response response ;
        int statusCode = 0;
        try {
            response = given().when().get(url+"##$%^&&&^$#@##$%^&**((((*&&^%%$:");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);//not found
    }
    @Test
    public void testResponseCode() {

       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        int status = given().when().get(url).getStatusCode();
        Assert.assertEquals(status, 200);
    }
    @Test
    public void testResponseTime() {

        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        long time = given().when().get(url).getTime();
        Assert.assertTrue(time > 0.0);
    }
    @Test
    public void testResponseCity() {

        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        JsonPath jsonPathEvaluator = given().when().get(url).jsonPath();
        String city = jsonPathEvaluator.get("name");
        Assert.assertEquals(city, "London");
    }
    @Test
    public void testResponseIDTotalResults() {

        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

        JsonPath jsonPathEvaluator = given().when().get(url).jsonPath();
        int id = jsonPathEvaluator.get("id");
        Assert.assertEquals(id, 2643743);
    }
}
