package tdscProject.features;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import tdscProject.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;





    @Given("^go to \"([^\"]*)\"$")
    public void goTo() {
        endUserSteps.goToWebsite();
    }
}
