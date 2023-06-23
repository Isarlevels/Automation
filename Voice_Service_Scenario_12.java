package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Voice_Service_Scenario_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
			Actions act=new Actions (driver);
			WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10)); 
			
			driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTQ5MzU0LCJqdGkiOiIzYzQ5YmFkMS01YWI3LTRjZmUtYmJlOC1hZTlmZTA0ZmFhMDUiLCJ1c2VyIjp7ImlkIjo0NjMsImVtYWlsIjoicm9uYWtlODg4NkBsdWJkZS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjoicHJha2FzaCIsImxhc3RfbmFtZSI6InBvdWRlbCIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1WU0UifV0sImFwcGxpY2FudF9pZCI6NDYzLCJkYXNoYm9hcmRfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5hcHBsaWNhbnQtc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20iLCJqb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudF9pZCI6MTY1OSwic2NvcmVfc3VibWlzc2lvbl91cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY1OSIsIm1ldGhvZCI6IlBBVENIIn0sImFzc2Vzc21lbnRfc3RhdHVzX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjU5L3N0YXR1cyIsIm1ldGhvZCI6IkdFVCJ9LCJpc19jdl9wZXJtaXR0ZWQiOm51bGwsImN2X2ltYWdlX2NhcHR1cmVfaW50ZXJ2YWwiOm51bGwsImJhc2VfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEifQ.bYJDcrKSS_VB_ftRbO7Bj4r1a8XSeF4vo0xcfymBJjGzv-sL3oIWfcoDH1C3b0ez81XUw_HAb7FP0wqe4TES4Q&test=true");
			driver.findElement(By.cssSelector(".col-md-3:nth-child(4) .background-icon")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Begin']")).click();
			driver.findElement(By.xpath("//img[@alt='Voice 1']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
			driver.findElement(By.cssSelector(".btn-text")).click();
			
			act.moveToElement(driver.findElement(By.id("S01.L01.QN01.QC4Response1"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.id("S01.L01.QN01.QC4Response1")).click(); 
		    act.moveToElement(driver.findElement(By.id("S01.L01.QN01.QC2Response2"))).click().build().perform();
		    act.pause(2000);
		    driver.findElement(By.id("S01.L01.QN01.QC2Response2")).click(); 
		    driver.findElement(By.cssSelector(".send-btn")).click();
		    
		    w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input:nth-child(1)")));
			driver.findElement(By.cssSelector("input:nth-child(1)")).click();
			driver.findElement(By.cssSelector("input:nth-child(1)")).sendKeys("9074051");
			driver.findElement(By.cssSelector(".ps-2")).click();		
			act.pause(30000);
			
			driver.findElement(By.id("S03.L01.QN02.QC1Response1")).click();
			w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".send-btn"))));
			driver.findElement(By.cssSelector(".send-btn")).click();
			act.pause(30000);
			
			driver.findElement(By.id("S04.L02.QN03.QC2Response1")).click();
			w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".send-btn"))));
			driver.findElement(By.cssSelector(".send-btn")).click();
			act.pause(30000);
			
			act.moveToElement(driver.findElement(By.id("S05.L06.QN04.QC3Response1"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S05.L06.QN04.QC3Response1")).click();
			act.moveToElement(driver.findElement(By.xpath("//input[@id='S05.L06.QN04.QC1Response2']"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.xpath("//input[@id='S05.L06.QN04.QC1Response2']")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.id("S06.L03.QN05.QC4Response1"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S06.L03.QN05.QC4Response1")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.id("S11.L03.QN07.QC3Response1"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S11.L03.QN07.QC3Response1")).click();
			act.moveToElement(driver.findElement(By.id("S11.L03.QN07.QC5Response2"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S11.L03.QN07.QC5Response2")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			driver.findElement(By.id("S12.L02.QN08.QC2Response1")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.id("S15.L02.QN10.QC4Response1"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S15.L02.QN10.QC4Response1")).click();
			act.moveToElement(driver.findElement(By.id("S15.L02.QN10.QC2Response2"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.id("S15.L02.QN10.QC2Response2")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
	}

}
