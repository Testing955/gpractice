package Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatecontact 
{
public static void main(String args[]) throws InterruptedException
{
/*WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html_tables.asp");
try
{
driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]")).sendKeys("Maria Anders");
}
catch(Exception e)
{
System.out.println("Title is not matching");
}
driver.quit();*/
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Ms Dhoni");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).clear();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("MS Dhoni India");
driver.findElement(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li[4]")).click();
driver.quit();
}
}
