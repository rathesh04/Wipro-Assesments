package testing;
 
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
 
public class APITest
{
 
	@Test
	
	public void getUserTest()
	{
			given()
			.when().get("https://dummyjson.com/products")
			.then()
			.statusCode(200)
			.body("products[0].id", equalTo(1));
	}
}