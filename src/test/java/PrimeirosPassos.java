import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrimeirosPassos {

        WebDriver driver;
        @Before
               public void preCondicao(){
            System.setProperty("webdriver.chrome.driver", "/home/rafaelsaraiva/Documentos/selenium/geckodriver/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            driver = new ChromeDriver(options);
            driver.get("https://2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            driver.manage().window().maximize();
        }

        @Test
                public void teste() {
            WebElement caixaDePesquisa = driver.findElement(By.id("identifierId"));
            caixaDePesquisa.clear();
            caixaDePesquisa.sendKeys("rafaelsaraiva1510@gmail.com");
            //System.out.println(driver.getTitle());
            //System.out.println(driver.getCurrentUrl());

        }
       // @After
         //       public void posCondicao(){
       //   driver.quit();
        //}

    }

