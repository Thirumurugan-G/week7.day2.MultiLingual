package createLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class CreateLeadPage extends BasePage
{
	public CreateLeadPage typeCompanyName2(String compname) {
		getDriver().findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(compname);
		return this;
	}

	public CreateLeadPage typeFirstName2(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage typeLastName2(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public CreateLeadPage typeEmailAddress2(String EmailADD) {
		getDriver().findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys(EmailADD);
		return this;
	}

	public ViewLeadsPage clickSubmit2() {
		getDriver().findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Submited");
		return new ViewLeadsPage();
	}
}