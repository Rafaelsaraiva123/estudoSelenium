import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TesteCadastroFacebook {
    private static CadastroFacebookPage facebook;
    private static WebDriver driver;

    @BeforeClass
    public static void preCondicao(){
        System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("http://pt-br.facebook.com/r.php");
        facebook = new CadastroFacebookPage(driver);
        driver.manage().window().maximize();
    }
    @Test
    public void preencheNomeSobrenome(){
        facebook.preencheNome("Rafael");
        facebook.preencheSobrenome("Saraiva");
    }
}
