package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by ttruong on 26.10.16.
 */
@DefaultUrl("http://www.cda.org")
public class Footer extends PageObject {

    public void clickOnTheLink() {
        $("//*[@id='dnn_ctr504_HtmlModule_lblContent']/div/ul[1]/li[1]/a").click();
    }

    public String pageHasHeader() {

       return  $(".//*[@id='dnn_ctr616_dnnTITLE5_titleLabel']").getText();
    }

    public String pageHasUrl() {

        return getDriver().getCurrentUrl();
    }
}
