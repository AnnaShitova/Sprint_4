package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FaqAreaPageObject {
    private final WebDriver webDriver;
    //Первый вопрос в "Вопросы о важном"
    private By firstQuestion = By.id("accordion__heading-0");
    //Первый ответ в "Вопросы о важном"
    private By firstAnswer = By.id("accordion__panel-0");

    //Первый вопрос в "Вопросы о важном"
    private By secondQuestion = By.id("accordion__heading-1");
    //Первый ответ в "Вопросы о важном"
    private By secondAnswer = By.id("accordion__panel-1");


    public FaqAreaPageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void scrollAndWait() {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void clickFirstQuestion() {
        webDriver.findElement(firstQuestion).click();
    }

    public String getTextOfFirstAnswer() {
        return webDriver.findElement(firstAnswer).getText();
    }

    public void clickSecondQuestion() {
        webDriver.findElement(secondQuestion).click();
    }

    public String getTextOfSecondAnswer() {
        return webDriver.findElement(secondAnswer).getText();
    }
}
