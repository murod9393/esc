package Tests;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Factories.AliFactroy;

public class TestCases extends Base {
	
	AliFactroy ali;
	
	@Test
	public void signIn() {
		ali = new AliFactroy(driver,act);
		
		try {
		ali.declinePopUpWin();
		}catch (Exception e) {
			// TODO: handle exception
		}
		ali.moveToAccountBtn();
		ali.clickSignBtn();
		ali.insertEmailAndPass(prop.getProperty("username"), prop.getProperty("password"));
		try {
			ali.slideVerifyBtn();
		}catch (Exception e) {
			// TODO: handle exception
		}
		ali.clickSignInWin();
		try {
		ali.declinePopUpWin();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test(dependsOnMethods = {"signIn"})
	public void addToCart() {
		ali.sendKeysToSearchBox(prop.getProperty("product"));
		ali.choosingProduct();
		ali.switchToChildWin();
		ali.clickAddToCart();
		ali.refresh();
		ali.clickToMyCart();
		//ali.isAddedToCart();
		ali.navigateToBack();
		ali.switchToMainWin();
		ali.clearSearchBox();
		ali.sendKeysToSearchBox(prop.getProperty("product2"));
	}
	
	@Test(dependsOnMethods = {"signIn"})
	public void deleteFromCart() {
		
		ali.clickToMyCart();
		ali.removeFromCart();
		ali.areYouSureWinYes();
	}

}
