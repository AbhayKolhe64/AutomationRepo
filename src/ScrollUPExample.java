import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPExample {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users\\akolh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.manage().window().maximize();

        JavascriptExecutor Ja = (JavascriptExecutor) driver;
        Ja.executeScript( script:"window.scrollBy(0,700)");
        Thread.sleep( millis: 1000);

        Ja.executeScript( script: "window.scrollBy(0,-700");
        Thread.sleep( millis: 1000);

        driver.close();

    }
}
