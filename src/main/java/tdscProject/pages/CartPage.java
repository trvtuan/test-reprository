package tdscProject.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class CartPage extends PageObject {


    public void goToWebsite() {
        getDriver().navigate().to("http://google.com");
    }
}