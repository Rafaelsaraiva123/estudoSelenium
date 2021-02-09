import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TesteChromeHeadless {
    //WebDriver driver;

    WebDriver driver = DriverFactory.createDriver("chrome-headless");
    @Test
    public void chromeHeadless(){
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

}
