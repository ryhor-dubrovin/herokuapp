package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.TABLES_PAGE;

public class TablesPage extends BasePage {
    @FindBy(xpath = "//table[1]//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[1]")
    private WebElement firstName1stTbl;
    @FindBy(xpath = "//table[1]//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[2]")
    private WebElement lastName1stTbl;
    @FindBy(xpath = "//table[2]//td[text() = 'fbach@yahoo.com']/following-sibling::td[1]")
    private WebElement due2ndTbl;
    @FindBy(xpath = "//table[2]//td[text() = 'fbach@yahoo.com']/following-sibling::td[2]")
    private WebElement webSite2ndTbl;

    public TablesPage(WebDriver driver) {
        super(driver);
    }

    public void openTablesPage() {
        driver.get(TABLES_PAGE);
    }

    public String getFirstName1stTbl() {
        return firstName1stTbl.getText();
    }

    public String getLastName1stTbl() {
        return lastName1stTbl.getText();
    }

    public String getDue2ndTbl() {
        return due2ndTbl.getText();
    }

    public String getWebSite2ndTbl() {
        return webSite2ndTbl.getText();
    }

}
