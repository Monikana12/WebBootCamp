package pages;

import base.CommonApI;

public class Signout extends CommonApI {

    Homepage homepage =new Homepage();
    Loginpage loginpage =new Loginpage();

    public void validateSignout(){
        homepage.signIn();
        homepage.clickOnSearchBar();
        homepage.clickOnSearchButton();
        homepage.typeOnSearchBar("type on the search bar");
        loginpage.clickOnSignInButton();
        loginpage.validataLogin();
        loginpage.validatePassword();
        loginpage.continueButton();

        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }

}
