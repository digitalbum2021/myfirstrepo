package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhome {

public static WebDriver driver;
	
	@FindBy (id="email" ) WebElement email;
	@FindBy (id="pass" ) WebElement pass;
    @FindBy (xpath="//*[@name='login']") WebElement login;
	
	public fbhome(WebDriver driver) {
		fbhome.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void emailid(String emailtext) {
		email.clear();
		email.sendKeys(emailtext);
	}
	
	public void password(String passtext) {
		pass.sendKeys(passtext);
	}
	
	public void loginclick() {
		login.click();
	}
	
	public void findLinks() {
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("There are "+linkList.size()+" links.");
		
		for (int i=0; i<linkList.size(); i++) {
			
			System.out.println("this is link # "+i+" - "+linkList.get(i).getAttribute("href"));
			
		}
	}
	
}


//locate elements
//page factory constructor
//create functions