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

    String SRCH_PAG_TOP = "";
    String SRCH_PAG_BOT = "";
    String SRCH_MAG_GL_ICON = "//*[@name='search_form_SearchBox']//button";


//   HYBRIS -------------------------

    String HBR_USER = ".//*[@id='Main_user']";
    String HBR_PASS = ".//*[@id='Main_password']";
    String HBR_LOGIN = ".//*[@id='Main_label']";
    String HBR_CATEGORY = "";
    String HBR_USER_GROUP = "";



//    -------SIGN IN-----------
    String SIGN_EMAIL = ".//*[@id='j_username']";
    String SIGN_PASS = ".//*[@id='j_password']";
    String SIGN_BUTTON = ".//*[@id='loginForm']/button";
    String SIGN_FORGOT = ".//*[@id='loginForm']/div[3]/a";
    String SIGN_FORG_X_CLOSE = ".//*[@id='cboxClose']";
    String SIGN_BREADCRUMB = "html/body/main/div[2]/div/ol/li";
//    ---------T&C-----------
    String TC_ACCEPT =".//*[@id='decisionAccept']";
    String TC_DECLINE=".//*[@id='decisionDecline']";
    String TC_X_CLOSE = ".//*[@id='cboxClose']";

//---FORGOT PASSWORD---------
    String FWP_X = ".//*[@id='cboxClose']";
    String FWP_RESET = ".//*[@id='forgottenPwdForm']/div[1]/button";
    String FWP_EMAIL = ".//*[@id='forgottenPwd.email']";
    String FWP_TEXT_EL=".//*[@id='validEmail']";
    String FWP_TEXT = "Password reset instructions have been sent to your e-mail address. Please contact customer support if you require additional assistance.";
//---------SEARHC_PAGE------------------------------

    String SRC_EMP_SHOP_BUTTON = "html/body/main/div[4]/div[2]/a";
    String SRC_TEXT_NO_RESULTS="html/body/main/div[4]/div[3]/div/div/h2";

//    ---------MY_ACCOUNT-----------------------
    String ACC_OPTIONS= "//*[@class='account-menu']";
    String ACC_OPTIONS_TEXT= "My Account\n" +
            "Quotes\n" +
            "Order History\n" +
            "Email Address\n" +
            "Personal Details\n" +
            "Address Book\n" +
            "Payment Details\n" +
            "Password\n" +
            "Replenishment Orders\n" +
            "Saved Carts\n" +
            "Sign Out";
    String ACC_PERS_DET = ".//*[@id='updateProfileForm']//div//label";
    String ACC_PERS_DET_FIELDS = "";

}
