import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class gcd  {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "file:///home/ise/gcd.html";
        
        driver.get(baseUrl);
       	WebElement email1 = driver.findElement(By.id("num1"));
       	email1.sendKeys("785");
       	WebElement email2 = driver.findElement(By.id("num2"));
       	email2.sendKeys("632");
       	WebElement element = driver.findElement(By.id("calc"));
       	element.click();
	
        System.exit(0);
    }
}
