package duplicateLead_POM;

import org.openqa.selenium.By;

import basePage_POM.BasePage;

public class FindLeadsPage extends BasePage 
{
	public FindLeadsPage clickEmailTab4() {
		getDriver().findElement(By.xpath("//span[text()='Email']")).click();
		return this;
	}
	public FindLeadsPage typeEmailAddress4(String Eaddress) throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(Eaddress);
		Thread.sleep(3000);
		return this;
	}
	public FindLeadsPage clickFind4() throws InterruptedException {
		System.out.println("hi");
		getDriver().findElement(By.xpath("(//button)[7]")).click();
		Thread.sleep(3000);
		return this;
	}
	public ViewLeadPage clickFirstName4() throws InterruptedException {
		Thread.sleep(3000);
		text = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
		System.out.println("orginal Name = "+text);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		return new ViewLeadPage();
	}
	

}


