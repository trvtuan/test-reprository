package tdscProject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tdscProject.pages.CartPage;

public class EndUserSteps extends ScenarioSteps {

    CartPage cartPage;

    @Step
    public void goToWebsite() {
        cartPage.goToWebsite();
    }
}