package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
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
    public void clickSubmitLoginButton(){
        onPage.clickSubmitLoginButton();
    }
    // Проверка наличия алерта:
    @Step
    public void checkAllertMessageIsDisplayed(){
        onPage.checkAllertMessageIsDisplayed();
    }
    // Сообщение алерта правильное:
    @Step
    public void checkAllertMessageIsCorrect(String message){
        onPage.checkAllertMessageIsCorrect(message);
    }
}
