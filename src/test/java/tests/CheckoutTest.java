package tests;


import Helper.PropertiesHelper;
import org.junit.Test;

public class CheckoutTest extends SampleTest {

    @Test
    public void CheckoutTest() {
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // 3. Вводим почту:
        user.loginPage.fillEmailAddress(Helper.PropertiesHelper.INSTANCE.getProperties("email"));
        // 4. Вводим пароль:
        user.loginPage.fillPassword(Helper.PropertiesHelper.INSTANCE.getProperties("password"));
        // 5. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSubmitLoginButton();
        // 6. Открываем страницу категории вомен
        user.mainPage.clickOnWomenTab();
        // 7. Добавляем товар:
        user.categoryPage.clickAddToCartButton(1);
        // 8. Нажимаем кнопку продолжить чекаут:
        user.categoryPage.clickCheckoutButton();
        // 9. Проверяем находимся ли мы на шаге 1:
        user.shopingCartPage.checkStepFirstIndicatorIsDisplayed();
        // 10. Сравниваем количество итемов в корзине с добавленым:
        user.shopingCartPage.checkItemsCountInShopingCart("1 Product");
        // 11. Нажимаем кнопку чекаут:
        user.shopingCartPage.clickProceedToCheckoutButton();
        // 12. Проверяем находимся ли мы на шаге 3
        //     и шаг 2 пропущен, тк логин выполнен:
        user.shopingCartPage.checkStepCurrentThirdIndicatorIsDisplayed();
        user.shopingCartPage.checkStepDoneSecondIndicatorIsDisplayed();
        // 13. Выбираем эл. почту для доставки:
        user.shopingCartPage.selectDeliveryAddress(PropertiesHelper.INSTANCE.getProperties("email"));
        // 14. Проверяем чекбокс для исп. адреса для доставки и выст. счета:
        user.shopingCartPage.checkAddressesAreEqualsCheckboxIsChecked();
        // 15. Вводим текст в текстовое поле:
        user.shopingCartPage.fillDeliveryMessageField("Good prices!");
        // 16. Нажимаем кнопку продолжить чекаут (2):
        user.shopingCartPage.clickProceedToCheckoutButton2();
        // 17. Проверяем находимся ли мы на шаге 4:
        user.shopingCartPage.checkStepCurrentFourIndicatorIsDisplayed();
        // 18. Нажимаем на чекбокс условия обслуживания:
        user.shopingCartPage.clickTermsOfServiceAgreementCheckbox();
        // 19. Нажимаем кнопку продолжить чекаут:
        user.shopingCartPage.clickProceedToCheckoutButton();
        // 20. Проверяем находимся ли мы на шаге 5:
        user.shopingCartPage.checkStepCurrentFiveIndicatorIsDisplayed();
        // 21. Нажимаем кнопку оплатить через банк:
        user.shopingCartPage.clickPayByBankWireButton();
        // 22. Проверяем выбранный способ оплаты:
        user.shopingCartPage.checkPaymentMethod("BANK-WIRE PAYMENT.");
        // 23. Нажимаем кнопку подтверждения заказа:
        user.shopingCartPage.clickConfirmOrderButton();
        // 24. Проверяем статус заказа:
        user.shopingCartPage.checkOrderCompletionStatus("Your order on My Store is complete.");


    }
}
