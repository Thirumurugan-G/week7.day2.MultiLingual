package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class HomePage extends BasePage
{
	public MyHomePage clickCRMSFA1() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
