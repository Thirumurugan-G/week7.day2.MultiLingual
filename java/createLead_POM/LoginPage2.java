package createLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class LoginPage2 extends BasePage
{
	public LoginPage2 typeUserName2(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}

	public LoginPage2 typePassword2(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}

	public HomePage clickLogin2() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}







