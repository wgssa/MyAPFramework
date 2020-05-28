package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
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
    private WebElement submitLoginButton;

    @FindBy (xpath = "//div[@class='alert alert-danger']/ol/li")
    private WebElement allertMessage;

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
    public void clickSubmitLoginButton(){
        element(submitLoginButton).click();
    }
    // Отображение алерта:
    public void checkAllertMessageIsDisplayed(){
        Assert.assertTrue(element(allertMessage).isDisplayed());
    }
    // Сообщение в алерте правильное:
    public void checkAllertMessageIsCorrect(String message){
        Assert.assertEquals(message, element(allertMessage).getText());
    }

}
