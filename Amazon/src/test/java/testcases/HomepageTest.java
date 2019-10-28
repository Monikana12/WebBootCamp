package testcases;

import base.CommonApI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;

public class HomepageTest extends CommonApI {
    Homepage homepage;

    @BeforeMethod

    public void setHomepage(){
        homepage= PageFactory.initElements(driver,Homepage.class);
    }
    @Test
    public void validateSignIn(){
        homepage.signIn();
    }

    @Test
    public void testSearchbar(){
      homepage.clickOnSearchBar();
      homepage.typeOnSearchBar("type on the search bar");
    }

    @Test
    public void testSearchbutton(){
        homepage.clickOnSearchButton();

    }

}
