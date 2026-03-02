//given() - (Pre request) - Content type, set cookies, add auth, add parameters , set headers, info etc
//when() - (Request)  - get() , post(), put(), delete()
//then() - (Validation) - Validate status code, extract response ,extract header's cookies and response body

package test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HTTPRequest {

    @Test
    void getUser() {
    	
    	String requestData = "{\n" +
                "\"title\": \"I am in love with someone.\",\n" +
                "\"userId\": 5\n" +
                "}";

        given()
        .header("Content-Type","application/json")
        .body(requestData)
        .when()
            .post("https://dummyjson.com/products")
        .then()
            .statusCode(201)
            .body("id", equalTo(4))
            .body("title", equalTo("I am in love with someone."))
            .log().all();
    }
}