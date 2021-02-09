import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static WebDriver driver;

    private static final String DRIVER_CHROME = "chrome";
    private static final String DRIVER_FIREFOX = "firefox";
    private static final String DRIVER_IE = "ie";
    private static final String HEADLESS_CHROME = "chrome-headless";

    public static WebDriver createDriver(String browserName){
        if (browserName.equals(DRIVER_CHROME)){
        System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        } else if (browserName.equals(DRIVER_FIREFOX)){
            System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/geckodriver");
            driver = new FirefoxDriver();
        } else if (browserName.equals(DRIVER_IE)){
            System.setProperty("webdriver.ie.driver", "/home/rafaelsaravia/documento");
            driver = new InternetExplorerDriver();
        } else if (browserName.equals(HEADLESS_CHROME)){
            System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
