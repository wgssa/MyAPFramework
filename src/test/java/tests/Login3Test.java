package tests;

import org.junit.Test;

public class Login3Test extends SampleTest {

    @Test
    public void Login3Test (){
        // 1. Открываем главную страницу:
        user.mainPage.openMainPage();
        // 2. Нажимаем кнпоку сайн ин чтобы перейти на страницу логина:
        user.mainPage.clickOnSignInButton();
        // 3. Вводим почту:
        user.loginPage.fillEmailAddress(Helper.PropertiesHelper.INSTANCE.getProperties("email"));
        // Пропускаем ввод пароля
        // 4. Нажимаем кнопку сайн ин чтобы войти в мой аккаунт:
        user.loginPage.clickSubmitLoginButton();
        // 5. Проверяем наличие алерта:
        user.loginPage.checkAllertMessageIsDisplayed();
        // 6. Проверяем правильность сообщения в алерте:
        user.loginPage.checkAllertMessageIsCorrect(Helper.PropertiesHelper.INSTANCE.getProperties("allertPassword"));
    }
}
