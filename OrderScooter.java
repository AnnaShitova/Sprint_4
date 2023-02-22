package ScooterTests;


import org.example.MainPagePageObject;
import org.example.OrderScooterPageObject;
import org.example.RentPageObject;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class OrderScooter extends TestBase{
    @Test
    public void orderScooterByTopButton(){
        MainPagePageObject mainPage = new MainPagePageObject(driver);
        mainPage.hideCookie();
        mainPage.clickTopOrderButton();

        OrderScooterPageObject orderPage = new OrderScooterPageObject(driver);
        orderPage.enterName("Анна");
        orderPage.enterSurName("Иванова");
        orderPage.enterAddress("улица Петрова 50");
        orderPage.chooseMetroStantion();
        orderPage.enterPhone("+71111111111");
        orderPage.clickNextButton();

        RentPageObject rentPage = new RentPageObject(driver);
        rentPage.chooseDate();
        rentPage.chooseDaysCount();
        rentPage.chooseBlackScooter();
        rentPage.enterCommentForDeliver("Аккуратно, пожалуйста");
        rentPage.clickOrderButton();
        rentPage.clickYesButton();
        assertTrue(rentPage.successModalExist());
    }
    @Test
    public void orderScooterByLowerButton(){
        MainPagePageObject mainPage = new MainPagePageObject(driver);
        mainPage.hideCookie();
        mainPage.clickLowerOrderButton();

        OrderScooterPageObject orderPage = new OrderScooterPageObject(driver);
        orderPage.enterName("Анна");
        orderPage.enterSurName("Иванова");
        orderPage.enterAddress("улица Петрова 50");
        orderPage.chooseMetroStantion();
        orderPage.enterPhone("+71111111111");
        orderPage.clickNextButton();

        RentPageObject rentPage = new RentPageObject(driver);
        rentPage.chooseDate();
        rentPage.chooseDaysCount();
        rentPage.chooseBlackScooter();
        rentPage.enterCommentForDeliver("Аккуратно, пожалуйста");
        rentPage.clickOrderButton();
        rentPage.clickYesButton();
        assertTrue(rentPage.successModalExist());
    }
}
