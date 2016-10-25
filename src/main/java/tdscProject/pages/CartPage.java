package tdscProject.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://tdsc-staging.zaelab.com/")
public class CartPage extends PageObject {


    public void goToWebsite() {
        open();
    }
}