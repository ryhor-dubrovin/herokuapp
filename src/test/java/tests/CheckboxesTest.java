package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.Urls.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void isFirstCheckboxUncheckedTest() {
        driver.get(CHECKBOXES_PAGE);
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));

        Assert.assertFalse(firstCheckbox.isSelected(), "First checkbox selected");
    }

    @Test
    public void isFirstCheckboxCheckableTest() {
        driver.get(CHECKBOXES_PAGE);
        WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));
        firstCheckbox.click();

        Assert.assertTrue(firstCheckbox.isSelected(), "First checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckedTest() {
        driver.get(CHECKBOXES_PAGE);
        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));

        Assert.assertTrue(secondCheckbox.isSelected(), "Second checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckableTest() {
        driver.get(CHECKBOXES_PAGE);
        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));
        secondCheckbox.click();

        Assert.assertFalse(secondCheckbox.isSelected(), "Second checkbox is selected");
    }

}
