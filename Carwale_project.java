package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Carwale_project {

	public static void main(String[] args) throws InterruptedException {
		
		//Disable Notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//To Setup ChromeDriver
		ChromeDriver driver = new ChromeDriver(options);
		// to Maximize the Windows 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//To Load the URL
		driver.get("https://www.carwale.com/");
		// mouse Hover on the elements
		WebElement Mosuehover = driver.findElement(By.xpath("//div[text() = 'USED CARS']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Mosuehover).perform();
		driver.findElement(By.xpath("//div[text() = 'Explore Used Cars']")).click();
		driver.findElement(By.id("usedCarsList")).sendKeys("Chennai");
		driver.findElement(By.xpath("//a[@cityname = 'chennai,tamilnadu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("minInput")).sendKeys("8Lakh");
		driver.findElement(By.id("maxInput")).sendKeys("12akh");
		driver.findElement(By.id("findCarText")).click();
		driver.findElement(By.xpath("(//div[@class = 'o-bkmzIL o-eNlUkX o-biKUts o-eUqSLf o-dbKqqe o-ItVGT o-YCHtV o-eZTujG o-AxjCR'])[7]")).click();		
		driver.findElement(By.xpath("(//label[@class = 'o-frwuxB o-flVtyy o-eemiLE  o-cpnuEd o-dsiSgT   o-fzoHFO o-fzoHCA o-fzpihY o-fzpilm'])[24]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Select Manufacturer']")).sendKeys("Creta");
		driver.findElement(By.xpath("(//input[@class = 'o-bfyaNx o-cYOpxG o-bXKmQE o-btTZkL o-KXCcx o-cXBIhK o-frwuxB'])[11]")).click();
		driver.findElement(By.xpath("(//div[@class = 'o-bkmzIL o-eNlUkX o-biKUts o-eUqSLf o-dbKqqe o-ItVGT o-YCHtV o-eZTujG o-AxjCR'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class = 'o-bfyaNx o-cYOpxG o-bXKmQE o-btTZkL o-KXCcx o-cXBIhK o-frwuxB'])[24]")).click();
		Thread.sleep(4000);
		
			}
	
	
}
