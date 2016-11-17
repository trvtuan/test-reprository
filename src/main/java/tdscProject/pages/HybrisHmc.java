package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 27.10.16.
 */
@DefaultUrl("https://zaelab:baleaz@tdsc-staging.zaelab.com/hmc/hybris")
public class HybrisHmc extends PageObject{
    public void goToHybrisHmc() {
        open();
        for (String handle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(handle);
        }
    }

    public void logInWithUserPass(String user, String pass) throws Throwable {
        $(PATH.HBR_USER).sendKeys(user);

        $(PATH.HBR_PASS).clear();
        $(PATH.HBR_PASS).sendKeys(pass);
        $(PATH.HBR_LOGIN).click();
//        $(PATH.HBR_LOGIN).click();
    }
}
