package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn {


    @FindBy(css="#clearance > div > div > form > div:nth-child(6) > a")
    private WebElement signUpButton;


    public void clickSignUp() {
        signUpButton.click();
    }

}
