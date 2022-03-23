package createLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class ViewLeadsPage extends BasePage 
{
	public ViewLeadsPage verifyFirstName2() throws InterruptedException {
		Thread.sleep(2000);
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println("First name in Create Lead = "+text);
		return this;
	}

}
