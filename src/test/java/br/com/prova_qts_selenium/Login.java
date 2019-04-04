package br.com.prova_qts_selenium;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	private WebDriver driver = null;

	@Before
	public void preCondicao() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://veduca.org/");
	}
	
	@Test
	public void fazerLogin() throws InterruptedException {
		driver.findElement(By.className("ajuste-btnlogin")).click();
		driver.findElement(By.id("email")).sendKeys("nawowebulo@mailsearch.net");
		driver.findElement(By.id("senha")).sendKeys("123456");
		
		driver.findElement(By.className("btn_cadastrar")).click();
		
		assertNotNull(driver.findElement(By.id("teste-teste")));
	}
}
