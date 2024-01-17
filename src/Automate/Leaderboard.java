package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Leaderboard {

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

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard
		WebElement Leaderboard = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Leaderboard);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Leaderboard is DISPLAYED or not
		boolean res = Leaderboard.isDisplayed();

		if (res == true) {
			System.out.println("Leaderboard is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Leaderboard is not DISPLAYED");
		}
		Leaderboard.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_Heading
		WebElement Leaderboard_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Earn Rewards Points by contributing NFT Collection')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_Heading);

		// Leaderboard_Heading is DISPLAYED or not
		boolean res1 = Leaderboard_Heading.isDisplayed();

		if (res1 == true) {
			System.out.println("Leaderboard_Heading is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points_unlock_any_future_Digitali_token_dis
		WebElement Reward_Points_unlock_any_future_Digitali_token_dis = driver
				.findElement(By.xpath("//div[contains(text(),'Reward Points unlock any future Digitali token dis')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Reward_Points_unlock_any_future_Digitali_token_dis
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Reward_Points_unlock_any_future_Digitali_token_dis);

		// Reward_Points_unlock_any_future_Digitali_token_dis is DISPLAYED or not
		boolean res2 = Reward_Points_unlock_any_future_Digitali_token_dis.isDisplayed();

		if (res2 == true) {
			System.out.println("Reward_Points_unlock_any_future_Digitali_token_dis is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points_unlock_any_future_Digitali_token_dis is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath(
				"//div[@id='__next']//main//div//div//div//div//div//a[normalize-space()='Earn Reward Points']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);

		// Earn_Reward_Points is DISPLAYED or not
		boolean res3 = Earn_Reward_Points.isDisplayed();

		if (res3 == true) {
			System.out.println("Earn_Reward_Points is DISPLAYED  ");
		} else {
			System.out.println("Earn_Reward_Points is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate win_prize
		WebElement win_prize = driver.findElement(By.xpath("//img[@alt='win prize']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the win_prize
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", win_prize);

		// win_prize is DISPLAYED or not
		boolean res4 = win_prize.isDisplayed();

		if (res4 == true) {
			System.out.println("win_prize is DISPLAYED  ");
		} else {
			System.out.println("win_prize is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard11
		WebElement Leaderboard11 = driver.findElement(By.xpath("//div[contains(text(),'Leaderboard')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard11
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard11);

		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 500);");

//----------------------------------------------------------------------------------------------------------------------------

		// locate Total_Contributors
		WebElement Total_Contributors = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Total_Contributors
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributors);

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Total_Contributions
		WebElement Total_Contributions = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Total_Contributions
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributions);

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points1
		WebElement Earn_Reward_Points1 = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points1
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points1);

		// Earn_Reward_Points1 is DISPLAYED or not
		boolean res5 = Earn_Reward_Points1.isDisplayed();

		if (res5 == true) {
			System.out.println("Earn_Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Earn_Reward_Points1 is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse9.executeScript("scroll(0, 500);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box
		WebElement Leaderboard_box = driver
				.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[3]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_box
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box);

		// Leaderboard_box is DISPLAYED or not
		boolean res6 = Leaderboard_box.isDisplayed();

		if (res6 == true) {
			System.out.println("Leaderboard_box is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard_box is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse10.executeScript("scroll(0, 800);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box1
		WebElement Leaderboard_box1 = driver
				.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_box1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box1);

		Thread.sleep(1000);
		jse11.executeScript("scroll(0, 1400);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

//		// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res36 = Reward_Points1.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us1 is DISPLAYED");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali is DISPLAYED");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(
				By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ1 is DISPLAYED");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);

		// Twitter_Icon is DISPLAYED or not
		boolean res44 = All_Rights_Reserved.isDisplayed();

		if (res44 == true) {
			System.out.println("Twitter_Icon is DISPLAYED");
		} else {
			System.out.println("Twitter_Icon is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Discord_Icon
		WebElement Discord_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);

		// Discord_Icon is DISPLAYED or not
		boolean res45 = Discord_Icon.isDisplayed();

		if (res45 == true) {
			System.out.println("Discord_Icon is DISPLAYED");
		} else {
			System.out.println("Discord_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
}
