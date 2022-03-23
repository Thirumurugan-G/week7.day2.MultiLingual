package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;
import createContact_POM.LoginPage1;

public class LoginPage1 extends BasePage
{
	public LoginPage1 typeUserName1(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	
	public LoginPage1 typePassword1(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}

	public HomePage clickLogin1() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}







