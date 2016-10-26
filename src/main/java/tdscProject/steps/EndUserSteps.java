package tdscProject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tdscProject.pages.CartPage;
import tdscProject.pages.Checkout;
import tdscProject.pages.Header;
import tdscProject.pages.HomePage;

public class EndUserSteps extends ScenarioSteps {

    CartPage cartPage;
    Header header;
    Checkout ck;
    HomePage hmp;


    @Step
    public void goToWebsite() {
        cartPage.goToWebsite();
    }

    public void pageIsOpened(String arg0) {
//        switch (arg0){
//            case "powergrill": header.pageAboutUsIsOpened(arg0);
//                break;
//            case "anglegrinder": header.pageAngleGrindersIsOpened(arg0);
//                break;
//        }


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
}