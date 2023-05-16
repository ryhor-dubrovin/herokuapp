package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.Urls.*;

public class InputTest extends BaseTest {

    @Test
    public void couldEnterValuesWithArrowsTest() {
        driver.get(INPUTS_PAGE);
        WebElement field = driver.findElement(By.tagName("input"));

        for (int i = 0; i < 10; i++) {
            field.sendKeys(Keys.ARROW_UP);
        }
        String fieldValue = field.getAttribute("value"); // ??
        Assert.assertEquals(fieldValue, "10", "Incorrect field value after increased");

        for (int i = 0; i < 5; i++) {
            field.sendKeys(Keys.ARROW_DOWN);
        }
        fieldValue = field.getAttribute("value"); // ??
        Assert.assertEquals(fieldValue, "5", "Incorrect field value after decreased");
    }
}
