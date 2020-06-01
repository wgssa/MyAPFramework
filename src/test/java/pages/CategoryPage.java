package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class CategoryPage extends BasePage {

    //// Локаторы:
    @FindBy(xpath = "//*[@id='center_column']/ul/li")
    private List<WebElement> columnItemsList;

    @FindBy(css = "a[title='Add to cart'][data-id-product]")
    private List<WebElement> addToCartButtons;

    @FindBy(css = "a[title='Proceed to checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")
    private WebElement continueShopingButton;

    //// Драйвер:

    public CategoryPage (WebDriver driver) {
        super(driver);
    }

    //// Методы:
    // Коллекция колонок с параметрами для товара:
    private List<WebElement> getColumnItemsList(){
        return columnItemsList;
    }

    // Получаем коллекцию кнопок
    private List<WebElement> getAddToCartButtonsList(){
        return addToCartButtons;
    }


    // Нажатия кнопки чекаут:
    public void clickCheckoutButton(){
        element(checkoutButton).click();
    }

    // Нажатия кнопки продолжить покупки:
    public void clickContinueShopingButton(){
        element(continueShopingButton).click();
    }



    // Добавления необходимого количества товаров по нажатию кнопки:
    public void clickAddToCartButton(int addProductCount){
        for (int i = 0; i < addProductCount;i++) {
            withAction().moveToElement(getColumnItemsList().get(i)).perform();
            getAddToCartButtonsList().get(i).click();
            if(i<addProductCount){
                // TODO:
                clickContinueShopingButton();
            }
        }
    }



}
