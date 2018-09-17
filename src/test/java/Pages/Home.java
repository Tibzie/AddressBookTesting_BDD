package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy(id="sign-in")
    private WebElement signInButton;

    public void clickSignIn() {
        signInButton.click();
    }

}
