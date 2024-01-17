package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Add_Content {

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
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the Collections_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// Collections_Button is DISPLAYED or not
		boolean res = Collections_Button.isDisplayed();

		if (res == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}

		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath("//span[contains(text(),'Decentraland')]"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// Collection is DISPLAYED or not
		boolean res1 = Collection.isDisplayed();

		if (res1 == true) {
			System.out.println("Collection is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}
		Collection.click();
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(2000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);
		Thread.sleep(2000);

		// Collection_Name is DISPLAYED or not
		boolean res2 = Collection_Name.isDisplayed();

		if (res2 == true) {
			System.out.println("Collection_Name is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collection_Name is not DISPLAYED");
		}
		Collection_Name.click();
		Thread.sleep(2000);
		jse3.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Add_Content
		WebElement Add_Content = driver.findElement(By.xpath("//div[@id='project-information']//div//div//button"));
		Thread.sleep(2000);

		// to highlight the Add_Content
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Add_Content);
		Thread.sleep(2000);

		// Add_Content is DISPLAYED or not
		boolean res3 = Add_Content.isDisplayed();

		if (res3 == true) {
			System.out.println("Add_Content is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Add_Content is not DISPLAYED");
		}
		Add_Content.click();
		Thread.sleep(2000);
		jse4.executeScript("scroll(0, 650);");

		// ------------------------------------------------------------------------------------------------------------

		// locate Credentials
		WebElement Credentials = driver
				.findElement(By.xpath("//div[normalize-space()='CREDENTIALS']"));
		Thread.sleep(3000);

		// to highlight the Credentials
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Credentials);

		// Credentials is DISPLAYED or not
		boolean res4 = Credentials.isDisplayed();

		if (res4 == true) {
			System.out.println("Credentials is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Credentials is not DISPLAYED");
		}
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------------------------------------------------

		// locate EMAIL_ID
		WebElement EMAIL_ID = driver.findElement(By.xpath("//div[contains(text(),'EMAIL ID*')]"));
		Thread.sleep(2000);

		// to highlight the EMAIL_ID
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", EMAIL_ID);

		// EMAIL_ID is DISPLAYED or not
		boolean res5 = EMAIL_ID.isDisplayed();

		if (res5 == true) {
			System.out.println("EMAIL_ID is DISPLAYED ");
		} else {
			System.out.println("EMAIL_ID is not DISPLAYED");
		}

		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------------------------------------------------------

		// locate EMAIL_ID_box
		WebElement EMAIL_ID_box = driver.findElement(By.xpath("//input[@id='userMail']"));
		Thread.sleep(2000);

		// to highlight the EMAIL_ID_box
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				EMAIL_ID_box);
		Thread.sleep(2000);

		// EMAIL_ID_box is DISPLAYED or not
		boolean res6 = EMAIL_ID_box.isDisplayed();

		if (res6 == true) {
			System.out.println("EMAIL_ID_box is DISPLAYED ");
		} else {
			System.out.println("EMAIL_ID_box is not DISPLAYED");
		}
		EMAIL_ID_box.clear();
		EMAIL_ID_box.click();
		EMAIL_ID_box.sendKeys("prakash@ix.cumberlandlabs.io");
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------------------------

		// locate ETH_Wallet_Address
		WebElement ETH_Wallet_Address = driver.findElement(By.xpath("//div[contains(text(),'ETH Wallet Address*')]"));
		Thread.sleep(2000);

		// to highlight the ETH_Wallet_Address
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				ETH_Wallet_Address);

		// ETH_Wallet_Address is DISPLAYED or not
		boolean res7 = ETH_Wallet_Address.isDisplayed();

		if (res7 == true) {
			System.out.println("ETH_Wallet_Address is DISPLAYED ");
		} else {
			System.out.println("ETH_Wallet_Address is not DISPLAYED");
		}
		Thread.sleep(2000);

		// ------------------------------------------------------------------------------------------------------------

		// locate ETH_Wallet_Address_box
		WebElement ETH_Wallet_Address_box = driver.findElement(By.xpath("//input[@id='userWalletAddress']"));
		Thread.sleep(2000);

		// to highlight the ETH_Wallet_Address_box
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				ETH_Wallet_Address_box);
		Thread.sleep(2000);

		// ETH_Wallet_Address_box is DISPLAYED or not
		boolean res8 = ETH_Wallet_Address_box.isDisplayed();

		if (res8 == true) {
			System.out.println("ETH_Wallet_Address_box is DISPLAYED ");
		} else {
			System.out.println("ETH_Wallet_Address_box is not DISPLAYED");
		}
		ETH_Wallet_Address_box.clear();
		ETH_Wallet_Address_box.click();
		ETH_Wallet_Address_box.sendKeys("0x6Fb447Ae94F5180254D436A693907a1f57696900");
		Thread.sleep(2000);
		jse9.executeScript("scroll(0, 950);");

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Next
		WebElement Next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Thread.sleep(2000);

		// to highlight the Next
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Next);
		Thread.sleep(2000);

		// Next is DISPLAYED or not
		boolean res9 = Next.isDisplayed();

		if (res9 == true) {
			System.out.println("Next is DISPLAYED ");
		} else {
			System.out.println("Next is not DISPLAYED");
		}
		Next.click();
		Thread.sleep(2000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Project_Information
		WebElement Project_Information = driver
				.findElement(By.xpath("//body/div[@id='__next']/form[@id='form']/div[1]/div[2]"));
		Thread.sleep(2000);

		// to highlight the Credentials
		JavascriptExecutor jse555 = (JavascriptExecutor) driver;
		jse555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Project_Information);

		// Project_Information is DISPLAYED or not
		boolean res10 = Project_Information.isDisplayed();

		if (res10 == true) {
			System.out.println("Project_Information is DISPLAYED ");
		} else {
			System.out.println("Project_Information is not DISPLAYED");
		}
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------
		// locate Information_box
		WebElement Information_box = driver.findElement(By.xpath("//h2[normalize-space()='Founders']"));
		Thread.sleep(2000);

		// to highlight the Information_box
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Information_box);
		Thread.sleep(2000);

		// Information_box is DISPLAYED or not
		boolean res11 = Information_box.isDisplayed();

		if (res11 == true) {
			System.out.println("Information_box is DISPLAYED ");
		} else {
			System.out.println("Information_box is not DISPLAYED");
		}
		Information_box.click();
		Thread.sleep(2000);
		Information_box.sendKeys(
				"Decentraland was established by Argentinians[19] Esteban Ordano and Ariel Meilich in 2015 in Buenos Aires, ArgentinaOrdano, a software engineer, has experience working at BitPay Inc. and as an advisor to Matic Network. He has also founded two software companies, Smart Contract Solutions and Zeppelin Solutions.");
		Thread.sleep(2000);
		jse11.executeScript("scroll(0, 2800);");
		Thread.sleep(2000);
		// --------------------------------------------------------------------------------------------------------

		// locate Next1
		WebElement Next1 = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Thread.sleep(2000);

		// to highlight the Next1
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Next1);

		// Next1 is DISPLAYED or not
		boolean res12 = Next1.isDisplayed();

		if (res12 == true) {
			System.out.println("Next1 is DISPLAYED ");
		} else {
			System.out.println("Next1 is not DISPLAYED");
		}
		Thread.sleep(2000);
		Next1.click();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------------------------

		// locate Preview
		WebElement Preview = driver.findElement(By.xpath("//body/div[@id='__next']/form[@id='form']/div[1]/div[3]"));
		Thread.sleep(2000);

		// to highlight the Preview
		JavascriptExecutor jse5555 = (JavascriptExecutor) driver;
		jse5555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Preview);

		// Preview is DISPLAYED or not
		boolean res13 = Preview.isDisplayed();

		if (res13 == true) {
			System.out.println("Preview is DISPLAYED ");
		} else {
			System.out.println("Preview is not DISPLAYED");
		}
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------------------------------

		// locate Submit
		WebElement Submit = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		Thread.sleep(2000);

		// to highlight the Submit
		JavascriptExecutor jse55555 = (JavascriptExecutor) driver;
		jse55555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Submit);
		Thread.sleep(2000);

		// Submit is DISPLAYED or not
		boolean res14 = Submit.isDisplayed();

		if (res14 == true) {
			System.out.println("Submit is DISPLAYED ");
		} else {
			System.out.println("Submit is not DISPLAYED");
		}
		Submit.click();
		Thread.sleep(3000);

		// ---------------------------------------------------------------------------------------------------

		driver.close();
		driver.quit();

	}
}