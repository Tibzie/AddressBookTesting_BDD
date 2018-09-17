package Tests;

import Pages.Home;
import Pages.SignIn;
import Pages.SignUp;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepDef {


    ChromeDriver driver;
    String url="http://a.testaddressbook.com/";

    @Given("^the website$")
    public void the_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I click on Sign in button$")
    public void i_click_on_Sign_in_button() throws Throwable {
        Home login = PageFactory.initElements(driver, Home.class);
        login.clickSignIn();
        Thread.sleep(2000);
    }

    @When("^I click on Sign up link$")
    public void i_click_on_Sign_up_link() throws Throwable {
        SignIn gotoreg = PageFactory.initElements(driver, SignIn.class);
        gotoreg.clickSignUp();
        Thread.sleep(2000);
    }

    @Then("^I fill out fields with information$")
    public void i_fill_out_fields_with_information() throws Throwable {
        SignUp filldetails = PageFactory.initElements(driver, SignUp.class);
        filldetails.credentials(driver);
        Thread.sleep(2000);
    }

    @Then("^I press submit button$")
    public void i_press_submit_button() throws Throwable {
        SignUp signingup = PageFactory.initElements(driver, SignUp.class);
        signingup.compSignUp();
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);
    }

}
