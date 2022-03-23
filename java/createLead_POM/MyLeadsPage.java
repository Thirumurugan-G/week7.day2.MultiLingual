package createLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyLeadsPage extends BasePage 
{
	public CreateLeadPage clickcreateLead2() {
		getDriver().findElement(By.linkText(prop1.getProperty("linkcreatelead"))).click();	
		return new CreateLeadPage();
	}

}

