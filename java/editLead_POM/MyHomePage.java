package editLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyHomePage extends BasePage{

	public MyLeadsPage clickLeadsTab3() {
		getDriver().findElement(By.linkText(prop1.getProperty("linklead"))).click();
		return new MyLeadsPage();
	}
	
}
