import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class myclass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	WebElement emailBox = driver.findElement(By.id("Email"));
		emailBox.sendKeys("pkdhirasaria");
		emailBox.submit();
        // get the actual value of the title
        
        
        WebElement pass = driver.findElement(By.id("Passwd"));
        pass.sendKeys("123456789");
        pass.submit();
//        driver.close();
       
        // exit the program explicitly
  //      System.exit(0);
    }

}
