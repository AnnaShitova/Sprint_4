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

    //Второй вопрос в "Вопросы о важном"
    private By secondQuestion = By.id("accordion__heading-1");
    //Второй ответ в "Вопросы о важном"
    private By secondAnswer = By.id("accordion__panel-1");

    //Третий вопрос в "Вопросы о важном"
    private By thirdQuestion = By.id("accordion__heading-2");
    //Третий ответ в "Вопросы о важном"
    private By thirdAnswer = By.id("accordion__panel-2");

    //Четвертый вопрос в "Вопросы о важном"
    private By fourthQuestion = By.id("accordion__heading-3");
    //Четвертый ответ в "Вопросы о важном"
    private By fourthAnswer = By.id("accordion__panel-3");

    //Пятый вопрос в "Вопросы о важном"
    private By fifthQuestion = By.id("accordion__heading-4");
    //Пятый ответ в "Вопросы о важном"
    private By fifthAnswer = By.id("accordion__panel-4");

    //Шестой вопрос в "Вопросы о важном"
    private By sixthQuestion = By.id("accordion__heading-5");
    //Шестой ответ в "Вопросы о важном"
    private By sixthAnswer = By.id("accordion__panel-5");

    //Седьмой вопрос в "Вопросы о важном"
    private By seventhQuestion = By.id("accordion__heading-6");
    //Седьмой ответ в "Вопросы о важном"
    private By seventhAnswer = By.id("accordion__panel-6");

    //Восьмой вопрос в "Вопросы о важном"
    private By eighthQuestion = By.id("accordion__heading-7");
    //Восьмой ответ в "Вопросы о важном"
    private By eighthAnswer = By.id("accordion__panel-7");

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
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getTextOfFirstAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(firstAnswer).getText();
    }

    public void clickSecondQuestion() {
        webDriver.findElement(secondQuestion).click();
    }

    public String getTextOfSecondAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(secondAnswer).getText();
    }

    public void clickThirdQuestion() {
        webDriver.findElement(thirdQuestion).click();
    }

    public String getTextOfThirdAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(thirdAnswer).getText();
    }

    public void clickFourthQuestion() {
        webDriver.findElement(fourthQuestion).click();
    }

    public String getTextOfFourthAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(fourthAnswer).getText();
    }

    public void clickFifthQuestion() {
        webDriver.findElement(fifthQuestion).click();
    }

    public String getTextOfFifthAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(fifthAnswer).getText();
    }

    public void clickSixthQuestion() {
        webDriver.findElement(sixthQuestion).click();
    }

    public String getTextOfSixthAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(sixthAnswer).getText();
    }

    public void clickSeventhQuestion() {
        webDriver.findElement(seventhQuestion).click();
    }

    public String getTextOfSeventhAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(seventhAnswer).getText();
    }

    public void clickEighthQuestion() {
        webDriver.findElement(eighthQuestion).click();
    }

    public String getTextOfEighthAnswer() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver.findElement(eighthAnswer).getText();
    }
}