package br.com.prova_qts_selenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Busca {

	private WebDriver driver = null;

	@Before
	public void preCondicao() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://veduca.org/");
	}
	
	@Test
	public void buscarCursosDeGestão() throws InterruptedException {
		
		WebElement campoDeBusca = driver.findElement(By.className("inputBusca"));
		campoDeBusca.sendKeys("Gestão");
	    
		driver.findElement(By.className("btnBusca")).click();
		
		List<WebElement> titulos = driver.findElements(By.className("titulo-card-cursos"));
		for (WebElement titulo : titulos) {
			if (titulo.getText().contains("Gestão da Inovação")) {
				titulo.click();
				break;
			}
		}
	}
}
