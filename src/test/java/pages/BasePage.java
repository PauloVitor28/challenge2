package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BasePage {
    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public WebElement selectHeaderOption(String s) {
        WebElement webElement = driver.findElement(By.xpath("//div[@class='facet__title'][contains(text(), '" + s + "')]"));

        return webElement;
    }

    public void selectOption(String text1, String text) {
       Select dropdown = new Select(driver.findElement(By.cssSelector(text1)));
       dropdown.selectByVisibleText(text);
    }


    protected void fluentWait(WebElement element, long timeOutInSeconds, long attemptEverymillis) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSeconds))
                .pollingEvery(Duration.ofMillis(attemptEverymillis))
                .ignoring(NoSuchElementException.class)
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}

