package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 14.11.16.
 */
public class SearchPage extends PageObject{
    public void clickOnMagnifyingGlass() {
        $(PATH.SRCH_MAG_GL_ICON).click();
    }

    public boolean emptySearchResultPageIsOpened() {
                return $(PATH.SRC_TEXT_NO_RESULTS).isDisplayed() &
                        $(PATH.SRC_EMP_SHOP_BUTTON).isDisplayed();

    }

    public void clickOnContinueShoppingButtonInThePage() {
        $(PATH.SRC_EMP_SHOP_BUTTON).click();
    }
}
