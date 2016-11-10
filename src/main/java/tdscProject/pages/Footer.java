package tdscProject.pages;

import com.beust.jcommander.internal.Lists;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tdscProject.steps.PATH;

import java.util.List;

/**
 * Created by ttruong on 26.10.16.
 */
@DefaultUrl("http://www.cda.org")
public class Footer extends PageObject {

    public void clickOnTheLink(int arg1) {

        List<WebElement> list= Lists.newArrayList(getDriver().findElements(By.xpath(PATH.FT_LINKS_ARRAY)));

        list.get(arg1).click();
//        for (int j=0; j<list.size(); j++){
//            List<WebElement> list2= Lists.newArrayList(getDriver().findElements(By.xpath(PATH.FT_LINKS_ARRAY)));
//            list2.get(j).click();
//            System.out.print(pageHasHeader());
//            System.out.print(pageHasUrl());

//        }


    }

    public String pageHasHeader() {

       return  getDriver().getTitle();
//               $("(//*[@class='dnntitle']/span)[1]").getText();
    }

    public String pageHasUrl() {

        return getDriver().getCurrentUrl();
    }
}
