package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_Test;
import com.ShoppersStack.POM.MyAddress_Page;
import com.ShoppersStack.POM.MyProfile_Page;

public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test{
	
	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		
		homePage.getAccountSettings().click();
		homePage.getMyProfileButton().click();
		
		MyProfile_Page myProfilePage=new MyProfile_Page(driver);
		myProfilePage.getMyAddressButton().click();
		
		Thread.sleep(2000);
		MyAddress_Page myAddressPage=new MyAddress_Page(driver);
		myAddressPage.getDeleteButton().click();
		Thread.sleep(2000);
		myAddressPage.getYesButton().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		webdriverUtility.takeWebPageScreenShot();
		
	}
	
}
