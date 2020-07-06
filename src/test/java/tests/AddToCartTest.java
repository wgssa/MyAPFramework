package tests;

import org.junit.Test;

public class AddToCartTest extends SampleTest {

    @Test
    public void AddToCartTest() {
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Открываем страницу категории вомен
        user.mainPage.clickOnWomenTab();
        // 3. Добавляем товар:
        user.categoryPage.addItemsInShopingCart(3);
        // 4. Нажимаем кнопку чекаут:
        user.categoryPage.clickCheckoutButton();
        // 5. Проверяем открылась ли корзина:
        user.shopingCartPage.checkShopigCartPageIsOpen();
    }
}
