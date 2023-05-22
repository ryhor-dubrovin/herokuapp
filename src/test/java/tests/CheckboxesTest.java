package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import tests.BaseTest;

import static constants.Urls.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void isFirstCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxSelected(), "First checkbox selected");
    }

    @Test
    public void isFirstCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondCheckbox();
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox is selected");
    }

}
