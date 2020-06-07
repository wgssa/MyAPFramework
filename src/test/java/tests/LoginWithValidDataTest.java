package tests;

import org.junit.Test;

public class LoginWithValidDataTest extends SampleTest {

    @Test
    public void LoginWithValidDataTest() {
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
        // 6. Проверяем вошли ли через имя пользователя:
        user.myAccountPage.myAccountNameIsTrue(Helper.PropertiesHelper.INSTANCE.getProperties("myAccountName"));
        // 7. Проверяем есть ли кнопка сан аут:
        user.myAccountPage.signOutButtonIsVisible();
        user.myAccountPage.signOutButtonIsClickable();
    }
}
