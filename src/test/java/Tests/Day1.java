package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by abarabash on 7/17/16.
 */
public class Day1 extends TestBase {

    @Test
    public void test001(){

        Assert.assertTrue(scr.mainScreen.searchBar.isDisplayed());

        scr.mainScreen.searchBar.click();

    }

}
