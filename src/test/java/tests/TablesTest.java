package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.Urls.TABLES_PAGE;

public class TablesTest extends BaseTest {

    @Test
    public void firstTableDataTest() {
        driver.get(TABLES_PAGE);
        String emailXpath = "//table[1]//td[text() = 'fbach@yahoo.com']";
        String firstNameXpath = emailXpath + "/preceding-sibling::td[1]";
        String lastNameXpath = emailXpath + "/preceding-sibling::td[2]";
        WebElement firstName = driver.findElement(By.xpath(firstNameXpath));
        WebElement lastName = driver.findElement(By.xpath(lastNameXpath));

        Assert.assertEquals(firstName.getText(), "Frank", "Wrong first name");
        Assert.assertEquals(lastName.getText(), "Bach", "Wrong last name");
    }

    @Test
    public void secondTableDataTest() {
        driver.get(TABLES_PAGE);
        String emailXpath = "//table[2]//td[text() = 'fbach@yahoo.com']";
        String dueXpath = emailXpath + "/following-sibling::td[1]";
        String webSiteXpath = emailXpath + "/following-sibling::td[2]";

        WebElement due = driver.findElement(By.xpath(dueXpath));
        WebElement webSite = driver.findElement(By.xpath(webSiteXpath));

        Assert.assertEquals(due.getText(), "$51.00", "Wrong due");
        Assert.assertEquals(webSite.getText(), "http://www.frank.com", "Wrong Web Site");
    }
}
