package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;

import static constants.Urls.TABLES_PAGE;

public class TablesTest extends BaseTest {

    @Test
    public void firstTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        tablesPage.selectTable(1);
        Assert.assertEquals(tablesPage.getFirstName(), "Frank", "Wrong first name");
        Assert.assertEquals(tablesPage.getLastName(), "Bach", "Wrong last name");
    }

    @Test
    public void secondTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        tablesPage.selectTable(2);
        Assert.assertEquals(tablesPage.getDue(), "$51.00", "Wrong due");
        Assert.assertEquals(tablesPage.getWebSite(), "http://www.frank.com", "Wrong Web Site");
    }
}
