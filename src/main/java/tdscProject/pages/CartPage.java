package tdscProject.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.cda.org")
public class CartPage extends PageObject {


    public void goToWebsite() {
        open();
    }
}