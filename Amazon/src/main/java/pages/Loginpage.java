package pages;

import base.CommonApI;

public class Loginpage extends CommonApI {

    public void clickOnSignInButton(){
     clickOnElementByXpath("//div[@id='nav-signin-tooltip']");
    }
    public void validataLogin(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "//input[@id='ap_email']");

    }
    public void validatePassword(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "/html//input[@id='ap_password']");
    }
    public void continueButton(){
        clickOnElementByXpath("//span[@id='continue']");
    }


}
