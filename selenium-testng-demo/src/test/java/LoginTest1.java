import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest1 {

    @BeforeClass
    public void setup() {
        System.out.println("Browser Launch");
    }

    @Test
    public void testLogin() {
        System.out.println("Executing Login Test");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Close Browser");
    }
}