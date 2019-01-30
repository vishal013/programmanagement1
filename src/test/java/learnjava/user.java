package learnjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class user {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
//driver.get("http://globemed.intelegencia.com:8081/sites/RecordCenter/Home/Feedback.aspx");

Thread.sleep(2000);
driver.get("http://remedy.qa1:intel@2098@globemed.intelegencia.com:8081/sites/RecordCenter/Home/Feedback.aspx");


//driver.switchTo().alert().getText();
driver.quit();

}
}