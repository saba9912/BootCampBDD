package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AddContactPage;

public class AddContactSteps {
	
	WebDriver driver;
	String email = "techfiosdemo@gmail.com";
	String password = "abc123";
	String fullname = "Rony Roy";
	String Coname =  "TechFios";
	String PEmail = "Rosy123@gmail.com";
	String phone = "2346758977";
	String address="4536 Yellowstone st";
	String city = "Dallas";
	String state = "Texas";
	String zip = "75090";
	
	
	@Before
	public void startBrowerAndGoToTechFios() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=login/");
	}
	@Given("^a internal user$")
	public void user_already_on_login_page() {
		AddContactPage addcontapage = PageFactory.initElements(driver, AddContactPage.class);
		addcontapage.login(email, password);

	}
	
	@When("^user navigate to CRM -> AddContact page$")
	public void user_navigate_to_CRM_AddContact_page()  {
		AddContactPage addcontapage = PageFactory.initElements(driver, AddContactPage.class);
		addcontapage.clickonCRM();
		addcontapage.ClickonAddContactPage();
	}

	@Then("^AddContact page should display$")
	public void addcontact_page_should_display() {
		AddContactPage addcontapage = PageFactory.initElements(driver, AddContactPage.class);
		Assert.assertTrue("AddContactPage not Displayed", addcontapage.isAddContactPageDisplayed());
	   
	}

	@When("^user fill the form$")
	public void user_fill_the_form()  {
		AddContactPage addcontapage = PageFactory.initElements(driver, AddContactPage.class);
		addcontapage.fillingForm(fullname,Coname,PEmail,phone,address,city,state,zip);
	}

	@Then("^success message should display$")
	public void success_message_should_display()  {
		AddContactPage addcontapage = PageFactory.initElements(driver, AddContactPage.class);
		Assert.assertTrue("SuccessMsg not Displayed",addcontapage.isSuccessMsgDisplay());
	}

}
