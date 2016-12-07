package tdscProject.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://zaelab:baleaz@tdsc-staging.zaelab.com/?site=tdsc")
public class CartPage extends PageObject {

    public void goToWebsite() {
        open();

    }
}