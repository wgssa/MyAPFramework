package steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    //Обьявляем логин пейдж
    private LoginPage onPage;

    //// Шаги для логин пейдж

    // Прямое открытие страницы логина:
    @Step
    public void openMainPage() {
        onPage.openLoginPage();
    }
    // Заполнение поля емеила:
    @Step
    public void fillEmailAddress(String email){
        onPage.fillEmailAddress(email);
    }
    //Заполнение поля пароля:
    @Step
    public void fillPassword(String password){
        onPage.fillPassword(password);
    }
    // Нажатие кнопки сайн ин:
    @Step
    public void clickSignInLogin(){
        onPage.clickSignInLogin();
    }

}