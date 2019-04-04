package br.com.prova_qts_selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro {

	private WebDriver driver = null;

	@Before
	public void preCondicao() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://veduca.org/");
	}
	
	@Test
	public void fazerCadastro() throws InterruptedException {
		driver.findElement(By.className("btnCriarConta")).click();
		
		driver.findElement(By.id("appbundle_cadastro_aluno_nome")).sendKeys("Bruno da Graça Vieira");
		driver.findElement(By.id("appbundle_cadastro_aluno_celular")).sendKeys("51995168407");
		driver.findElement(By.id("appbundle_cadastro_aluno_email_first")).sendKeys("nawowebulo@mailsearch.net");
		driver.findElement(By.id("appbundle_cadastro_aluno_email_second")).sendKeys("nawowebulo@mailsearch.net");
		driver.findElement(By.id("appbundle_cadastro_aluno_senha_first")).sendKeys("123456");
		driver.findElement(By.id("appbundle_cadastro_aluno_senha_second")).sendKeys("123456");
		
		driver.findElement(By.id("appbundle_cadastro_aluno_aceitoOsTermos")).click();
		driver.findElement(By.className("btn_cadastrar")).click();

	}
}
