package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddDepositPage {

	WebDriver driver;

	public AddDepositPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement Email;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignIn;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Transactions')]")
	WebElement Trans;
	@FindBy(how = How.LINK_TEXT, using ="New Deposit")
	WebElement NewDeposit;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/div[1]/h5")
	WebElement AddDeposit;
	@FindBy(how = How.XPATH, using = "//select[@id='account']")
	WebElement AcccountDropDown;
	@FindBy(how = How.ID, using = "description")
	WebElement DescriptionField;
	@FindBy(how = How.ID, using = "amount")
	WebElement AmountField;
	@FindBy(how = How.ID, using = "submit")
	WebElement SubmitButton;
	@FindBy(how = How.XPATH, using = "//button[@data-dismiss='alert']")
	WebElement DepositSuccessMsg;
	@FindBy(how = How.XPATH, using = "//h5[text() = 'Add Deposit']")
	WebElement AddDepositPanelHeading;
	@FindBy(how = How.ID, using = "date")
	WebElement DateField;

	public void login(String UserName, String password) {
		Email.sendKeys(UserName);
		Password.sendKeys(password);
		SignIn.click();
		
		
	}

	public void clickOnTransaction() {
		
		Trans.click();
	}

	public void clickonNewDeposit() {
		NewDeposit.click();
		
	}

	public boolean isNewDepositpagedisplay() {
	
		return AddDeposit.isDisplayed();
	}

	public void selectFromDropDownForAccount(String string) {
		Select AccountDropDown = new Select(AcccountDropDown);
		AccountDropDown.selectByVisibleText(string);
		
	}

	public void ClearTheDateAndInput(String string) {
		DateField.clear();
		DateField.sendKeys(string);
		DateField.sendKeys(Keys.TAB);
		
	}

	public void clickAway() {
		
		AddDepositPanelHeading.click();
	}

	public void inputDescriptionAndAmount(String expectedDescription, String expectedAmount) {
		DescriptionField.sendKeys(expectedDescription);
		AmountField.sendKeys(expectedAmount);
	}

	public void clickOnSubmitButton() {
		SubmitButton.click();
		
	}

	public boolean isSuccessMsgdisplay() {
		try {
			return DepositSuccessMsg.isDisplayed();
		} catch (NoSuchElementException e) {
			throw new RuntimeException("I Failed The Test, Not JAVA");
		}
	
	}
}
