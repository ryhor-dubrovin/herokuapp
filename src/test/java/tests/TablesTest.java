package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;


public class TablesTest extends BaseTest {

    @Test
    public void firstTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.getFirstName1stTbl(), System.getProperty("firstName"), "Wrong first name");
        Assert.assertEquals(tablesPage.getLastName1stTbl(), System.getProperty("lastName"), "Wrong last name");
    }

    @Test
    public void secondTableDataTest() {
        TablesPage tablesPage = new TablesPage(driver);
        tablesPage.openTablesPage();
        Assert.assertEquals(tablesPage.getDue2ndTbl(), System.getProperty("due"), "Wrong due");
        Assert.assertEquals(tablesPage.getWebSite2ndTbl(), System.getProperty("webSite"), "Wrong Web Site");
    }
}
