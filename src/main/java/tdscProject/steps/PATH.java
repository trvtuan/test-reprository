package tdscProject.steps;

/**
 * Created by ttruong on 25.10.16.
 */
public interface PATH {


//  Header  ----------------------------

    String MAGNIF_GlASS = "";
    String SIGN_IN = "";
    String SEARCH_FIELD = "";
    String CART_BUCKET_ICON = "";
    String LOGO_TDSC = "";
    String PRODUCTS_MENU = "";
    String SALES_MENU = "";
    String ABOUT_TDSK = "";
    String PRAC_MANGMNT = "";
    String PURCH = "";
    String RECRUITING = "";
    String CONTACT_US = "html/body/main/header/nav[3]/div/ul[2]/li[1]/span/a";
//-----------------------

    String SEARCH_BAR= ".//*[@id='']";
    String[] array = {
            "html/body/main/header/nav[3]/div/ul[2]/li[1]/span/a",
            "html/body/main/header/nav[3]/div/ul[2]/li[2]/span/a"};

//    FOOTER ------------------------------





//   HYBRIS -------------------------

    String HBR_USER = ".//*[@id='Main_user']";
    String HBR_PASS = ".//*[@id='Main_password']";
    String HBR_LOGIN = "//*[@id='outerTD']/table/tbody/tr/td/div/table/tbody/tr[4]/td[2]/div";

}
