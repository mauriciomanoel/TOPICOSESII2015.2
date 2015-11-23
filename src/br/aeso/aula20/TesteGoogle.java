package br.aeso.aula20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

	public static void main(String[] args) {
		WebDriver drive = new FirefoxDriver();
		drive.get("http://www.google.com.br");
		WebElement campoDoTexto = drive.findElement(By.name("q"));
		campoDoTexto.sendKeys("AESO");
		campoDoTexto.submit();
	}
}
