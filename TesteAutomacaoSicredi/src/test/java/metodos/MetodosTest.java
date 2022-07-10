package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTest {

	WebDriver driver;

	public void abrirBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void selecionarVersao(By elemento) {
		driver.findElement(elemento).click();

	}

	public void clicarAddCustomer(By elemento) {
		driver.findElement(elemento).click();

	}

	public void inserirName(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirLastName(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirContFirstName(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void digitarPhone(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirAddress1(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirAddress2(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirCity(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirState(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirPostalCode(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void inserirCountry(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicarEmployeer(By elemento) {
		driver.findElement(elemento).click();

	}

	public void selecionarEmployeer(By elemento) {
		driver.findElement(elemento).sendKeys("Fixter");

	}

	public void inserirEmployeer(By elemento) {
		driver.findElement(elemento).sendKeys(Keys.ENTER);

	}

	public void inserirCreditLimit(By elemento, String num) {
		driver.findElement(elemento).sendKeys(num);
	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");

	}

	public void clicarEnviar(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(2000);

	}
 
	public void validarMsg(By elemento, String textoEncontrado) throws InterruptedException {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEncontrado));
		Thread.sleep(3000);
	}

	public void takesScrs(String nameEvidencia) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./evidencies/" + nameEvidencia + ".png");
		FileUtils.copyFile(srcFile, desFile);

	}

	public void fecharBrowser() {
		driver.quit();

	}

}
