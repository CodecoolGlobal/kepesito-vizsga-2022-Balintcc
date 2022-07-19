import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablePage {
    WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }
    public final String url ="https://demo.seleniumeasy.com/table-data-download-demo.html";
    public void navigate() {
        driver.navigate().to(url);
    }
    private final By entryRows = By.className("display nowrap dataTable no-footer");
    public List<WebElement> entries(){
        return driver.findElements(entryRows);
    }



}
