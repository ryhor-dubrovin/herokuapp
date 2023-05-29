package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Urls.FILE_UPLOAD_PAGE;

public class FileUploadPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement chooseFileButton;
    @FindBy(id = "file-submit")
    private WebElement uploadButton;
    @FindBy(id = "uploaded-files")
    private WebElement uploadFileName;
    private final String fileName = "Screenshot1.png";

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public String getUploadFileName() {
        return uploadFileName.getText();
    }

    public String getFileName() {
        return fileName;
    }

    public FileUploadPage openFileUploadPage() {
        driver.get(FILE_UPLOAD_PAGE);
        return this;
    }

    public FileUploadPage uploadImage() {
        chooseFileButton.sendKeys(System.getProperty("user.dir")
                .concat("/src/test/resources/files/Screenshot1.png"));
        return this;
    }

    public FileUploadPage clickUploadButton() {
        uploadButton.click();
        return this;
    }

}
