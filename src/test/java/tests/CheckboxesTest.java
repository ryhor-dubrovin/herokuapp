package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends BaseTest {

    @Test
    public void isFirstCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .isFirstCheckboxSelected();
        Assert.assertFalse(isSelected, "First checkbox selected");
    }

    @Test
    public void isFirstCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .clickFirstCheckbox()
                .isFirstCheckboxSelected();
        Assert.assertTrue(isSelected, "First checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .isSecondCheckboxSelected();
        Assert.assertTrue(isSelected, "Second checkbox isn't selected");
    }

    @Test
    public void isSecondCheckboxCheckableTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        boolean isSelected = checkboxesPage
                .openCheckboxesPage()
                .clickSecondCheckbox()
                .isSecondCheckboxSelected();
        Assert.assertFalse(isSelected, "Second checkbox is selected");
    }

}
