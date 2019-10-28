package testcases;

import base.CommonApI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest extends CommonApI {

    @Test(enabled = false)
    public void testAllDropdown(){

       List<WebElement> elementList = getAllElementFromList("//*[contains(@value,'search-alias')]");
              System.out.println(elementList.size());

          for (int i = 0; i < elementList.size(); i++) {
                  System.out.println(elementList.get(i).getText());
    }         }


}
