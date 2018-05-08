package org.task.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.task.Paytm.Utilities;

public class MainScript extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		
		//Entering username and password by switching into the frame
		browserOpen();
		launchURL("https://paytm.com/");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.className("_3ac-"));
		loginBtn.click();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("myusername");
		driver.findElement(By.name("password")).sendKeys("mypassword");

	}

}
