package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends BaseTest {

    @Test
    public void testSpellCheck() {
        TyposPage typosPage = new TyposPage(driver);
        String text = typosPage
                .openTyposPage()
                .getFieldText();
        Assert.assertEquals(text, typosPage.getGoodText(), "Text has a typo");
    }
}
