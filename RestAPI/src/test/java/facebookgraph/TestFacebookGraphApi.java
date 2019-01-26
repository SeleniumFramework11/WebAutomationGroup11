package facebookgraph;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.BaseUtil.convertToString;
import static io.restassured.RestAssured.given;

public class TestFacebookGraphApi {
    public static String url="https://graph.facebook.com/facebook/picture?redirect=false";
    @Test
    public void showFacebookGraph() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Response response = given().when().get(url).then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
}
