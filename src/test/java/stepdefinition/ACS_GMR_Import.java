package stepdefinition;

import static Helper.BaseObjects.go;
import static Helper.BaseObjects.gmr;
import static Helper.BaseObjects.gmrImport;
import static Helper.BaseObjects.driver;
import static Helper.BaseObjects.loginScreen;
import static Helper.BaseObjects.wm;
import static Helper.BaseObjects.cm;
import static Helper.BaseObjects.co;
import static Helper.BaseVariables.Entity;
import static Helper.BaseVariables.Password;
import static Helper.BaseVariables.Username;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.math.Expression;

import Methods.CommonMethods;
import Methods.WebDriverMethod;
import TestDataOperations.TestDataReader;
import groovyjarjarantlr.collections.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACS_GMR_Import {


	private static final String WebElement = null;
	private static final WebDriver Driver = null;
	public boolean verify;
	
	
	
	
	@When("I login with {string} user given in {string} sheet ACS_GMR_Import")
	public void i_login_with_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
	}
	
	@Given("^To verify whether user is able to create Direct Shipment from Add MAWB/HAWB screen ACS_GMR_Import$")
	public void To_verify_whether_user_is_able_to_create_Direct_Shipment_from_Add_MAWB_HAWB_screen_ACS_GMR_Import() throws InterruptedException, AWTException {

	gmr.AllRadioBtn.click();
	Thread.sleep(2000);
	
	gmr.GmrHydRadioOKBtn.click();
	Thread.sleep(2000);
	
	gmrImport.Imports.click();
	Thread.sleep(2000);
	
	WebElement Element = driver.findElement(By.id("ctl00_hldPage_btnGenerateToken"));

    //This will scroll the page till the element is found	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Element);
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
	Thread.sleep(2000);
	
	/*gmrImport.AddHAWBMAWBBtn.click();
	Thread.sleep(2000);
	
	gmrImport.MAWBNoPrefix.click();Thread.sleep(1000);
	gmrImport.MAWBNoPrefix.sendKeys("999");Thread.sleep(1000);
	
	gmrImport.AWBNo.click();Thread.sleep(1000);
	gmrImport.AWBNo.sendKeys("22052015");Thread.sleep(1000);
	
	gmrImport.MAWBCalendar.click();Thread.sleep(1000);
	gmrImport.MAWBDate.click();Thread.sleep(1000); //------------------Every should change
	
	gmrImport.OrgAirportCode.click();Thread.sleep(1000);
	gmrImport.OrgAirportCode.sendKeys("lhr");Thread.sleep(1000);
	
	Robot down = new Robot();
	down.delay(2000);
	
	down.keyPress(KeyEvent.VK_DOWN);
	down.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	gmrImport.FlightNo.click();Thread.sleep(1000);
	gmrImport.FlightNo.sendKeys("5352");Thread.sleep(1000);
	
	gmrImport.FlightCalendar.click();Thread.sleep(1000);
	 gmrImport.FlightDate.click();	                       //------------------Every should change
	 Thread.sleep(2000);
	
	gmrImport.IGMNo.click();Thread.sleep(1000);
	gmrImport.IGMNo.sendKeys("8594034");Thread.sleep(1000); 
	
	gmrImport.IGMCalendar.click();Thread.sleep(1000);
	gmrImport.IGMDate.click();Thread.sleep(1000);            //------------------Every should change
		
	gmrImport.NoOfPckg.click();Thread.sleep(1000);
	gmrImport.NoOfPckg.sendKeys("2");Thread.sleep(1000);
	 
	gmrImport.GrossWt.click();Thread.sleep(1000);
	gmrImport.GrossWt.sendKeys("120");Thread.sleep(1000);
	
	wm.JavascriptExecutorClick(driver, gmrImport.ChrgWt);Thread.sleep(2000);
	gmrImport.ChrgWt.sendKeys("140");Thread.sleep(1000);
	
	//------------------------------------HAWB Details------------------------------------------------
	
	gmrImport.HAWBNo.click();Thread.sleep(1000);
	gmrImport.HAWBNo.sendKeys("h1");Thread.sleep(1000);
	
	gmrImport.HAWBDetailsCalendar.click();Thread.sleep(1000);
	gmrImport.HAWBDetailsDate.click();Thread.sleep(1000);
	
	gmrImport.origin.click();Thread.sleep(1000);
	gmrImport.origin.sendKeys("LHR");Thread.sleep(1000);
	
	gmrImport.Package.click();Thread.sleep(1000);
	gmrImport.Package.sendKeys("2");Thread.sleep(1000);
	
	gmrImport.GrossWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.GrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(1000);
	
	gmrImport.ChargeWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ChargeWtOfHAWBDetails.clear();Thread.sleep(1000);
	gmrImport.ChargeWtOfHAWBDetails.sendKeys("140");Thread.sleep(1000);
	
	gmrImport.ReceivedPckgOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ReceivedPckgOfHAWBDetails.sendKeys("1");Thread.sleep(1000);
	
	gmrImport.ReceivedGrossWtOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.ReceivedGrossWtOfHAWBDetails.sendKeys("120");Thread.sleep(1000);
	
	gmrImport.ReceivedChrgWtOfHAWBDetails.click();Thread.sleep(1000);
	
	
	
	gmrImport.DescriptionOfHAWBDetails.click();Thread.sleep(1000);
	gmrImport.DescriptionOfHAWBDetails.sendKeys("Done");Thread.sleep(1000);
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,200)", "");
	Thread.sleep(1000);
	
	gmrImport.HAWBDetailsSaveBtn.click();Thread.sleep(1000);
	
	gmrImport.MAWBDetailsSuccessPoupMsgBtn.click();Thread.sleep(1000);
	
	
	//-----------------------------Generate Token---------------------------------------
	gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(2000);
	gmrImport.MAWBNOInShipmentDetails.sendKeys("23052050");Thread.sleep(2000);
	
	gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(2000);
	gmrImport.Contains.click();Thread.sleep(4000);
	
	gmrImport.AirlinrDo.click();Thread.sleep(2000);
	
	Thread.sleep(8000);

	wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");

	Thread.sleep(8000);*/
	}
	
	@Then("I login with {string} airline user given in {string} sheet ACS_GMR_Import")
	public void i_login_with_airline_user_given_in_sheet_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
		
		/*Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= " + Username);
		System.out.println("pwd= " + Password);
		// loginScreen.isLoginScreenDisplayed();
		loginScreen.Login(Entity, Username, Password);
		Thread.sleep(4000);	
		
		
		wm.JavascriptExecutorClick(driver, gmrImport.ImportsForAirline);Thread.sleep(2000);
	
		Actions shipmentdetails = new Actions(driver);
		//Mouseover on an element
		shipmentdetails.moveToElement(gmrImport.ShipmentDetails).perform();
		Thread.sleep(2000);
	
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetails);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ShipmentDetailscheckbox);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredr);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.ApproveDeliveryOredrpopup);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);*/
	}
		
		@Then("I logout with {string} airline user given in {string} sheet for request status ACS_GMR_Import")
		public void I_logout_with_airline_user_given_in_sheet_for_request_status_ACS_GMR_Import(String entity, String sheetName) throws Throwable {
		
			/*Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	*/
			
			gmrImport.MAWBNOInShipmentDetails.click();Thread.sleep(2000);
			gmrImport.MAWBNOInShipmentDetails.sendKeys("24052022");Thread.sleep(2000);
			
			gmrImport.MAWBNOInShipmentDetailsDownArrow.click();Thread.sleep(2000);
			gmrImport.Contains.click();Thread.sleep(4000);
			
		/*wm.JavascriptExecutorClick(driver, gmrImport.WeightVerification);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.WeightVerificationUploadDocs);Thread.sleep(2000);
		
		driver.switchTo().frame(0);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocRadioBtn);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.UploadHAWBDocchoosefile);Thread.sleep(2000);
		
		 WebElement icon = driver.findElement(By.id("ctl00_hldPage_grdWTVerificationDetails_ctl02_fuctlUploadDocs1"));
	      Actions ob = new Actions(driver);
	      ob.click(icon);
	      Action action  = ob.build();
	      action.perform();
		
		Robot uploaddoc = new Robot();
		uploaddoc.delay(2000);

		StringSelection sss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss1, null);

		uploaddoc.keyPress(KeyEvent.VK_CONTROL);
		uploaddoc.keyPress(KeyEvent.VK_V);
		uploaddoc.delay(2000);

		uploaddoc.keyPress(KeyEvent.VK_ENTER);
//		uploaddoc.keyPress(KeyEvent.VK_ENTER);
		uploaddoc.delay(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtn);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopup);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBtnPopupClose);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUpload);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(2000);
		wm.JavascriptExecutorClick(driver, gmrImport.ChargWtExcelUploadChooseFile);Thread.sleep(2000);
		
		
		
	      
	      WebElement destname = driver.findElement(By.id("ctl00_hldPage_fuuploadexcel"));
	      Actions dest = new Actions(driver);
	      dest.click(destname);
	      Action destnameaction  = dest.build();
	      destnameaction.perform();Thread.sleep(2000);
	      
	      Robot uploaddoc1 = new Robot();
			uploaddoc1.delay(2000);

			StringSelection ss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

			uploaddoc1.keyPress(KeyEvent.VK_CONTROL);
			uploaddoc1.keyPress(KeyEvent.VK_V);
			uploaddoc1.delay(2000);

			uploaddoc1.keyPress(KeyEvent.VK_ENTER);
//			uploaddoc.keyPress(KeyEvent.VK_ENTER);
			uploaddoc1.delay(1000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.DownloadSampleExcelTemplate);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ChargeWtpopupUpload);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.wtVerificationsubmitpopup);Thread.sleep(2000);
			
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoRevoke);Thread.sleep(2000);
		
		Select consoldocustomerbroker = new Select(driver.findElement(By.id("ctl00_hldPage_ddlCHA")));  
		consoldocustomerbroker.selectByVisibleText("ADVIK ENTERPRISES");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDopoup);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmit);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.ConsoleDoSubmittedSuccessfully);Thread.sleep(2000);*/
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoE);Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoENumber);Thread.sleep(2000);
		gmrImport.BoENumber.sendKeys("7474745");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.BoEDate);Thread.sleep(2000);
		
		LocalDate boedate = LocalDate.now();
		DateTimeFormatter boedateformatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		 String boedatedate = boedate.format(boedateformatter);
		 gmrImport.BoEDate.sendKeys(boedatedate);	
		 Thread.sleep(2000);
		 
		Select boetype = new Select(driver.findElement(By.id("drpSBType")));  
		boetype.selectByVisibleText("Manual");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.CAVValue);Thread.sleep(2000);
		gmrImport.CAVValue.sendKeys("123456789123");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.NoPForBoE);Thread.sleep(2000);
		gmrImport.NoPForBoE.sendKeys("1");Thread.sleep(2000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoE);Thread.sleep(2000);
		
		driver.switchTo().frame(0);Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEChooseFile);Thread.sleep(2000);
		
		WebElement boeupload = driver.findElement(By.id("ctl00_hldPage_fuctlUploadDocs"));
	    Actions boe = new Actions(driver);
	    boe.click(boeupload);
	    Action uploadboeaction  = boe.build();
	    uploadboeaction.perform();Thread.sleep(2000);
		
		 Robot uploadboe = new Robot();
		 uploadboe.delay(2000);

			StringSelection ss1 = new StringSelection("E:\\dummy1 documents\\pdf1.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

			uploadboe.keyPress(KeyEvent.VK_CONTROL);
			uploadboe.keyPress(KeyEvent.VK_V);
			uploadboe.delay(2000);

			uploadboe.keyPress(KeyEvent.VK_ENTER);
//			uploaddoc.keyPress(KeyEvent.VK_ENTER);
			uploadboe.delay(1000);
			
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFile);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmrImport.UploadBoEBtnChooseFileCloseBtn);Thread.sleep(2000);
		
		//wm.JavascriptExecutorClick(driver, gmrImport.BillEntryDetailsSaveBtn);Thread.sleep(2000);
		
		
	/*gmrImport.GenerateTokenBtn.click();Thread.sleep(2000);
	
	gmrImport.CTOKaleGHA1.click();Thread.sleep(2000);
	
	gmrImport.CTOKaleGHA1Proceed.click();Thread.sleep(1000);
	
	gmrImport.VehicleNo.click();Thread.sleep(1000);
	gmrImport.VehicleNo.sendKeys("MH127896");Thread.sleep(1000);
	
	gmrImport.DriverLicenseNo.click();Thread.sleep(1000);
	gmrImport.DriverLicenseNo.sendKeys("MH7896");Thread.sleep(1000);
	
	gmrImport.DriverName.click();Thread.sleep(1000);
	gmrImport.DriverName.sendKeys("John");Thread.sleep(1000);
	
	gmrImport.DriverMobileNo.click();Thread.sleep(1000);
	gmrImport.DriverMobileNo.sendKeys("1234567891");Thread.sleep(1000);
	
	gmrImport.AgentMobileNo.click();Thread.sleep(1000);
	gmrImport.AgentMobileNo.sendKeys("2234567891");Thread.sleep(1000);
	
	gmrImport.NumberOfPieces.click();Thread.sleep(1000);
	gmrImport.NumberOfPieces.sendKeys("20");Thread.sleep(2000);
	
	gmrImport.GrossWtForVehicleDetails.click();Thread.sleep(1000);
	
	gmrImport.VehicleDetailsAdd.click();Thread.sleep(1000);
	
	Actions tracktrace = new Actions(driver);
	//Mouseover on an element
	tracktrace.moveToElement(gmrImport.TrackTrace).perform();
	Thread.sleep(1000);
	
	gmrImport.TrackTrace.click();Thread.sleep(2000);
	
	Actions gstinfo = new Actions(driver);
	//Mouseover on an element
	gstinfo.moveToElement(gmrImport.GSTInfo).perform();
	Thread.sleep(1000);
	
	gmrImport.GSTInfo.click();Thread.sleep(1000);
	
	Actions reports = new Actions(driver);
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.TransactionReports.click();Thread.sleep(1000);
	
	Select cto = new Select(driver.findElement(By.id("ctl00_hldPage_ddlTerminal")));  
	cto.selectByVisibleText("Kale_GHA1");
	
	gmrImport.ExportToExcelTransactionReport.click();Thread.sleep(1000);
	
	
	//Mouseover on an element
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.DwellTimeReport.click();Thread.sleep(1000);
	
	gmrImport.DwellTimeReportExportToExcel.click();Thread.sleep(1000);
	
	reports.moveToElement(gmrImport.Reports).perform();
	Thread.sleep(1000);
	
	gmrImport.TonnageReport.click();Thread.sleep(1000);
	
	gmrImport.TonnageReportAirport.click();Thread.sleep(1000);
	gmrImport.TonnageReportAirport.sendKeys("HYD");Thread.sleep(1000);
	
	gmrImport.TonnageReportExportToExcel.click();Thread.sleep(1000);
	
	Actions ecustom = new Actions(driver);
	//Mouseover on an element
	ecustom.moveToElement(gmrImport.Ecustom).perform();
	Thread.sleep(1000);
	
	gmrImport.Ecustom.click();Thread.sleep(1000);*/
	
	}
}
