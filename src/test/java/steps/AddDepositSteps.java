package steps;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AddContactPage;
import page.AddDepositPage;

public class AddDepositSteps {

	WebDriver driver;

	String email = "techfiosdemo@gmail.com";
	String password = "abc123";

	@Before
	public void startBrowerAndGoToTechFios() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=login/");
	}

	@Given("^a user with valid credentials$")
	public void a_user_with_valid_credentials() {
		AddDepositPage adddepositpage = PageFactory.initElements(driver, AddDepositPage.class);
		adddepositpage.login(email, password);
	}

	@When("^user navigate to Transaction -> New Deposit$")
	public void user_navigate_to_Transaction_New_Deposit() {
		AddDepositPage adddepositpage = PageFactory.initElements(driver, AddDepositPage.class);
		adddepositpage.clickOnTransaction();
		adddepositpage.clickonNewDeposit();

	}

	@Then("^New Deposit page should display$")
	public void new_Deposit_page_should_display() {
		AddDepositPage adddepositpage = PageFactory.initElements(driver, AddDepositPage.class);
		Assert.assertTrue("NewDepositpage did not Display", adddepositpage.isNewDepositpagedisplay());
	}

	@When("^user submit New Deposit form$")
	public void user_submit_New_Deposit_form() throws InterruptedException {
		AddDepositPage adddepositpage = PageFactory.initElements(driver, AddDepositPage.class);
		adddepositpage.selectFromDropDownForAccount("AutoAccount");
		adddepositpage.ClearTheDateAndInput("2019-06-12");
		adddepositpage.clickAway();
		Thread.sleep(500);
		Random random = new Random();

		String expectedDescription = "TestDescription" + String.valueOf(random.nextInt(999));
		String expectedAmount = String.valueOf(random.nextInt(99999));
		adddepositpage.inputDescriptionAndAmount(expectedDescription, expectedAmount);
		adddepositpage.clickOnSubmitButton();

	}

	@Then("^success Msg should display$")
	public void success_Msg_should_display() {
		AddDepositPage adddepositpage = PageFactory.initElements(driver, AddDepositPage.class);
		Assert.assertTrue("SuccessMsg did not Display", adddepositpage.isSuccessMsgdisplay());
	}

}
