package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
	WebDriver driver;

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement Email;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignIn;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'CRM')]")
	WebElement Crm;
	
	@FindBy(how = How.LINK_TEXT,using = "Add Contact") WebElement Addcontact;
	@FindBy(how=How.ID,using="account")
	WebElement fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement Coname;
	
	@FindBy(how=How.ID,using="email")
	WebElement PEmail;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID,using="city")
	WebElement city;
	
	@FindBy(how=How.ID,using="state")
	WebElement state;
	
	@FindBy(how=How.ID,using="zip")
	WebElement zip;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submitbutton;
@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
WebElement addcontact;
@FindBy(how=How.XPATH,using="//*[@id=\"activity\"]")WebElement Activity;


	public void login(String UserName, String password) {
		Email.sendKeys(UserName);
		Password.sendKeys(password);
		SignIn.click();
		
	}



	public void clickonCRM() {
		Crm.click();
	
		
	}



	public void ClickonAddContactPage() {
		Addcontact.click();
		
	}



	public boolean isAddContactPageDisplayed() {
		return addcontact.isDisplayed();
		
	}



	public void fillingForm(String FName,String CName,String Pmail,String Phone,String Address,
			String City, String State,String Zip ) {
		fullname.sendKeys(FName);
		Coname.sendKeys(CName);
		PEmail.sendKeys(Pmail);
		phone.sendKeys(Phone);
		address.sendKeys(Address);
		city.sendKeys(City);
		state.sendKeys(State);
		zip.sendKeys(Zip);
		submitbutton.click();
		
	}

	public boolean isSuccessMsgDisplay() {
		// TODO Auto-generated method stub
		return Activity.isDisplayed();
	}

}
