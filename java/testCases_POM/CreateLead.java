package testCases_POM;

import org.testng.annotations.Test;

import basePage_POM.BasePage;
import createLead_POM.LoginPage2;


public class CreateLead extends BasePage{

	@Test
	public void createLead() throws InterruptedException {
		new LoginPage2()
		.typeUserName2("DemoCsr2")		//Demosalesmanager for english language
		.typePassword2("crmsfa")
		.clickLogin2()
		.clickCRMSFA2()
		.clickLeadsTab2()
		.clickcreateLead2()
		.typeCompanyName2("TestLeaf")
		.typeFirstName2("Thirumurugan")
		.typeLastName2("G")
		.typeEmailAddress2("thiru110298@gmail.com")
		.clickSubmit2()
		.verifyFirstName2();
	}}
