package tdscProject.features;

import cucumber.api.java.en.And;
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


    @When("^click on \"([^\"]*)\"$")
    public void clickOnMenu(String arg0)   {
        endUserSteps.clickOnMenu(arg0);
    }


    @When("^click \"([^\"]*)\" \"([^\"]*)\"$")
    public void clickLinkArg(String arg, int arg1)  {
       endUserSteps.clickOntheLink(arg,arg1);
    }

    @Then("^\"([^\"]*)\" is opened with \"([^\"]*)\"$")
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

    @Then("^\"([^\"]*)\" is opened$")
    public void pageIsOpened(String arg0) {
        endUserSteps.pageIsOpened(arg0);
    }


    @And("^sign in using \"(.*)\" pass \"(.*)\"$")
    public void signInUsingPass(String arg0, String arg1) throws Throwable {
       endUserSteps.signInUsingPass(arg0, arg1);
    }

    @Then("^total saving is shown in the header$")
    public void totalSavingIsShownInTheHeader() throws Throwable {
        endUserSteps.totalSavingIsShownInTheHeader();
    }

    @Then("^validation messages are shown in the page$")
    public void validationMessagesAreShownInThePage() throws Throwable {
       endUserSteps.validationMessagesAreShownInThePage();
    }


    @When("^click on magnifying glass$")
    public void clickOnMagnifyingGlass() throws Throwable {
        endUserSteps.clickOnMagnifyingGlass();
    }

    @And("^populate field with \"([^\"]*)\"$")
    public void populateFieldWith(String emailaddress) throws Throwable {
       endUserSteps.populateFieldWith(emailaddress);
    }

    @Then("^message that notify email has been sent to the user$")
    public void messageThatNotifyEmailHasBeenSentToTheUser() throws Throwable {
        endUserSteps.messageThatNotifyEmailHasBeenSentToTheUser();
    }

    @Then("^empty search result page is opened$")
    public void emptySearchResultPageIsOpened() throws Throwable {
        endUserSteps.emptySearchResultPageIsOpened();
    }

    @Then("^click on Continue Shopping button in the page$")
    public void clickOnContinueShoppingButtonInThePage() throws Throwable {
        endUserSteps.clickOnContinueShoppingButtonInThePage();
    }


    @And("^click on X buton to close pop-up$")
    public void clickOnXButonToClosePopUp() throws Throwable {
        endUserSteps.clickOnXButonToClosePopUp();

    }

    @And("^click on breadcrumb \"([^\"]*)\"$")
    public void clickOnBreadcrumb(String breadcrumb) throws Throwable {
        endUserSteps.clickOnBreadcrumb(breadcrumb);
    }

    @When("^hover to my account text link$")
    public void hoverToMyAccountTextLink() throws Throwable {
        endUserSteps.hoverToMyAccountTextLink();
    }

    @And("^my account pop-up is opened with options$")
    public void myAccountPopUpIsOpenedWithOptions() throws Throwable {
        endUserSteps.myAccountPopUpIsOpenedWithOptions();
    }

      @And("^click on \"([^\"]*)\" option$")
    public void clickOnOption(String option) throws Throwable {
        endUserSteps.clickOnOption(option);
    }


//
//    @Then("^page \"([^\"]*)\" is opened$")
//    public void pageMyAccIsOpened(String page) throws Throwable {
//        endUserSteps.pageMyAccIsOpened(page);
//    }
}
