package testCases_POM;

import org.testng.annotations.Test;

import basePage_POM.BasePage;
import createContact_POM.LoginPage1;

public class CreateContacts extends BasePage{

	@Test
	public void createContact() {
		new LoginPage1()
		.typeUserName1("Democsr2")		//Demosalesmanager   for english language
		.typePassword1("crmsfa")
		.clickLogin1()
		.clickCRMSFA1()
		.ClickContactsTab1()
		.clickcontact1()
		.typeFirstName1("Thirumurugan")
		.typeLastName1("G")
		.clickSubmit1()
		.verifyFirstName1();
	}
	
}
