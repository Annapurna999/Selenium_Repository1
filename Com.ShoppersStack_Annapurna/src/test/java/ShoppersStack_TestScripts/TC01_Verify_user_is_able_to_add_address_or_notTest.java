package ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.ShoppersStack_GenericUtility.BaseTest;
import Com.ShoppersStack_POM.AddressForm_Page;
import Com.ShoppersStack_POM.MyAddresses_Page;
import Com.ShoppersStack_POM.MyProfile_Page;

public class TC01_Verify_user_is_able_to_add_address_or_notTest extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
	
		Thread.sleep(2000);
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		MyAddresses_Page myAddressesPage = new MyAddresses_Page(driver);
		myAddressesPage.getAddAddressBtn().click();
		
		AddressForm_Page addressFormPage = new AddressForm_Page(driver);
		
		addressFormPage.getAddAddressBtn().click();		
		addressFormPage.getNameTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 0));
		addressFormPage.getHouse_officeTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 1));
		addressFormPage.getStreetTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 2));
		addressFormPage.getLandmarkTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 3));
		
		webDriverUtility.selectByValue(addressFormPage.getCountryDropdown(), fileUtility.readDataFromPropertyFile("country"));
		webDriverUtility.selectByValue(addressFormPage.getStateDropdown(), fileUtility.readDataFromPropertyFile("state"));
		webDriverUtility.selectByValue(addressFormPage.getCityDropdown(), fileUtility.readDataFromPropertyFile("city"));
		
		addressFormPage.getPincodeTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 4));
		addressFormPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("sheet1", 1, 5));			
		addressFormPage.getAddAddressBtn().click();
		
		myAddressesPage.getClosePopupBtn().click();		
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);
	}
}