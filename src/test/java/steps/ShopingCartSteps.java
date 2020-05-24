package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ShopingCartPage;


public class ShopingCartSteps extends ScenarioSteps {

    private ShopingCartPage onPage;

    @Step
    public void checkShopigCartPageIsOpen(){
        onPage.checkShopigCartPageIsOpen();
    }
}
