import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public BasePage(WebDriverWait wait) {
        this.wait = wait;
    }

    WebDriverWait wait;
}
