import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CadastroFacebookTest {
    WebDriver driver;

    @Before
    public void antes(){
        System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("http://pt-br.facebook.com/r.php");
        driver.manage().window().maximize();
    }
    @Test
    public void cadastroFacebookComSucesso() throws InterruptedException{
        driver.findElement(By.name("firstname")).sendKeys("Rafael");
        driver.findElement(By.name("lastname")).sendKeys("Saraiva");
        driver.findElement(By.name("reg_email__")).sendKeys("rafaelsaraiva1510@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rafaelsaraiva1510@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("teste");
        WebElement comboDia = driver.findElement(By.id("day"));
        Select select = new Select(comboDia);
        select.selectByVisibleText("29");

        WebElement comboMes = driver.findElement(By.id("month"));
        select = new Select(comboMes);
        select.selectByVisibleText("Out");

        WebElement comboAno = driver.findElement(By.id("year"));
        select = new Select(comboAno);
        select.selectByVisibleText("1996");
        //driver.findElement(By.id("input#u_0_7.8esa")).click();
        driver.findElement(By.name("websubmit")).click();
    }
    @After
    public void depois(){
        driver.quit();
    }
}
