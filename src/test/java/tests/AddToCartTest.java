package tests;

import org.junit.Test;

public class AddToCartTest extends SampleTest {

    @Test
    public void AddToCartTest(){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Открываем страницу категории дресес
        user.mainPage.clickOnWomenTab();
        // 3. Добавляем один товар:
        user.categoryPage.clickAddToCartButton(1);
        // 4. Нажимаем кнопку чекаут:
        user.categoryPage.clickCheckoutButton();
        // 5. Проверяем открылась ли корзина:
        user.shopingCartPage.checkShopigCartPageIsOpen();
    }
}
