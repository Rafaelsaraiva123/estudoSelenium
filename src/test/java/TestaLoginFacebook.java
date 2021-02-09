import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestaLoginFacebook {
    private CadastroFacebookPage facebook;
    private WebDriver driver;

    @Before
    public void preCondicao(){
        System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("http://facebook.com.br");
        facebook = new CadastroFacebookPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void deveLogarComSucesso(){
        //passe usuário e senha
        facebook.logarComo("rafaelsaraiva1510@gmail.com", "Rafael2014");
    }
    public void naoDeveLogarSemSenha(){
        //deixe a senha em branco
        facebook.logarComo("rafaelsaraiva1510@gmail.com", "");
    }
    public void naoDeveLogarComSenhaErrada(){
        //passe a senha errada
        facebook.logarComo("rafaelsaraiva1510@gmail.com", "afsdgsd");
    }

    @After
    public void posCondicao(){
        driver.quit();
    }

}
