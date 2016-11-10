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


    @Step
    public void goToWebsite() {
        cartPage.goToWebsite();
    }
    @Step
    public void pageIsOpened(String arg0) {
        switch (arg0) {
//            case "powergrill": header.pageAboutUsIsOpened(arg0);
//                break;
//            case "anglegrinder": header.pageAngleGrindersIsOpened(arg0);
//                break;
            case "home": Assert.assertEquals("","");

        }

    }
    @Step
    public void clickOnMenu(String arg0) {
        header.clickOnAboutUsMenu(arg0);
//        switch (arg0){
//            case "powergrill": header.clickOnAboutUsMenu();
//                break;
//            case "anglegrinder": header.clicOnAngleGrindersIsOpened();
//                break;
//        }
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

    public void goToHybrisHmc() {
        hbr.goToHybrisHmc();
    }

    public void logInWithUserPass(String user, String pass) throws Throwable {
        hbr.logInWithUserPass(user,pass);
    }
}