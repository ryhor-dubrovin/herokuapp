package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

import java.io.IOException;

import static constants.Urls.TYPOS_PAGE;

public class TyposTest extends BaseTest {

    @Test
    public void testSpellCheck() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertEquals(typosPage.getFieldText(), typosPage.GOOD_TEXT, "Text has a typo");
    }
}
