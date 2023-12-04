import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aostest {

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
    public void demoFormTest() {
        System.out.println("*** test ***");
        webDriver.get("https://advantageonlineshopping.com/#/");
        boolean expectedFieldsExist;
        try {
            webDriver.findElement(By.name("Speakers"));
            expectedFieldsExist = true;
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
