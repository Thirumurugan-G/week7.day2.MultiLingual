package createLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class HomePage extends BasePage
{
	public MyHomePage clickCRMSFA2() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
