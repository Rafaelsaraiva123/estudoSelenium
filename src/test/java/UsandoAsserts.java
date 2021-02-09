import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsandoAsserts {
    private static WebDriver driver;

    @BeforeClass
    public static void incializa(){
        System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("http://google.com");
    }

    @Test
    public void verificaSeTituloEstaCorreto(){
        String titulo = driver.getTitle();
        boolean tituloEstaCorreto = titulo.equals("Googli");
        Assert.assertFalse("Deu erro pq o titulo nao é igual", tituloEstaCorreto);
    }

    @AfterClass
    public static void finaliza(){
        driver.quit();
    }

}