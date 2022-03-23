package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class MyHomePage extends BasePage 
{
	public MyContactsPage ClickContactsTab1() {
		getDriver().findElement(By.linkText("Contacts")).click();
		return new MyContactsPage();
	}
	
}
