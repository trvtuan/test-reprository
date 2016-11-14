package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 11.11.16.
 */
public class SignIn extends PageObject{


    public void clickOnLoginSignIn() {

        $(PATH.SIGN_BUTTON).click();
    }

    public String validationMessages() {
        String value = $("//div[@class='global-alerts']").getText();
        return value.substring(value.indexOf("\n")+1);
    }

    public String signInPageHasTitle() {
        return  $("//div[@class='login-page__headline']").getText();
    }

    public boolean signInPageHasSuchElements() {
        return $(".//*[@id='loginForm']/div[1]/label").isDisplayed() &
       $(".//*[@id='loginForm']/div[2]/label").isDisplayed() &
        $(".//*[@id='loginForm']/button").isPresent() & $(".//*[@id='loginForm']/div[3]/a").isPresent();
    }

    public void clickOnForgotPassword() {
        $(PATH.SIGN_FORGOT).click();
    }



    public String forgotPopupHasTitle() {
        return $(".//*[@id='cboxTitle']/div/span").getText();
    }

    public boolean forgotPassPopupElements() {
        return $(PATH.FWP_X).isDisplayed() & $(PATH.FWP_RESET).isDisplayed();
    }
}
