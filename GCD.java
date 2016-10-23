import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class myclass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "file:///home/ise/Selenium_Demo/last.html";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	WebElement emailBox = driver.findElement(By.id("num1"));
		emailBox.sendKeys("5");
		//emailBox.submit();
        // get the actual value of the title
        
        
        WebElement pass = driver.findElement(By.id("num2"));
        pass.sendKeys("7");
        
        WebElement btn = driver.findElement(By.id("calc"));
        btn.click();
        
        String alertText = driver.switchTo().alert().getText();
        
        if (alertText == "The GCD is 1")
            System.out.println("Test Passed!");
        
//        driver.close();
       
        // exit the program explicitly
  //      System.exit(0);
    }

}
