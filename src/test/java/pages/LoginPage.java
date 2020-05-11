package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")

public class LoginPage extends BasePage {

    //// Локаторы:

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy (id = "passwd")
    private WebElement passField;

    @FindBy (xpath = "//*[@id='SubmitLogin']/span/i")
    private WebElement SignInLogin;

    //// Драйвер:

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    //// Методы:

    //Открытия страницы:
    public void openLoginPage() {
        open();
    }

    // Заполнение поля адреса:
    public void fillEmailAddress(String email){
        element(emailField).sendKeys(email);
    }
    // Заполнение поля пароля:
    public void fillPassword(String password){
        element(passField).sendKeys(password);
    }
    // Нажатие кнопки Sign In:
    public void clickSignInLogin(){
        element(SignInLogin).click();
    }

}
