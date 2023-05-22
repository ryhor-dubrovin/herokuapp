package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.InputPage;

import static constants.Urls.*;

public class InputTest extends BaseTest {

    @Test
    public void couldEnterValuesWithArrowsTest() {
        InputPage inputPage = new InputPage(driver);
        inputPage.openInputPage();

        for (int i = 0; i < 10; i++) {
            inputPage.fieldArrowUp();
        }
        Assert.assertEquals(inputPage.getFieldValue(), "10", "Incorrect field value after increased");

        for (int i = 0; i < 5; i++) {
            inputPage.fieldArrowDown();
        }
        Assert.assertEquals(inputPage.getFieldValue(), "5", "Incorrect field value after decreased");
    }
}
