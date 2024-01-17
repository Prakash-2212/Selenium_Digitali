package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Collection_detail_page {

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

		// to highlight the Collection_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(1000);

		// Collections_Button is DISPLAYED or not
		boolean res = Collections_Button.isDisplayed();

		if (res == true) {
			System.out.println("Collections_Button is DISPLAYED  ");
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
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		
		// Collection is DISPLAYED or not
				boolean res1 = Collection.isDisplayed();

				if (res1 == true) {
					System.out.println("Collection is DISPLAYED  ");
				} else {
					System.out.println("Collection is not DISPLAYED");
				}
		Collection.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);
		
		// Collection_Name is DISPLAYED or not
		boolean res2 = Collection_Name.isDisplayed();

		if (res2 == true) {
			System.out.println("Collection_Name is DISPLAYED  ");
		} else {
			System.out.println("Collection_Name is not DISPLAYED");
		}
		Thread.sleep(1000);

		jse3.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Collection_Info
		WebElement Collection_Info = driver
				.findElement(By.xpath("//div[contains(text(),'Decentraland is a user-governed virtual world wher')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Info
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Info);
		
		// Collection_Info is DISPLAYED or not
		boolean res3 = Collection_Info.isDisplayed();

		if (res3 == true) {
			System.out.println("Collection_Info is DISPLAYED  ");
		} else {
			System.out.println("Collection_Info is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 250);");
		// ---------------------------------------------------------------------------------------------------------

		// locate ETH_Address_bar
		WebElement ETH_Address_bar = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the ETH_Address_bar
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				ETH_Address_bar);
		
		// ETH_Address_bar is DISPLAYED or not
				boolean res4 = ETH_Address_bar.isDisplayed();

				if (res4 == true) {
					System.out.println("ETH_Address_bar is DISPLAYED  ");
				} else {
					System.out.println("ETH_Address_bar is not DISPLAYED");
				}
		
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Website
		WebElement Website = driver
				.findElement(By.xpath("//a[@href='https://decentraland.org/']//div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Website
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Website);
		
		// Website is DISPLAYED or not
		boolean res5 = Website.isDisplayed();

		if (res5 == true) {
			System.out.println("Website is DISPLAYED  ");
		} else {
			System.out.println("Website is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Twitter
		WebElement Twitter = driver.findElement(By.xpath(
				"//a[@href='https://twitter.com/decentraland']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Twitter
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Twitter);
		
		// Twitter is DISPLAYED or not
				boolean res6 = Twitter.isDisplayed();

				if (res6 == true) {
					System.out.println("Twitter is DISPLAYED  ");
				} else {
					System.out.println("Twitter is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Insta
		WebElement Insta = driver.findElement(By.xpath(
				"//a[@href='https://ig.me/m/decentraland_foundation/']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Insta
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Insta);
		
		// Insta is DISPLAYED or not
		boolean res7 = Insta.isDisplayed();

		if (res7 == true) {
			System.out.println("Insta is DISPLAYED  ");
		} else {
			System.out.println("Insta is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Discord
		WebElement Discord = driver.findElement(
				By.xpath("//div[@class='flex justify-between banner-collection-detail-wrapper']//a[4]//div[1]"));
		Thread.sleep(1000);

		// to highlight the Discord
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Discord);
		
		// Insta is DISPLAYED or not
				boolean res8 = Insta.isDisplayed();

				if (res8 == true) {
					System.out.println("Discord is DISPLAYED  ");
				} else {
					System.out.println("Discord is not DISPLAYED");
				}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Stats
		WebElement Token = driver.findElement(By.xpath("//div[@class='flex flex-col gap-5']"));
		Thread.sleep(1000);

		// to highlight the Token
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", Token);
		Thread.sleep(1000);
		
		
		// Token is DISPLAYED or not
		boolean res9 = Token.isDisplayed();

		if (res9 == true) {
			System.out.println("Token is DISPLAYED  ");
		} else {
			System.out.println("Token is not DISPLAYED");
		}
		jse10.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Project_Information
		WebElement Project_Information = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Project Information']"));
		Thread.sleep(1000);

		// to highlight the Project_Information
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Project_Information);
		Thread.sleep(1000);
		
		// Project_Information is DISPLAYED or not
				boolean res10 = Project_Information.isDisplayed();

				if (res10 == true) {
					System.out.println("Project_Information is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Project_Information is not DISPLAYED");
				}

		Project_Information.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Project_Information_data
		WebElement Project_Information_data = driver.findElement(
				By.xpath("//div[@id='project-information']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Project_Information_data
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Project_Information_data);
		
		// Project_Information_data is DISPLAYED or not
		boolean res11 = Project_Information_data.isDisplayed();

		if (res11 == true) {
			System.out.println("Project_Information_data is DISPLAYED  ");
		} else {
			System.out.println("Project_Information_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------

		// locate Functionality
		WebElement Functionality = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Functionality']"));
		Thread.sleep(1000);

		// to highlight the Functionality
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Functionality);
		
		// Functionality is DISPLAYED or not
				boolean res12 = Functionality.isDisplayed();

				if (res12 == true) {
					System.out.println("Functionality is DISPLAYED  AND CLICKABLE");
				} else {
					System.out.println("Functionality is not DISPLAYED");
				}
		Thread.sleep(1000);

		Functionality.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Functionality_data
		WebElement Functionality_data = driver
				.findElement(By.xpath("//div[@id='functionality']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Functionality_data
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Functionality_data);
		
		// Functionality_data is DISPLAYED or not
		boolean res13 = Functionality_data.isDisplayed();

		if (res13 == true) {
			System.out.println("Functionality_data is DISPLAYED  ");
		} else {
			System.out.println("Functionality_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Ownership_Rights
		WebElement Ownership_Rights = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Ownership Rights']"));
		Thread.sleep(1000);

		// to highlight the Ownership_Rights
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Ownership_Rights);
		
		// Ownership_Rights is DISPLAYED or not
				boolean res14 = Ownership_Rights.isDisplayed();

				if (res14 == true) {
					System.out.println("Ownership_Rights is DISPLAYED  AND CLICKABLE");
				} else {
					System.out.println("Ownership_Rights is not DISPLAYED");
				}
		Thread.sleep(1000);

		Ownership_Rights.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Ownership_data
		WebElement Ownership_data = driver.findElement(By.xpath("//div[@id='ownership-rights']"));
		Thread.sleep(1000);

		// to highlight the Ownership_data
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Ownership_data);
		
		// Ownership_data is DISPLAYED or not
		boolean res15 = Ownership_data.isDisplayed();

		if (res15 == true) {
			System.out.println("Ownership_data is DISPLAYED  ");
		} else {
			System.out.println("Ownership_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Rarity_Traits
		WebElement Rarity_Traits = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Rarity Traits']"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Rarity_Traits);
		
		// Rarity_Traits is DISPLAYED or not
		boolean res16 = Rarity_Traits.isDisplayed();

		if (res16 == true) {
			System.out.println("Rarity_Traits is DISPLAYED  AND CLICKABLE");
		} else {
			System.out.println("Rarity_Traits is not DISPLAYED");
		}
		Thread.sleep(1000);

		Rarity_Traits.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Rarity_Traits_data
		WebElement Rarity_Traits_data = driver
				.findElement(By.xpath("//div[@id='rarity-traits']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits_data
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Rarity_Traits_data);
		
		// Rarity_Traits_data is DISPLAYED or not
				boolean res17 = Rarity_Traits_data.isDisplayed();

				if (res17 == true) {
					System.out.println("Rarity_Traits_data is DISPLAYED  ");
				} else {
					System.out.println("Rarity_Traits_data is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Upcoming_Events
		WebElement Upcoming_Events = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Upcoming Events']"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Upcoming_Events);
		
		// Upcoming_Events is DISPLAYED or not
		boolean res18 = Upcoming_Events.isDisplayed();

		if (res18 == true) {
			System.out.println("Upcoming_Events is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Upcoming_Events is not DISPLAYED");
		}
		Thread.sleep(1000);

		Upcoming_Events.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Upcoming_Events_data
		WebElement Upcoming_Events_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[5]"));
		Thread.sleep(1000);

		// to highlight the Upcoming_Events_data
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Upcoming_Events_data);
		
		// Upcoming_Events_data is DISPLAYED or not
		boolean res19 = Upcoming_Events_data.isDisplayed();

		if (res19 == true) {
			System.out.println("Upcoming_Events_data is DISPLAYED  ");
		} else {
			System.out.println("Upcoming_Events_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Marketplace_Links
		WebElement Marketplace_Links = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Marketplace Links']"));
		Thread.sleep(1000);

		// to highlight the Marketplace_Links
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Marketplace_Links);
		
		// Marketplace_Links is DISPLAYED or not
				boolean res20 = Marketplace_Links.isDisplayed();

				if (res20 == true) {
					System.out.println("Marketplace_Links is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Marketplace_Links is not DISPLAYED");
				}
		Thread.sleep(1000);

		Marketplace_Links.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Marketplace_Links_data
		WebElement Marketplace_Links_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[6]"));
		Thread.sleep(1000);

		// to highlight the Marketplace_Links_data
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Marketplace_Links_data);
		
		// Marketplace_Links_data is DISPLAYED or not
		boolean res21 = Marketplace_Links_data.isDisplayed();

		if (res21 == true) {
			System.out.println("Marketplace_Links_data is DISPLAYED  ");
		} else {
			System.out.println("MarMarketplace_Links_dataketplace_Links is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Creative_Team
		WebElement Creative_Team = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Creative Team']"));
		Thread.sleep(1000);

		// to highlight the Creative_Team
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Creative_Team);
		
		// Creative_Team is DISPLAYED or not
				boolean res22 = Creative_Team.isDisplayed();

				if (res22 == true) {
					System.out.println("Creative_Team is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Creative_Team is not DISPLAYED");
				}
				Thread.sleep(1000);
		Thread.sleep(1000);

		Creative_Team.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Creative_Team_data
		WebElement Creative_Team_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[7]"));
		Thread.sleep(1000);

		// to highlight the Creative_Team_data
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Creative_Team_data);
		
		// Creative_Team_data is DISPLAYED or not
		boolean res23 = Creative_Team_data.isDisplayed();

		if (res23 == true) {
			System.out.println("Creative_Team_data is DISPLAYED  ");
		} else {
			System.out.println("Creative_Team_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Partnership
		WebElement Partnership = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Partnership']"));
		Thread.sleep(1000);

		// to highlight the Partnership
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Partnership);
		
		// Partnership is DISPLAYED or not
				boolean res24 = Partnership.isDisplayed();

				if (res24 == true) {
					System.out.println("Partnership is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Partnership is not DISPLAYED");
				}
		Thread.sleep(1000);

		Partnership.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Partnership_data
		WebElement Partnership_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[8]/div[2]"));
		Thread.sleep(1000);

		// to highlight the Partnership_data
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Partnership_data);
		
		// Partnership_data is DISPLAYED or not
		boolean res25 = Partnership.isDisplayed();

		if (res25 == true) {
			System.out.println("Partnership_data is DISPLAYED  ");
		} else {
			System.out.println("Partnership_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Notable_Owners
		WebElement Notable_Owners = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Notable Owners']"));
		Thread.sleep(1000);

		// to highlight the Notable_Owners
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Notable_Owners);
		
		// Notable_Owners is DISPLAYED or not
				boolean res26 = Notable_Owners.isDisplayed();

				if (res26 == true) {
					System.out.println("Notable_Owners is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Notable_Owners is not DISPLAYED");
				}
		Thread.sleep(1000);

		Notable_Owners.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Notable_Owners_data
		WebElement Notable_Owners_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[9]/div[2]"));
		Thread.sleep(1000);

		// to highlight the Notable_Owners_data
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Notable_Owners_data);
		
		// Notable_Owners_data is DISPLAYED or not
		boolean res27 = Notable_Owners_data.isDisplayed();

		if (res27 == true) {
			System.out.println("Notable_Owners_data is DISPLAYED  ");
		} else {
			System.out.println("Notable_Owners_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate News_and_Articles
		WebElement News_and_Articles = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='News and Articles']"));
		Thread.sleep(1000);

		// to highlight the News_and_Articles
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_and_Articles);
		Thread.sleep(1000);
		
		// News_and_Articles is DISPLAYED or not
				boolean res28 = News_and_Articles.isDisplayed();

				if (res28 == true) {
					System.out.println("News_and_Articles is DISPLAYED  ");
				} else {
					System.out.println("News_and_Articles is not DISPLAYED");
				}

		News_and_Articles.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate News_and_Articles_data
		WebElement News_and_Articles_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[10]"));
		Thread.sleep(1000);

		// to highlight the News_and_Articles_data
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				News_and_Articles_data);
		
		// News_and_Articles_data is DISPLAYED or not
		boolean res29 = News_and_Articles_data.isDisplayed();

		if (res29 == true) {
			System.out.println("News_and_Articles_data is DISPLAYED  ");
		} else {
			System.out.println("News_and_Articles_data is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse30.executeScript("scroll(0, 8500);");

		// -----------------------------------------------------------------------------------------------------------

		// locate Top_NFTs_of_this_collection
		WebElement Top_NFTs_of_this_collection = driver
				.findElement(By.xpath("//h1[contains(text(),'Top NFTs of this collection')]"));
		Thread.sleep(1000);

		// to highlight the Top_NFTs_of_this_collection
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Top_NFTs_of_this_collection);
		
		// Top_NFTs_of_this_collection is DISPLAYED or not
				boolean res30 = Top_NFTs_of_this_collection.isDisplayed();

				if (res30 == true) {
					System.out.println("Top_NFTs_of_this_collection is DISPLAYED  ");
				} else {
					System.out.println("Top_NFTs_of_this_collection is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate left_swipe
		WebElement left_swipe = driver.findElement(
				By.xpath("//div[@class='sc-d9026495-2 lmFsid']//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the left_swipe
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				left_swipe);
		
		// left_swipe is DISPLAYED or not
		boolean res31 = left_swipe.isDisplayed();

		if (res31 == true) {
			System.out.println("left_swipe is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("left_swipe is not DISPLAYED");
		}
		Thread.sleep(1000);
		left_swipe.click();
		left_swipe.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate Right_swipe
		WebElement Right_swipe = driver
				.findElement(By.xpath("//div[@class='sc-d9026495-2 lmFsid']//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Right_swipe
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Right_swipe);
		
		// Right_swipe is DISPLAYED or not
		boolean res32 = Right_swipe.isDisplayed();

		if (res32 == true) {
			System.out.println("Right_swipe is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Right_swipe is not DISPLAYED");
		}
		Thread.sleep(1000);
		Right_swipe.click();
		Right_swipe.click();
		Thread.sleep(1000);
		jse33.executeScript("scroll(0, 9000);");

		// -----------------------------------------------------------------------------------------------------------

		// locate Other_NFT_Collections
		WebElement Other_NFT_Collections = driver
				.findElement(By.xpath("//h1[contains(text(),'Other NFT Collections')]"));
		Thread.sleep(1000);

		// to highlight the Other_NFT_Collections
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Other_NFT_Collections);
		
		// Other_NFT_Collections is DISPLAYED or not
				boolean res33 = Other_NFT_Collections.isDisplayed();

				if (res33 == true) {
					System.out.println("Other_NFT_Collections is DISPLAYED   ");
				} else {
					System.out.println("Other_NFT_Collections is not DISPLAYED");
				}
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate left_swipe1
		WebElement left_swipe1 = driver.findElement(
				By.xpath("//div[@class='sc-ece1a9d2-2 iUXLNY']//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the left_swipe1
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				left_swipe1);
		
		// left_swipe1 is DISPLAYED or not
		boolean res34 = left_swipe1.isDisplayed();

		if (res34 == true) {
			System.out.println("left_swipe1 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("left_swipe1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		left_swipe1.click();
		left_swipe1.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate Right_swipe1
		WebElement Right_swipe1 = driver
				.findElement(By.xpath("//div[@class='sc-ece1a9d2-2 iUXLNY']//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Right_swipe1
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Right_swipe1);
		Thread.sleep(1000);
		
		// Right_swipe1 is DISPLAYED or not
				boolean res35 = Right_swipe1.isDisplayed();

				if (res35 == true) {
					System.out.println("Right_swipe1 is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("Right_swipe1 is not DISPLAYED");
				}
		Right_swipe1.click();
		Right_swipe1.click();
		Thread.sleep(1000);
		jse36.executeScript("scroll(0, 9400);");
		// -----------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[normalize-space()='Wen Token?']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		
		// Wen_Token is DISPLAYED or not
		boolean res36 = Wen_Token.isDisplayed();

		if (res36 == true) {
			System.out.println("Wen_Token is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}
		
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse448 = (JavascriptExecutor) driver;
		jse448.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Email_Field);
		
		
		// Email_Field is DISPLAYED or not
		boolean res37 = Email_Field.isDisplayed();

		if (res37 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse449 = (JavascriptExecutor) driver;
		jse449.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);
		
		// See_our_privacy_policy is DISPLAYED or not
				boolean res38 = See_our_privacy_policy.isDisplayed();

				if (res38 == true) {
					System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE  ");
				} else {
					System.out.println("See_our_privacy_policy is not DISPLAYED");
				}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse449.executeScript("scroll(0, 10000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		
		// digitali_footer is DISPLAYED or not
		boolean res39 = digitali_footer.isDisplayed();

		if (res39 == true) {
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
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);
		
		// digitali_footer_text is DISPLAYED or not
				boolean res40 = digitali_footer_text.isDisplayed();

				if (res40 == true) {
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
		JavascriptExecutor jse552 = (JavascriptExecutor) driver;
		jse552.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);
		
		// Explore is DISPLAYED or not
		boolean res41 = Explore.isDisplayed();

		if (res41 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

//		// locate Collection 
//		WebElement Collections = driver
//				.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/a[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Collections
//		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
//		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Collections);
//		
//		// Collection is DISPLAYED or not
//				boolean res42 = Collection.isDisplayed();
//
//				if (res42 == true) {
//					System.out.println("Collection is DISPLAYED  ");
//				} else {
//					System.out.println("Collection is not DISPLAYED");
//				}
//		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

//		// locate Leaderboard4
//		WebElement Leaderboard4 = driver.findElement(
//				By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/a[2]"));
//		Thread.sleep(1000);
//
//		// to highlight the Leaderboard4
//		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
//		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Leaderboard4);
//		
//		// Leaderboard4 is DISPLAYED or not
//		boolean res43 = Leaderboard4.isDisplayed();
//
//		if (res43 == true) {
//			System.out.println("Leaderboard4 is DISPLAYED  ");
//		} else {
//			System.out.println("Leaderboard4 is not DISPLAYED");
//		}
//		Thread.sleep(1000);
//
//		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);
		
		// Reward_Points1 is DISPLAYED or not
				boolean res44 = Reward_Points1.isDisplayed();

				if (res44 == true) {
					System.out.println("Reward_Points1 is DISPLAYED   ");
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
		boolean res45 = About_Us1.isDisplayed();

		if (res45 == true) {
			System.out.println("About_Us1 is DISPLAYED   ");
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
				boolean res46 = Digitali.isDisplayed();

				if (res46 == true) {
					System.out.println("Digitali is DISPLAYED   ");
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
		
		// Digitali is DISPLAYED or not
		boolean res47 = Digitali.isDisplayed();

		if (res47 == true) {
			System.out.println("Digitali is DISPLAYED   ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
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
				boolean res48 = FAQ1.isDisplayed();

				if (res48 == true) {
					System.out.println("FAQ1 is DISPLAYED   ");
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
		boolean res49 = Legal.isDisplayed();

		if (res49 == true) {
			System.out.println("Legal is DISPLAYED   ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms111
		WebElement Terms111 = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms111
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms111);
		
		// Terms111 is DISPLAYED or not
				boolean res50 = Terms111.isDisplayed();

				if (res50 == true) {
					System.out.println("Terms111 is DISPLAYED   ");
				} else {
					System.out.println("Terms111 is not DISPLAYED");
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
		boolean res51 = Privacy.isDisplayed();

		if (res51 == true) {
			System.out.println("Privacy is DISPLAYED   ");
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
		boolean res52 = All_Rights_Reserved.isDisplayed();

		if (res52 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED   ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//				// locate Twitter_Icon
//				WebElement Twitter_Icon = driver
//						.findElement(By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//				Thread.sleep(1000);
//
//				// to highlight the Twitter_Icon
//				JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//				jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Twitter_Icon);
//				Thread.sleep(1000);
//
//				// -----------------------------------------------------------------------------------------------------------------
//
//				// locate Discord_Icon
//				WebElement Discord_Icon = driver
//						.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//				Thread.sleep(1000);
//
//				// to highlight the Discord_Icon
//				JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//				jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Discord_Icon);
//				Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
}
