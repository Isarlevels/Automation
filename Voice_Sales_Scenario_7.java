package Text;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Voice_Sales_Scenario_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
			Actions act=new Actions (driver);
			WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10)); 
			
			driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTQ5MzU0LCJqdGkiOiIzYzQ5YmFkMS01YWI3LTRjZmUtYmJlOC1hZTlmZTA0ZmFhMDUiLCJ1c2VyIjp7ImlkIjo0NjMsImVtYWlsIjoicm9uYWtlODg4NkBsdWJkZS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjoicHJha2FzaCIsImxhc3RfbmFtZSI6InBvdWRlbCIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1WU0EifV0sImFwcGxpY2FudF9pZCI6NDYzLCJkYXNoYm9hcmRfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5hcHBsaWNhbnQtc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20iLCJqb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudF9pZCI6MTY1OSwic2NvcmVfc3VibWlzc2lvbl91cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY1OSIsIm1ldGhvZCI6IlBBVENIIn0sImFzc2Vzc21lbnRfc3RhdHVzX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjU5L3N0YXR1cyIsIm1ldGhvZCI6IkdFVCJ9LCJpc19jdl9wZXJtaXR0ZWQiOm51bGwsImN2X2ltYWdlX2NhcHR1cmVfaW50ZXJ2YWwiOm51bGwsImJhc2VfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEifQ.tbnB3iBoSuWKbK6B2LJRqiWqvQMBzEwaAJ4O2OSX0BdlAxG3-Sh9wzFz079ghREPETkI5U0EQNOpN6ZB9uIA_Q&test=true");
			driver.findElement(By.cssSelector(".col-md-3:nth-child(4) .background-icon")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Begin']")).click();
			driver.findElement(By.xpath("//img[@alt='Voice 1']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
			driver.findElement(By.cssSelector(".btn-text")).click();
			
			act.pause(30000);
		    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c-name']")));
		    act.pause(30000);
			driver.findElement(By.xpath("//input[@id='c-name']")).click();
			driver.findElement(By.xpath("//input[@id='c-name']")).sendKeys("Xavier James");
		    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c-number']")));
			driver.findElement(By.xpath("//input[@id='c-number']")).click();
			driver.findElement(By.xpath("//input[@id='c-number']")).sendKeys("+49 174 5555 524");
		    w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#appContainer > div.main-board-container.d-flex.flex-column.w-100.h-100 > div > div > div.message-board-container.overflow-auto.w-100.h-100.flex-fill.active > div > div.msg-board-container.flex-fill > div > div.account-information-section.px-lg-4.pt-0.d-flex.flex-column > div > div > div > div > form > div.form-actions > div > button")));
		    driver.findElement(By.cssSelector("#appContainer > div.main-board-container.d-flex.flex-column.w-100.h-100 > div > div > div.message-board-container.overflow-auto.w-100.h-100.flex-fill.active > div > div.msg-board-container.flex-fill > div > div.account-information-section.px-lg-4.pt-0.d-flex.flex-column > div > div > div > div > form > div.form-actions > div > button")).click();
		  
		    act.moveToElement(driver.findElement((By.xpath("//input[@id='S02.L01.QN01.QC2Response1']")))).click().build().perform();
		    act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S02.L01.QN01.QC2Response1']")).click();
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S02.L01.QN01.QC5Response2']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S02.L01.QN01.QC5Response2']")).click();
		    w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".send-btn")));
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S03.L01.QN02.QC2Response1']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S03.L01.QN02.QC2Response1']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		    
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S03.L03.QN03.QC3Response1']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S03.L03.QN03.QC3Response1']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S04.L06.QN05.QC2Response1']"))).click().build().perform();
		    act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S04.L06.QN05.QC2Response1']")).click();
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S04.L06.QN05.QC3Response2']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S04.L06.QN05.QC3Response2']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S05.L01.QN06.QC3Response1']"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.xpath("//input[@id='S05.L01.QN06.QC3Response1']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S07.L01.QN08.QC4Response1']"))).click().build().perform();
		    act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S07.L01.QN08.QC4Response1']")).click();
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S07.L01.QN08.QC5Response2']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S07.L01.QN08.QC5Response2']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    driver.findElement(By.cssSelector("tr:nth-child(2) > .border-0:nth-child(2) > .amt-btn")).click();
		    w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".rounded:nth-child(2)")));
		    driver.findElement(By.cssSelector(".rounded:nth-child(2)")).click();
		  
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S08.L02.QN09.QC3Response1']"))).click().build().perform();
			act.pause(2000);
			driver.findElement(By.xpath("//input[@id='S08.L02.QN09.QC3Response1']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
		  
		    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer-email']")));
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='customer-email']")).click();
		    driver.findElement(By.xpath("//input[@id='customer-email']")).sendKeys("Xavier@mojomailbox.com");
		    driver.findElement(By.xpath("//input[@id='customer-street-address']")).click();
		    driver.findElement(By.xpath("//input[@id='customer-street-address']")).sendKeys("8430 Bren Mawr Avenue");
		    driver.findElement(By.xpath("//input[@id='customer-state']")).click();
		    driver.findElement(By.xpath("//input[@id='customer-state']")).sendKeys("Chicago,");
		    driver.findElement(By.xpath("//input[@id='customer-city']")).click();
		    driver.findElement(By.xpath("//input[@id='customer-city']")).sendKeys("Illinois");
		    driver.findElement(By.xpath("//input[@id='customer-postal-code']")).click();
		    driver.findElement(By.xpath("//input[@id='customer-postal-code']")).sendKeys("60631");
			act.pause(2000);
		    driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
		    
		    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c-number']")));
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='c-number']")).click();
		    driver.findElement(By.xpath("//input[@id='c-number']")).sendKeys("4959 8174 2011 4480");
		    driver.findElement(By.xpath("//input[@id='cvv-code']")).click();
		    driver.findElement(By.xpath("//input[@id='cvv-code']")).sendKeys("542");
		    driver.findElement(By.cssSelector(".pe-2 > .search-input"));
		    WebElement dropdownElement = driver.findElement(By.cssSelector(".pe-2 > .search-input"));
		    Select dropdown = new Select(dropdownElement);
		    dropdown.selectByValue("label=01");
		    WebElement dropdownElement1 = driver.findElement(By.cssSelector(".custom-dropdown:nth-child(2) > .search-input"));
		    Select dropdown1 = new Select(dropdownElement1);
		    dropdown1.selectByValue("label=28");
		    driver.findElement((By.cssSelector(".btn-primary:nth-child(1)")));
		    
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S09.L10.QN11.QC2Response1']"))).click().build().perform();
		    act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S09.L10.QN11.QC2Response1']")).click();
		    act.moveToElement(driver.findElement(By.xpath("//input[@id='S09.L10.QN11.QC3Response2']"))).click().build().perform();
			act.pause(2000);
		    driver.findElement(By.xpath("//input[@id='S09.L10.QN11.QC3Response2']")).click();
		    driver.findElement(By.cssSelector(".send-btn")).click();
	}

}
