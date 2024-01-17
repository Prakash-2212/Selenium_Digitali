package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Privacy {

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
		Thread.sleep(1000);
		

		// digitali_logo is DISPLAYED or not
		boolean res = digitali_logo.isDisplayed();

		if (res == true) {
			System.out.println("digitali_logo is DISPLAYED");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}

		jse.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the Privacy
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		Thread.sleep(1000);
		
		// Privacy is DISPLAYED or not
		boolean res1 = Privacy.isDisplayed();

		if (res1 == true) {
			System.out.println("Privacy is DISPLAYED");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}

		driver.manage().deleteAllCookies();
		Privacy.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Privacy_Heading
		WebElement Privacy_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'We Care About Your Privacy')]"));
		Thread.sleep(1000);

		// to highlight the Privacy_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Privacy_Heading);
		
		// Privacy_Heading is DISPLAYED or not
		boolean res2 = Privacy_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Privacy_Heading is DISPLAYED");
		} else {
			System.out.println("Privacy_Heading is not DISPLAYED");
		}


		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text1
		WebElement Text1 = driver
				.findElement(By.xpath("//div[contains(text(),'Your privacy is important to us at Digitali. We re')]"));
		Thread.sleep(1000);

		// to highlight the Text1
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

		
		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text2
		WebElement Text2 = driver.findElement(By.xpath("//div[contains(text(),'Privacy Policy')]"));
		Thread.sleep(1000);

		// to highlight the Text2
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text2);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text3
		WebElement Text3 = driver.findElement(By.xpath("//p[contains(text(),'Effective: 1 June 2023')]"));
		Thread.sleep(1000);

		// to highlight the Text3
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text4
		WebElement Text4 = driver
				.findElement(By.xpath("//p[contains(text(),'We take the protection of your privacy and your pe')]"));
		Thread.sleep(1000);

		// to highlight the Text4
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text4);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text5
		WebElement Text5 = driver
				.findElement(By.xpath("//p[contains(text(),'We at Digitali Ltd. operate an online service that')]"));
		Thread.sleep(1000);

		// to highlight the Text5
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text5);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text6
		WebElement Text6 = driver
				.findElement(By.xpath("//p[contains(text(),'Our Services are owned and operated by Digitali Lt')]"));
		Thread.sleep(1000);

		// to highlight the Text6
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text6);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text7
		WebElement Text7 = driver.findElement(By.xpath("//div[contains(text(),'Information Collected')]"));
		Thread.sleep(1000);

		// to highlight the Text7
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text7);

		// Thread.sleep(1000);
		jse9.executeScript("scroll(0,1000);");

		// --------------------------------------------------------------------------------------------------

		// locate Text8
		WebElement Text8 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[5]"));
		Thread.sleep(1000);

		// to highlight the Text8
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text8);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text9
		WebElement Text9 = driver.findElement(By.xpath("//div[contains(text(),'Information Uses')]"));
		Thread.sleep(1000);

		// to highlight the Text9
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text9);

		// Thread.sleep(1000);
		jse11.executeScript("scroll(0,1200);");

		// --------------------------------------------------------------------------------------------------

		// locate Text10
		WebElement Text10 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[7]"));
		Thread.sleep(1000);

		// to highlight the Text10
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text10);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text11
		WebElement Text11 = driver.findElement(By.xpath("//div[contains(text(),'Information Sharing')]"));
		Thread.sleep(1000);

		// to highlight the Text11
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text11);

		// Thread.sleep(1000);
		jse13.executeScript("scroll(0,2000);");

		// -------------------------------------------------------------------------------------

		// locate Text12
		WebElement Text12 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[9]"));
		Thread.sleep(1000);

		// to highlight the Text12
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text13
		WebElement Text13 = driver.findElement(By.xpath("//div[contains(text(),'Information Choices')]"));
		Thread.sleep(1000);

		// to highlight the Text13
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text13);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text14
		WebElement Text14 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[11]"));
		Thread.sleep(1000);

		// to highlight the Text14
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text14);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text15
		WebElement Text15 = driver.findElement(By.xpath("//div[contains(text(),'Information Transfers')]"));
		Thread.sleep(1000);

		// to highlight the Text15
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text15);

		// Thread.sleep(1000);
		jse17.executeScript("scroll(0,3000);");

		// -------------------------------------------------------------------------------------

		// locate Text16
		WebElement Text16 = driver
				.findElement(By.xpath("//p[contains(text(),'We are a global company and operate in many differ')]"));
		Thread.sleep(1000);

		// to highlight the Text16
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text16);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text17
		WebElement Text17 = driver.findElement(By.xpath("//div[contains(text(),'Information Security')]"));
		Thread.sleep(1000);

		// to highlight the Text17
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text17);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text18
		WebElement Text18 = driver
				.findElement(By.xpath("//p[contains(text(),'We have implemented appropriate administrative, te')]"));
		Thread.sleep(1000);

		// to highlight the Text18
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text18);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------

		// locate Text19
		WebElement Text19 = driver.findElement(By.xpath("//div[contains(text(),'Information Retention')]"));
		Thread.sleep(1000);

		// to highlight the Text19
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text19);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text20
		WebElement Text20 = driver
				.findElement(By.xpath("//p[contains(text(),'We will retain copies of your information for as l')]"));
		Thread.sleep(1000);

		// to highlight the Text20
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text20);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text21
		WebElement Text21 = driver.findElement(By.xpath("//div[contains(text(),'Cookies')]"));
		Thread.sleep(1000);

		// to highlight the Text21
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text21);

		// Thread.sleep(1000);
		jse23.executeScript("scroll(0,3500);");

//-------------------------------------------------------------------------------------

		// locate Text22
		WebElement Text22 = driver
				.findElement(By.xpath("//p[contains(text(),'We want your access to our Services to be as easy,')]"));
		Thread.sleep(1000);

		// to highlight the Text22
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text22);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text23
		WebElement Text23 = driver
				.findElement(By.xpath("//p[contains(text(),'Cookies are small text files that are automaticall')]"));
		Thread.sleep(1000);

		// to highlight the Text23
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text23);

		// Thread.sleep(1000);
		jse25.executeScript("scroll(0,3800);");

		// ------------------------------------------------------------------------------------------------

		// locate Text24
		WebElement Text24 = driver
				.findElement(By.xpath("//div[@class='inline-block min-w-full py-2 sm:px-6 lg:px-8']"));
		Thread.sleep(1000);

		// to highlight the Text24
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text24);

		// Thread.sleep(1000);
		jse26.executeScript("scroll(0,4800);");

		// ------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------

		// locate Text25
		WebElement Text25 = driver.findElement(By.xpath("//i[normalize-space()='Cookie Consent Policy']"));
		Thread.sleep(1000);

		// to highlight the Text25
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text25);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text26
		WebElement Text26 = driver
				.findElement(By.xpath("//p[contains(text(),'To give you control, we allow you to decide whethe')]"));
		Thread.sleep(1000);

		// to highlight the Text26
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text26);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text27
		WebElement Text27 = driver
				.findElement(By.xpath("//p[contains(text(),'If you delete your cookies, your access to some fu')]"));
		Thread.sleep(1000);

		// to highlight the Text27
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text27);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text28
		WebElement Text28 = driver
				.findElement(By.xpath("//p[contains(text(),'Our use of any information we collect through cook')]"));
		Thread.sleep(1000);

		// to highlight the Text28
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text28);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text29
		WebElement Text29 = driver
				.findElement(By.xpath("//p[contains(text(),'If you delete your cookies, your access to some fu')]"));
		Thread.sleep(1000);

		// to highlight the Text29
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text29);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text30
		WebElement Text30 = driver
				.findElement(By.xpath("//div[contains(text(),'Statement Changes and Notification')]"));
		Thread.sleep(1000);

		// to highlight the Text30
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text30);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text31
		WebElement Text31 = driver
				.findElement(By.xpath("//p[contains(text(),'We may update this Statement in the future. If we ')]"));
		Thread.sleep(1000);

		// to highlight the Text31
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text31);

		// Thread.sleep(1000);
		jse33.executeScript("scroll(0,5300);");

//----------------------------------------------------------------------------------------------

		// locate Text32
		WebElement Text32 = driver.findElement(By.xpath("//div[contains(text(),'Contact')]"));
		Thread.sleep(1000);

		// to highlight the Text32
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text32);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text33
		WebElement Text33 = driver
				.findElement(By.xpath("//p[contains(text(),'If you have a data privacy request, such as a requ')]"));
		Thread.sleep(1000);

		// to highlight the Text33
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text33);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text34
		WebElement Text34 = driver.findElement(By.xpath("//div[contains(text(),'Europe')]"));
		Thread.sleep(1000);

		// to highlight the Text34
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text34);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text35
		WebElement Text35 = driver
				.findElement(By.xpath("//p[contains(text(),'General Data Protection Regulation Privacy Stateme')]"));
		Thread.sleep(1000);

		// to highlight the Text35
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text35);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text36
		WebElement Text36 = driver
				.findElement(By.xpath("//p[contains(text(),'This GDPR Statement applies to persons in the Euro')]"));
		Thread.sleep(1000);

		// to highlight the Text36
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text36);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text37
		WebElement Text37 = driver.findElement(By.xpath("//p[contains(text(),'Controller of Personal Information')]"));
		Thread.sleep(1000);

		// to highlight the Text37
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text37);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text38
		WebElement Text38 = driver
				.findElement(By.xpath("//p[contains(text(),'Digitali Ltd is the data controller of personal in')]"));
		Thread.sleep(1000);

		// to highlight the Text38
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text38);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text39
		WebElement Text39 = driver.findElement(By.xpath("//p[contains(text(),'Your rights under GDPR')]"));
		Thread.sleep(1000);

		// to highlight the Text39
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text39);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text40
		WebElement Text40 = driver
				.findElement(By.xpath("//p[contains(text(),'You have certain rights regarding your personal da')]"));
		Thread.sleep(1000);

		// to highlight the Text40
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text40);

		// Thread.sleep(1000);
		jse42.executeScript("scroll(0,5800);");

//------------------------------------------------------------------------------------------------

		// locate Text41
		WebElement Text41 = driver
				.findElement(By.xpath("//ul[contains(text(),'The right to restrict the processing of personal d')]"));
		Thread.sleep(1000);

		// to highlight the Text41
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text41);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text42
		WebElement Text42 = driver
				.findElement(By.xpath("//p[contains(text(),'You will not have to pay a fee to access your pers')]"));
		Thread.sleep(1000);

		// to highlight the Text42
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text42);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text43
		WebElement Text43 = driver
				.findElement(By.xpath("//p[contains(text(),'We may need to request specific information from y')]"));
		Thread.sleep(1000);

		// to highlight the Text43
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text43);

		// Thread.sleep(1000);
		jse45.executeScript("scroll(0,6000);");

//------------------------------------------------------------------------------------------------

		// locate Text44
		WebElement Text44 = driver.findElement(By.xpath("//p[normalize-space()='Information Uses']"));
		Thread.sleep(1000);

		// to highlight the Text44
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text44);

		// Thread.sleep(1000);
		jse46.executeScript("scroll(0,6800);");

//------------------------------------------------------------------------------------------------

		// locate Text45
		WebElement Text45 = driver
				.findElement(By.xpath("//p[contains(text(),'We will only use your personal data when the law a')]"));
		Thread.sleep(1000);

		// to highlight the Text45
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text45);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text46
		WebElement Text46 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[25]/ul[2]"));
		Thread.sleep(1000);

		// to highlight the Text46
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text46);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text47
		WebElement Text47 = driver.findElement(By.xpath("//p[normalize-space()='International Transfers']"));
		Thread.sleep(1000);

		// to highlight the Text47
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text47);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text48
		WebElement Text48 = driver
				.findElement(By.xpath("//p[contains(text(),'Your personal data may be stored or transferred to')]"));
		Thread.sleep(1000);

		// to highlight the Text48
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text48);

		// Thread.sleep(1000);
		jse50.executeScript("scroll(0,7200);");
//------------------------------------------------------------------------------------------------

		// locate Text49
		WebElement Text49 = driver
				.findElement(By.xpath("//p[contains(text(),'Whenever we store or transfer your personal data o')]"));
		Thread.sleep(1000);

		// to highlight the Text49
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text49);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text50
		WebElement Text50 = driver
				.findElement(By.xpath("//p[contains(text(),'By using our services, you understand that your pe')]"));
		Thread.sleep(1000);

		// to highlight the Text50
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text50);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text51
		WebElement Text51 = driver.findElement(By.xpath("//div[contains(text(),'California')]"));
		Thread.sleep(1000);

		// to highlight the Text51
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text51);

		// Thread.sleep(1000);
		jse53.executeScript("scroll(0,7500);");

//------------------------------------------------------------------------------------------------

		// locate Text52
		WebElement Text52 = driver
				.findElement(By.xpath("//p[contains(text(),'California Consumer Privacy Act Privacy Statement ')]"));
		Thread.sleep(1000);

		// to highlight the Text52
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text52);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text53
		WebElement Text53 = driver.findElement(By.xpath("//p[contains(text(),'Your rights under CCPA')]"));
		Thread.sleep(1000);

		// to highlight the Text53
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text53);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text54
		WebElement Text54 = driver
				.findElement(By.xpath("//p[contains(text(),'As of January 1, 2020, California law permits resi')]"));
		Thread.sleep(1000);

		// to highlight the Text54
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text54);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text55
		WebElement Text55 = driver
				.findElement(By.xpath("//p[contains(text(),'California residents may also take advantage of th')]"));
		Thread.sleep(1000);

		// to highlight the Text55
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text55);

		// Thread.sleep(1000);
		jse57.executeScript("scroll(0,7800);");

//------------------------------------------------------------------------------------------------

		// locate Text56
		WebElement Text56 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[27]/ul[1]"));
		Thread.sleep(1000);

		// to highlight the Text56
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text56);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text57
		WebElement Text57 = driver
				.findElement(By.xpath("//p[contains(text(),'To take advantage of your disclosure and deletion ')]"));
		Thread.sleep(1000);

		// to highlight the Text57
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text57);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text58
		WebElement Text58 = driver.findElement(By.xpath("//p[normalize-space()='Disclosures']"));
		Thread.sleep(1000);

		// to highlight the Text58
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text58);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text59
		WebElement Text59 = driver
				.findElement(By.xpath("//p[contains(text(),'For purposes of compliance with the CCPA, in addit')]"));
		Thread.sleep(1000);

		// to highlight the Text59
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text59);

		// Thread.sleep(1000);
		jse61.executeScript("scroll(0,8300);");

//------------------------------------------------------------------------------------------------

		// locate Text60
		WebElement Text60 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[27]/ul[2]"));
		Thread.sleep(1000);

		// to highlight the Text60
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text60);

		// Thread.sleep(1000);
		jse62.executeScript("scroll(0,8600);");
//
//------------------------------------------------------------------------------------------------
		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

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
		JavascriptExecutor jse448 = (JavascriptExecutor) driver;
		jse448.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		JavascriptExecutor jse449 = (JavascriptExecutor) driver;
		jse449.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse552 = (JavascriptExecutor) driver;
		jse552.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

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
		JavascriptExecutor jse553 = (JavascriptExecutor) driver;
		jse553.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse554 = (JavascriptExecutor) driver;
		jse554.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse555 = (JavascriptExecutor) driver;
		jse555.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse556 = (JavascriptExecutor) driver;
		jse556.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

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
		JavascriptExecutor jse557 = (JavascriptExecutor) driver;
		jse557.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

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
		JavascriptExecutor jse558 = (JavascriptExecutor) driver;
		jse558.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
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
		JavascriptExecutor jse559 = (JavascriptExecutor) driver;
		jse559.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

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
		JavascriptExecutor jse660 = (JavascriptExecutor) driver;
		jse660.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

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
		JavascriptExecutor jse661 = (JavascriptExecutor) driver;
		jse661.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy111
		WebElement Privacy111 = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy111
		JavascriptExecutor jse662 = (JavascriptExecutor) driver;
		jse662.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy111);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy111.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy111 is DISPLAYED");
		} else {
			System.out.println("Privacy111 is not DISPLAYED");
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
