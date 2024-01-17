package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------
		// -------------------------------------------------------------------------
				// digitali_logo is DISPLAYED or not
				boolean res = digitali_logo.isDisplayed();

				if (res == true) {
					System.out.println("digitali_logo is DISPLAYED");
				} else {
					System.out.println("digitali_logo is not DISPLAYED");
				}
		// ----------------------------------------

		// locate Home_Button
		WebElement Home_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Home']"));
		Thread.sleep(1000);

		// to highlight the Home_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Home_Button);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------
		// Home_Button is DISPLAYED or not
				boolean res1 = Home_Button.isDisplayed();

				if (res1 == true) {
					System.out.println("Home_Button is DISPLAYED");
				} else {
					System.out.println("Home_Button is not DISPLAYED");
				}

		// -----------------------------------------------------------------------------------------------------------------------------

		// locate Home_Heading
		WebElement Home_Heading = driver
				.findElement(By.xpath("//h1[normalize-space()='The most trusted NFT encyclopedia']"));
		Thread.sleep(1000);

		// to highlight the Home_Heading
		JavascriptExecutor jse00 = (JavascriptExecutor) driver;
		jse00.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Home_Heading);
		Thread.sleep(1000);
		
		//----------------------------------------------------------------------------------
		
		// Home_Heading is DISPLAYED or not
				boolean res2 = Home_Heading.isDisplayed();

				if (res2 == true) {
					System.out.println("Home_Heading is DISPLAYED");
				} else {
					System.out.println("Home_Heading is not DISPLAYED");
				}

		// --------------------------------------------------
		

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collection_Button
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);
		Thread.sleep(1000);
		
		// Collections_Button is DISPLAYED or not
		boolean res3 = Collections_Button.isDisplayed();

		if (res3 == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}
		Collections_Button.click();
		Thread.sleep(1000);

		// --------------------------------------------------
		
		// --------------------------------------------------

		// locate heading
		WebElement Collections_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Explore NFT Collections')]"));
		Thread.sleep(1000);

		// to highlight the Collections_Heading
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Heading);
		Thread.sleep(1000);
		
		// Collections_Heading is DISPLAYED or not
				boolean res4 = Collections_Heading.isDisplayed();

				if (res4 == true) {
					System.out.println("Collections_Heading is DISPLAYED");
				} else {
					System.out.println("Collections_Heading is not DISPLAYED");
				}

		driver.navigate().back();
		Thread.sleep(1000);

		// ---------------------------------------------------
		

		//-------------------------------------------------------------------------------------------------------------------------------------------------

		// locate About_US
		WebElement About_US = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_US
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_US);
		Thread.sleep(1000);
		
		// About_US is DISPLAYED or not
		boolean res5 = About_US.isDisplayed();

		if (res5 == true) {
			System.out.println("About_US is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("About_US is not DISPLAYED");
		}

		About_US.click();
		Thread.sleep(1000);

		// --------------------------------------------------

	

		// --------------------------------------------------

		// locate About_US_heading
		WebElement About_US_heading = driver.findElement(By.xpath("//div[contains(text(),'About Digitali')]"));
		Thread.sleep(1000);

		// to highlight the About_US_heading
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				About_US_heading);
		Thread.sleep(1000);
		
		// About_US_heading is DISPLAYED or not
		boolean res6 = About_US_heading.isDisplayed();

		if (res6 == true) {
			System.out.println("About_US_heading is DISPLAYED ");
		} else {
			System.out.println("About_US_heading is not DISPLAYED");
		}

		driver.navigate().back();
		Thread.sleep(1000);

		// ------------------------------------------------

		// locate Leaderboard
		WebElement Leaderboard = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Leaderboard);
		Thread.sleep(1000);
		
		// Leaderboard is DISPLAYED or not
		boolean res7 = Leaderboard.isDisplayed();

		if (res7 == true) {
			System.out.println("Leaderboard is DISPLAYED ");
		} else {
			System.out.println("Leaderboard is not DISPLAYED");
		}

		Leaderboard.click();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------

		// locate Leaderboard_heading
		WebElement Leaderboard_heading = driver
				.findElement(By.xpath("//div[contains(text(),'Earn Rewards Points by contributing NFT Collection')]"));
		Thread.sleep(1000);

		// to highlight the Leaderboard_heading
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_heading);

		Thread.sleep(1000);
		
		// Leaderboard_heading is DISPLAYED or not
		boolean res8 = Leaderboard_heading.isDisplayed();

		if (res8 == true) {
			System.out.println("Leaderboard_heading is DISPLAYED ");
		} else {
			System.out.println("Leaderboard_heading is not DISPLAYED");
		}

		// -------------------------------------------------

		// locate Search_bar
		WebElement Search_bar = driver.findElement(By.xpath("//input[@id='search-navbar-desktop']"));
		Thread.sleep(1000);

		// to highlight the Search_bar
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Search_bar);
		Thread.sleep(1000);
		
		// Search_bar is DISPLAYED or not
		boolean res9 = Search_bar.isDisplayed();

		if (res9 == true) {
			System.out.println("Search_bar is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Search_bar is not DISPLAYED");
		}
		Search_bar.clear();
		Search_bar.click();
		Search_bar.sendKeys("BEANZ Official");
		Thread.sleep(1000);
		Search_bar.sendKeys(Keys.RETURN);

		Thread.sleep(1000);
		driver.navigate().back();

		Thread.sleep(1000);

		// -----------------------------------------------------------------

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath("//a[@type='button']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reaward_Points
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);
		Thread.sleep(1000);
		
		// Earn_Reaward_Points is DISPLAYED or not
		boolean res10 = Earn_Reward_Points.isDisplayed();

		if (res10 == true) {
			System.out.println("Earn_Reaward_Points is DISPLAYED ");
		} else {
			System.out.println("Earn_Reaward_Points is not DISPLAYED");
		}


		Earn_Reward_Points.click();
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------------
		// locate Earn_Reward_Points_heading
		WebElement Earn_Reward_Points_heading = driver
				.findElement(By.xpath("//h3[normalize-space()='Earning Reward Points is easy!']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reward_Points_Heading
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points_heading);
		Thread.sleep(1000);
		
		// Earn_Reward_Points_heading is DISPLAYED or not
		boolean res11 = Earn_Reward_Points_heading.isDisplayed();

		if (res11 == true) {
			System.out.println("Earn_Reward_Points_heading is DISPLAYED ");
		} else {
			System.out.println("Earn_Reward_Points_heading is not DISPLAYED");
		}

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------
		// locate Know_what_you’re_buying
		WebElement Know_what_you_re_buying = driver
				.findElement(By.xpath("//h5[contains(text(),'Know what you’re buying')]"));
		Thread.sleep(1000);

		// to highlight the Know_what_you’re_buying
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Know_what_you_re_buying);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Understand_what_you_own
		WebElement Understand_what_you_own = driver
				.findElement(By.xpath("//h5[normalize-space()='Understand what you own']"));
		Thread.sleep(1000);

		// to highlight the Understand_what_you_own
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Understand_what_you_own);

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Earn_Reward_Points1
		WebElement Earn_Reward_Points1 = driver.findElement(By.xpath("//h5[normalize-space()='Earn Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points1);

		Thread.sleep(1000);
		
		// Earn_Reward_Points1 is DISPLAYED or not
		boolean res12 = Earn_Reward_Points1.isDisplayed();

		if (res12 == true) {
			System.out.println("Earn_Reward_Points1 is DISPLAYED ");
		} else {
			System.out.println("Earn_Reward_Points1 is not DISPLAYED");
		}

		// -----------------------------------------------------------------------

		// locate Explore_NFT_Collections
		WebElement Explore_NFT_Collections = driver
				.findElement(By.xpath("//a[normalize-space()='Explore NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Explore_NFT_Collections
		JavascriptExecutor jse66 = (JavascriptExecutor) driver;
		jse66.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Explore_NFT_Collections);

		Thread.sleep(1000);
		
		// Explore_NFT_Collections is DISPLAYED or not
				boolean res13 = Explore_NFT_Collections.isDisplayed();

				if (res13 == true) {
					System.out.println("Explore_NFT_Collections is DISPLAYED AND CLICKABLE ");
				} else {
					System.out.println("Explore_NFT_Collections is not DISPLAYED");
				}

		Explore_NFT_Collections.click();
		driver.navigate().back();
		Thread.sleep(1000);

		// locate Explore_NFT_Collections
		WebElement Explore_NFT_Collections1 = driver
				.findElement(By.xpath("//a[normalize-space()='Explore NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Explore_NFT_Collections
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Explore_NFT_Collections1);
		Thread.sleep(1000);

		Explore_NFT_Collections1.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ----------------------------------------------------------------

		// locate How_Do_I_Earn_Reward_Points
		WebElement How_Do_I_Earn_Reward_Points = driver
				.findElement(By.xpath("//a[normalize-space()='How do I earn Reward Points?']"));
		Thread.sleep(1000);

		// to highlight the How_Do_I_Earn_Reward_Points
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_Do_I_Earn_Reward_Points);
		Thread.sleep(1000);
		
		// How_Do_I_Earn_Reward_Points is DISPLAYED or not
		boolean res14 = How_Do_I_Earn_Reward_Points.isDisplayed();

		if (res14 == true) {
			System.out.println("How_Do_I_Earn_Reward_Points is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_Do_I_Earn_Reward_Points is not DISPLAYED");
		}


		How_Do_I_Earn_Reward_Points.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 1200);");
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------

		// locate Recently_updated_NFT_Collections
		WebElement Recently_updated_NFT_Collections = driver
				.findElement(By.xpath("//h1[normalize-space()='Recently updated NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections);
		Thread.sleep(1000);
		
		// Recently_updated_NFT_Collections is DISPLAYED or not
		boolean res15 = Recently_updated_NFT_Collections.isDisplayed();

		if (res15 == true) {
			System.out.println("Recently_updated_NFT_Collections is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections is not DISPLAYED");
		}

		jse.executeScript("scroll(0, 1400)");
		Thread.sleep(1000);

		// ------------------------------------------------------

		// locate Recently_updated_NFT_Collections_left_arrow
		WebElement Recently_updated_NFT_Collections_left_arrow = driver
				.findElement(By.xpath("//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections_left_arrow
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections_left_arrow);
		Thread.sleep(1000);
		
		// Recently_updated_NFT_Collections_left_arrow is DISPLAYED or not
		boolean res16 = Recently_updated_NFT_Collections_left_arrow.isDisplayed();

		if (res16 == true) {
			System.out.println("Recently_updated_NFT_Collections_left_arrow is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections_left_arrow is not DISPLAYED");
		}

		Recently_updated_NFT_Collections_left_arrow.click();
		Recently_updated_NFT_Collections_left_arrow.click();

		// -----------------------------------------------------

		// locate Recently_updated_NFT_Collections_right_arrow
		WebElement Recently_updated_NFT_Collections_right_arrow = driver
				.findElement(By.xpath("//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections_right_arrow
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections_right_arrow);
		Thread.sleep(1000);
		
		// Recently_updated_NFT_Collections_right_arrow is DISPLAYED or not
		boolean res17 = Recently_updated_NFT_Collections_right_arrow.isDisplayed();

		if (res17 == true) {
			System.out.println("Recently_updated_NFT_Collections_right_arrow is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections_right_arrow is not DISPLAYED");
		}

		Recently_updated_NFT_Collections_right_arrow.click();
		Thread.sleep(1000);
		Recently_updated_NFT_Collections_right_arrow.click();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------

		// locate View_all_collections
		WebElement View_all_collections = driver
				.findElement(By.xpath("//span[normalize-space()='View All Collections']"));
		Thread.sleep(1000);

		// to highlight the View_all_collections
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				View_all_collections);
		Thread.sleep(3000);
		
		// View_all_collections is DISPLAYED or not
		boolean res18 = View_all_collections.isDisplayed();

		if (res18 == true) {
			System.out.println("View_all_collections is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("View_all_collections is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------

		View_all_collections.click();
		Thread.sleep(3000);
		driver.navigate().back();

		// -------------------------------------------------------------------------------------------------------------------------------

		// --------------------------------------------------------------------------------------

		jse.executeScript("scroll(0, 2000)");

		// locate Contributors earn Reward Points
		WebElement Contributors_earn_Reward_Points = driver
				.findElement(By.xpath("//div[normalize-space()='Contributors earn Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Contributors_earn_Reward_Points
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Contributors_earn_Reward_Points);
		Thread.sleep(1000);
		
		// Contributors_earn_Reward_Points is DISPLAYED or not
		boolean res19 = Contributors_earn_Reward_Points.isDisplayed();

		if (res19 == true) {
			System.out.println("Contributors_earn_Reward_Points is DISPLAYED ");
		} else {
			System.out.println("Contributors_earn_Reward_Points is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points11
		WebElement Earn_Reward_Points11 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//button[contains(text(),'Earn Reward Points')]"));
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

		// to highlight the Earn_Reward_Points11
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points11);
		Thread.sleep(1000);
		
		// Earn_Reward_Points11 is DISPLAYED or not
		boolean res20 = Earn_Reward_Points11.isDisplayed();

		if (res20 == true) {
			System.out.println("Earn_Reward_Points11 is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Earn_Reward_Points11 is not DISPLAYED");
		}

		Earn_Reward_Points11.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 2500)");

		// -------------------------------------------------------------------------------------------

        //locate Leaderboard1
		WebElement Leaderboard1 = driver.findElement(By.xpath("//div[contains(text(),'Leaderboard')]"));
		Thread.sleep(1000);

		// to highlight the Leaderboard1
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard1);
		Thread.sleep(1000);
		
		// Leaderboard1 is DISPLAYED or not
		boolean res21 = Leaderboard1.isDisplayed();

		if (res21 == true) {
			System.out.println("Leaderboard1 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard1 is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------

		// locate Total_Contributors
		WebElement Total_Contributors = driver.findElement(By.xpath("//div[contains(text(),'Total Contributors')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors1
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributors);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Total_Contributions
		WebElement Total_Contributions = driver.findElement(By.xpath("//div[contains(text(),'Total Contributions')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributions
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributions);
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Earned_Reward_Points2
		WebElement Earned_Reward_Points2 = driver
				.findElement(By.xpath("//div[contains(text(),'Earned Reward Points')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors3
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earned_Reward_Points2);
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box
		WebElement Leaderboard_box = driver.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div/div[2]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors3
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box);
		Thread.sleep(1000);
		
		// Leaderboard_box is DISPLAYED or not
		boolean res22 = Leaderboard_box.isDisplayed();

		if (res22 == true) {
			System.out.println("Leaderboard_box is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Leaderboard_box is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------

		// locate Contributors_box
		WebElement Contributors_box = driver
				.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]"));
		Thread.sleep(1000);

		// to highlight the Contributors_box
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Contributors_box);
		Thread.sleep(1000);

		// Contributors_box is DISPLAYED or not
		boolean res23 = Contributors_box.isDisplayed();

		if (res23 == true) {
			System.out.println("Contributors_box is DISPLAYED  ");
		} else {
			System.out.println("Contributors_box is not DISPLAYED");
		}
		jse.executeScript("scroll(0, 3000)");

		// -------------------------------------------------------------------------------------------------------------------

		// locate View_full_leaderboard
		WebElement View_full_leaderboard = driver
				.findElement(By.xpath("//span[normalize-space()='View full Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the View_full_leaderboard
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				View_full_leaderboard);
		Thread.sleep(1000);
		
		// View_full_leaderboard is DISPLAYED or not
		boolean res24 = View_full_leaderboard.isDisplayed();

		if (res24 == true) {
			System.out.println("View_full_leaderboard is DISPLAYED  ");
		} else {
			System.out.println("View_full_leaderboard is not DISPLAYED");
		}

		View_full_leaderboard.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 3200)");

		// -----------------------------------------------------------------------------------------------------

		// locate Our_blog
		WebElement Our_blog = driver.findElement(By.xpath("//h5[normalize-space()='Our Blog']"));
		Thread.sleep(1000);

		// to highlight the Our_blog
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_blog);
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Resources and insights
		WebElement Resources_and_insights = driver
				.findElement(By.xpath("//h2[normalize-space()='Resources and insights']"));
		Thread.sleep(1000);

		// to highlight the Resources_and_insights
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Resources_and_insights);
		Thread.sleep(1000);
		
		// Resources_and_insights is DISPLAYED or not
		boolean res25 = Resources_and_insights.isDisplayed();

		if (res25 == true) {
			System.out.println("Resources_and_insights is DISPLAYED  ");
		} else {
			System.out.println("Resources_and_insights is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------------------------------------

		// locate View_All
		WebElement View_All = driver.findElement(By.xpath("//a[normalize-space()='View All']"));
		Thread.sleep(1000);

		// to highlight the View_All
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", View_All);
		Thread.sleep(1000);
		
		// View_All is DISPLAYED or not
		boolean res26 = View_All.isDisplayed();

		if (res26 == true) {
			System.out.println("View_All is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("View_All is not DISPLAYED");
		}

		View_All.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 3400)");

		// -------------------------------------------------------------------------------------------------

		// locate Blog_1
		WebElement Blog_1 = driver
				.findElement(By.xpath("//a[@href='/blog/announcing-digitali']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_1
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_1);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Blog_2
		WebElement Blog_2 = driver.findElement(
				By.xpath("//a[@href='/blog/top-nft-projects-by-market-cap']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_2
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_2);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Blog_3
		WebElement Blog_3 = driver.findElement(By.xpath(
				"//a[@href='/blog/introducing-bitcoin-ordinals-with-digitali']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_3
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_3);
		Thread.sleep(1000);

		jse.executeScript("scroll(0, 4000)");
		// ------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		Thread.sleep(1000);
		
		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
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
		Thread.sleep(1000);
		
		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

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
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse16.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse100 = (JavascriptExecutor) driver;
		jse100.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		Thread.sleep(1000);
		
		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}


		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);
		Thread.sleep(1000);
		
		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);
		Thread.sleep(1000);
		
		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED  ");
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
		boolean res33 = Collection.isDisplayed();

		if (res33 == true) {
			System.out.println("Collection is DISPLAYED  ");
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
		Thread.sleep(1000);

		
		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}

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
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------
		// locate About_Us
		WebElement About_Us = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us
		JavascriptExecutor jse388 = (JavascriptExecutor) driver;
		jse388.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us);
		Thread.sleep(1000);
		
		// About_Us is DISPLAYED or not
		boolean res36 = About_Us.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us is DISPLAYED  ");
		} else {
			System.out.println("About_Us is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------
		// locate Digitali_1
		WebElement Digitali_1 = driver.findElement(By.xpath("//a[@href='/about-us'][normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali_1
		JavascriptExecutor jse3388 = (JavascriptExecutor) driver;
		jse3388.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Digitali_1);
		
		// Digitali_1 is DISPLAYED or not
		boolean res37 = Digitali_1.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali_1 is DISPLAYED  ");
		} else {
			System.out.println("Digitali_1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);
		
		// Blogs_footer is DISPLAYED or not
				boolean res38 = Blogs_footer.isDisplayed();

				if (res38 == true) {
					System.out.println("Blogs_footer is DISPLAYED  ");
				} else {
					System.out.println("Blogs_footer is not DISPLAYED");
				}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);
		
		// FAQ is DISPLAYED or not
		boolean res39 = FAQ.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ is DISPLAYED  ");
		} else {
			System.out.println("FAQ is not DISPLAYED");
		}

		// ------------------------------------------------------------------------------------------------------------------

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		Thread.sleep(1000);
		
		// Legal is DISPLAYED or not
				boolean res40 = Legal.isDisplayed();

				if (res40 == true) {
					System.out.println("Legal is DISPLAYED  ");
				} else {
					System.out.println("Legal is not DISPLAYED");
				}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse444 = (JavascriptExecutor) driver;
		jse444.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);
		Thread.sleep(1000);
		
		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED  ");
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
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED  ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);
		Thread.sleep(1000);
		
		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED  ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);
		
		// Twitter_Icon is DISPLAYED or not
				boolean res44 = Twitter_Icon.isDisplayed();

				if (res44 == true) {
					System.out.println("Twitter_Icon is DISPLAYED  ");
				} else {
					System.out.println("Twitter_Icon is not DISPLAYED");
				}
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------------	

		// locate Discord_Icon
		WebElement Discord_Icon = driver
				.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);
		
		// Discord_Icon is DISPLAYED or not
				boolean res45 = Discord_Icon.isDisplayed();

				if (res45 == true) {
					System.out.println("Discord_Icon is DISPLAYED  ");
				} else {
					System.out.println("Discord_Icon is not DISPLAYED");
				}
		Thread.sleep(1000);

		// -------------------------------------------------------------------------
//		// digitali_logo is DISPLAYED or not
//		boolean res = digitali_logo.isDisplayed();
//
//		if (res == true) {
//			System.out.println("digitali_logo is DISPLAYED");
//		} else {
//			System.out.println("digitali_logo is not DISPLAYED");
//		}
		// --------------------------------------------------
		// Home_Button is DISPLAYED or not
//		boolean res1 = Home_Button.isDisplayed();
//
//		if (res1 == true) {
//			System.out.println("Home_Button is DISPLAYED");
//		} else {
//			System.out.println("Home_Button is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------------------------

		// Home_Heading is DISPLAYED or not
//		boolean res2 = Home_Heading.isDisplayed();
//
//		if (res2 == true) {
//			System.out.println("Home_Heading is DISPLAYED");
//		} else {
//			System.out.println("Home_Heading is not DISPLAYED");
//		}

		// -----------------------------------

		// Collections_Button is DISPLAYED or not
//		boolean res3 = Collections_Button.isDisplayed();
//
//		if (res3 == true) {
//			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE");
//		} else {
//			System.out.println("Collections_Button is not DISPLAYED");
//		}

		// --------------------------------------------------

//		// Collections_Heading is DISPLAYED or not
//		boolean res4 = Collections_Heading.isDisplayed();
//
//		if (res4 == true) {
//			System.out.println("Collections_Heading is DISPLAYED");
//		} else {
//			System.out.println("Collections_Heading is not DISPLAYED");
//		}

//		// About_US is DISPLAYED or not
//		boolean res5 = About_US.isDisplayed();
//
//		if (res5 == true) {
//			System.out.println("About_US is DISPLAYED AND CLICKABLE");
//		} else {
//			System.out.println("About_US is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// About_US_heading is DISPLAYED or not
//		boolean res6 = About_US_heading.isDisplayed();
//
//		if (res6 == true) {
//			System.out.println("About_US_heading is DISPLAYED ");
//		} else {
//			System.out.println("About_US_heading is not DISPLAYED");
//		}
		// ---------------------------------------------------------------------------------------------------

//		// Leaderboard is DISPLAYED or not
//		boolean res7 = About_US_heading.isDisplayed();
//
//		if (res7 == true) {
//			System.out.println("Leaderboard is DISPLAYED ");
//		} else {
//			System.out.println("Leaderboard is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// Leaderboard_heading is DISPLAYED or not
//		boolean res8 = Leaderboard_heading.isDisplayed();
//
//		if (res8 == true) {
//			System.out.println("Leaderboard_heading is DISPLAYED ");
//		} else {
//			System.out.println("Leaderboard_heading is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// Search_bar is DISPLAYED or not
//		boolean res9 = Search_bar.isDisplayed();
//
//		if (res9 == true) {
//			System.out.println("Search_bar is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Search_bar is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// Earn_Reaward_Points is DISPLAYED or not
//		boolean res10 = Earn_Reward_Points.isDisplayed();
//
//		if (res10 == true) {
//			System.out.println("Earn_Reaward_Points is DISPLAYED ");
//		} else {
//			System.out.println("Earn_Reaward_Points is not DISPLAYED");
//		}

//		// Earn_Reward_Points_heading is DISPLAYED or not
//		boolean res11 = Earn_Reward_Points_heading.isDisplayed();
//
//		if (res11 == true) {
//			System.out.println("Earn_Reward_Points_heading is DISPLAYED ");
//		} else {
//			System.out.println("Earn_Reward_Points_heading is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// Earn_Reward_Points1 is DISPLAYED or not
//		boolean res12 = Earn_Reward_Points1.isDisplayed();
//
//		if (res12 == true) {
//			System.out.println("Earn_Reward_Points1 is DISPLAYED ");
//		} else {
//			System.out.println("Earn_Reward_Points1 is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------
//
//		// Explore_NFT_Collections is DISPLAYED or not
//		boolean res13 = Explore_NFT_Collections.isDisplayed();
//
//		if (res13 == true) {
//			System.out.println("Explore_NFT_Collections is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Explore_NFT_Collections is not DISPLAYED");
//		}

		// ---------------------------------------------------------------------------------------------------

//		// How_Do_I_Earn_Reward_Points is DISPLAYED or not
//		boolean res14 = How_Do_I_Earn_Reward_Points.isDisplayed();
//
//		if (res14 == true) {
//			System.out.println("How_Do_I_Earn_Reward_Points is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("How_Do_I_Earn_Reward_Points is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Recently_updated_NFT_Collections is DISPLAYED or not
//		boolean res15 = Recently_updated_NFT_Collections.isDisplayed();
//
//		if (res15 == true) {
//			System.out.println("Recently_updated_NFT_Collections is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Recently_updated_NFT_Collections is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Recently_updated_NFT_Collections_left_arrow is DISPLAYED or not
//		boolean res16 = Recently_updated_NFT_Collections_left_arrow.isDisplayed();
//
//		if (res16 == true) {
//			System.out.println("Recently_updated_NFT_Collections_left_arrow is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Recently_updated_NFT_Collections_left_arrow is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Recently_updated_NFT_Collections_right_arrow is DISPLAYED or not
//		boolean res17 = Recently_updated_NFT_Collections_right_arrow.isDisplayed();
//
//		if (res17 == true) {
//			System.out.println("Recently_updated_NFT_Collections_right_arrow is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Recently_updated_NFT_Collections_right_arrow is not DISPLAYED");
//		}

//		// View_all_collections is DISPLAYED or not
//		boolean res18 = View_all_collections.isDisplayed();
//
//		if (res18 == true) {
//			System.out.println("View_all_collections is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("View_all_collections is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Contributors_earn_Reward_Points is DISPLAYED or not
//		boolean res19 = Contributors_earn_Reward_Points.isDisplayed();
//
//		if (res19 == true) {
//			System.out.println("Contributors_earn_Reward_Points is DISPLAYED ");
//		} else {
//			System.out.println("Contributors_earn_Reward_Points is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Earn_Reward_Points11 is DISPLAYED or not
//		boolean res20 = Earn_Reward_Points11.isDisplayed();
//
//		if (res20 == true) {
//			System.out.println("Earn_Reward_Points11 is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Earn_Reward_Points11 is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Leaderboard1 is DISPLAYED or not
//		boolean res21 = Leaderboard1.isDisplayed();
//
//		if (res21 == true) {
//			System.out.println("Leaderboard1 is DISPLAYED  ");
//		} else {
//			System.out.println("Leaderboard1 is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Leaderboard_box is DISPLAYED or not
//		boolean res22 = Leaderboard_box.isDisplayed();
//
//		if (res22 == true) {
//			System.out.println("Leaderboard_box is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Leaderboard_box is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Contributors_box is DISPLAYED or not
//		boolean res23 = Contributors_box.isDisplayed();
//
//		if (res23 == true) {
//			System.out.println("Contributors_box is DISPLAYED  ");
//		} else {
//			System.out.println("Contributors_box is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// View_full_leaderboard is DISPLAYED or not
//		boolean res24 = View_full_leaderboard.isDisplayed();
//
//		if (res24 == true) {
//			System.out.println("View_full_leaderboard is DISPLAYED  ");
//		} else {
//			System.out.println("View_full_leaderboard is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// Resources_and_insights is DISPLAYED or not
//		boolean res25 = Resources_and_insights.isDisplayed();
//
//		if (res25 == true) {
//			System.out.println("Resources_and_insights is DISPLAYED  ");
//		} else {
//			System.out.println("Resources_and_insights is not DISPLAYED");
//		}

		// -------------------------------------------------------------------------------------------------------------------------------

//		// View_All is DISPLAYED or not
//		boolean res26 = View_All.isDisplayed();
//
//		if (res26 == true) {
//			System.out.println("View_All is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("View_All is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Wen_Token is DISPLAYED or not
//		boolean res27 = Wen_Token.isDisplayed();
//
//		if (res27 == true) {
//			System.out.println("Wen_Token is DISPLAYED ");
//		} else {
//			System.out.println("Wen_Token is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Email_Field is DISPLAYED or not
//		boolean res28 = Email_Field.isDisplayed();
//
//		if (res28 == true) {
//			System.out.println("Email_Field is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("Email_Field is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// See_our_privacy_policy is DISPLAYED or not
//		boolean res29 = See_our_privacy_policy.isDisplayed();
//
//		if (res29 == true) {
//			System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE ");
//		} else {
//			System.out.println("See_our_privacy_policy is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// digitali_footer is DISPLAYED or not
//		boolean res30 = digitali_footer.isDisplayed();
//
//		if (res30 == true) {
//			System.out.println("digitali_footer is DISPLAYED  ");
//		} else {
//			System.out.println("digitali_footer is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// digitali_footer_text is DISPLAYED or not
//		boolean res31 = digitali_footer_text.isDisplayed();
//
//		if (res31 == true) {
//			System.out.println("digitali_footer_text is DISPLAYED  ");
//		} else {
//			System.out.println("digitali_footer_text is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Explore is DISPLAYED or not
//		boolean res32 = Explore.isDisplayed();
//
//		if (res32 == true) {
//			System.out.println("Explore is DISPLAYED  ");
//		} else {
//			System.out.println("Explore is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Collection is DISPLAYED or not
//		boolean res33 = Collection.isDisplayed();
//
//		if (res33 == true) {
//			System.out.println("Collection is DISPLAYED  ");
//		} else {
//			System.out.println("Collection is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Leaderboard4 is DISPLAYED or not
//		boolean res34 = Leaderboard4.isDisplayed();
//
//		if (res34 == true) {
//			System.out.println("Leaderboard4 is DISPLAYED  ");
//		} else {
//			System.out.println("Leaderboard4 is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Reward_Points1 is DISPLAYED or not
//		boolean res35 = Reward_Points1.isDisplayed();
//
//		if (res35 == true) {
//			System.out.println("Reward_Points1 is DISPLAYED  ");
//		} else {
//			System.out.println("Reward_Points1 is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// About_Us is DISPLAYED or not
//		boolean res36 = About_Us.isDisplayed();
//
//		if (res36 == true) {
//			System.out.println("About_Us is DISPLAYED  ");
//		} else {
//			System.out.println("About_Us is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Digitali_1 is DISPLAYED or not
//		boolean res37 = Digitali_1.isDisplayed();
//
//		if (res37 == true) {
//			System.out.println("Digitali_1 is DISPLAYED  ");
//		} else {
//			System.out.println("Digitali_1 is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Blogs_footer is DISPLAYED or not
//		boolean res38 = Blogs_footer.isDisplayed();
//
//		if (res38 == true) {
//			System.out.println("Blogs_footer is DISPLAYED  ");
//		} else {
//			System.out.println("Blogs_footer is not DISPLAYED");
//		}

//		// FAQ is DISPLAYED or not
//		boolean res39 = FAQ.isDisplayed();
//
//		if (res39 == true) {
//			System.out.println("FAQ is DISPLAYED  ");
//		} else {
//			System.out.println("FAQ is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Legal is DISPLAYED or not
//		boolean res40 = Legal.isDisplayed();
//
//		if (res40 == true) {
//			System.out.println("Legal is DISPLAYED  ");
//		} else {
//			System.out.println("Legal is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Terms is DISPLAYED or not
//		boolean res41 = Terms.isDisplayed();
//
//		if (res41 == true) {
//			System.out.println("Terms is DISPLAYED  ");
//		} else {
//			System.out.println("Terms is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Privacy is DISPLAYED or not
//		boolean res42 = Privacy.isDisplayed();
//
//		if (res42 == true) {
//			System.out.println("Privacy is DISPLAYED  ");
//		} else {
//			System.out.println("Privacy is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// All_Rights_Reserved is DISPLAYED or not
//		boolean res43 = All_Rights_Reserved.isDisplayed();
//
//		if (res43 == true) {
//			System.out.println("All_Rights_Reserved is DISPLAYED  ");
//		} else {
//			System.out.println("All_Rights_Reserved is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Twitter_Icon is DISPLAYED or not
//		boolean res44 = Twitter_Icon.isDisplayed();
//
//		if (res44 == true) {
//			System.out.println("Twitter_Icon is DISPLAYED  ");
//		} else {
//			System.out.println("Twitter_Icon is not DISPLAYED");
//		}

		// ------------------------------------------------------------------------------------------------------------------

//		// Discord_Icon is DISPLAYED or not
//		boolean res45 = Discord_Icon.isDisplayed();
//
//		if (res45 == true) {
//			System.out.println("Discord_Icon is DISPLAYED  ");
//		} else {
//			System.out.println("Discord_Icon is not DISPLAYED");
//		}

		driver.close();
		driver.quit();

	}
}
