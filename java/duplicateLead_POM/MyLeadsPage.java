package duplicateLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyLeadsPage extends BasePage 
{
	public FindLeadsPage clickFindLead4() {
		getDriver().findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();	
		return new FindLeadsPage();
	}

}
