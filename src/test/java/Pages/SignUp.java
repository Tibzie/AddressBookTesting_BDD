package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SignUp {

    @FindBy(id = "user_email")
    private WebElement userName;

    @FindBy(id = "user_password")
    private WebElement userPass;


    public void credentials(WebDriver driver) {
        Actions cred = new Actions(driver);
        cred.click(userName).sendKeys("yolo@test.com").perform();
        cred.click(userPass).sendKeys("Batman").perform();
    }


    @FindBy(xpath="//*[@id=\"new_user\"]/div[3]/input")
    private WebElement signUp;

    public void compSignUp() {
        signUp.click();
    }

}
