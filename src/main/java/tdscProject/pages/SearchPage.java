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
}
