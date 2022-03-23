package testCases_POM;

import org.testng.annotations.Test;

import basePage_POM.BasePage;
import editLead_POM.LoginPage3;

public class EditLead extends BasePage{

	@Test
	public void editLead() {
		
		new LoginPage3()
		.typeUserName3("DemoCsr2")			//Demosalesmanager for english language
		.typePassword3("crmsfa")
		.clickLogin3()
		.clickCRMSFA3()
		.clickLeadsTab3()
		.clickFindLead3()
		.clickFirstLead3()
		.clickEditTab3()
		.changeCompanyName3("Test Leaf Ahead")
		.ClickSubmit3()
		.verifyEditedOrNot3();
		
	}
	
}
