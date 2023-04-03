package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderScooterPageObject {
    private final WebDriver webDriver;
    //Первый вопрос в "Вопросы о важном"
    private By nextButton = By.xpath(".//button[text()='Далее']");
    private By nameInput = By.cssSelector("input[placeholder='* Имя']");
    private By surNameInput = By.cssSelector("input[placeholder='* Фамилия']");
    private By addressInput = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By phoneInput = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private By stationInput = By.cssSelector("input[placeholder='* Станция метро']");
    private By stationVariant = By.className("select-search__options");

    public OrderScooterPageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterName(String name) {
        webDriver.findElement(nameInput).click();
        webDriver.findElement(nameInput).sendKeys(name);
    }

    public void enterSurName(String surname) {
        webDriver.findElement(surNameInput).click();
        webDriver.findElement(surNameInput).sendKeys(surname);
    }

    public void enterAddress(String address) {
        webDriver.findElement(addressInput).click();
        webDriver.findElement(addressInput).sendKeys(address);
    }

    public void enterPhone(String phone) {
        webDriver.findElement(phoneInput).click();
        webDriver.findElement(phoneInput).sendKeys(phone);
    }

    public void chooseMetroStantion() {
        webDriver.findElement(stationInput).click();
        webDriver.findElement(stationVariant).click();
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void fillOrderScooterForm(String username, String password, String address, String phone){
        enterName(username);
        enterSurName(password);
        enterAddress(address);
        chooseMetroStantion();
        enterPhone(phone);
        clickNextButton();
    }
}
