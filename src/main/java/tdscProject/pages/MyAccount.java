package tdscProject.pages;

import com.beust.jcommander.internal.Lists;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import tdscProject.steps.PATH;

import java.util.List;

/**
 * Created by ttruong on 17.11.16.
 */
public class MyAccount extends PageObject {


    public void hoverToMyAccountTextLink() {
        withAction().moveToElement($("//*[@class='welcome-user']")).perform();
        waitABit(1000);
    }

    public String myAccountPopUpIsOpenedWithOptions() {
        return $(PATH.ACC_OPTIONS).getText();
    }

    public void clickOnOption(int option) {
        List<WebElement> op = Lists.newArrayList(getDriver().findElements(By.xpath("//li[@class='yCmsComponent']//a")));
        op.get(option).click();
//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("arguments[3].click();", op);

    }

    public boolean fieldsArePresented() {
        return $(PATH.ACC_PERS_CA).isDisplayed() &
                $(PATH.ACC_PERS_CDA).isDisplayed() &
                $(PATH.ACC_PERS_PERSON).isDisplayed() &
                $(PATH.ACC_PERS_PHONE).isDisplayed() &
                $(PATH.ACC_PERS_FIRST).isDisplayed() &
                $(PATH.ACC_PERS_LAST).isDisplayed() &
                $(PATH.ACC_PERS_TITLE).isDisplayed() &
                $(PATH.ACC_PERS_DEA).isDisplayed() &
                $(PATH.ACC_PERS_CANCEL).isDisplayed() &
                $(PATH.ACC_PERS_UPDATE).isDisplayed();
    }

    public void emptyDEAFieldAndClickOnUpdate() {
        $("//*[@id='profile.deaLicenseNumber']").clear();
        $(PATH.ACC_PERS_UPDATE).click();
    }

    public String validationMessagesForTheRequiredFieldsAreShown() {
        return $(".//*[@id='deaLicenseNumber.errors']").getText();
    }

    public void updateThePersonalDetails() {
        String phone = $(".//*[@id='profile.primaryPhone']").getValue();
        String dea = $("//*[@id='profile.deaLicenseNumber']").getValue();
        if (dea != null) {
//            $(".//*[@id='profile.primaryPhone']").sendKeys("1111");
            $("//*[@id='profile.deaLicenseNumber']").sendKeys("1111");
            $(PATH.ACC_PERS_UPDATE).click();
        } else {
            $(PATH.ACC_PERS_UPDATE).click();
        }
    }

    public void addNewAddress() {
        $(".//*[@id='address.line1']").sendKeys("test address");
        $(".//*[@id='address.line2']").sendKeys("test address optional");
        $(".//*[@id='address.townCity']").sendKeys("Westport");
        $(".//*[@id='address.postcode']").sendKeys("06880");
        $(".//*[@id='address.region']").click();
        Select state = new Select(getDriver().findElement(By.xpath(".//*[@id='address.region']")));
        state.selectByValue("US-CT");
        $(PATH.ACC_ADDRESS_UPDATE).click();

    }

    public boolean newAddressIsAddedIntoAddressBook() {

        Dimension address_size = getDriver().findElement(By.xpath("//*[@class='account-cards card-select']")).getSize();
        return (Serenity.getCurrentSession().get("1") != address_size);
//                return true;
//            }else return false;

    }
}
