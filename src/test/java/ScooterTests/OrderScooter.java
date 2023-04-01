package ScooterTests;


import org.example.MainPagePageObject;
import org.example.OrderScooterPageObject;
import org.example.RentPageObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderScooter extends TestBase {
    @Test
    public void orderScooterByTopButton() {
        MainPagePageObject mainPage = new MainPagePageObject(driver);
        mainPage.hideCookie();
        mainPage.clickTopOrderButton();

        OrderScooterPageObject orderPage = new OrderScooterPageObject(driver);
        orderPage.fillOrderScooterForm("Анна", "Иванова", "улица Петрова 50", "+71111111111");

        RentPageObject rentPage = new RentPageObject(driver);
        rentPage.fillRentForm("Аккуратно, пожалуйста");
        assertTrue(rentPage.successModalExist());
    }

    @Test
    public void orderScooterByLowerButton() {
        MainPagePageObject mainPage = new MainPagePageObject(driver);
        mainPage.hideCookie();
        mainPage.clickLowerOrderButton();

        OrderScooterPageObject orderPage = new OrderScooterPageObject(driver);
        orderPage.fillOrderScooterForm("Анна", "Иванова", "улица Петрова 50", "+71111111111");

        RentPageObject rentPage = new RentPageObject(driver);
        rentPage.fillRentForm("Аккуратно, пожалуйста");
        assertTrue(rentPage.successModalExist());
    }
}
