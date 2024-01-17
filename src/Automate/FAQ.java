package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FAQ {

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
		Thread.sleep(1000);

		// digitali_logo is DISPLAYED or not
		boolean res1 = digitali_logo.isDisplayed();

		if (res1 == true) {
			System.out.println("digitali_logo is DISPLAYED  ");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}

		jse00.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);

		// FAQ is DISPLAYED or not
		boolean res2 = FAQ.isDisplayed();

		if (res2 == true) {
			System.out.println("FAQ is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("FAQ is not DISPLAYED");
		}
		FAQ.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate FAQs
		WebElement FAQs = driver.findElement(By.xpath("//div[normalize-space()='FAQs']"));
		Thread.sleep(1000);

		// to highlight the FAQs
		JavascriptExecutor jse000 = (JavascriptExecutor) driver;
		jse000.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQs);
		Thread.sleep(1000);

		// FAQs is DISPLAYED or not
		boolean res3 = FAQs.isDisplayed();

		if (res3 == true) {
			System.out.println("FAQs is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("FAQs is not DISPLAYED");
		}
		jse000.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Top_questions_about_Digitali
		WebElement Top_questions_about_Digitali = driver
				.findElement(By.xpath("//div[normalize-space()='Top questions about Digitali']"));
		Thread.sleep(1000);

		// to highlight the Top_questions_about_Digitali
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Top_questions_about_Digitali);
		Thread.sleep(1000);

		// Top_questions_about_Digitali is DISPLAYED or not
		boolean res4 = Top_questions_about_Digitali.isDisplayed();

		if (res4 == true) {
			System.out.println("Top_questions_about_Digitali is DISPLAYED ");
		} else {
			System.out.println("Top_questions_about_Digitali is not DISPLAYED");
		}
		jse1.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Need_Something
		WebElement Need_Something = driver
				.findElement(By.xpath("//div[contains(text(),'Need something cleared up? Here are our most frequ')]"));
		Thread.sleep(1000);

		// to highlight the Need_Something
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Need_Something);
		Thread.sleep(1000);
		jse2.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate What_is_Digitali?
		WebElement What_is_Digitali = driver.findElement(By.xpath("//div[contains(text(),'What is Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the What_is_Digitali
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_is_Digitali);
		Thread.sleep(1000);

		// What_is_Digitali is DISPLAYED or not
		boolean res5 = What_is_Digitali.isDisplayed();

		if (res5 == true) {
			System.out.println("What_is_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_is_Digitali is not DISPLAYED");
		}
		What_is_Digitali.click();
		Thread.sleep(1000);
		jse3.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Digitali_is_a_community_driven_Web3_collaborative
		WebElement Digitali_is_a_community_driven_Web3_collaborative = driver
				.findElement(By.xpath("//p[contains(text(),'Digitali is a community-driven Web3 collaborative ')]"));
		Thread.sleep(1000);

		// to highlight the Digitali_is_a_community_driven_Web3_collaborative
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Digitali_is_a_community_driven_Web3_collaborative);
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Our_mission_is_to_establish_a_comprehensive_reposi
		WebElement Our_mission_is_to_establish_a_comprehensive_reposi = driver
				.findElement(By.xpath("//p[contains(text(),'Our mission is to establish a comprehensive reposi')]"));
		Thread.sleep(1000);

		// to highlight the Our_mission_is_to_establish_a_comprehensive_reposi
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Our_mission_is_to_establish_a_comprehensive_reposi);
		Thread.sleep(1000);
		jse5.executeScript("scroll(0, 200);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate We_are_committed_to_providing_the_community_with_a
		WebElement We_are_committed_to_providing_the_community_with_a = driver
				.findElement(By.xpath("//p[contains(text(),'We are committed to providing the community with a')]"));
		Thread.sleep(1000);

		// to highlight the We_are_committed_to_providing_the_community_with_a
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				We_are_committed_to_providing_the_community_with_a);
		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 200);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate How_does_Digitali_work
		WebElement How_does_Digitali_work = driver
				.findElement(By.xpath("//div[contains(text(),'How does Digitali work?')]"));
		Thread.sleep(1000);

		// to highlight the How_does_Digitali_work
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_does_Digitali_work);
		Thread.sleep(1000);

		// How_does_Digitali_work is DISPLAYED or not
		boolean res6 = How_does_Digitali_work.isDisplayed();

		if (res6 == true) {
			System.out.println("How_does_Digitali_work is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_does_Digitali_work is not DISPLAYED");
		}
		How_does_Digitali_work.click();
		Thread.sleep(1000);
		jse7.executeScript("scroll(0, 300);");

		// -----------------------------------------------------------------------------------------------------

		// locate Contributors_can_navigate_to_a_specific_NFT_collec
		WebElement Contributors_can_navigate_to_a_specific_NFT_collec = driver
				.findElement(By.xpath("//div[contains(text(),'Contributors can navigate to a specific NFT collec')]"));
		Thread.sleep(1000);

		// to highlight the Contributors_can_navigate_to_a_specific_NFT_collec
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Contributors_can_navigate_to_a_specific_NFT_collec);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate What_kinds_of_NFTs_does_Digitali_currently_cover
		WebElement What_kinds_of_NFTs_does_Digitali_currently_cover = driver
				.findElement(By.xpath("//div[contains(text(),'What kinds of NFTs does Digitali currently cover?')]"));
		Thread.sleep(1000);

		// to highlight the What_kinds_of_NFTs_does_Digitali_currently_cover
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_kinds_of_NFTs_does_Digitali_currently_cover);
		Thread.sleep(1000);

		// What_kinds_of_NFTs_does_Digitali_currently_cover is DISPLAYED or not
		boolean res7 = What_kinds_of_NFTs_does_Digitali_currently_cover.isDisplayed();

		if (res7 == true) {
			System.out.println("What_kinds_of_NFTs_does_Digitali_currently_cover is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_kinds_of_NFTs_does_Digitali_currently_cover is not DISPLAYED");
		}
		What_kinds_of_NFTs_does_Digitali_currently_cover.click();
		Thread.sleep(1000);
		jse9.executeScript("scroll(0, 300);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate We_ve_initially_started_with_PFP_style_collections
		WebElement We_ve_initially_started_with_PFP_style_collections = driver
				.findElement(By.xpath("//p[contains(text(),'We′ve initially started with PFP-style collections')]"));
		Thread.sleep(1000);

		// to highlight the We_ve_initially_started_with_PFP_style_collections
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				We_ve_initially_started_with_PFP_style_collections);
		Thread.sleep(1000);
		jse10.executeScript("scroll(0, 600);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate Our_ultimate_goal_is_to_evolve_and_encompass_a_bro
		WebElement Our_ultimate_goal_is_to_evolve_and_encompass_a_bro = driver
				.findElement(By.xpath("//p[contains(text(),'Our ultimate goal is to evolve and encompass a bro')]"));
		Thread.sleep(1000);

		// to highlight the Our_ultimate_goal_is_to_evolve_and_encompass_a_bro
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Our_ultimate_goal_is_to_evolve_and_encompass_a_bro);
		Thread.sleep(1000);
		jse11.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------------------

		// locate How_can_I_contribute_content_to_Digitali
		WebElement How_can_I_contribute_content_to_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'How can I contribute content to Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the How_can_I_contribute_content_to_Digitali
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_can_I_contribute_content_to_Digitali);
		Thread.sleep(1000);

		// How_can_I_contribute_content_to_Digitali is DISPLAYED or not
		boolean res8 = How_can_I_contribute_content_to_Digitali.isDisplayed();

		if (res8 == true) {
			System.out.println("How_can_I_contribute_content_to_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_can_I_contribute_content_to_Digitali is not DISPLAYED");
		}

		How_can_I_contribute_content_to_Digitali.click();
		Thread.sleep(1000);
		jse12.executeScript("scroll(0, 600);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate Contributing_content_is_effortless
		WebElement Contributing_content_is_effortless = driver
				.findElement(By.xpath("//p[normalize-space()='Contributing content is effortless.']"));
		Thread.sleep(1000);

		// to highlight the Contributing_content_is_effortless
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Contributing_content_is_effortless);
		Thread.sleep(1000);
		jse14.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate Simply_go_to_a_collection_page_and_click_the
		WebElement Simply_go_to_a_collection_page_and_click_the = driver
				.findElement(By.xpath("//p[contains(text(),'Simply go to a collection page, and click the \"ADD')]"));
		Thread.sleep(1000);

		// to highlight the Simply_go_to_a_collection_page_and_click_the
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Simply_go_to_a_collection_page_and_click_the);
		Thread.sleep(1000);
		jse15.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate Provide_your_email_and_ETH_address_for_communicati
		WebElement Provide_your_email_and_ETH_address_for_communicati = driver
				.findElement(By.xpath("//p[contains(text(),'Provide your email and ETH address for communicati')]"));
		Thread.sleep(1000);

		// to highlight the Provide_your_email_and_ETH_address_for_communicati
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Provide_your_email_and_ETH_address_for_communicati);
		Thread.sleep(1000);
		jse16.executeScript("scroll(0, 600);");

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate It_s_that_simple
		WebElement It_s_that_simple = driver.findElement(By.xpath("//p[contains(text(),'It′s that simple!')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				It_s_that_simple);
		Thread.sleep(1000);
		jse17.executeScript("scroll(0, 600);");

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate What_kind_of_information_can_I_contribute_to_Digit
		WebElement What_kind_of_information_can_I_contribute_to_Digit = driver
				.findElement(By.xpath("//div[contains(text(),'What kind of information can I contribute to Digit')]"));
		Thread.sleep(1000);

		// to highlight the What_kind_of_information_can_I_contribute_to_Digit
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_kind_of_information_can_I_contribute_to_Digit);
		Thread.sleep(1000);

		// What_kind_of_information_can_I_contribute_to_Digit is DISPLAYED or not
		boolean res9 = What_kind_of_information_can_I_contribute_to_Digit.isDisplayed();

		if (res9 == true) {
			System.out.println("What_kind_of_information_can_I_contribute_to_Digit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_kind_of_information_can_I_contribute_to_Digit is not DISPLAYED");
		}
		What_kind_of_information_can_I_contribute_to_Digit.click();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate ans
		WebElement ans = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans);
		Thread.sleep(1000);
		jse18.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Are_there_any_guidelines_or_rules_for_contributing
		WebElement Are_there_any_guidelines_or_rules_for_contributing = driver
				.findElement(By.xpath("//div[contains(text(),'Are there any guidelines or rules for contributing')]"));
		Thread.sleep(1000);

		// to highlight the Are_there_any_guidelines_or_rules_for_contributing
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Are_there_any_guidelines_or_rules_for_contributing);
		Thread.sleep(1000);

		// Are_there_any_guidelines_or_rules_for_contributing is DISPLAYED or not
		boolean res10 = Are_there_any_guidelines_or_rules_for_contributing.isDisplayed();

		if (res10 == true) {
			System.out.println("Are_there_any_guidelines_or_rules_for_contributing is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Are_there_any_guidelines_or_rules_for_contributing is not DISPLAYED");
		}
		Are_there_any_guidelines_or_rules_for_contributing.click();
		Thread.sleep(1000);
		jse19.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate ans1
		WebElement ans1 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans1);
		Thread.sleep(1000);
		jse20.executeScript("scroll(0, 600);");

		// -----------------------------------------------------------------------------------------------------------------------------------------

		// locate What_happens_to_the_content_I_submit
		WebElement What_happens_to_the_content_I_submit = driver
				.findElement(By.xpath("//div[contains(text(),'What happens to the content I submit?')]"));
		Thread.sleep(1000);

		// to highlight the What_happens_to_the_content_I_submit
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_happens_to_the_content_I_submit);
		Thread.sleep(1000);

		// What_happens_to_the_content_I_submit is DISPLAYED or not
		boolean res11 = What_happens_to_the_content_I_submit.isDisplayed();

		if (res11 == true) {
			System.out.println("What_happens_to_the_content_I_submit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_happens_to_the_content_I_submit is not DISPLAYED");
		}
		What_happens_to_the_content_I_submit.click();
		Thread.sleep(1000);
		jse21.executeScript("scroll(0, 600);");

		// --------------------------------------------------------------------------------------------------------------------------------
		// locate Reward_Points11
		WebElement Reward_Points11 = driver.findElement(By.xpath(
				"//p[contains(text(),'Next, we multiply this Quality Score ratio by the ')]//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points11
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Reward_Points11);
		Thread.sleep(1000);
		jse24.executeScript("scroll(0, 600);");
		Reward_Points11.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse24.executeScript("scroll(0, 700);");

		// ------------------------------------------------------------

//				// locate ans2
//				WebElement ans2 = driver
//						.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[1]"));
//				Thread.sleep(1000);
//
//				// to highlight the It_s_that_simple
//				JavascriptExecutor jse22 = (JavascriptExecutor) driver;
//				jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						ans2);
//				Thread.sleep(1000);
//				jse22.executeScript("scroll(0, 300);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate
		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit
		WebElement What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit = driver
				.findElement(By.xpath("//div[contains(text(),'What happens to the content I submit?')]"));
		Thread.sleep(1000);

		// to highlight the
		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit);
		Thread.sleep(1000);

		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is
		// DISPLAYED or not
		boolean res12 = What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit.isDisplayed();

		if (res12 == true) {
			System.out.println(
					"What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println(
					"What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is not DISPLAYED");
		}
		What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit.click();
		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 800);");

		// ---------------------------------------------------------------------------------------------------------------

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans3
		WebElement ans3 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse244 = (JavascriptExecutor) driver;
		jse244.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans3);
		Thread.sleep(1000);
		jse244.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate Who_decides_what_gets_approved_for_a_collection_pa
		WebElement Who_decides_what_gets_approved_for_a_collection_pa = driver
				.findElement(By.xpath("//div[contains(text(),'Who decides what gets approved for a collection pa')]"));
		Thread.sleep(1000);

		// to highlight the Who_decides_what_gets_approved_for_a_collection_pa
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Who_decides_what_gets_approved_for_a_collection_pa);
		Thread.sleep(1000);

		// Who_decides_what_gets_approved_for_a_collection_pa is DISPLAYED or not
		boolean res13 = Who_decides_what_gets_approved_for_a_collection_pa.isDisplayed();

		if (res13 == true) {
			System.out.println("Who_decides_what_gets_approved_for_a_collection_pa is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Who_decides_what_gets_approved_for_a_collection_pa is not DISPLAYED");
		}
		Who_decides_what_gets_approved_for_a_collection_pa.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans4
		WebElement ans4 = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans4);
		Thread.sleep(1000);
		jse26.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate Can_I_contribute_content_to_multiple_collection_pa
		WebElement Can_I_contribute_content_to_multiple_collection_pa = driver
				.findElement(By.xpath("//div[contains(text(),'Can I contribute content to multiple collection pa')]"));
		Thread.sleep(1000);

		// to highlight the Can_I_contribute_content_to_multiple_collection_pa
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Can_I_contribute_content_to_multiple_collection_pa);
		Thread.sleep(1000);

		// Can_I_contribute_content_to_multiple_collection_pa is DISPLAYED or not
		boolean res14 = Can_I_contribute_content_to_multiple_collection_pa.isDisplayed();

		if (res14 == true) {
			System.out.println("Can_I_contribute_content_to_multiple_collection_pa is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Can_I_contribute_content_to_multiple_collection_pa is not DISPLAYED");
		}
		Can_I_contribute_content_to_multiple_collection_pa.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans5
		WebElement ans5 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans5);
		Thread.sleep(1000);
		jse28.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate How_do_I_report_inaccurate_or_misleading_informati
		WebElement How_do_I_report_inaccurate_or_misleading_informati = driver
				.findElement(By.xpath("//div[contains(text(),'How do I report inaccurate or misleading informati')]"));
		Thread.sleep(1000);

		// to highlight the How_do_I_report_inaccurate_or_misleading_informati
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_do_I_report_inaccurate_or_misleading_informati);
		Thread.sleep(1000);

		// How_do_I_report_inaccurate_or_misleading_informati is DISPLAYED or not
		boolean res15 = How_do_I_report_inaccurate_or_misleading_informati.isDisplayed();

		if (res15 == true) {
			System.out.println("How_do_I_report_inaccurate_or_misleading_informati is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_do_I_report_inaccurate_or_misleading_informati is not DISPLAYED");
		}
		How_do_I_report_inaccurate_or_misleading_informati.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans6
		WebElement ans6 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans6);
		Thread.sleep(1000);
		jse30.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// locate_Is_the_information_on_Digitali_verified_or_fact_ch
		WebElement locate_Is_the_information_on_Digitali_verified_or_fact_ch = driver
				.findElement(By.xpath("//div[contains(text(),'Is the information on Digitali verified or fact-ch')]"));
		Thread.sleep(1000);

		// to highlight the locate_Is_the_information_on_Digitali_verified_or_fact_ch
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				locate_Is_the_information_on_Digitali_verified_or_fact_ch);
		Thread.sleep(1000);

		// locate_Is_the_information_on_Digitali_verified_or_fact_ch is DISPLAYED or not
		boolean res16 = locate_Is_the_information_on_Digitali_verified_or_fact_ch.isDisplayed();

		if (res16 == true) {
			System.out.println("locate_Is_the_information_on_Digitali_verified_or_fact_ch is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("locate_Is_the_information_on_Digitali_verified_or_fact_ch is not DISPLAYED");
		}
		locate_Is_the_information_on_Digitali_verified_or_fact_ch.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans7
		WebElement ans7 = driver
				.findElement(By.xpath("//p[contains(text(),'Yes, our content moderators review all submitted c')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans7);
		Thread.sleep(1000);
		jse32.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// What_information_do_I_need_to_provide_when_contrib
		WebElement What_information_do_I_need_to_provide_when_contrib = driver
				.findElement(By.xpath("//div[contains(text(),'What information do I need to provide when contrib')]"));
		Thread.sleep(1000);

		// to highlight the What_information_do_I_need_to_provide_when_contrib
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_information_do_I_need_to_provide_when_contrib);
		Thread.sleep(1000);

		// What_information_do_I_need_to_provide_when_contrib is DISPLAYED or not
		boolean res17 = What_information_do_I_need_to_provide_when_contrib.isDisplayed();

		if (res17 == true) {
			System.out.println("What_information_do_I_need_to_provide_when_contrib is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_information_do_I_need_to_provide_when_contrib is not DISPLAYED");
		}
		What_information_do_I_need_to_provide_when_contrib.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans8
		WebElement ans8 = driver
				.findElement(By.xpath("//p[contains(text(),'We require your email address, ETH address, conten')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans8);
		Thread.sleep(1000);
		jse34.executeScript("scroll(0, 600);");

//---------------------------------------------------------------------------------------------------------------------

		// Why_do_I_need_to_include_my_email_address_when_sub
		WebElement Why_do_I_need_to_include_my_email_address_when_sub = driver
				.findElement(By.xpath("//div[contains(text(),'Why do I need to include my email address when sub')]"));
		Thread.sleep(1000);

		// to highlight the Why_do_I_need_to_include_my_email_address_when_sub
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Why_do_I_need_to_include_my_email_address_when_sub);
		Thread.sleep(1000);

		// Why_do_I_need_to_include_my_email_address_when_sub is DISPLAYED or not
		boolean res18 = Why_do_I_need_to_include_my_email_address_when_sub.isDisplayed();

		if (res18 == true) {
			System.out.println("Why_do_I_need_to_include_my_email_address_when_sub is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Why_do_I_need_to_include_my_email_address_when_sub is not DISPLAYED");
		}
		Why_do_I_need_to_include_my_email_address_when_sub.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans9
		WebElement ans9 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans9);
		Thread.sleep(1000);
		jse36.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------------------------------

		// What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag
		WebElement What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag = driver
				.findElement(By.xpath("//div[contains(text(),'What do I do if I can′t find an NFT Collection pag')]"));
		Thread.sleep(1000);

		// to highlight the What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag);
		Thread.sleep(1000);

		// What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is DISPLAYED or not
		boolean res19 = What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag.isDisplayed();

		if (res19 == true) {
			System.out.println("What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is not DISPLAYED");
		}
		What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans10
		WebElement ans10 = driver
				.findElement(By.xpath("//div[contains(text(),'You can request the creation of a new page for you')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans10);
		Thread.sleep(1000);
		jse38.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------------------------------

		// Does_Digitali_offer_NFT_Collection_pages_for_non_E
		WebElement Does_Digitali_offer_NFT_Collection_pages_for_non_E = driver
				.findElement(By.xpath("//div[contains(text(),'Does Digitali offer NFT Collection pages for non-E')]"));
		Thread.sleep(1000);

		// to highlight the Does_Digitali_offer_NFT_Collection_pages_for_non_E
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Does_Digitali_offer_NFT_Collection_pages_for_non_E);
		Thread.sleep(1000);

		// Does_Digitali_offer_NFT_Collection_pages_for_non_E is DISPLAYED or not
		boolean res20 = Does_Digitali_offer_NFT_Collection_pages_for_non_E.isDisplayed();

		if (res20 == true) {
			System.out.println("Does_Digitali_offer_NFT_Collection_pages_for_non_E is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Does_Digitali_offer_NFT_Collection_pages_for_non_E is not DISPLAYED");
		}
		Does_Digitali_offer_NFT_Collection_pages_for_non_E.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans11
		WebElement ans11 = driver
				.findElement(By.xpath("//p[contains(text(),'Absolutely! While most collections on Digitali are')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans11);
		Thread.sleep(1000);
		jse40.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------------------------------

		// What_are_Reward_Points_on_Digitali
		WebElement What_are_Reward_Points_on_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'What are Reward Points on Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the What_are_Reward_Points_on_Digitali
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_are_Reward_Points_on_Digitali);
		Thread.sleep(1000);

		// What_are_Reward_Points_on_Digitali is DISPLAYED or not
		boolean res21 = What_are_Reward_Points_on_Digitali.isDisplayed();

		if (res21 == true) {
			System.out.println("What_are_Reward_Points_on_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_are_Reward_Points_on_Digitali is not DISPLAYED");
		}
		What_are_Reward_Points_on_Digitali.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------------------

		// locate ans12
		WebElement ans12 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[16]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans12);
		Thread.sleep(1000);
		jse42.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------------------------------

		// Is_there_a_Digitali_token
		WebElement Is_there_a_Digitali_token = driver
				.findElement(By.xpath("//div[contains(text(),'Is there a Digitali token?')]"));
		Thread.sleep(1000);

		// to highlight the Is_there_a_Digitali_token
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Is_there_a_Digitali_token);
		Thread.sleep(1000);

		// Is_there_a_Digitali_token is DISPLAYED or not
		boolean res22 = Is_there_a_Digitali_token.isDisplayed();

		if (res22 == true) {
			System.out.println("Is_there_a_Digitali_token is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Is_there_a_Digitali_token is not DISPLAYED");
		}
		Is_there_a_Digitali_token.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans13
		WebElement ans13 = driver
				.findElement(By.xpath("//p[contains(text(),'Not at the moment. Our primary focus is on buildin')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans13);
		Thread.sleep(1000);
		jse44.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------

		// How_will_token_distribution_work_on_Digitali_in_th
		WebElement How_will_token_distribution_work_on_Digitali_in_th = driver
				.findElement(By.xpath("//div[contains(text(),'How will token distribution work on Digitali in th')]"));
		Thread.sleep(1000);

		// to highlight the How_will_token_distribution_work_on_Digitali_in_th
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_will_token_distribution_work_on_Digitali_in_th);
		Thread.sleep(1000);

		// How_will_token_distribution_work_on_Digitali_in_th is DISPLAYED or not
		boolean res23 = How_will_token_distribution_work_on_Digitali_in_th.isDisplayed();

		if (res23 == true) {
			System.out.println("How_will_token_distribution_work_on_Digitali_in_th is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_will_token_distribution_work_on_Digitali_in_th is not DISPLAYED");
		}
		How_will_token_distribution_work_on_Digitali_in_th.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans14
		WebElement ans14 = driver
				.findElement(By.xpath("//p[contains(text(),'We′re exploring various options and will involve o')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans14);
		Thread.sleep(1000);
		jse46.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------

		// Can_I_promote_my_own_NFT_collection_on_Digitali
		WebElement Can_I_promote_my_own_NFT_collection_on_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'Can I promote my own NFT collection on Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the Can_I_promote_my_own_NFT_collection_on_Digitali
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Can_I_promote_my_own_NFT_collection_on_Digitali);
		Thread.sleep(1000);

		// Can_I_promote_my_own_NFT_collection_on_Digitali is DISPLAYED or not
		boolean res24 = Can_I_promote_my_own_NFT_collection_on_Digitali.isDisplayed();

		if (res24 == true) {
			System.out.println("Can_I_promote_my_own_NFT_collection_on_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Can_I_promote_my_own_NFT_collection_on_Digitali is not DISPLAYED");
		}
		Can_I_promote_my_own_NFT_collection_on_Digitali.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------

		// locate ans15
		WebElement ans15 = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[19]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans15);
		Thread.sleep(1000);
		jse48.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------

		// How_can_I_provide_feedback_or_suggest_improvements
		WebElement How_can_I_provide_feedback_or_suggest_improvements = driver
				.findElement(By.xpath("//div[contains(text(),'How can I provide feedback or suggest improvements')]"));
		Thread.sleep(1000);

		// to highlight the How_can_I_provide_feedback_or_suggest_improvements
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_can_I_provide_feedback_or_suggest_improvements);
		Thread.sleep(1000);

		// How_can_I_provide_feedback_or_suggest_improvements is DISPLAYED or not
		boolean res25 = How_can_I_provide_feedback_or_suggest_improvements.isDisplayed();

		if (res25 == true) {
			System.out.println("How_can_I_provide_feedback_or_suggest_improvements is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_can_I_provide_feedback_or_suggest_improvements is not DISPLAYED");
		}
		How_can_I_provide_feedback_or_suggest_improvements.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------

		// locate ans16
		WebElement ans16 = driver.findElement(By.xpath("//p[contains(text(),'Feel free to join our')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans16);
		Thread.sleep(1000);
		jse50.executeScript("scroll(0, 700);");

//---------------------------------------------------------------------------------------------

		// Is_Digitali_open_to_collaborations_or_partnerships
		WebElement Is_Digitali_open_to_collaborations_or_partnerships = driver
				.findElement(By.xpath("//div[contains(text(),'Is Digitali open to collaborations or partnerships')]"));
		Thread.sleep(1000);

		// to highlight the Is_Digitali_open_to_collaborations_or_partnerships
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Is_Digitali_open_to_collaborations_or_partnerships);
		Thread.sleep(1000);

		// Is_Digitali_open_to_collaborations_or_partnerships is DISPLAYED or not
		boolean res26 = Is_Digitali_open_to_collaborations_or_partnerships.isDisplayed();

		if (res26 == true) {
			System.out.println("Is_Digitali_open_to_collaborations_or_partnerships is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Is_Digitali_open_to_collaborations_or_partnerships is not DISPLAYED");
		}
		Is_Digitali_open_to_collaborations_or_partnerships.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------

		// locate ans17
		WebElement ans17 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[21]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans17);
		Thread.sleep(1000);
		jse52.executeScript("scroll(0, 5000);");

		// -------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[contains(text(),'Wen Token?')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED AND CLICKABLE ");
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
		jse448.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE ");
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
		jse449.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse449.executeScript("scroll(0, 10000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
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
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
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
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED  ");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
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
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
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
		boolean res36 = About_Us1.isDisplayed();

		if (res36 == true) {
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
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
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
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
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
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
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
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
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
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
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
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
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
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
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
//		WebElement Discord_Icon = driver.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
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
