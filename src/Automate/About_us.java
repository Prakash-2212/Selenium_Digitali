package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class About_us {

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

		// locate About_us
		WebElement About_us = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='About Us']"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the About_us
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_us);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// About_us is DISPLAYED or not
		boolean res = About_us.isDisplayed();

		if (res == true) {
			System.out.println("About_us is DISPLAYED");
		} else {
			System.out.println("About_us is not DISPLAYED");
		}
		About_us.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate About_us_Heading
		WebElement About_us_Heading = driver.findElement(By.xpath("//div[contains(text(),'About Digitali')]"));
		Thread.sleep(1000);

		// to highlight the About_us_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				About_us_Heading);

		// About_us_Heading is DISPLAYED or not
		boolean res1 = About_us_Heading.isDisplayed();

		if (res1 == true) {
			System.out.println("About_us_Heading is DISPLAYED");
		} else {
			System.out.println("About_us_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------

		// locate Our_Mission
		WebElement Our_Mission = driver.findElement(By.xpath("//div[normalize-space()='Our Mission']"));
		Thread.sleep(1000);

		// to highlight the Our_Mission
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_Mission);

		// About_us_Heading is DISPLAYED or not
		boolean res2 = About_us_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("About_us_Heading is DISPLAYED");
		} else {
			System.out.println("About_us_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text1
		WebElement Text1 = driver
				.findElement(By.xpath("//p[contains(text(),'Our mission is straightforward: to empower the com')]"));
		Thread.sleep(1000);

		// to highlight the Text1
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

		// Text1 is DISPLAYED or not
		boolean res3 = About_us_Heading.isDisplayed();

		if (res3 == true) {
			System.out.println("Text1 is DISPLAYED");
		} else {
			System.out.println("Text1 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text2
		WebElement Text2 = driver
				.findElement(By.xpath("//p[contains(text(),'Our community is building a comprehensive informat')]"));
		Thread.sleep(1000);

		// to highlight the Text2
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text2);

		// Text2 is DISPLAYED or not
		boolean res4 = Text2.isDisplayed();

		if (res4 == true) {
			System.out.println("Text2 is DISPLAYED");
		} else {
			System.out.println("Text2 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------

		// locate Text3
		WebElement Text3 = driver
				.findElement(By.xpath("//p[contains(text(),\"Here's what you'll find when you explore Digitali:\")]"));
		Thread.sleep(1000);

		// to highlight the Text3
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

		Thread.sleep(1000);

		// Text3 is DISPLAYED or not
		boolean res5 = Text3.isDisplayed();

		if (res5 == true) {
			System.out.println("Text3 is DISPLAYED");
		} else {
			System.out.println("Text3 is not DISPLAYED");
		}

		jse6.executeScript("scroll(0, 400);");

		// --------------------------------------------------------------------------------------------

		// locate Text4
		WebElement Text4 = driver.findElement(By.xpath("//li[normalize-space()='Its History']"));
		Thread.sleep(1000);

		// to highlight the Text4
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text4);

		// Text4 is DISPLAYED or not
		boolean res6 = Text4.isDisplayed();

		if (res6 == true) {
			System.out.println("Text4 is DISPLAYED");
		} else {
			System.out.println("Text4 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text5
		WebElement Text5 = driver.findElement(By.xpath("//li[normalize-space()='The Founders']"));
		Thread.sleep(1000);

		// to highlight the Text5
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text5);

		// Text5 is DISPLAYED or not
		boolean res7 = Text5.isDisplayed();

		if (res7 == true) {
			System.out.println("Text5 is DISPLAYED");
		} else {
			System.out.println("Text5 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------

		// locate Text6
		WebElement Text6 = driver.findElement(By.xpath("//li[normalize-space()='The Founders']"));
		Thread.sleep(1000);

		// to highlight the Text6
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text6);

		// Text6 is DISPLAYED or not
		boolean res8 = Text6.isDisplayed();

		if (res8 == true) {
			System.out.println("Text6 is DISPLAYED");
		} else {
			System.out.println("Text6 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------

		// locate Text7
		WebElement Text7 = driver.findElement(By.xpath("//li[normalize-space()='NFT Characteristics']"));
		Thread.sleep(1000);

		// to highlight the Text7
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text7);

		// Text7 is DISPLAYED or not
		boolean res9 = Text7.isDisplayed();

		if (res9 == true) {
			System.out.println("Text7 is DISPLAYED");
		} else {
			System.out.println("Text7 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------

		// locate Text8
		WebElement Text8 = driver.findElement(By.xpath("//li[normalize-space()='Rarity Traits']"));
		Thread.sleep(1000);

		// to highlight the Text8
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text8);

		// Text8 is DISPLAYED or not
		boolean res10 = Text8.isDisplayed();

		if (res10 == true) {
			System.out.println("Text8 is DISPLAYED");
		} else {
			System.out.println("Text8 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Text9
		WebElement Text9 = driver.findElement(By.xpath("//li[normalize-space()='Functionality']"));
		Thread.sleep(1000);

		// to highlight the Text9
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text9);

		// Text9 is DISPLAYED or not
		boolean res11 = Text9.isDisplayed();

		if (res11 == true) {
			System.out.println("Text9 is DISPLAYED");
		} else {
			System.out.println("Text9 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------

		// locate Text10
		WebElement Text10 = driver.findElement(By.xpath("//li[normalize-space()='NFT Ownership Rights']"));
		Thread.sleep(1000);

		// to highlight the Text10
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text10);

		// Text10 is DISPLAYED or not
		boolean res12 = Text10.isDisplayed();

		if (res12 == true) {
			System.out.println("Text10 is DISPLAYED");
		} else {
			System.out.println("Text10 is not DISPLAYED");
		}

		Thread.sleep(1000);

		jse13.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------

		// locate Core_Principles
		WebElement Core_Principles = driver.findElement(By.xpath("//div[normalize-space()='Core Principles']"));
		Thread.sleep(1000);

		// to highlight the Core_Principles
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Core_Principles);

		// Core_Principles is DISPLAYED or not
		boolean res13 = Core_Principles.isDisplayed();

		if (res13 == true) {
			System.out.println("Core_Principles is DISPLAYED");
		} else {
			System.out.println("Core_Principles is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Neutrality
		WebElement Neutrality = driver.findElement(By.xpath("//div[normalize-space()='Neutrality']"));
		Thread.sleep(1000);

		// to highlight the Neutrality
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Neutrality);

		// Neutrality is DISPLAYED or not
		boolean res14 = Neutrality.isDisplayed();

		if (res14 == true) {
			System.out.println("Neutrality is DISPLAYED");
		} else {
			System.out.println("Neutrality is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Clarity
		WebElement Clarity = driver.findElement(By.xpath("//div[normalize-space()='Clarity']"));
		Thread.sleep(1000);

		// to highlight the Neutrality
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Clarity);

		// Clarity is DISPLAYED or not
		boolean res15 = Clarity.isDisplayed();

		if (res15 == true) {
			System.out.println("Clarity is DISPLAYED");
		} else {
			System.out.println("Clarity is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------

		// locate Transparency
		WebElement Transparency = driver.findElement(By.xpath("//div[normalize-space()='Transparency']"));
		Thread.sleep(1000);

		// to highlight the Transparency
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Transparency);

		// Transparency is DISPLAYED or not
		boolean res16 = Transparency.isDisplayed();

		if (res16 == true) {
			System.out.println("Transparency is DISPLAYED");
		} else {
			System.out.println("Transparency is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse17.executeScript("scroll(0, 1300);");

		// --------------------------------------------------------------------------------

		// locate Why_Digitali?
		WebElement Why_Digitali = driver.findElement(By.xpath("//div[normalize-space()='Why Digitali?']"));
		Thread.sleep(1000);

		// to highlight the Why_Digitali
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Why_Digitali);

		// Why_Digitali is DISPLAYED or not
		boolean res17 = Transparency.isDisplayed();

		if (res17 == true) {
			System.out.println("Why_Digitali is DISPLAYED");
		} else {
			System.out.println("Why_Digitali is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

		// locate Text11
		WebElement Text11 = driver
				.findElement(By.xpath("//p[contains(text(),'The NFT industry currently lacks a reliable reposi')]"));
		Thread.sleep(1000);

		// to highlight the Text11
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text11);

		// Text11 is DISPLAYED or not
		boolean res18 = Text11.isDisplayed();

		if (res18 == true) {
			System.out.println("Text11 is DISPLAYED");
		} else {
			System.out.println("Text11 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------

		// locate Text12
		WebElement Text12 = driver
				.findElement(By.xpath("//p[contains(text(),'Researching a collection often involves sifting th')]"));
		Thread.sleep(1000);

		// to highlight the Text12
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

		// Text12 is DISPLAYED or not
		boolean res19 = Text12.isDisplayed();

		if (res19 == true) {
			System.out.println("Text12 is DISPLAYED");
		} else {
			System.out.println("Text12 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------

		// locate Text13
		WebElement Text13 = driver
				.findElement(By.xpath("//p[contains(text(),\"Digitali's mission is to simplify this process.\")]"));
		Thread.sleep(1000);

		// to highlight the Text13
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text13);

		// Text13 is DISPLAYED or not
		boolean res20 = Text13.isDisplayed();

		if (res20 == true) {
			System.out.println("Text13 is DISPLAYED");
		} else {
			System.out.println("Text13 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------

		// locate Text14
		WebElement Text14 = driver
				.findElement(By.xpath("//p[contains(text(),'We aim to provide a one-stop, trusted, and reliabl')]"));
		Thread.sleep(1000);

		// to highlight the Text14
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text14);

		// Text14 is DISPLAYED or not
		boolean res21 = Text14.isDisplayed();

		if (res21 == true) {
			System.out.println("Text14 is DISPLAYED");
		} else {
			System.out.println("Text14 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------

		// locate Text15
		WebElement Text15 = driver
				.findElement(By.xpath("//p[contains(text(),\"We're building Digitali to meet our own needs and \")]"));
		Thread.sleep(1000);

		// to highlight the Text15
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text15);

		// Text15 is DISPLAYED or not
		boolean res22 = Text15.isDisplayed();

		if (res22 == true) {
			System.out.println("Text15 is DISPLAYED");
		} else {
			System.out.println("Text15 is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 1900);");
		// --------------------------------------------------------------------------------------------------------

		// locate Primary Objectives
		WebElement Primary_Objectives = driver.findElement(By.xpath("//div[contains(text(),'Primary Objectives')]"));
		Thread.sleep(1000);

		// to highlight the Primary_Objectives
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Primary_Objectives);

		// Primary_Objectives is DISPLAYED or not
		boolean res23 = Primary_Objectives.isDisplayed();

		if (res23 == true) {
			System.out.println("Primary_Objectives is DISPLAYED");
		} else {
			System.out.println("Primary_Objectives is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 1000);");

		// ------------------------------------------------------------------------------------------------
		// locate Submitting_content_that_is_balanced_accurate
		WebElement Submitting_content_that_is_balanced_accurate = driver
				.findElement(By.xpath("//p[contains(text(),'Submitting content that is balanced, accurate, ref')]"));
		Thread.sleep(1000);

		// to highlight the Submitting_content_that_is_balanced_accurate
		JavascriptExecutor jse224 = (JavascriptExecutor) driver;
		jse224.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Submitting_content_that_is_balanced_accurate);

		Thread.sleep(1000);
		jse224.executeScript("scroll(0, 2000);");

		// ----------------------------------------------------------------------
		// locate Building_the_NFT
		WebElement Building_the_NFT = driver
				.findElement(By.xpath("//div[contains(text(),'Building the definitive Web3 Wiki for NFT collecti')]"));
		Thread.sleep(1000);

		// to highlight the Building_the_NFT
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Building_the_NFT);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Building_awareness
		WebElement Building_awareness = driver
				.findElement(By.xpath("//div[contains(text(),'Building awareness of Digitali to drive content co')]"));
		Thread.sleep(1000);

		// to highlight the Building_awareness
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Building_awareness);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Recording_submissions
		WebElement Recording_submissions = driver
				.findElement(By.xpath("//div[contains(text(),'Recording submissions and rewarding our users for ')]"));
		Thread.sleep(1000);

		// to highlight the Recording_submissions
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recording_submissions);

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 2400);");

//		// -------------------------------------------------------------------------------------------------

		// locate Reward_Points_Digitali_Token
		WebElement Reward_Points_Digitali_Token = driver
				.findElement(By.xpath("//div[normalize-space()='Reward Points & Digitali Token']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points_Digitali_Token
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points_Digitali_Token);

		// Reward_Points_Digitali_Token is DISPLAYED or not
		boolean res24 = Reward_Points_Digitali_Token.isDisplayed();

		if (res24 == true) {
			System.out.println("Reward_Points_Digitali_Token is DISPLAYED");
		} else {
			System.out.println("Reward_Points_Digitali_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------

		// locate Our_community_ofcontributors_plays_a_pivotal_role
		WebElement Our_community_ofcontributors_plays_a_pivotal_role = driver
				.findElement(By.xpath("//p[contains(text(),'Our community of contributors plays a pivotal role')]"));
		Thread.sleep(1000);

		// to highlight the Our_community_ofcontributors_plays_a_pivotal_role
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_community_ofcontributors_plays_a_pivotal_role);

		Thread.sleep(1000);
//
		// ------------------------------------------------------------------------------------------------------------

		// locate_In_preparation_for_the_launch_of_a_Digitali_token
		WebElement locate_In_preparation_for_the_launch_of_a_Digitali_token = driver
				.findElement(By.xpath("//p[contains(text(),'In preparation for the launch of a Digitali token,')]"));
		Thread.sleep(1000);

		// to highlight the locate_In_preparation_for_the_launch_of_a_Digitali_token
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				locate_In_preparation_for_the_launch_of_a_Digitali_token);

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 2600);");
//
//		// -----------------------------------------------------------------------------------------------
//
		// locate Reward_Points
		WebElement Reward_Points = driver.findElement(By.xpath(
				"//p[contains(text(),'In preparation for the launch of a Digitali token,')]//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points);

		Thread.sleep(1000);
		Reward_Points.click();
		Thread.sleep(1000);
		driver.navigate().back();

		jse16.executeScript("scroll(0, 2300);");

////-----------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver
				.findElement(By.xpath("//p[contains(text(),'More information about')]//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);

		Thread.sleep(1000);
		FAQ.click();
		Thread.sleep(1000);
		driver.navigate().back();

		jse32.executeScript("scroll(0, 2600);");
//
//		// -------------------------------------------------------------------------------------------------

		// locate More_information_about
		WebElement More_information_about = driver
				.findElement(By.xpath("//p[contains(text(),'More information about')]"));
		Thread.sleep(2000);

		// to highlight the More_information_about
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				More_information_about);

		Thread.sleep(1000);
//
//		// ------------------------------------------------------------------------------------------------------------------

		// locate As_we_achieve_milestones_in_terms_of_contributors
		WebElement As_we_achieve_milestones_in_terms_of_contributors = driver
				.findElement(By.xpath("//p[contains(text(),'As we achieve milestones in terms of contributors ')]"));
		Thread.sleep(1000);

		// to highlight the As_we_achieve_milestones_in_terms_of_contributors
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				As_we_achieve_milestones_in_terms_of_contributors);

		Thread.sleep(1000);

//		// ----------------------------------------------------------------------------------------------

		// locate Meet_our_team
		WebElement Meet_our_team = driver.findElement(By.xpath("//div[normalize-space()='Meet our team']"));
		Thread.sleep(1000);

		// to highlight the Meet_our_team
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Meet_our_team);

		// Meet_our_team is DISPLAYED or not
		boolean res25 = Meet_our_team.isDisplayed();

		if (res25 == true) {
			System.out.println("Meet_our_team is DISPLAYED");
		} else {
			System.out.println("Meet_our_team is not DISPLAYED");
		}

		Thread.sleep(1000);
//
//		// ---------------------------------------------------------------------------------------------------
//
		// locate We_are_Cumberland_Labs_an_early_stage_Web3_incuba
		WebElement We_are_Cumberland_Labs_an_early_stage_Web3_incuba = driver
				.findElement(By.xpath("//p[contains(text(),'We are Cumberland Labs, an early-stage Web3 incuba')]"));
		Thread.sleep(1000);

		// to highlight the We_are_Cumberland_Labs_an_early_stage_Web3_incuba
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				We_are_Cumberland_Labs_an_early_stage_Web3_incuba);

		Thread.sleep(1000);
//
		// ---------------------------------------------------------------------------------------------------

		// locate Our_team_comprises_builders_founders_product_man
		WebElement Our_team_comprises_builders_founders_product_man = driver
				.findElement(By.xpath("//p[contains(text(),'Our team comprises builders, founders, product man')]"));
		Thread.sleep(1000);

		// to highlight the Our_team_comprises_builders_founders_product_man
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_team_comprises_builders_founders_product_man);

		Thread.sleep(1000);
//
////---------------------------------------------------------------------------------------------------
//
		// locate Feel_free_to_reach_out_to_us_at_Digitali_anytime_v
		WebElement Feel_free_to_reach_out_to_us_at_Digitali_anytime_v = driver
				.findElement(By.xpath("//p[contains(text(),'Feel free to reach out to us at Digitali anytime v')]"));
		Thread.sleep(1000);

		// to highlight the Feel_free_to_reach_out_to_us_at_Digitali_anytime_v
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Feel_free_to_reach_out_to_us_at_Digitali_anytime_v);

		Thread.sleep(1000);

////---------------------------------------------------------------------------------------------------
//
		// locate For_more_details_about_our_content_review_process
		WebElement For_more_details_about_our_content_review_process = driver
				.findElement(By.xpath("//p[contains(text(),'For more details about our content, review process')]"));
		Thread.sleep(1000);

		// to highlight the For_more_details_about_our_content_review_process
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				For_more_details_about_our_content_review_process);

		Thread.sleep(1000);
		jse39.executeScript("scroll(0, 3200);");

////---------------------------------------------------------------------------------------------------

		// locate Tama
		WebElement Tama = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tama
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Tama);

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate David
		WebElement David = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[2]/div[1]"));
		Thread.sleep(1000);

		// to highlight the David
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", David);

		Thread.sleep(1000);
//
////---------------------------------------------------------------------------------------------------
		// locate Saqib
		WebElement Saqib = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Saqib
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Saqib);

		Thread.sleep(1000);
//
////---------------------------------------------------------------------------------------------------
		// locate Tushar
		WebElement Tushar = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[4]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tushar
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Tushar);

		Thread.sleep(1000);
		jse43.executeScript("scroll(0, 3800);");

////---------------------------------------------------------------------------------------------------

		// locate Join_our_team
		WebElement Join_our_team = driver.findElement(By.xpath("//div[normalize-space()='Join our team']"));
		Thread.sleep(1000);

		// to highlight the Join_our_team
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Join_our_team);

		// Join_our_team is DISPLAYED or not
		boolean res26 = Join_our_team.isDisplayed();

		if (res26 == true) {
			System.out.println("Join_our_team is DISPLAYED");
		} else {
			System.out.println("Join_our_team is not DISPLAYED");
		}

		Thread.sleep(1000);

////---------------------------------------------------------------------------------------------------
		// locate info_digitali_xyz.xyz
		WebElement info_digitali_xyz = driver.findElement(By.xpath("//a[normalize-space()='info@digitali.xyz']"));
		Thread.sleep(1000);

		// to highlight the info_digitali_xyz
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				info_digitali_xyz);

		Thread.sleep(1000);
//
////---------------------------------------------------------------------------------------------------
		// locate Our_philosophy_is_simple_hire_a_team_of_diverse
		WebElement Our_philosophy_is_simple_hire_a_team_of_diverse = driver
				.findElement(By.xpath("//div[contains(text(),'Our philosophy is simple — hire a team of diverse,')]"));
		Thread.sleep(1000);

		// to highlight the Our_philosophy_is_simple_hire_a_team_of_diverse
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_philosophy_is_simple_hire_a_team_of_diverse);

		Thread.sleep(1000);
		jse43.executeScript("scroll(0,4500);");
//
////---------------------------------------------------------------------------------------------------

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
