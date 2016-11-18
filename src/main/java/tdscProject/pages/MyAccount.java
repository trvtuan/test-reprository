package tdscProject.pages;

import com.beust.jcommander.internal.Lists;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tdscProject.steps.PATH;

import java.util.List;

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

    public void clickOnOption(int option) {
        List<WebElement> op = Lists.newArrayList(getDriver().findElements(By.xpath(PATH.ACC_OPTIONS)));
        op.get(option).click();
    }
}
