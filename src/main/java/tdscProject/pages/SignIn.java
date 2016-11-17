package tdscProject.pages;

import com.beust.jcommander.internal.Lists;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tdscProject.steps.PATH;

import java.util.List;

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

    public void populateFieldWith(String emailaddress) {
        $(PATH.FWP_EMAIL).sendKeys(emailaddress);

    }

    public void messageThatNotifyEmailHasBeenSentToTheUser() {
        $(PATH.FWP_RESET).click();

    }

    public String messageText() {
        return  $(PATH.FWP_TEXT_EL).getText();
    }

    public String alertEmailAddressMess() {
        return $(".//*[@id='email.errors']").getText();
    }

    public void clickOnXButonToClosePopUp() {
        $(PATH.SIGN_FORG_X_CLOSE).click();
        waitABit(1000);


    }

    public void clickOnBreadcrumb(int breadcumb_element) {
        List<WebElement> br = Lists.newArrayList(getDriver().findElements(By.xpath(PATH.FT_LINKS_ARRAY)));
        br.get(breadcumb_element).click();

    }
}
