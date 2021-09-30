package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class NsePage {

    protected WebDriver driver;

    public NsePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement marketData = driver.findElement(By.linkText("Market Data"));
    private WebElement equityMarket = driver.findElement(By.linkText("Equity & SME Market"));

    private WebElement nseContainer() {
        return driver.findElement(By.className("container-fluid"));
    }

    public boolean isContainerPresent() {
        return nseContainer().isDisplayed();
    }

    public void hoverOnElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(marketData).perform();
    }

    public void clickOnItem() {
        if (equityMarket.isDisplayed()) {
            equityMarket.click();
        }
    }
}
