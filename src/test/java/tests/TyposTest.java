package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static constants.Urls.INPUTS_PAGE;
import static constants.Urls.TYPOS_PAGE;

public class TyposTest extends BaseTest{

    @Test
    public void testSpellCheck() {
        driver.get(TYPOS_PAGE);
        WebElement field = driver.findElement(By.xpath("//div[2]"));
        String pageText = field.getText();

        String goodText = "Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "Sometimes you'll see a typo, other times you won't.";

        Assert.assertEquals(pageText,goodText,"Text has a typo");
    }
}
