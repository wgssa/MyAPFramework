package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ShopingCartPage;


public class ShopingCartSteps extends ScenarioSteps {

    private ShopingCartPage onPage;

    @Step
    public void openShopingCartPage() {
        onPage.openShopingCartPage();
    }

    @Step
    public void checkShopigCartPageIsOpen() {
        onPage.checkShopigCartPageIsOpen();
    }

    @Step
    public void checkItemsCountInShopingCart(String itemsCount) {
        onPage.checkItemsCountInShopingCart(itemsCount);
    }

    @Step
    public void checkStepFirstIndicatorIsDisplayed() {
        onPage.checkStepFirstIndicatorIsDisplayed();
    }

    @Step
    public void clickProceedToCheckoutButton() {
        onPage.clickProceedToCheckoutButton();
    }

    public void clickProceedToCheckoutButton2() {
        onPage.clickProceedToCheckoutButton2();
    }

    @Step
    public void checkStepCurrentThirdIndicatorIsDisplayed() {
        onPage.checkStepCurrentThirdIndicatorIsDisplayed();
    }

    @Step
    public void checkStepDoneSecondIndicatorIsDisplayed() {
        onPage.checkStepDoneSecondIndicatorIsDisplayed();
    }

    @Step
    public void selectDeliveryAddress(String deliveryEmail) {
        onPage.selectDeliveryAddress(deliveryEmail);
    }

    @Step
    public void checkAddressesAreEqualsCheckboxIsChecked() {
        onPage.checkAddressesAreEqualsCheckboxIsChecked();
    }

    @Step
    public void fillDeliveryMessageField(String deliveryMessage) {
        onPage.fillDeliveryMessageField(deliveryMessage);
    }

    @Step
    public void checkStepCurrentFourIndicatorIsDisplayed() {
        onPage.checkStepCurrentFourIndicatorIsDisplayed();
    }

    @Step
    public void clickTermsOfServiceAgreementCheckbox() {
        onPage.clickTermsOfServiceAgreementCheckbox();
    }

    @Step
    public void checkStepCurrentFiveIndicatorIsDisplayed() {
        onPage.checkStepCurrentFiveIndicatorIsDisplayed();
    }

    @Step
    public void clickPayByBankWireButton() {
        onPage.clickPayByBankWireButton();
    }

    @Step
    public void checkPaymentMethod(String paymentMethodName) {
        onPage.checkPaymentMethod(paymentMethodName);
    }

    @Step
    public void clickConfirmOrderButton() {
        onPage.clickConfirmOrderButton();
    }

    @Step
    public void checkOrderCompletionStatus(String orderStatus) {
        onPage.checkOrderCompletionStatus(orderStatus);
    }


}
