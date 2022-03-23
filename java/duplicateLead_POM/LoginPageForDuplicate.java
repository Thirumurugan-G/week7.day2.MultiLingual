package duplicateLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class LoginPageForDuplicate extends BasePage
{
	public LoginPageForDuplicate typeUserName4(String userId) {
		getDriver().findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	
	public LoginPageForDuplicate typePassword4(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this; 
	}

	public HomePage clickLogin4() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}







