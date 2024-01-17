package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Collection_List_Page {

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

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		// Collection_Button is DISPLAYED or not
		boolean res1 = Collections_Button.isDisplayed();

		if (res1 == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}
		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate heading
		WebElement Collections_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Explore NFT Collections')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collections_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Heading);
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		// Collections_Heading is DISPLAYED or not
				boolean res2 = Collections_Heading.isDisplayed();

				if (res2 == true) {
					System.out.println("Collections_Heading is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Collections_Heading is not DISPLAYED");
				}
		// ---------------------------------------------------------------------------------------------------

//		// locate Sort_button
//		WebElement Sort_button = driver.findElement(By.xpath("//span[contains(text(),'Sort')]"));
//		Thread.sleep(1000);
//		driver.manage().deleteAllCookies();
//
//		// to highlight the Sort_button
//		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
//		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Sort_button);
//		Thread.sleep(1000);
//		driver.manage().deleteAllCookies();
		// -----------------------------------------------------------------------------------------------------------------------

		// locate Collection1
		WebElement Collection1 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/decentraland-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection1
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection1);
		Thread.sleep(1000);
		
		// Collection1 is DISPLAYED or not
		boolean res3 = Collection1.isDisplayed();

		if (res3 == true) {
			System.out.println("Collection1 is DISPLAYED   ");
		} else {
			System.out.println("Collection1 is not DISPLAYED");
		}

		jse4.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Collection2
		WebElement Collection2 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/dourdarcels-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection2
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection2);
		Thread.sleep(1000);
		
		// Collection2 is DISPLAYED or not
				boolean res4 = Collection2.isDisplayed();

				if (res4 == true) {
					System.out.println("Collection2 is DISPLAYED   ");
				} else {
					System.out.println("Collection2 is not DISPLAYED");
				}
		jse6.executeScript("scroll(0, 800);");

		// -----------------------------------------------------------------------------------------------------

		// locate Collection3
		WebElement Collection3 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/clonex-mintvial-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection3
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection3);
		Thread.sleep(1000);
		
		// Collection3 is DISPLAYED or not
		boolean res5 = Collection3.isDisplayed();

		if (res5 == true) {
			System.out.println("Collection3 is DISPLAYED   ");
		} else {
			System.out.println("Collection3 is not DISPLAYED");
		}
		jse7.executeScript("scroll(0, 1200);");

		// ---------------------------------------------------------------------------------------------------

		// locate Collection4
		WebElement Collection4 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/bored-ape-kennel-club-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection4
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection4);
		Thread.sleep(1000);
		
		// Collection4 is DISPLAYED or not
		boolean res6 = Collection3.isDisplayed();

		if (res6 == true) {
			System.out.println("Collection4 is DISPLAYED   ");
		} else {
			System.out.println("Collection4 is not DISPLAYED");
		}
		jse8.executeScript("scroll(0, 1800);");

		// ----------------------------------------------------------------------------------

		// locate Collection5
		WebElement Collection5 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/hapeprime-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection5
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection5);
		Thread.sleep(1000);
		
		// Collection5 is DISPLAYED or not
				boolean res7 = Collection5.isDisplayed();

				if (res7 == true) {
					System.out.println("Collection5 is DISPLAYED   ");
				} else {
					System.out.println("Collection5 is not DISPLAYED");
				}
		jse9.executeScript("scroll(0, 2400);");

		// ------------------------------------------------------------------------------

		// locate Collection6
		WebElement Collection6 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/bored-ape-chemistry-club-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection6
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection6);
		
		// Collection6 is DISPLAYED or not
		boolean res8 = Collection6.isDisplayed();

		if (res8 == true) {
			System.out.println("Collection6 is DISPLAYED   ");
		} else {
			System.out.println("Collection6 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------

		// locate Page_no_1
		WebElement Page_no_1 = driver.findElement(By.xpath("//a[normalize-space()='1']"));
		Thread.sleep(1000);

		// to highlight the Page_no_1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_1);
		
		// Page_no_1 is DISPLAYED or not
				boolean res9 = Page_no_1.isDisplayed();

				if (res9 == true) {
					System.out.println("Page_no_1 is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Page_no_1 is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Page_no_2
		WebElement Page_no_2 = driver.findElement(By.xpath("//a[normalize-space()='2']"));
		Thread.sleep(1000);

		// to highlight the Page_no_2
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_2);
		Thread.sleep(1000);
		
		// Page_no_2 is DISPLAYED or not
		boolean res10 = Page_no_1.isDisplayed();

		if (res10 == true) {
			System.out.println("Page_no_2 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_2 is not DISPLAYED");
		}
		Page_no_2.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Page_no_3
		WebElement Page_no_3 = driver.findElement(By.xpath("//a[normalize-space()='3']"));
		Thread.sleep(1000);

		// to highlight the Page_no_3
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_3);
		Thread.sleep(1000);
		
		// Page_no_3 is DISPLAYED or not
		boolean res11 = Page_no_3.isDisplayed();

		if (res11 == true) {
			System.out.println("Page_no_3 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_3 is not DISPLAYED");
		}
		Page_no_3.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Page_no_4
		WebElement Page_no_4 = driver.findElement(By.xpath("//a[normalize-space()='4']"));
		Thread.sleep(000);

		// to highlight the Page_no_4
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_4);
		Thread.sleep(000);
		
		
		// Page_no_3 is DISPLAYED or not
				boolean res12 = Page_no_4.isDisplayed();

				if (res12 == true) {
					System.out.println("Page_no_4 is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Page_no_4 is not DISPLAYED");
				}
		Page_no_4.click();
		// Thread.sleep(1000);
		
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------		

		// locate Page_no_5
		WebElement Page_no_5 = driver.findElement(By.xpath("//a[normalize-space()='5']"));
		Thread.sleep(1000);

		// to highlight the Page_no_5
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_5);
		// Thread.sleep(1000);
		
		// Page_no_5 is DISPLAYED or not
		boolean res13 = Page_no_4.isDisplayed();

		if (res13 == true) {
			System.out.println("Page_no_5 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_5 is not DISPLAYED");
		}
		Page_no_5.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------

		// locate Page_no_6
		WebElement Page_no_6 = driver.findElement(By.xpath("//a[normalize-space()='6']"));
		Thread.sleep(1000);

		// to highlight the Page_no_6
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_6);
		Thread.sleep(1000);
		
		// Page_no_6 is DISPLAYED or not
				boolean res14 = Page_no_6.isDisplayed();

				if (res14 == true) {
					System.out.println("Page_no_6 is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Page_no_6 is not DISPLAYED");
				}
		Page_no_6.click();
		Thread.sleep(1000);

		jse16.executeScript("scroll(0, 1400);");
//------------------------------------------------------------------------------------------------

		// locate Tweet to us
		WebElement Tweet_to_us = driver.findElement(By.xpath("//a[normalize-space()='Tweet to us']"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Tweet_to_us);
		Thread.sleep(1000);
		
		// Tweet is DISPLAYED or not
		boolean res15 = Tweet_to_us.isDisplayed();

		if (res15 == true) {
			System.out.println("Tweet_to_us is DISPLAYED   ");
		} else {
			System.out.println("Tweet_to_us is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------

		// locate Message_us
		WebElement Message_us = driver.findElement(By.xpath("//a[normalize-space()='Message us']"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Message_us);
		Thread.sleep(1000);
		
		// Message_us is DISPLAYED or not
				boolean res16 = Message_us.isDisplayed();

				if (res16 == true) {
					System.out.println("Message_us is DISPLAYED ");
				} else {
					System.out.println("Message_us is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------

		// locate NFT_Collection_card
		WebElement NFT_Collection_card = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[2]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				NFT_Collection_card);
		Thread.sleep(1000);
		
		// NFT_Collection_card is DISPLAYED or not
		boolean res17 = NFT_Collection_card.isDisplayed();

		if (res17 == true) {
			System.out.println("NFT_Collection_card is DISPLAYED ");
		} else {
			System.out.println("NFT_Collection_card is not DISPLAYED");
		}
		jse19.executeScript("scroll(0, 2200);");

		// ------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		Thread.sleep(1000);
		
		// Wen_Token is DISPLAYED or not
				boolean res18 = Wen_Token.isDisplayed();

				if (res18 == true) {
					System.out.println("Wen_Token is DISPLAYED ");
				} else {
					System.out.println("Wen_Token is not DISPLAYED");
				}

		// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);
		
		// Email_Field is DISPLAYED or not
		boolean res19 = Wen_Token.isDisplayed();

		if (res19 == true) {
			System.out.println("Email_Field is DISPLAYED ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);
		
		// See_our_privacy_policy is DISPLAYED or not
		boolean res20 = See_our_privacy_policy.isDisplayed();

		if (res20 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

//				See_our_privacy_policy.click();
//                    Thread.sleep(1000);	
//             driver.navigate().back();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

//          // locate Collections_Button1
//     		WebElement Collections_Button1 = driver
//     				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
//     		Thread.sleep(1000);
//     		driver.manage().deleteAllCookies();
//
//     		// to highlight the Collection_Button
//     		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
//     		jse111.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//     				Collections_Button1);
//
//     		Thread.sleep(1000);
//     		driver.manage().deleteAllCookies();
//     		Collections_Button.click();
//     		driver.manage().deleteAllCookies();
//     		Thread.sleep(1000);
//				
		jse16.executeScript("scroll(0, 5000);");

		// -------------------------------------------------------------------------------------------

		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		// Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		
		// digitali_footer is DISPLAYED or not
		boolean res21 = digitali_footer.isDisplayed();

		if (res21 == true) {
			System.out.println("digitali_footer is DISPLAYED ");
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
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);
		
		// digitali_footer_text is DISPLAYED or not
				boolean res22 = digitali_footer.isDisplayed();

				if (res22 == true) {
					System.out.println("digitali_footer_text is DISPLAYED ");
				} else {
					System.out.println("digitali_footer_text is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);
		Thread.sleep(1000);
		
		// Explore is DISPLAYED or not
		boolean res23 = Explore.isDisplayed();

		if (res23 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collection
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(1000);
		
		// Collection is DISPLAYED or not
				boolean res24 = Collection.isDisplayed();

				if (res24 == true) {
					System.out.println("Collection is DISPLAYED ");
				} else {
					System.out.println("Collection is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);
		
		// Leaderboard4 is DISPLAYED or not
		boolean res25 = Leaderboard4.isDisplayed();

		if (res25 == true) {
			System.out.println("Leaderboard4 is DISPLAYED ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);
		Thread.sleep(1000);
		
		// Reward_Points1 is DISPLAYED or not
				boolean res26 = Reward_Points1.isDisplayed();

				if (res26 == true) {
					System.out.println("Reward_Points1 is DISPLAYED ");
				} else {
					System.out.println("Reward_Points1 is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_us1
		WebElement About_us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_us1
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_us1);
		 Thread.sleep(1000);
		 
		// About_us1 is DISPLAYED or not
			boolean res27 = About_us1.isDisplayed();

			if (res27 == true) {
				System.out.println("About_us1 is DISPLAYED ");
			} else {
				System.out.println("About_us1 is not DISPLAYED");
			}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);
		Thread.sleep(1000);
		
		// Digitali is DISPLAYED or not
					boolean res28 = Digitali.isDisplayed();

					if (res28 == true) {
						System.out.println("Digitali is DISPLAYED ");
					} else {
						System.out.println("Digitali is not DISPLAYED");
					}

		// -------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		// Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);
		Thread.sleep(1000);
		
		// Blogs_footer is DISPLAYED or not
		boolean res29 = Digitali.isDisplayed();

		if (res29 == true) {
			System.out.println("Blogs_footer is DISPLAYED ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}


		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);
		
		// FAQ is DISPLAYED or not
				boolean res30 = FAQ.isDisplayed();

				if (res30 == true) {
					System.out.println("FAQ is DISPLAYED ");
				} else {
					System.out.println("FAQ is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		Thread.sleep(1000);
		
		// Legal is DISPLAYED or not
		boolean res31 = Legal.isDisplayed();

		if (res31 == true) {
			System.out.println("Legal is DISPLAYED ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);
		Thread.sleep(1000);
		
		// Terms is DISPLAYED or not
				boolean res32 = Legal.isDisplayed();

				if (res32 == true) {
					System.out.println("Terms is DISPLAYED ");
				} else {
					System.out.println("Terms is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);
		Thread.sleep(1000);

		
		// Privacy is DISPLAYED or not
		boolean res33 = Legal.isDisplayed();

		if (res33 == true) {
			System.out.println("Privacy is DISPLAYED ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);
		Thread.sleep(1000);
		
		// All_Rights_Reserved is DISPLAYED or not
				boolean res34 = All_Rights_Reserved.isDisplayed();

				if (res34 == true) {
					System.out.println("All_Rights_Reserved is DISPLAYED ");
				} else {
					System.out.println("All_Rights_Reserved is not DISPLAYED");
				}

		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Twitter_Icon
//		WebElement Twitter_Icon = driver.findElement(
//				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Twitter_Icon
//		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
//		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Twitter_Icon);
//		Thread.sleep(1000);
//
//		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Discord_Icon
//		WebElement Discord_Icon = driver.findElement(
//				By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//		Thread.sleep(1000);
//
//		// to highlight the Discord_Icon
//		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
//		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Discord_Icon);
//		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
}