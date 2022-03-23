package duplicateLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class DuplicateLeadPage extends BasePage {
	public ViewLeadPage clickCreateLead4() throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(3000);
		return new ViewLeadPage();
}
}
