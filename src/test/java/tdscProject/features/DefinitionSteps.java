package tdscProject.features;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import tdscProject.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//---------------------------------CARTPAGE-----------------//
    @Given("^go to website$")
    public void goToWebsite() {
        endUserSteps.goToWebsite();
    }


}
