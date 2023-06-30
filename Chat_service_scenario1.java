package chatservice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chat_service_scenario1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			Actions act=new Actions (driver);
			WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(15)); 
			
			driver.get("https://truemark.dev.intelliante.com/mccs/dashboard/?session_token=eyJraWQiOiIxVEpVTHpsZUdBXzhDSkpUYm9VOEhxbXl6UHdWc210VjF5SzBFQlV5WXRJIiwiYWxnIjoiSFM1MTIifQ.eyJpc3MiOiJJbnRlbGxpYW50ZSBJbmMuIiwiaWF0IjoxNjcxNTQ5MzU0LCJqdGkiOiIzYzQ5YmFkMS01YWI3LTRjZmUtYmJlOC1hZTlmZTA0ZmFhMDUiLCJ1c2VyIjp7ImlkIjo0NjMsImVtYWlsIjoicm9uYWtlODg4NkBsdWJkZS5jb20iLCJ0eXBlIjoiQXBwbGljYW50czo6VXNlciJ9LCJmaXJzdF9uYW1lIjoicHJha2FzaCIsImxhc3RfbmFtZSI6InBvdWRlbCIsImFzc2Vzc21lbnRfY29uZmlnX29yZGVyIjpbeyJpZCI6MSwiY29kZSI6Ik1DU0UifV0sImFwcGxpY2FudF9pZCI6NDYzLCJkYXNoYm9hcmRfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5hcHBsaWNhbnQtc3RhZ2luZy5pbnRlbGxpYW50ZS5jb20iLCJqb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudF9pZCI6MTY1OSwic2NvcmVfc3VibWlzc2lvbl91cmwiOnsidXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEvYXBwbGljYW50cy9qb2JfYXBwbGljYXRpb25fYXNzZXNzbWVudHMvMTY1OSIsIm1ldGhvZCI6IlBBVENIIn0sImFzc2Vzc21lbnRfc3RhdHVzX3VybCI6eyJ1cmwiOiJodHRwczovL3RydWVtYXJrLnBsYXRmb3JtLXN0YWdpbmcuaW50ZWxsaWFudGUuY29tL2FwaS92MS9hcHBsaWNhbnRzL2pvYl9hcHBsaWNhdGlvbl9hc3Nlc3NtZW50cy8xNjU5L3N0YXR1cyIsIm1ldGhvZCI6IkdFVCJ9LCJpc19jdl9wZXJtaXR0ZWQiOm51bGwsImN2X2ltYWdlX2NhcHR1cmVfaW50ZXJ2YWwiOm51bGwsImJhc2VfdXJsIjoiaHR0cHM6Ly90cnVlbWFyay5wbGF0Zm9ybS1zdGFnaW5nLmludGVsbGlhbnRlLmNvbS9hcGkvdjEifQ.rDfFfxJ870QsP_m0k93da16ybrXjKcPQ9cg6aBQ1pFhmdSVVEL4exKWhQMRDbEmEt3P0whK_pCg1r1fKfwqzgA&test=true");
			
			driver.findElement(By.cssSelector(".col-md-3:nth-child(4) .background-icon")).click();
			driver.findElement(By.xpath("(//img[contains(@alt,'Charlene Atkins')])[2]")).click();
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Thanks. What seems to be the problem?']"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[normalize-space()='Thanks. What seems to be the problem?']")).click();		   
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			
			act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Can you give me a more specific reeson?']"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[normalize-space()='Can you give me a more specific reeson?']")).click();
			
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			
			act.moveToElement(driver.findElement(By.xpath("//p[normalize-space()='Are you sure there is nothing wrong at all with the product?']"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[normalize-space()='Are you sure there is nothing wrong at all with the product?']")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			driver.findElement(By.xpath("(//p[contains(text(),'I'm sorry. We try to make returns easy. I want to')])[1]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
            
			act.pause(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Knowledge Management']")).click();
			driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Return process");
			driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
			
			driver.findElement(By.xpath("//p[normalize-space()='Back to Chat']")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'Great news! I can process your item return today a')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'Great news! I can process your item return today a')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'I will help you if you give me your email addrass ')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'I will help you if you give me your email addrass ')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'I just sent you an email with a pre-pa')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'I just sent you an email with a pre-pa')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			driver.findElement(By.xpath("//a[normalize-space()='Account']")).click();
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='Please enter OTP character 1']")));
			driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']")).sendKeys("5846301978");
			driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		    driver.findElement(By.xpath("//p[normalize-space()='Back to Chat']")).click();
		    
		    act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'The instructins for packaging and sending are in t')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'The instructins for packaging and sending are in t')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'Happy to help. Refunds take about 3 days to proces')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'Happy to help. Refunds take about 3 days to proces')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			
			act.moveToElement(driver.findElement(By.xpath("//p[contains(text(),'You're welcome Charlene. Glad to help!')]"))).click().build().perform();
			act.pause(1000);
			driver.findElement(By.xpath("//p[contains(text(),'You're welcome Charlene. Glad to help!')]")).click();
			act.pause(1000);
			driver.findElement(By.cssSelector(".send-btn")).click();
			driver.close();
        
        
        
        
        
		
	}
		
	

}
