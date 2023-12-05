import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AOSTabletTest {

    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {

        System.out.println("*** set up ***");
        System.setProperty("webdriver.chrome.driver", "./chromedriver/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    // To-Do
    // Make downloading the ChromeDriver dynamic

    @Test
    public void SearchTablets() throws InterruptedException {
        String info;

        webDriver.get("https://advantageonlineshopping.com/#/");
        Thread.sleep(5000);

        WebElement speakers = webDriver.findElement(By.id("speakersImg"));

        speakers.click();
        Thread.sleep(5000);
    }


    @Test
    public void TestSpeakerLink() throws InterruptedException {
        System.out.println("*** test ***");
        webDriver.get("https://advantageonlineshopping.com/#/");
        boolean expectedFieldsExist;

        Thread.sleep(5000);

        try {
            WebElement speakers = webDriver.findElement(By.id("speakersImg"));
            expectedFieldsExist = true;
            speakers.click();
            Thread.sleep(5000);

        } catch (NoSuchElementException e) {
            expectedFieldsExist = false;
        }
        assertTrue(expectedFieldsExist);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("*** tear down ***");
        webDriver.quit();
    }

}
