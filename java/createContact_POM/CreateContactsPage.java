package createContact_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;
import createContact_POM.CreateContactsPage;

public class CreateContactsPage extends BasePage
{
	public CreateContactsPage typeFirstName1(String fname) {
		getDriver().findElement(By.id("firstNameField")).sendKeys(fname);
		return this;
	}
	public CreateContactsPage typeLastName1(String lname) {
		getDriver().findElement(By.id("lastNameField")).sendKeys(lname);
		return this;
	}
	
public ViewContactsPage clickSubmit1() {
	getDriver().findElement(By.name("submitButton")).click();
	return new ViewContactsPage();
}
}