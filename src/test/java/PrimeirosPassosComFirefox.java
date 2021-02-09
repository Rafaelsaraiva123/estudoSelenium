import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeirosPassosComFirefox {
    WebDriver driver;

    @Before
    public void preCondicao(){
        System.setProperty("webdriver.gecko.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void teste(){
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @After
    public void posCondicao(){
        driver.quit();
    }
}
