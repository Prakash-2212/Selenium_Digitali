package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Earn_Reward_Points {

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

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath("//a[@type='button']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);

		Thread.sleep(1000);
		
		// Earn_Reward_Points is DISPLAYED or not
				boolean res1 = Earn_Reward_Points.isDisplayed();

				if (res1 == true) {
					System.out.println("Earn_Reward_Points is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Earn_Reward_Points is not DISPLAYED");
				}
		driver.manage().deleteAllCookies();
		Earn_Reward_Points.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Heading
		WebElement Heading = driver.findElement(By.xpath("//h3[normalize-space()='Earning Reward Points is easy!']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Heading);
		
		// Heading is DISPLAYED or not
		boolean res2 = Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Heading is DISPLAYED ");
		} else {
			System.out.println("Heading is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Step1
		WebElement Step1 = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Step1
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Step1);
		
		// Step1 is DISPLAYED or not
				boolean res3 = Step1.isDisplayed();

				if (res3 == true) {
					System.out.println("Step1 is DISPLAYED ");
				} else {
					System.out.println("Step1 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Our_content
		WebElement Our_content = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div/div[2]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Our_content
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_content);
		Thread.sleep(1000);
		
		// Our_content is DISPLAYED or not
		boolean res4 = Our_content.isDisplayed();

		if (res4 == true) {
			System.out.println("Our_content is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Our_content is not DISPLAYED");
		}
		Our_content.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Successful_submission
		WebElement Successful_submission = driver
				.findElement(By.xpath("//div[@id='__next']//div//div//section//div[3]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Successful_submission
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Successful_submission);
		Thread.sleep(1000);
		
		// Successful_submission is DISPLAYED or not
				boolean res5 = Successful_submission.isDisplayed();

				if (res5 == true) {
					System.out.println("Successful_submission is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Successful_submission is not DISPLAYED");
				}
		Successful_submission.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Collection_Image
		WebElement Collection_Image = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection_Image
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collection_Image);
		
		// Collection_Image is DISPLAYED or not
		boolean res6 = Collection_Image.isDisplayed();

		if (res6 == true) {
			System.out.println("Collection_Image is DISPLAYED ");
		} else {
			System.out.println("Collection_Image is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 650);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Find_your_NFT_Collection
		WebElement Find_your_NFT_Collection = driver
				.findElement(By.xpath("//span[normalize-space()='Find your NFT Collection']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Find_your_NFT_Collection
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Find_your_NFT_Collection);
		Thread.sleep(1000);
		
		// Find_your_NFT_Collection is DISPLAYED or not
		boolean res7 = Find_your_NFT_Collection.isDisplayed();

		if (res7 == true) {
			System.out.println("Find_your_NFT_Collection is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Find_your_NFT_Collection is not DISPLAYED");
		}

		Find_your_NFT_Collection.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse7.executeScript("scroll(0, 800);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate How_Reward_Points_Work
		WebElement How_Reward_Points_Work = driver
				.findElement(By.xpath("//h3[normalize-space()='How Reward Points Work?']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the How_Reward_Points_Work
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_Reward_Points_Work);
		
		// How_Reward_Points_Work is DISPLAYED or not
				boolean res8 = How_Reward_Points_Work.isDisplayed();

				if (res8 == true) {
					System.out.println("How_Reward_Points_Work is DISPLAYED  ");
				} else {
					System.out.println("How_Reward_Points_Work is not DISPLAYED");
				}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX1
		WebElement BOX1 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX1
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX1);
		
		// BOX1 is DISPLAYED or not
		boolean res9 = BOX1.isDisplayed();

		if (res9 == true) {
			System.out.println("BOX1 is DISPLAYED  ");
		} else {
			System.out.println("BOX1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX2
		WebElement BOX2 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX2
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX2);
		
		// BOX2 is DISPLAYED or not
				boolean res10 = BOX2.isDisplayed();

				if (res10 == true) {
					System.out.println("BOX2 is DISPLAYED  ");
				} else {
					System.out.println("BOX2 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX3
		WebElement BOX3 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX3
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX3);
		
		// BOX3 is DISPLAYED or not
		boolean res11 = BOX3.isDisplayed();

		if (res11 == true) {
			System.out.println("BOX3 is DISPLAYED  ");
		} else {
			System.out.println("BOX3 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX4
		WebElement BOX4 = driver.findElement(By.xpath(
				"//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/img[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX4
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX4);
		Thread.sleep(1000);
		jse111.executeScript("scroll(0, 1000);");
		
		// BOX4 is DISPLAYED or not
				boolean res12 = BOX4.isDisplayed();

				if (res12 == true) {
					System.out.println("BOX4 is DISPLAYED  ");
				} else {
					System.out.println("BOX4 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX5
		WebElement BOX5 = driver.findElement(By
				.xpath("//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX5
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX5);
		
		// BOX5 is DISPLAYED or not
		boolean res13 = BOX4.isDisplayed();

		if (res13 == true) {
			System.out.println("BOX5 is DISPLAYED  ");
		} else {
			System.out.println("BOX5 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

//		// locate BOX6
//		WebElement BOX6 = driver.findElement(
//				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]"));
//		Thread.sleep(1000);
//		driver.manage().deleteAllCookies();
//
//		// to highlight the BOX6
//		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
//		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX5);
//		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX7
		WebElement BOX7 = driver.findElement(By
				.xpath("//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX7
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX7);
		Thread.sleep(1000);
		
		// BOX7 is DISPLAYED or not
				boolean res14 = BOX7.isDisplayed();

				if (res14 == true) {
					System.out.println("BOX7 is DISPLAYED  ");
				} else {
					System.out.println("BOX7 is not DISPLAYED");
				}
		jse16.executeScript("scroll(0, 1600);");
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Content_Guidelines
		WebElement Content_Guidelines = driver.findElement(By.xpath("//h3[normalize-space()='Content Guidelines']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Content_Guidelines
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Content_Guidelines);
		
		// Content_Guidelines is DISPLAYED or not
		boolean res15 = Content_Guidelines.isDisplayed();

		if (res15 == true) {
			System.out.println("Content_Guidelines is DISPLAYED  ");
		} else {
			System.out.println("Content_Guidelines is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Neutrality
		WebElement Neutrality = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Neutrality
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Neutrality);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------
		// locate Clarity
		WebElement Clarity = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Clarity
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Clarity);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Transparency
		WebElement Transparency = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Transparency
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Transparency);
		Thread.sleep(1000);
		jse20.executeScript("scroll(0, 2200);");
		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Do_s
		WebElement Do_s = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Do_s
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Do_s);
		
		// Do_s is DISPLAYED or not
				boolean res16 = Do_s.isDisplayed();

				if (res16 == true) {
					System.out.println("Do_s is DISPLAYED  ");
				} else {
					System.out.println("Do_s is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Dont_s
		WebElement Dont_s = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[2]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Dont_s
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Dont_s);
		
		// Dont_s is DISPLAYED or not
		boolean res17 = Dont_s.isDisplayed();

		if (res17 == true) {
			System.out.println("Dont_s is DISPLAYED  ");
		} else {
			System.out.println("Dont_s is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse22.executeScript("scroll(0, 2800);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		
		// Wen_Token is DISPLAYED or not
				boolean res18 = Wen_Token.isDisplayed();

				if (res18 == true) {
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
		boolean res19 = Email_Field.isDisplayed();

		if (res19 == true) {
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
		
		// See_our_privacy_policy is DISPLAYED or not
				boolean res20 = See_our_privacy_policy.isDisplayed();

				if (res20 == true) {
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
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		
		// digitali_footer is DISPLAYED or not
		boolean res21 = digitali_footer.isDisplayed();

		if (res21 == true) {
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
				boolean res22 = digitali_footer_text.isDisplayed();

				if (res22 == true) {
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
		boolean res23 = Explore.isDisplayed();

		if (res23 == true) {
			System.out.println("Explore is DISPLAYED  ");
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
		boolean res24 = Collections.isDisplayed();

		if (res24 == true) {
			System.out.println("Collections is DISPLAYED  ");
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
				boolean res25 = Leaderboard4.isDisplayed();

				if (res25 == true) {
					System.out.println("Leaderboard4 is DISPLAYED  ");
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
		boolean res26 = Reward_Points1.isDisplayed();

		if (res26 == true) {
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
				boolean res27 = About_Us1.isDisplayed();

				if (res27 == true) {
					System.out.println("About_Us1 is DISPLAYED  ");
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
		boolean res28 = Digitali.isDisplayed();

		if (res28 == true) {
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
				boolean res29 = Blogs_footer.isDisplayed();

				if (res29 == true) {
					System.out.println("Blogs_footer is DISPLAYED  ");
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
		boolean res30 = FAQ1.isDisplayed();

		if (res30 == true) {
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
		boolean res31 = Legal.isDisplayed();

		if (res31 == true) {
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
				boolean res32 = Terms.isDisplayed();

				if (res32 == true) {
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
		boolean res33 = Privacy.isDisplayed();

		if (res33 == true) {
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
		boolean res34 = All_Rights_Reserved.isDisplayed();

		if (res34 == true) {
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
//				.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
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
