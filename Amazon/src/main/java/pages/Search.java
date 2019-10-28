package pages;

import base.CommonApI;
import org.testng.Assert;

public class Search extends CommonApI {

    public void clickOnSearchButton() {
        clickOnElementByXpath("//input[@type='submit' and @value='Go']");
    }

    public void searchFieldIsTypeAble(){
        Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"), true);
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "Accounting Book");


    }

}
