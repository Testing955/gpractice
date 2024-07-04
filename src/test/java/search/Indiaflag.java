package search;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indiaflag {

	public static void main(String[] args) 				
	{
/*WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Indian Army");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div/div[1]/div[1]/a/div/span")).click();*/
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("India flag");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='sbic sb43']")));
for (WebElement suggestion : suggestions) {
    System.out.println(suggestion.getText());
}
driver.findElement(By.xpath("//div[@aria-label='india flag']")).click();




	}

}
