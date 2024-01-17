package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Social_Media_Icons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(2000);
		
		
		// Collections_Button is DISPLAYED or not
				boolean res = Collections_Button.isDisplayed();

				if (res == true) {
					System.out.println("Collections_Button is DISPLAYED ");
				} else {
					System.out.println("Collections_Button is not DISPLAYED");
				}
		driver.manage().deleteAllCookies();
		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath("//span[contains(text(),'Decentraland')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(2000);
		
		// Collections_Button is DISPLAYED or not
		boolean res1 = Collection.isDisplayed();

		if (res1 == true) {
			System.out.println("Collection is DISPLAYED ");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}
		driver.manage().deleteAllCookies();
		Collection.click();
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);
		Thread.sleep(2000);
		
		// Collection_Name is DISPLAYED or not
				boolean res2 = Collection_Name.isDisplayed();

				if (res2 == true) {
					System.out.println("Collection_Name is DISPLAYED ");
				} else {
					System.out.println("Collection_Name is not DISPLAYED");
				}
		Collection_Name.click();
		Thread.sleep(2000);
		jse3.executeScript("scroll(0, 350);");

		// -------------------------------------------------------------------------------------------------------

		// locate Website
		WebElement Website = driver
				.findElement(By.xpath("//a[@href='https://decentraland.org/']//div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Website
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Website);
		Thread.sleep(2000);
		
		// Collection_Name is DISPLAYED or not
		boolean res3 = Website.isDisplayed();

		if (res3 == true) {
			System.out.println("Website is DISPLAYED ");
		} else {
			System.out.println("Website is not DISPLAYED");
		}
		Website.click();
		Thread.sleep(2000);

		// ------------------------------------------------------------------------------------------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// --------------------------------------------

		// locate Twitter
		WebElement Twitter = driver.findElement(By.xpath(
				"//a[@href='https://twitter.com/decentraland']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Twitter
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Twitter);
		Thread.sleep(2000);
		
		// Twitter is DISPLAYED or not
				boolean res4 = Twitter.isDisplayed();

				if (res4 == true) {
					System.out.println("Twitter is DISPLAYED ");
				} else {
					System.out.println("Twitter is not DISPLAYED");
				}
		Twitter.click();
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------

		// locate Insta
		WebElement Insta = driver.findElement(By.xpath(
				"//a[@href='https://ig.me/m/decentraland_foundation/']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Insta
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Insta);
		Thread.sleep(1000);
		
		// Insta is DISPLAYED or not
		boolean res5 = Twitter.isDisplayed();

		if (res5 == true) {
			System.out.println("Insta is DISPLAYED ");
		} else {
			System.out.println("Insta is not DISPLAYED");
		}
		Insta.click();
		Thread.sleep(1000);

		// ------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------

		// locate Discord
		WebElement Discord = driver.findElement(
				By.xpath("//div[@class='flex justify-between banner-collection-detail-wrapper']//a[4]//div[1]"));
		Thread.sleep(1000);

		// to highlight the Discord
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Discord);
		Thread.sleep(1000);
		
		// Discord is DISPLAYED or not
		boolean res6 = Discord.isDisplayed();

		if (res6 == true) {
			System.out.println("Discord is DISPLAYED ");
		} else {
			System.out.println("Discord is not DISPLAYED");
		}
		Discord.click();
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		driver.close();
		driver.quit();

	}

}
