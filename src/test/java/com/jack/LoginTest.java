import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void validLogin() {
        WebDriver driver = new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/login");

driver.findElement(By.id("username")).sendKeys("tomsith");
driver.findElement(By.id("password")).sendKeys("superSecretpassword!");
       driver.findElement(By.cssSelector("button")).click();
       System.out.println("Login Test passed");
       driver.quit();
    }
}