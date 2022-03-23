package editLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyLeadsPage extends BasePage 
{
	public ViewLeadsPage clickFindLead3() {
		getDriver().findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();	
		return new ViewLeadsPage();
	}

}

