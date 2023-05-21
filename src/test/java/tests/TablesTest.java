package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;


public class TablesTest extends BaseTest {

    @Test
    public void firstTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.getFirstName1stTbl(), "Frank", "Wrong first name");
        Assert.assertEquals(tablesPage.getLastName1stTbl(), "Bach", "Wrong last name");
    }

    @Test
    public void secondTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.getDue2ndTbl(), "$51.00", "Wrong due");
        Assert.assertEquals(tablesPage.getWebSite2ndTbl(), "http://www.frank.com", "Wrong Web Site");
    }
}
