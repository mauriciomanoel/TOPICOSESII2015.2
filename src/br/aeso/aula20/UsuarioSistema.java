package br.aeso.aula20;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UsuarioSistema {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/new");
		WebElement campoNome = driver.findElement(By.name("nome"));
		WebElement campoEmail = driver.findElement(By.name("email"));
		
		campoNome.sendKeys("Mauricio");
		campoEmail.sendKeys("mauricio@gmail.com");
		
		WebElement botalSalvar = driver.findElement(By.id("btnSalvar"));
		botalSalvar.click();
		
		boolean achouNome = driver.getPageSource().contains("Mauricio");
		boolean achouEmail = driver.getPageSource().contains("mauricio@gmail.com");
		
		assertTrue(achouNome);
	}

}
