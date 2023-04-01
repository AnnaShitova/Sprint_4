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
        assertEquals(expected, actual;
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
}
