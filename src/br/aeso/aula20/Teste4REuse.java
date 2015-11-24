package br.aeso.aula20;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Teste4REuse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www2.4reuse.info/autenticacao");
		WebElement campoNome = driver.findElement(By.name("usuario"));
		WebElement campoEmail = driver.findElement(By.name("senha"));
		
		campoNome.sendKeys("mauriciomanoel@gmail.com");
		campoEmail.sendKeys("123456");
		
		WebElement botaoSalvar = driver.findElement(By.id("btn_submit"));
		botaoSalvar.click();
		Thread.sleep(2000);
		boolean achouNome = driver.getPageSource().contains("Home1111");
		System.out.println(achouNome);
	}
}
