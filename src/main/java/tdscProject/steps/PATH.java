package tdscProject.steps;

/**
 * Created by ttruong on 25.10.16.
 */
public interface PATH {


//  Header  ----------------------------
    String HEADER_LINKS="html/body/main/header/nav//span/a";
    String MAGNIF_GlASS = "";
    String SIGN_IN = ".liOffcanvas.signin>a";
    String SEARCH_FIELD = "";
    String CART_BUCKET_ICON = "";
    String LOGO_TDSC = "(//*[@class='logo'])[2]";
    String PRODUCTS_MENU = "(html/body/main/header//span//a)[1]";
    String SALES_MENU = "";
    String ABOUT_TDSK = "(html/body/main/header//span//a)[2]";
    String PRAC_MANGMNT = "(html/body/main/header//span//a)[3]";
    String PURCH = "";
    String RECRUITING = "";
    String CONTACT_US = "html/body/main/header/nav[3]/div/ul[2]/li[1]/span/a";
//-----------------------

    String SEARCH_BAR= ".//*[@id='']";
    String[] ARRAY = {
            "html/body/main/header/nav[3]/div/ul[2]/li[1]/span/a",
            "html/body/main/header/nav[3]/div/ul[2]/li[2]/span/a"};

//    FOOTER ------------------------------

    String FT_LINKS_ARRAY = "html/body/main/footer/div//a";
    


//----------HOMEPAGE

    String HMP_CAR_LEFT = "";
    String HMP_CAR_RGHT = "";
    String HMP_PROD_IMAGE = "";
    String HMP_PROD_NAME = "";
    String HMP_BANNER_BUTTON = "";
    String HMP_BAN_CAR_LEFT = "";
    String HMP_BAN_CAR_RIGHT = "";

// SEARCH

    String SEARCH_PAGINATION_TOP = "";
    String SEARCH_PAGINATION_BOT = "";


//   HYBRIS -------------------------

    String HBR_USER = "((.//*[@id='loginForm']/div/table//table//tr//div/table//td//table//td[3])[1]";
    String HBR_PASS = "(.//input[@class='login z-textbox'])[1]";
    String HBR_LOGIN = ".//*[@class='z-select']";
    String HBR_CATEGORY = "";
    String HBR_USER_GROUP = "";



//    -------SIGN IN-----------
    String SIGN_EMAIL = ".//*[@id='j_username']";
    String SIGN_PASS = ".//*[@id='j_password']";
    String SIGN_BUTTON = ".//*[@id='loginForm']/button";
    String SIGN_FORGOT = ".//*[@id='loginForm']/div[3]/a";

//---FORGOT PASSWORD---------
    String FWP_X = ".//*[@id='cboxClose']";
    String FWP_RESET = ".//*[@id='forgottenPwdForm']/div[1]/button";

}
