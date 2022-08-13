package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Loginpage {
	
		
		public static void main (String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			
			WebElement elementUsernname = driver.findElement(By.id("username"));
			elementUsernname.sendKeys("Demosalesmanager");
			WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
			elementPassword.sendKeys("crmsfa");
			WebElement elementLogin= driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
			WebElement elementWelcomMessage = driver.findElement(By.tagName("h2"));
			String text = elementWelcomMessage.getText();
			System.out.println(text);
				
			WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			WebElement elementLeads = driver.findElement(By.linkText("Leads"));
			elementLeads.click();
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
			elementcompanyName.sendKeys("TestLeaf Company");
			WebElement elementfirstName = driver.findElement(By.id("createLeadForm_firstName"));
			elementfirstName.sendKeys("Sam");
			WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
			elementlastName.sendKeys("chay");
			WebElement elementdataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
			elementdataSourceId.sendKeys("CONFERENCE");

			WebElement elementindustrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select dd  = new Select(elementindustrydd);
			dd.selectByIndex(6);
			WebElement elementownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select dd1  = new Select(elementownershipEnumId);
			dd1.selectByVisibleText("Partnership");
			WebElement elementmarketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select dd2  = new Select(elementmarketingCampaignId);
			dd2.selectByValue("CATRQ_CAMPAIGNS");
			WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
			elementdepartmentName.sendKeys("Learning Selenium with java in test leaf");
			WebElement elementprimaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementprimaryEmail.sendKeys("gluck3930@gmail.com");
			WebElement elementgeneralStateProvinceGeoId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dd0  = new Select(elementgeneralStateProvinceGeoId);
			dd0.selectByVisibleText("Pennsylvania");
			WebElement elementsCreateLead = driver.findElement(By.className("smallSubmit"));
			elementsCreateLead.click();
			String title = driver.getTitle();
			System.out.println("Title of the resulting page is :"+ title);
		}
	}


