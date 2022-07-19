import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownPage {
    private final WebDriver driver;

    public DropdownPage(WebDriver driver) { this.driver = driver;
    }
    private final String url="https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    private final By dropdown = By.id("select-demo");
    public List<WebElement> getDay() {
        driver.get(url);
        driver.findElement(dropdown).click();
        return driver.findElements(By.xpath("(//options)[0]"));


    }

}
