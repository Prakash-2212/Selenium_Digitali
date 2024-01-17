package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Footer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		Thread.sleep(1000);

		jse.executeScript("scroll(0, 5000);");

		// -----------------------------------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));

		// to highlight the Explore
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------------

		// locate Collections
		WebElement Collections = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));

		// to highlight the Collections
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collections);
		Thread.sleep(1000);
		Collections.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// -----------------------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard
		WebElement Leaderboard = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));

		// to highlight the Leaderboard
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Leaderboard);
		Thread.sleep(1000);

		Leaderboard.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points
		WebElement Reward_Points = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));

		// to highlight the Reward_Points
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points);
		Thread.sleep(1000);

		Reward_Points.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate About_Us
		WebElement About_Us = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));

		// to highlight the About_Us
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us);
		Thread.sleep(1000);

		About_Us.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));

		// to highlight the Digitali
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);
		Thread.sleep(1000);

		Digitali.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blogs
		WebElement Blogs = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));

		// to highlight the Digitali
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blogs);
		Thread.sleep(1000);

		Blogs.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));

		// to highlight the FAQ
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);

		FAQ.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));

		// to highlight the Legal
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		Thread.sleep(1000);

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));

		// to highlight the Terms
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);
		Thread.sleep(1000);

		Terms.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));

		// to highlight the Privacy
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);
		Thread.sleep(1000);

		Privacy.click();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 5000);");

		driver.close();
		driver.quit();

	}
}