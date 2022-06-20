package org.Run;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh\\eclipse-workspace\\Alert\\src\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement ok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		
		ok.click();
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//simple Alert
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
	}

}
