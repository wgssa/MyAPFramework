package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopingCartPage extends BasePage {

    //// Локаторы:

    @FindBy(css = "span[class='navigation_page']")
    private WebElement navigationPageName;

    //// Драйвер:

    public ShopingCartPage(WebDriver driver) {
        super(driver);
    }

    //// Методы:

    // Проверяем название страницы:
    public void checkShopigCartPageIsOpen(){
        Assert.assertEquals("Your shopping cart",element(navigationPageName).getText());
    }

}
