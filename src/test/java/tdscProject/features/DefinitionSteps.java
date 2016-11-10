package tdscProject.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tdscProject.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;
//--------------------------------------------
    @Given("^go to website$")
    public void goToWebsite() {
        endUserSteps.goToWebsite();
    }

    @Then("^([^\"]*) is opened$")
    public void pageIsOpened(String arg0)  {
        endUserSteps.pageIsOpened(arg0);

    }


    @When("^click on ([^\"]*)$")
    public void clickOnMenu(String arg0)   {
        endUserSteps.clickOnMenu(arg0);
    }


    @When("^click ([^\"]*) ([^\"]*)$")
    public void clickLinkArg(String arg, int arg1)  {
       endUserSteps.clickOntheLink(arg,arg1);
    }

    @Then("^([^\"]*) is opened with ([^\"]*)$")
    public void pageIsOpenedWithUrl(String arg1, String arg2)  {
        endUserSteps.pageIsOpenedWithUrl(arg1,arg2);

    }

    @Given("^go to hybris hmc$")
    public void goToHybrisHmc()  {
       endUserSteps.goToHybrisHmc();
    }

    @When("^log in with user \"(.*)\" pass \"(.*)\"$")
    public void logInWithUserPass(String user, String pass) throws Throwable  {
       endUserSteps.logInWithUserPass(user,pass);
    }
//
//    @When("^click on \"(.*)\"$")
//    public void clickOn(String arg0)  {
//        endUserSteps.clickOnMenu(arg0);
//    }
}
