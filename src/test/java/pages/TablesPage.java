package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.TABLES_PAGE;

public class TablesPage extends BasePage {
    private String emailXpath = new String();
//    WebElement firstName;
//    WebElement lastName;
//    WebElement due;
//    WebElement webSite;
    public By FIRST_NAME;
    public By LAST_NAME;
    public By DUE;
    public By WEB_SITE;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void selectTable(int num) {
        if (num == 1) emailXpath = "//table[1]//td[text() = 'fbach@yahoo.com']";
        else if (num == 2) emailXpath = "//table[2]//td[text() = 'fbach@yahoo.com']";

//        @FindBy(xpath = emailXpath + "/preceding-sibling::td[1]")
//        firstName;

        FIRST_NAME = By.xpath(emailXpath + "/preceding-sibling::td[1]");
        LAST_NAME = By.xpath(emailXpath + "/preceding-sibling::td[2]");
        DUE = By.xpath(emailXpath + "/following-sibling::td[1]");
        WEB_SITE = By.xpath(emailXpath + "/following-sibling::td[2]");
    }

    public void openTablesPage() {
        driver.get(TABLES_PAGE);
    }

    public String getFirstName() {
        return driver.findElement(FIRST_NAME).getText();
    }

    public String getLastName() {
        return driver.findElement(LAST_NAME).getText();
    }

    public String getDue() {
        return driver.findElement(DUE).getText();
    }

    public String getWebSite() {
        return driver.findElement(WEB_SITE).getText();
    }

}
