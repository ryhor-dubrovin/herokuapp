package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {

    @Test(description = "1st checkbox unchecked by default")
    @Description("1st checkbox unchecked by default")
    public void isFirstCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .isFirstCheckboxSelected();
        Assert.assertFalse(isSelected, "First checkbox selected");
    }

    @Test(description = "1st checkbox checkable")
    @Description("1st checkbox checkable")
    public void isFirstCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .clickFirstCheckbox()
                .isFirstCheckboxSelected();
        Assert.assertTrue(isSelected, "First checkbox isn't selected");
    }

    @Test(description = "2nd checkbox selected by default")
    @Description("2nd checkbox selected by default")
    public void isSecondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .isSecondCheckboxSelected();
        Assert.assertTrue(isSelected, "Second checkbox isn't selected");
    }

    @Test(description = "2nd checkbox checkable")
    @Description("2nd checkbox checkable")
    public void isSecondCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .clickSecondCheckbox()
                .isSecondCheckboxSelected();
        Assert.assertFalse(isSelected, "Second checkbox is selected");
    }

}
