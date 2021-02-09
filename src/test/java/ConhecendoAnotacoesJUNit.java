import org.junit.*;

public class ConhecendoAnotacoesJUNit {
    @BeforeClass
    public static void antesDaClasse(){
        System.out.println("Esse é o BeforeClass");

    }
    @Before
    public void antesDosMetodos(){
        System.out.println("Esse é o Before");
    }
    @Test
    public void meuTest1(){
        System.out.println("Esse é o meu teste1");
    }
    @Test
    public void meuTeste2(){
        System.out.println("Esse é o meu teste2");
    }
    @After
    public void depoisDosMetodos(){
        System.out.println("Esse é o after");
    }
    @AfterClass
    public static void depoisDasClasses(){
        System.out.println("Esse é o AfterClass");
    }
}
