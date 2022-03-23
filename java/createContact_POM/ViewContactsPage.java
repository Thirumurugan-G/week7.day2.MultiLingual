package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class ViewContactsPage extends BasePage 
{
	public ViewContactsPage verifyFirstName1() {
		String text = getDriver().findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println("First name in Create Contact = "+text);
		return this;
	}

}
