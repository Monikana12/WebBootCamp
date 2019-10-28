package pages;

import base.CommonApI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class Homepage extends CommonApI {

    public void clickOnSearchBar(){
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        TestLogger.log("search bar clicked");

    }
    public void typeOnSearchBar(String value){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']",value);
        TestLogger.log(value +"type on the search bar");
    }

    public void clickOnSearchButton(){
        clickOnElementByXpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']");
        TestLogger.log("search button clicked");

    }
    public void signIn(){
        clickOnElementByXpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
    }

    public List<WebElement> getAllElementFromList(){

        return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
    }


}
