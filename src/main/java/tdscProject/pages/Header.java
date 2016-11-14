package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 25.10.16.
 */
@DefaultUrl("https://tdsc-staging.zaelab.com")
public class Header extends PageObject {


    public void clickOnProductMenu() {
        $(PATH.PRODUCTS_MENU).click();
    }

    public void clickOnAboutUsMenu() {
        $(PATH.ABOUT_TDSK).click();
    }

    public void clickonPracticeMenu() {
        $(PATH.PRAC_MANGMNT).click();
    }

    public void clickOnLogoHeader() {
        $(PATH.LOGO_TDSC).click();
    }

    public void clickOnSignIn() {
        $(PATH.SIGN_IN).click();
    }

    public void signInUsingPass(String arg0, String arg1) {
        $(PATH.SIGN_EMAIL).sendKeys(arg0);
        $(PATH.SIGN_PASS).sendKeys(arg1);
        $(PATH.SIGN_BUTTON).click();
    }

    public String totalSavingTitle() {
        return $("//*[@class='title']").getText();
    }


    public boolean myAccountProfileIsShown() {

        return $("(html/body/main/header/div[1]//li[2])[1]").isDisplayed();

    }

}