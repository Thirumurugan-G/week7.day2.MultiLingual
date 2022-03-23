package testCases_POM;

import org.testng.annotations.Test;

import basePage_POM.BasePage;
import duplicateLead_POM.LoginPageForDuplicate;


public class DuplicateLead extends BasePage{

	@Test
	public void duplicateLead() throws InterruptedException {
		
		new LoginPageForDuplicate()
		.typeUserName4("DemoCsr2")		//Demosalesmanager for english language
		.typePassword4("crmsfa")
		.clickLogin4()
		.clickCRMSFA4()
		.clickLeadsTab4()
		.clickFindLead4()
		.clickEmailTab4()
		.typeEmailAddress4("thiru110298@gmail")
		.clickFind4()
		.clickFirstName4()
		.clickDuplicateTab4()
		.clickCreateLead4()
		.verifyLeadforDuplicate4();
		
		
		
	}
	
}
