package LocatorsDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationdemo1 {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		
		//get url
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("sauravtopwal01@gmail.com");

		//Password
		driver.findElement(By.id("password")).sendKeys("saurav101");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//submit
		driver.findElement(By.id("submit-id")).click();
	}

}
