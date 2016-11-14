package tdscProject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import tdscProject.pages.*;

public class EndUserSteps extends ScenarioSteps {

    CartPage cartPage;
    Header header;
    Checkout ck;
    HomePage hmp;
    Footer ft;
    HybrisHmc hbr;
    SignIn signIn;


    @Step
    public void goToWebsite() {
        cartPage.goToWebsite();
    }

    @Step
    public void pageIsOpened(String arg0) {
        switch (arg0) {

            case "home page":
                Assert.assertEquals("", "");

        }

    }

    @Step
    public void clickOnMenu(String arg0) {
        switch (arg0) {
            case "Products":
                header.clickOnProductMenu();
                break;
            case "About TDSC":
                header.clickOnAboutUsMenu();
                break;
            case "Practice Management":
                header.clickonPracticeMenu();
                break;
            case "logo":
                header.clickOnLogoHeader();
                break;
            case "Sign In":
                header.clickOnSignIn();
                break;
            case "Login":
                Assert.assertEquals("Returning Customer",signIn.signInPageHasTitle());
                Assert.assertTrue(signIn.signInPageHasSuchElements());
                signIn.clickOnLoginSignIn();
                break;
            case "forgot password":
                signIn.clickOnForgotPassword();
                Assert.assertEquals("Reset Password",signIn.forgotPopupHasTitle());
                Assert.assertTrue(signIn.forgotPassPopupElements());
        }
    }

    @Step
    public void clickOntheLink(String arg, int arg1) {

//        switch (arg){
//            case "About CDA":
        ft.clickOnTheLink(arg1);
//                break;
//
//        }
    }

    @Step
    public void pageIsOpenedWithUrl(String arg1, String arg2) {
        Assert.assertEquals(arg1, ft.pageHasHeader());
        Assert.assertEquals(arg2, ft.pageHasUrl());
    }

    @Step
    public void goToHybrisHmc() {
        hbr.goToHybrisHmc();
    }

    @Step
    public void logInWithUserPass(String user, String pass) throws Throwable {
        hbr.logInWithUserPass(user, pass);
    }
    @Step
    public void signInUsingPass(String arg0, String arg1) {
        header.signInUsingPass(arg0, arg1);
    }
    @Step
    public void totalSavingIsShownInTheHeader() {
        Assert.assertEquals("2016 Total Savings", header.totalSavingTitle());
        Assert.assertTrue(header.myAccountProfileIsShown());
    }

    public void validationMessagesAreShownInThePage() {
        Assert.assertEquals("Your username or password was incorrect.",signIn.validationMessages());
    }

    public void clickOnMaginfyingGlass() {

    }
}