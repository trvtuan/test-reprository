package tdscProject.pages;

import net.serenitybdd.core.pages.PageObject;
import tdscProject.steps.PATH;

/**
 * Created by ttruong on 25.10.16.
 */
public class Header extends PageObject {


    public void pageAboutUsIsOpened(String arg0) {

    }

    public void clickOnAboutUsMenu() {
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
