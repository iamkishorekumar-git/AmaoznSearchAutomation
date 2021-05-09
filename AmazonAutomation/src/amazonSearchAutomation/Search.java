package amazonSearchAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search 
{
    public static void main(String[] args) 
    {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\885726\\OneDrive - Cognizant\\Documents\\GitHub\\AmaoznSearchAutomation\\AmazonAutomation\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http:www.amazon.com";

        driver.get(baseUrl);
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        String result = driver.findElement(By.xpath("//*[@id='search']/span/div/span/h1/div/div[1]/div/div")).getText();
        
        System.out.println("Result for Search :" + result);
        
        //close the Chrome Browser
        driver.close();
       
    }
}