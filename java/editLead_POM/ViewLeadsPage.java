package editLead_POM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import basePage_POM.BasePage;

public class ViewLeadsPage extends BasePage 
{
	public  EditLeadPage clickFirstLead3() {
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		return new EditLeadPage();
	}
	public  ViewLeadsPage verifyEditedOrNot3() {
		WebElement get = getDriver().findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text1 = "LEAF TEST";
		System.out.println("changed company name = "+text1);
		if (get.getText().contains(text1)) {
			System.out.println("changes in company name is confirmed = "+text1);

		} else {System.out.println("changes not happened");

		}
		return this;
	}
}

