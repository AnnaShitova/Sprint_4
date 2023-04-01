package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPagePageObject {
    private final WebDriver webDriver;
    private By topOrderButton = By.className("Button_Button__ra12g");
    private By lowerOrderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By cookieButton = By.className("App_CookieButton__3cvqF");

    public MainPagePageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickTopOrderButton() {
        webDriver.findElement(topOrderButton).click();
    }

    public void clickLowerOrderButton() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollTo(0, 2000)");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.findElement(lowerOrderButton).click();
    }

    public void hideCookie() {
        webDriver.findElement(cookieButton).click();
    }
}
