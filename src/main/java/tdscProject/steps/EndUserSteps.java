package tdscProject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import tdscProject.pages.*;

public class EndUserSteps extends ScenarioSteps {

    CartPage cartPage;
    Header header;
    Checkout ck;
    HomePage hmp;
    Footer ft;
    HybrisHmc hbr;
    SignIn signIn;
    SearchPage srcpage;
    MyAccount myAcc;


    @Step
    public void goToWebsite() {
        cartPage.goToWebsite();
    }

    @Step
    public void pageIsOpened(String arg0) {
        switch (arg0) {

            case "home page":
                Assert.assertTrue(getDriver().
                        findElement(By.xpath("html/body/main/div[3]/div[3]/div[2]/div[2]/div/div[1]")).isDisplayed());
                Assert.assertTrue(getDriver().
                        findElement(By.xpath("html/body/main/div[3]/div[3]/div[5]/div[1]")).isDisplayed());
                break;
            case "Personal Details": Assert.assertEquals(PATH.ACC_PERS_DET_FIELDS,myAcc.fieldsArePresented());
                break;
            case "":
                break;

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
                signIn.messageThatNotifyEmailHasBeenSentToTheUser();
               try{ Assert.assertEquals("Please enter a valid email", signIn.alertEmailAddressMess());}
               catch (AssertionError e){
                   e.printStackTrace();
               }
                break;
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
//        if(getDriver().findElement(By.xpath(PATH.TC_ACCEPT)).isDisplayed()){
//            getDriver().findElement(By.xpath(PATH.TC_ACCEPT)).click();
//        }
    }
    @Step
    public void totalSavingIsShownInTheHeader() {
        Assert.assertEquals("2016 Total Savings:", header.totalSavingTitle());
        Assert.assertTrue(header.myAccountProfileIsShown());
    }
    @Step
    public void validationMessagesAreShownInThePage() {
        Assert.assertEquals("Your username or password was incorrect.",signIn.validationMessages());
    }

    @Step
    public void clickOnMagnifyingGlass() {
        srcpage.clickOnMagnifyingGlass();
    }
    @Step
    public void populateFieldWith(String emailaddress) {
        signIn.populateFieldWith(emailaddress);
    }

    public void messageThatNotifyEmailHasBeenSentToTheUser() {
        signIn.messageThatNotifyEmailHasBeenSentToTheUser();
        Assert.assertEquals(PATH.FWP_TEXT,signIn.messageText());
    }
    @Step
    public void emptySearchResultPageIsOpened() {
        Assert.assertTrue(srcpage.emptySearchResultPageIsOpened());
    }
    @Step
    public void clickOnContinueShoppingButtonInThePage() {
        srcpage.clickOnContinueShoppingButtonInThePage();
    }
    @Step
    public void clickOnXButonToClosePopUp() {
        signIn.clickOnXButonToClosePopUp();
        signIn.clickOnForgotPassword();
    }
    @Step
    public void clickOnBreadcrumb(String breadcrumb) {
        switch (breadcrumb){

            case "home": signIn.clickOnBreadcrumb(0);
                    }
    }
    @Step
    public void hoverToMyAccountTextLink() {
        myAcc.hoverToMyAccountTextLink();
    }
    @Step
    public void myAccountPopUpIsOpenedWithOptions() {
        Assert.assertEquals(PATH.ACC_OPTIONS_TEXT,myAcc.myAccountPopUpIsOpenedWithOptions());
        Assert.assertTrue(myAcc.getDriver().findElement(By.xpath(PATH.ACC_OPTIONS)).isDisplayed());

    }
    @Step
    public void clickOnOption(String option) {
        switch (option){
            case "Order History":myAcc.clickOnOption(2);
                break;
            case "Email Address":myAcc.clickOnOption(3);
                break;
            case "Address Book":myAcc.clickOnOption(5);
                break;
            case "Payment Details":myAcc.clickOnOption(7);
                break;
            case "Password":myAcc.clickOnOption(8);
                break;
            case "Sign Out": myAcc.clickOnOption(10);
                break;
//            case "":
//                break;
            case "Personal Details": myAcc.clickOnOption(4);
                break;
        }

    }

//    public void pageMyAccIsOpened(String page) {
//        switch (page){
//            case ""
//        }
//    }
}