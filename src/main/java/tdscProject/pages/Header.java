package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 25.10.16.
 */
@DefaultUrl("https://tdsc-staging.zaelab.com")
public class Header extends PageObject {


    public void pageAboutUsIsOpened(String arg0) {

    }

    public void clickOnAboutUsMenu(String arg0) {
        int d = PATH.array.length;

        for (int s=0;s<d;s++ ){
            $(PATH.array[s]).click();

            }

    }

    public void pageAngleGrindersIsOpened(String arg0) {

    }

    public void clicOnAngleGrindersIsOpened() {
        $("html/body/main/header/nav[3]/div/ul[2]/li[2]/span/a").click();
    }
}
