package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Terms {

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

		// ------------------------------------------------------------------------------------------------

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		
		
		// digitali_logo is DISPLAYED or not
		boolean res = digitali_logo.isDisplayed();

		if (res == true) {
			System.out.println("digitali_logo is DISPLAYED ");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}
		Thread.sleep(1000);

		jse.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the Terms
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		Thread.sleep(2000);
		
		// Terms is DISPLAYED or not
				boolean res1 = Terms.isDisplayed();

				if (res1 == true) {
					System.out.println("Terms is DISPLAYED ");
				} else {
					System.out.println("Terms is not DISPLAYED");
				}
		driver.manage().deleteAllCookies();
		Terms.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Terms_Heading
		WebElement Terms_Heading = driver.findElement(By.xpath("//div[contains(text(),'Terms Of Service')]"));
		Thread.sleep(1000);

		// to highlight the Terms_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Terms_Heading);
		
		// Terms_Heading is DISPLAYED or not
		boolean res2 = Terms_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Terms_Heading is DISPLAYED ");
		} else {
			System.out.println("Terms_Heading is not DISPLAYED");
		}

		// Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate Text1
		WebElement Text1 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[2]/p[1]"));
		Thread.sleep(1000);

		// to highlight the Text1
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

		// Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate Text2
		WebElement Text2 = driver.findElement(By.xpath("//div[contains(text(),'Your Access to the Services')]"));
		Thread.sleep(1000);

		// to highlight the Text2
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text2);

		// Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate Text3
		WebElement Text3 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[4]"));
		Thread.sleep(1000);

		// to highlight the Text3
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

		// Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate Text5
		WebElement Text5 = driver.findElement(By.xpath("//div[contains(text(),'Your Use of the Services')]"));
		Thread.sleep(1000);

		// to highlight the Text5
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text5);

		// Thread.sleep(1000);
		jse7.executeScript("scroll(0, 700);");

		// -------------------------------------------------------------------------------------

		// locate Text6
		WebElement Text6 = driver
				.findElement(By.xpath("//div[contains(text(),'Subject to your complete and ongoing compliance wi')]"));
		Thread.sleep(1000);

		// to highlight the Text6
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Text6);

		// Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate Text7
		WebElement Text7 = driver.findElement(By.xpath("//div[contains(text(),'Personal Use Only')]"));
		Thread.sleep(1000);

		// to highlight the Text7
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text7);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Text8
		WebElement Text8 = driver.findElement(By.xpath("//div[contains(text(),'Personal Use Only')]"));
		Thread.sleep(1000);

		// to highlight the Text8
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text8);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Text9
		WebElement Text9 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[8]/p[1]"));
		Thread.sleep(1000);

		// to highlight the Text9
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text9);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text10
		WebElement Text10 = driver.findElement(By.xpath("//div[contains(text(),'Not Investment Advice')]"));
		Thread.sleep(1000);

		// to highlight the Text10
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text10);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text11
		WebElement Text11 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[10]/p[1]"));
		Thread.sleep(1000);

		// to highlight the Text11
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text11);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text12
		WebElement Text12 = driver
				.findElement(By.xpath("//p[contains(text(),'References to any specific NFT or other product or')]"));
		Thread.sleep(1000);

		// to highlight the Text12
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

		// Thread.sleep(1000);
		jse14.executeScript("scroll(0, 1200);");

//------------------------------------------------------------------------------------------------

		// locate Text13
		WebElement Text13 = driver.findElement(By.xpath("//div[contains(text(),'No Reverse Engineering')]"));
		Thread.sleep(1000);

		// to highlight the Text13
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text13);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text14
		WebElement Text14 = driver
				.findElement(By.xpath("//p[contains(text(),'You may not, and you agree not to or enable others')]"));
		Thread.sleep(1000);

		// to highlight the Text14
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text14);

		// Thread.sleep(1000);
		jse16.executeScript("scroll(0, 1500);");
//------------------------------------------------------------------------------------------------

		// locate Text15
		WebElement Text15 = driver.findElement(By.xpath("//div[contains(text(),'Copyright')]"));
		Thread.sleep(1000);

		// to highlight the Text15
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text15);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text16
		WebElement Text16 = driver
				.findElement(By.xpath("//p[contains(text(),'All information available through this website is ')]"));
		Thread.sleep(1000);

		// to highlight the Text16
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text16);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text17
		WebElement Text17 = driver
				.findElement(By.xpath("//p[contains(text(),'You are granted only a limited, non-exclusive, rev')]"));
		Thread.sleep(1000);

		// to highlight the Text17
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text17);

		// Thread.sleep(1000);
		jse19.executeScript("scroll(0, 1300);");
//------------------------------------------------------------------------------------------------

		// locate Text18
		WebElement Text18 = driver.findElement(By.xpath("//div[normalize-space()='Trademarks']"));
		Thread.sleep(1000);

		// to highlight the Text18
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text18);

		// Thread.sleep(1000);
		jse20.executeScript("scroll(0, 1300);");

//------------------------------------------------------------------------------------------------

		// locate Text19
		WebElement Text19 = driver
				.findElement(By.xpath("//p[contains(text(),'All trademarks used in conjunction with any Digita')]"));
		Thread.sleep(1000);

		// to highlight the Text19
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text19);

		// Thread.sleep(1000);
		jse21.executeScript("scroll(0, 2000);");

//------------------------------------------------------------------------------------------------

		// locate Text20
		WebElement Text20 = driver.findElement(By.xpath("//div[normalize-space()='User-Generated Content']"));
		Thread.sleep(1000);

		// to highlight the Text20
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text20);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text21
		WebElement Text21 = driver
				.findElement(By.xpath("//p[contains(text(),'The Services may include means by which you and ot')]"));
		Thread.sleep(1000);

		// to highlight the Text21
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text21);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text22
		WebElement Text22 = driver
				.findElement(By.xpath("//div[normalize-space()='Disclaimers - Services are Provided As-Is']"));
		Thread.sleep(1000);

		// to highlight the Text22
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text22);

		// Thread.sleep(1000);
		jse21.executeScript("scroll(0, 2400);");
//------------------------------------------------------------------------------------------------

		// locate Text23
		WebElement Text23 = driver
				.findElement(By.xpath("//p[contains(text(),'Neither Cumberland Labs, Digitali, nor any of its ')]"));
		Thread.sleep(1000);

		// to highlight the Text23
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text23);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text24
		WebElement Text24 = driver
				.findElement(By.xpath("//p[contains(text(),'NEITHER CUMBERLAND INNOVATIONS LLC, DIGITALI NOR A')]"));
		Thread.sleep(1000);

		// to highlight the Text24
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text24);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text25
		WebElement Text25 = driver
				.findElement(By.xpath("//p[contains(text(),'NEITHER CUMBERLAND INNOVATIONS LLC, DIGITALI, NOR ')]"));
		Thread.sleep(1000);

		// to highlight the Text25
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text25);

		// Thread.sleep(1000);
		jse27.executeScript("scroll(0, 2900);");

		// ------------------------------------------------------------------------------------------------------

		// locate Text26
		WebElement Text26 = driver.findElement(By.xpath("//div[normalize-space()='Governing Law and Venue']"));
		Thread.sleep(1000);

		// to highlight the Text26
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text26);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text27
		WebElement Text27 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[22]/p[1]"));
		Thread.sleep(1000);

		// to highlight the Text27
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text27);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text28
		WebElement Text28 = driver.findElement(By.xpath("//div[contains(text(),'Changes to these Terms')]"));
		Thread.sleep(1000);

		// to highlight the Text28
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text28);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text29
		WebElement Text29 = driver
				.findElement(By.xpath("//p[contains(text(),'We may make changes to these Terms from time to ti')]"));
		Thread.sleep(1000);

		// to highlight the Text29
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text29);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text30
		WebElement Text30 = driver.findElement(By.xpath("//div[contains(text(),'Termination')]"));
		Thread.sleep(1000);

		// to highlight the Text30
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text30);

		// Thread.sleep(1000);
		jse32.executeScript("scroll(0, 3800);");

		// ------------------------------------------------------------------------------------------------------

		// locate Text31
		WebElement Text31 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[26]/p[1]"));
		Thread.sleep(1000);

		// to highlight the Text31
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text31);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text32
		WebElement Text32 = driver
				.findElement(By.xpath("//p[contains(text(),'The following sections will survive any terminatio')]"));
		Thread.sleep(1000);

		// to highlight the Text32
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text32);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text33
		WebElement Text33 = driver.findElement(By.xpath("//div[contains(text(),'Miscellaneous')]"));
		Thread.sleep(1000);

		// to highlight the Text33
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text33);

		// Thread.sleep(1000);
		jse35.executeScript("scroll(0, 3800);");

		// ------------------------------------------------------------------------------------------------------

		// locate Text34
		WebElement Text34 = driver
				.findElement(By.xpath("//p[contains(text(),'These Terms, together with the Privacy Policy and ')]"));
		Thread.sleep(1000);

		// to highlight the Text34
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text34);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text35
		WebElement Text35 = driver
				.findElement(By.xpath("//p[contains(text(),'These Terms are a legally binding agreement betwee')]"));
		Thread.sleep(1000);

		// to highlight the Text35
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text35);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

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

//				// ---------------------------------------------------------------------------------------------
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

				// locate Terms11
				WebElement Terms11 = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
				Thread.sleep(1000);

				// to highlight the Terms11
				JavascriptExecutor jse61 = (JavascriptExecutor) driver;
				jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms11);

				// Terms is DISPLAYED or not
				boolean res41 = Terms11.isDisplayed();

				if (res41 == true) {
					System.out.println("Terms11 is DISPLAYED");
				} else {
					System.out.println("Terms11 is not DISPLAYED");
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
