package ScooterTests;

import org.example.FaqAreaPageObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTest extends TestBase {
    @Test
    public void checkFirstQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickFirstQuestion();
        String actual = mainPage.getTextOfFirstAnswer();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkSecondQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickSecondQuestion();
        String actual = mainPage.getTextOfSecondAnswer();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkThirdQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickThirdQuestion();
        String actual = mainPage.getTextOfThirdAnswer();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkFourthQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickFourthQuestion();
        String actual = mainPage.getTextOfFourthAnswer();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkFifthQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickFifthQuestion();
        String actual = mainPage.getTextOfFifthAnswer();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkSixthQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickSixthQuestion();
        String actual = mainPage.getTextOfSixthAnswer();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkSeventhQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickSeventhQuestion();
        String actual = mainPage.getTextOfSeventhAnswer();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, actual);
    }

    @Test
    public void checkEighthQuestionAndAnswer() {
        FaqAreaPageObject mainPage = new FaqAreaPageObject(driver);
        mainPage.scrollAndWait();
        mainPage.clickEighthQuestion();
        String actual = mainPage.getTextOfEighthAnswer();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, actual);
    }
}
