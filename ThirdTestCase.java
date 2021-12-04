package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Leads")).click();
        
        driver.findElement(By.linkText("Create Lead")).click();
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TNQ Technologies Pvt Ltd");
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathishkumar");
       
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamaraj");
        
        WebElement eleDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
        
        Select select=new Select(eleDropDown);
        
        select.selectByVisibleText("Employee");
        
        WebElement ele = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        
        Select dd=new Select(ele);
        
        dd.selectByIndex(6);
        
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sathish");
        
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("kamaraj");
        
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
        
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("29/10/1990");
        
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selnium");
        
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
        
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50,000");
        
        WebElement ele1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
        
        Select dd1=new Select(ele1);
        
        dd1.selectByValue("INR");
        
        WebElement ele2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
        
        Select dd2=new Select(ele2);
        
        dd2.selectByVisibleText("Computer Software");
        
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
        
        WebElement ele3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        
        Select dd3=new Select(ele3);
        
        dd3.selectByIndex(2);
        
        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("25");
        
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("true");
        
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning selenium is interesting");
        
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Practice makes a man perfect");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
        
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9444001234");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
        
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("kumar");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sadiz90@gmail.com");
        
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("leafground.com");
        
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sathish");
        
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kumar");
        
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("periyar nagar");
        
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("madipakkam");
        
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
        
        WebElement ele4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        
        Select dd4=new Select(ele4);
        
        dd4.selectByVisibleText("Indiana");
        
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600091");
        
        WebElement ele5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        
        Select dd5=new Select(ele5);
        
        dd5.selectByValue("IND");
        
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600091");
        
        driver.findElement(By.name("submitButton")).click();
        
        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        
        System.out.println(text);
        
        String title = driver.getTitle();
        System.out.println(title);

	}

}
