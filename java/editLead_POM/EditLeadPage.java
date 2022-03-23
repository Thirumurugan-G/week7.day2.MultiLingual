package editLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class EditLeadPage extends BasePage
{
	public EditLeadPage clickEditTab3() {
		getDriver().findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();

		return this;
	}

	public EditLeadPage changeCompanyName3(String Cname) {
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(Cname);

		return this;
	}
	public ViewLeadsPage ClickSubmit3() {
		getDriver().findElement(By.xpath("//input[@name='submitButton'][1]")).click();

		return new ViewLeadsPage();
	}


}
