package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPageObject {
    private final WebDriver webDriver;

    public RentPageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By dateInput = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private By dateVariant = By.cssSelector("[aria-label='Choose понедельник, 27-е февраля 2023 г.']");
    private By countOfDaysInput = By.className("Dropdown-placeholder");
    private By countOfDays = By.className("Dropdown-option");
    private By blackColourScooter = By.cssSelector("input[id='black']");
    private By commentForDeliver = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private By orderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By yesButton = By.xpath(".//button[text()='Да']");
    private By successModal = By.className("Order_Modal__YZ-d3");


    public void chooseDate() {
        webDriver.findElement(dateInput).click();
        webDriver.findElement(dateVariant).click();
    }

    public void chooseDaysCount() {
        webDriver.findElement(countOfDaysInput).click();
        webDriver.findElement(countOfDays).click();
    }

    public void chooseBlackScooter() {
        webDriver.findElement(blackColourScooter).click();
    }

    public void enterCommentForDeliver(String comment) {
        webDriver.findElement(commentForDeliver).sendKeys(comment);
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickYesButton() {
        webDriver.findElement(yesButton).click();
    }

    public boolean successModalExist() {
        return webDriver.findElement(successModal).isEnabled();
    }

    public void fillRentForm(String comment){
        chooseDate();
        chooseDaysCount();
        chooseBlackScooter();
        enterCommentForDeliver(comment);
        clickOrderButton();
        clickYesButton();
    }
}
