package editLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class LoginPage3 extends BasePage
{
	public LoginPage3 typeUserName3(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}

	public LoginPage3 typePassword3(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}

	public HomePage clickLogin3() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}







