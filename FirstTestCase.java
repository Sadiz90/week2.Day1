package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Contacts")).click();
        
        driver.findElement(By.linkText("Create Contact")).click();
        
        driver.findElement(By.id("firstNameField")).sendKeys("Sathishkumar");
        
        driver.findElement(By.id("lastNameField")).sendKeys("Kamaraj");
        
        driver.findElement(By.name("submitButton")).click();
        
        String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
                
        System.out.println(text);
        
        String title=driver.getTitle();
        
        System.out.println(title);
        
        driver.close();
        
        
	}

}
