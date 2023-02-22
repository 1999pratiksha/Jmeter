package jmeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jmeter1 {
	@Test
	public void bt(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://google.co.in");
		wd.getTitle();
		
		
}
}