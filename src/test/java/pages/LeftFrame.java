package pages;

import Tests.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by abarabash on 7/20/16.
 */
public class LeftFrame extends TestBase{

    @AndroidFindBy(id = "nav_account_text")
    public MobileElement accountText;

    public LeftFrame(){
        System.out.println("Initializing LeftFrame elements");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}
