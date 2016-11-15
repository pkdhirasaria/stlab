import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.*; 
import org.openqa.selenium.By; 
import org.openqa.selenium.firefox.FirefoxDriver; 
 
public class Gmail 
{ 
	public static WebDriver driver = null; 
    public static void main(String[] args) 
    { 
    	WebDriver driver = new FirefoxDriver(); 
    	WebElement element=null;  
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    driver.get("https://mail.google.com/"); 
   
    driver.manage().window().maximize(); 
    
    driver.findElement(By.id("Email")).sendKeys("2016isys@gmail.com"); 
    
    driver.findElement(By.xpath("//*[@id='next']")).click(); 
    driver.findElement(By.id("Passwd")).sendKeys("piyushagarwal"); 
        
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);    driver.findElement(By.id("signIn")).click(); 
    
    driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click(); 
    driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("pkdhirasaria@gmail.com"); 
    driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hello"); 
    element = driver.findElement(By.xpath("//div[@class='Ar Au']//div")); 
    element.click(); 
    element.sendKeys("good evening"); 
    driver.findElement(By.id(":me")).click(); 
    for(long i=0;i<10000;i++) 
	for(long j=0;j<1000000;j++) 
	{ 
	 
	} 
	System.out.println("ssss"); 
	driver.get("https://mail.google.com/mail/logout?hl=en"); 
    } 
}
