package testcases;

import org.testng.annotations.Test;
import pages.Search;

public class SearchTest extends Search {


    @Test(enabled = false)
    public void vaildateSearchButtonWorks() {
        searchFieldIsTypeAble();
        clickOnSearchButton();
        sleepFor(20);
    }
}