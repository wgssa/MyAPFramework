package tests;

import net.thucydides.core.annotations.Steps;
import steps.*;

// Описываем пейджы, для удобства
public class User {

    // Аннотация:
    // чтобы серенити мог добавить шаги в репорт при его генерации:
    @Steps
    public MainSteps mainPage;

    @Steps
    public LoginSteps loginPage;

    @Steps
    public MyAccountSteps myAccountPage;

    @Steps
    public CategorySteps categoryPage;

    @Steps
    public ShopingCartSteps shopingCartPage;
}
