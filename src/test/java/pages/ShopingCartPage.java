package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Стандартный адрес:
@DefaultUrl("http://automationpractice.com/index.php?controller=order")

public class ShopingCartPage extends BasePage {

    //// Локаторы:

    @FindBy(css = "span[class='navigation_page']")
    private WebElement navigationPageName;

    // Your shopping cart contains:
    @FindBy(id = "summary_products_quantity")
    private WebElement itemsCountInShopingCart;

    // Линия шагов:
    @FindBy(id = "order_step")
    private WebElement stepLine;

    @FindBy(css = "[class='button btn btn-default standard-checkout button-medium']")
    private WebElement proceedToCheckoutButton;

    @FindBy(css = "[type='submit'][class='button btn btn-default button-medium']")
    private WebElement proceedToCheckoutButton2;

    // Шаги:
    // Второй пропущен, тк логин выполнен

    // Шаг 1
    @FindBy(css = "li[class='step_current  first']")
    private WebElement stepCurrentFirstIndicator;

    //Выполненые шаги:
    @FindBy(css = "li[class='step_done step_done_last second']")
    private WebElement stepDoneSecondIndicator;

    //Шаг 3
    @FindBy(css = "li[class='step_current third']")
    private WebElement stepCurrentThirdIndicator;

    @FindBy(id = "uniform-id_address_delivery")
    private WebElement deliveryAddressDropdown;

    @FindBy(id = "id_address_delivery")
    private WebElement subjectAddress;

    @FindBy(id = "uniform-addressesAreEquals")
    private WebElement addressesAreEqualsCheckbox;

    @FindBy(css = "textarea[class='form-control']")
    private WebElement deliveryMessageField;


    // Шаг 4
    @FindBy(css = "li[class='step_current four']")
    private WebElement stepCurrentFourIndicator;

    @FindBy(id = "uniform-cgv")
    private WebElement termsOfServiceAgreementCheckbox;

    // Шаг 5
    @FindBy(css = "li[class='step_current last']")
    private WebElement stepCurrentFiveIndicator;

    @FindBy(css = "a[title='Pay by bank wire']")
    private WebElement payByBankWireButton;

    @FindBy(css = "[class='page-subheading']")
    private WebElement paymentMethodInfoTitle;

    @FindBy(css = "[class='button btn btn-default button-medium']")
    private WebElement confirmOrderButton;

    @FindBy(css = "[class='cheque-indent']")
    private WebElement orderCompletionInfoTitle;


    //// Драйвер:

    public ShopingCartPage(WebDriver driver) {
        super(driver);
    }

    //// Методы:

    //Открытия страницы:
    public void openShopingCartPage() {
        open();
    }

    // Проверяем название страницы:
    public void checkShopigCartPageIsOpen() {
        Assert.assertEquals("Your shopping cart", element(navigationPageName).getText());
    }

    // Проверяем равно ли количество итемов в корзине добавленному:
    public void checkItemsCountInShopingCart(String itemsCount) {
        Assert.assertEquals(itemsCount, element(itemsCountInShopingCart).getText());
    }

    // TODO: нужана ли эта проверка? она выполнена верно?
    public void checkStepFirstIndicatorIsDisplayed() {
        element(stepCurrentFirstIndicator).isDisplayed();
    }

    public void clickProceedToCheckoutButton() {
        element(proceedToCheckoutButton).click();
    }

    public void clickProceedToCheckoutButton2() {
        element(proceedToCheckoutButton2).click();
    }

    // TODO: нужана ли эта проверка? она выполнена верно?
    public void checkStepCurrentThirdIndicatorIsDisplayed() {
        Assert.assertTrue(element(stepCurrentThirdIndicator).isDisplayed());

    }

    // TODO: нужана ли эта проверка? она выполнена верно?
    public void checkStepDoneSecondIndicatorIsDisplayed() {
        Assert.assertTrue(element(stepDoneSecondIndicator).isDisplayed());
    }

    public void selectDeliveryAddress(String deliveryEmail) {
        element(deliveryAddressDropdown).click();
        selectFromDropdown(subjectAddress, deliveryEmail);
    }

    public void checkAddressesAreEqualsCheckboxIsChecked() {
        Assert.assertTrue(element(addressesAreEqualsCheckbox).containsElements("[class='checked']"));
    }

    public void fillDeliveryMessageField(String deliveryMessage) {
        element(deliveryMessageField).sendKeys(deliveryMessage);
    }


    // TODO: нужана ли эта проверка? она выполнена верно?
    public void checkStepCurrentFourIndicatorIsDisplayed() {
        Assert.assertTrue(element(stepCurrentFourIndicator).isDisplayed());
    }

    public void clickTermsOfServiceAgreementCheckbox() {
        element(termsOfServiceAgreementCheckbox).click();
    }

    // TODO: нужана ли эта проверка? она выполнена верно?
    public void checkStepCurrentFiveIndicatorIsDisplayed() {
        Assert.assertTrue(element(stepCurrentFiveIndicator).isDisplayed());
    }

    public void clickPayByBankWireButton() {
        element(payByBankWireButton).click();
    }

    public void checkPaymentMethod(String paymentMethodName) {
        Assert.assertEquals(paymentMethodName, element(paymentMethodInfoTitle).getText());
    }

    public void clickConfirmOrderButton() {
        element(confirmOrderButton).click();
    }

    public void checkOrderCompletionStatus(String orderStatus) {
        Assert.assertEquals(orderStatus, element(orderCompletionInfoTitle).getText());
    }


}
