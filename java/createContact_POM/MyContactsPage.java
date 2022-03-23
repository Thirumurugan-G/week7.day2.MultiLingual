package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyContactsPage extends BasePage 
{
	public CreateContactsPage clickcontact1() {
		getDriver().findElement(By.linkText(prop1.getProperty("contactTab"))).click();	
		return new CreateContactsPage();
	}

}
