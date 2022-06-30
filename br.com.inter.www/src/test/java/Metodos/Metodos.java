package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	WebDriver driver;

	public void pausa(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void preencher(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void validarTexto(By elemento, String esperadotexto) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(esperadotexto, texto);

	}
	
	public void print (String print) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File Desfile = new File(print);
		FileUtils.copyFile(srcFile, Desfile);
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
}
