package ShoppersStack_TestScripts;

import org.testng.annotations.Test;

import Com.ShoppersStack_GenericUtility.BaseTest;
import Com.ShoppersStack_POM.MyAddresses_Page;
import Com.ShoppersStack_POM.MyProfile_Page;

public class TC02_Verify_user_is_able_to_delete_address_or_notTest extends BaseTest {
	
	@Test
	public void deleteAddress() throws InterruptedException {
		Thread.sleep(2000);
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		Thread.sleep(2000);
		myAddressesPage.getDeleteAddressBtn().click();
		myAddressesPage.getYesBtn().click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
