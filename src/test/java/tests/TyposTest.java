package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

public class TyposTest extends BaseTest {

    @Test(description = "Spell check")
    @Description("Spell check")
    public void spellCheckTest() {
        TyposPage typosPage = new TyposPage(driver);
        String text = typosPage
                .openTyposPage()
                .getFieldText();
        Assert.assertEquals(text, typosPage.getGoodText(), "Text has a typo");
    }
}
