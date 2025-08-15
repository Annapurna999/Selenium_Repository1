
package Com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

	public Logout_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logOutBtn;
	
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

}
