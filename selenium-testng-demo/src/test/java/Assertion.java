import org.testng.annotations.Test;
import org.testng.Assert;
 
public class Assertion
{
 
@Test
public void verifyTitle()
{
	String actual ="Google";
	String expected="Google";
	Assert.assertEquals(actual, expected);
}
 
 
}