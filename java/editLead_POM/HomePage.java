package editLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class HomePage extends BasePage
{
	public MyHomePage clickCRMSFA3() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
