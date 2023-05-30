package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTest {
    @Test(description = "Select option one")
    @Description("Select option one")
    public void selectOptionOneTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        Assert.assertEquals(dropdownPage.selectOptionOne(), dropdownPage.getOptionOneText(), "Option 1 not selected");
    }

    @Test(description = "Select option two")
    @Description("Select option two")
    public void selectOptionTwoTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        Assert.assertEquals(dropdownPage.selectOptionTwo(), dropdownPage.getOptionTwoText(), "Option 2 not selected");
    }
}
