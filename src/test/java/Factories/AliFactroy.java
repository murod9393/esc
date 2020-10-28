package Factories;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AliFactroy {
	WebDriver driver;
	Actions act;
	String myCartNum;
	String myCartNums1;
	String mainWin;
	
	
	public AliFactroy(WebDriver driver,Actions act) {
		this.driver = driver;
		this.act=act;
		PageFactory.initElements(driver, this);
		
	}


	// list of webElements
// HomePage
	@FindBy(xpath = "(//span[text()='Account'])[1]")
	WebElement accountBtn;
	
	@FindBy(xpath = "//a[@class='sign-btn']")
	WebElement signBtnHome;
	
	@FindBy(xpath = "(//img[@class='rax-image '])[2]")
	WebElement popUpWindowXBtn;
	
	@FindBy(xpath = "(//iframe)[2]")
	WebElement homePopUpWinIFrame;
	
	@FindBy(xpath = "//a[@class='sign-btn']")
	WebElement signInBtn;
	
	@FindBy(id ="alibaba-login-box")
	WebElement signInWinFrame;
	
	@FindBy(xpath = "//input[@id='fm-login-id']")
	WebElement emailBox;
	
	@FindBy(xpath = "//input[@id='fm-login-password']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//button[@class='fm-button']")
	WebElement  signInWinBtn;
	
	@FindBy(xpath  = "//span[@id='nc_1_n1z']")
	WebElement verifyBtn;
	
	@FindBy(xpath = "//input[@class='search-key']")
	WebElement searchBox;
	
	@FindBy(xpath = "//a[text()='Baseus 33W/65W Power Bank 30000mAh PD Quick Charging FCP SCP Powerbank Portable External']")
	WebElement BaseusPowerBank;;
	
	@FindBy(xpath = "(//button[text()='Add to Cart'])[1]")
	WebElement addToCart;
	
	
	//   Child windows for products
	
	@FindBy(xpath = "//div[@class='sku-property-text']")
	WebElement shipFromChina;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[7]/div/div[2]/ul/li[3]/div/img")
	WebElement W65PowerBank;
	
	@FindBy(xpath = "/html/body/div[13]/div[2]/a")
	WebElement afterAddToCartWinXBtn;
	
	@FindBy(xpath = "//i[@class='right-cart-icon']")
	WebElement myCart;
	
	@FindBy(xpath = "//*[@id='nav-cart-num']")
	WebElement myCartNums;
	
	@FindBy(xpath = "/html/body/iframe[3]")
	WebElement afterAddedCartFrame;
	
	@FindBy(xpath = "//li[@class='list-item']")
	WebElement firstProduct;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[1]/div/div/div[2]/div/div[4]/div[1]/button[2]")
	WebElement grbBtnToRvItem;
	
	@FindBy(xpath = "//button[@class='next-btn next-medium next-btn-primary next-dialog-btn']")
	WebElement areYouSureWinYesBtn;
	

	
	public void navigateToBack() {
		driver.navigate().back();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	
	
	
	public void declinePopUpWin() {
		driver.switchTo().frame(homePopUpWinIFrame);
		popUpWindowXBtn.click();
		driver.switchTo().defaultContent();
	}
	
	public void moveToAccountBtn() {
		act.moveToElement(accountBtn).build().perform();
	}
	public void clickSignBtn() {
		signInBtn.click();
	}
	
	public void insertEmailAndPass(String email,String password) {
		//driver.switchTo().frame(signInWinFrame);
		emailBox.sendKeys(email);
		passwordBox.sendKeys(password);
		
	}
	
	public void slideVerifyBtn() {
		
		act.dragAndDropBy(verifyBtn, 350, 0).build().perform();
		driver.switchTo().defaultContent();
	}
	public void clickSignInWin() {
		signInWinBtn.click();

		
	}
	public void sendKeysToSearchBox(String keysToSend) {
		searchBox.sendKeys(keysToSend);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void choosingProduct() {
		BaseusPowerBank.click();
	}
	
	public void switchToChildWin() {
		mainWin = driver.getWindowHandle();
		//driver.switchTo().window(mainWin);
		System.out.println(mainWin);
		//CDwindow-0F09F568CE2FC7FD8D57A18BADFA1D9D
		//CDwindow-66439C0372F570BC445D4866F3A5340A
		String childWin="";
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!handle.equals(mainWin)) {
				childWin = handle;
			}
		}
		driver.switchTo().window(childWin);
		
		
	}
	
	public void switchToMainWin() {
		
		driver.switchTo().window(mainWin);
	}
	
	public void clickAddToCart() {
		shipFromChina.click();
		W65PowerBank.click();
		addToCart.click();
	}
	
	public void clickXafterAddToCartWin() {
		
		afterAddToCartWinXBtn.click();
		
	}
	
	public void clickToMyCart() {
		
		myCart.click();
	}
	
	public boolean isAddedToCart() {
		
		int currentNumOfOrders = Integer.parseInt(myCartNum);
		myCartNums1= myCartNums.getText();
		int newNumOfOrders = Integer.parseInt(myCartNums1);
		
		if(newNumOfOrders>currentNumOfOrders) {
			return true;
		}else {
			System.out.println(newNumOfOrders);
			return false;
		}
					
	}
	
	public void chooseFirstProductSearched() {
		firstProduct.click();
	}
	
	public void clearSearchBox() {
		searchBox.clear();
	}
	
	public void removeFromCart() {
		grbBtnToRvItem.click();
		
	}
	
	public void areYouSureWinYes() {
		areYouSureWinYesBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
