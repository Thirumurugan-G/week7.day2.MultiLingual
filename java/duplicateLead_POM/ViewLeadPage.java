package duplicateLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class ViewLeadPage extends BasePage
{	
	public DuplicateLeadPage clickDuplicateTab4() {
		getDriver().findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		return new DuplicateLeadPage();
	}
	public ViewLeadPage verifyLeadforDuplicate4() {
		String text3 = getDriver().findElement(By.xpath("//span[@id=\"viewLead_firstName_sp\"]")).getText();
		System.out.println(text3);
		if (text3.equals(text)) {
			System.out.println("Duplicated lead name is same as captured name");

		} else {
			System.out.println("Duplicated lead name is NOT same as captured name");
		}
		return this;
	}
}