package testcases;

import org.testng.annotations.Test;
import pages.Homepage;
import pages.Loginpage;

public class LoginpageTest extends Loginpage {

    Homepage homepage =new Homepage();

    @Test
    public void testLogIn(){
        homepage.signIn();
        validataLogin();
        clickOnSignInButton();
        validatePassword();
        continueButton();
    }

}
