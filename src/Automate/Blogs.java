package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Blogs {

	// -----------------------------------------------------------------------------------------------------------------------------

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

		// --------------------------------------------------------------------------------------------------------------------------

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse00 = (JavascriptExecutor) driver;
		jse00.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		
		// digitali_logo is DISPLAYED or not
				boolean res = digitali_logo.isDisplayed();

				if (res == true) {
					System.out.println("digitali_logo is DISPLAYED ");
				} else {
					System.out.println("digitali_logo is not DISPLAYED");
				}
		Thread.sleep(1000);

		jse00.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blogs
		WebElement Blogs = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blogs);
		Thread.sleep(1000);
		
		// Blogs is DISPLAYED or not
		boolean res1 = digitali_logo.isDisplayed();

		if (res1 == true) {
			System.out.println("Blogs is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Blogs is not DISPLAYED");
		}
		Blogs.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Heading
		WebElement Heading = driver.findElement(By.xpath("//h2[normalize-space()='Resources and insights']"));
		Thread.sleep(1000);

		// to highlight the Blogs
		JavascriptExecutor jse000 = (JavascriptExecutor) driver;
		jse000.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Heading);
		
		// Heading is DISPLAYED or not
				boolean res2 = Heading.isDisplayed();

				if (res2 == true) {
					System.out.println("Heading is DISPLAYED  ");
				} else {
					System.out.println("Heading is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate News
		WebElement News = driver
				.findElement(By.xpath("//p[contains(text(),'The latest industry news, interviews, technologies')]"));

		// to highlight the News
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", News);
		
		// News is DISPLAYED or not
		boolean res3 = News.isDisplayed();

		if (res3 == true) {
			System.out.println("News is DISPLAYED  ");
		} else {
			System.out.println("News is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog1
		WebElement Blog1 = driver.findElement(By.xpath("//article[1]"));

		// to highlight the Blog1
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog1);
		
		// Blog1 is DISPLAYED or not
				boolean res4 = Blog1.isDisplayed();

				if (res4 == true) {
					System.out.println("Blog1 is DISPLAYED  ");
				} else {
					System.out.println("Blog1 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog2
		WebElement Blog2 = driver.findElement(By.xpath("//article[2]"));

		// to highlight the Blog2
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog2);
		
		// Blog2 is DISPLAYED or not
		boolean res5 = Blog2.isDisplayed();

		if (res5 == true) {
			System.out.println("Blog2 is DISPLAYED  ");
		} else {
			System.out.println("Blog2 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog3
		WebElement Blog3 = driver.findElement(By.xpath("//article[3]"));

		// to highlight the Blog3
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog3);
		
		// Blog3 is DISPLAYED or not
				boolean res6 = Blog3.isDisplayed();

				if (res6 == true) {
					System.out.println("Blog3 is DISPLAYED  ");
				} else {
					System.out.println("Blog3 is not DISPLAYED");
				}
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[normalize-space()='Wen Token?']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		
		// Wen_Token is DISPLAYED or not
		boolean res7 = Wen_Token.isDisplayed();

		if (res7 == true) {
			System.out.println("Wen_Token is DISPLAYED  ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);
		
		// Email_Field is DISPLAYED or not
				boolean res8 = Email_Field.isDisplayed();

				if (res8 == true) {
					System.out.println("Email_Field is DISPLAYED  ");
				} else {
					System.out.println("Email_Field is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);
		
		//-------------------------------------------------------------------------
		
		// See_our_privacy_policy is DISPLAYED or not
		boolean res9 = See_our_privacy_policy.isDisplayed();

		if (res9 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED  ");
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
				.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		
		// digitali_footer is DISPLAYED or not
				boolean res10 = digitali_footer.isDisplayed();

				if (res10 == true) {
					System.out.println("digitali_footer is DISPLAYED  ");
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
		boolean res11 = digitali_footer_text.isDisplayed();

		if (res11 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
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
				boolean res12 = Explore.isDisplayed();

				if (res12 == true) {
					System.out.println("Explore is DISPLAYED  ");
				} else {
					System.out.println("Explore is not DISPLAYED");
				}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);
		
		// Collections is DISPLAYED or not
		boolean res13 = Collections.isDisplayed();

		if (res13 == true) {
			System.out.println("Collections is DISPLAYED  ");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);
		
		// Leaderboard4 is DISPLAYED or not
				boolean res14 = Leaderboard4.isDisplayed();

				if (res14 == true) {
					System.out.println("Leaderboard4 is DISPLAYED  ");
				} else {
					System.out.println("Leaderboard4 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);
		
		// Reward_Points1 is DISPLAYED or not
		boolean res15 = Reward_Points1.isDisplayed();

		if (res15 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
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
				boolean res16 = About_Us1.isDisplayed();

				if (res16 == true) {
					System.out.println("About_Us1 is DISPLAYED  ");
				} else {
					System.out.println("About_Us1 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[@href='/about-us'][normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);
		
		// Digitali is DISPLAYED or not
		boolean res17 = Digitali.isDisplayed();

		if (res17 == true) {
			System.out.println("Digitali is DISPLAYED  ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);
		
		// Blogs_footer is DISPLAYED or not
				boolean res18 = Blogs_footer.isDisplayed();

				if (res18 == true) {
					System.out.println("Blogs_footer is DISPLAYED  ");
				} else {
					System.out.println("Blogs_footer is not DISPLAYED");
				}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);
		
		// FAQ1 is DISPLAYED or not
		boolean res19 = FAQ1.isDisplayed();

		if (res19 == true) {
			System.out.println("FAQ1 is DISPLAYED  ");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		
		// Legal is DISPLAYED or not
				boolean res20 = Legal.isDisplayed();

				if (res20 == true) {
					System.out.println("Legal is DISPLAYED  ");
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
		boolean res21 = Legal.isDisplayed();

		if (res21 == true) {
			System.out.println("Terms is DISPLAYED  ");
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
		boolean res22 = Privacy.isDisplayed();

		if (res22 == true) {
			System.out.println("Privacy is DISPLAYED  ");
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
				boolean res23 = All_Rights_Reserved.isDisplayed();

				if (res23 == true) {
					System.out.println("All_Rights_Reserved is DISPLAYED  ");
				} else {
					System.out.println("All_Rights_Reserved is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//		// locate Twitter_Icon
//		WebElement Twitter_Icon = driver.findElement(
//				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Twitter_Icon
//		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Twitter_Icon);
//		Thread.sleep(1000);
//
//		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Discord_Icon
//		WebElement Discord_Icon = driver
//				.findElement(By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Discord_Icon
//		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Discord_Icon);
//		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
}