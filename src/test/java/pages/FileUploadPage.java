package pages;

import org.openqa.selenium.WebDriver;

import static constants.Urls.FILE_UPLOAD_PAGE;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(FILE_UPLOAD_PAGE);
    }
}
