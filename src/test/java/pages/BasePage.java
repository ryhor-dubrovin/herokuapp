package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}