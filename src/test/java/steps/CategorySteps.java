package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.CategoryPage;

public class CategorySteps extends ScenarioSteps {

    //Обьявляем категори пейдж:
    private CategoryPage onPage;

    @Step
    public void addItemsInShopingCart(int addProductCount) {
        onPage.addItemsInShopingCart(addProductCount);
    }

    @Step
    public void clickCheckoutButton() {
        onPage.clickCheckoutButton();
    }

    @Step
    public void clickContinueShopingButton() {
        onPage.clickContinueShopingButton();
    }
}
