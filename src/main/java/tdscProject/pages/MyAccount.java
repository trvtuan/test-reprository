package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 17.11.16.
 */
public class MyAccount extends PageObject {


    public void hoverToMyAccountTextLink() {
        withAction().moveToElement($("//*[@class='welcome-user']")).perform();
    }

    public String myAccountPopUpIsOpenedWithOptions() {
                return $(PATH.ACC_OPTIONS).getText();
    }
}
