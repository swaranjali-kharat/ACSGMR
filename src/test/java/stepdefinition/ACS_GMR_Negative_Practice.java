package stepdefinition;

import static Helper.BaseObjects.go;

import static Helper.BaseObjects.gmr;
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
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import TestDataOperations.TestDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ACS_GMR_Negative_Practice {
	
	private static final CharSequence AWB_ACSGMR_04 = "21062086";


		private static final String WebElement = null;
		private static final WebDriver Driver = null;
		public boolean verify;

		@When("I login with {string} user given in {string} sheet ACS_GMR Negative and Practice")
		public void i_login_with_user_given_in_sheet_ACS_GMR_QuickASI(String entity, String sheetName) throws Throwable {
			Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	
			
			
	}
		@Then("^To verify user able to create direct AWB in FF login and 1SB TSP done with 1VT in CB login or not ACS_GMR Negative and Practice$")
		public void To_verify_user_able_to_create_direct_AWB_in_FF_login_and_1SB_TSP_done_with_1VT_in_CB_login_or_not_ACS_GMR_Negative_and_Practice() throws InterruptedException, AWTException {
			
			gmr.AllRaadioBtn();
		//--------------------------Quick ASI For Direct For Non Bonded-------------------------------------------------------
			
		Actions action1 = new Actions(driver);
		action1.moveToElement(gmr.eAWBTab).perform();
		Thread.sleep(1000);
		
		wm.JavascriptExecutorClick(driver, gmr.QuickASI);Thread.sleep(2000);
		/*gmr.QuickASI();
		gmr.MAWBInput();
		gmr.MAWBASI();
		gmr.CO();
		wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
		Thread.sleep(8000);*/
		}
		
		
		/*@Then("I login with {string} Airline user given in {string} sheet ACS_GMR Negative and Practice")
		public void I_login_with_Airline_user_given_in_sheet_ACS_GMR_Negative_and_Practice(String entity, String sheetName) throws Throwable {
			
			Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	
			
			gmr.Airline();
			}*/
		
		/*@Then("I login with {string} Custom Broker Aadhya user given in {string} sheet ACS_GMR Negative and Practice")
		public void i_login_with_Customer_Broker_Aadhya_user_given_in_sheet_ACS_GMR_Negative_and_Practice(String entity, String sheetName) throws Throwable {

			gmr.Airline();
			
			Entity = entity;
			TestDataReader.ReadLoginDetails(Entity);
			Thread.sleep(500);
			System.out.println("usr= " + Username);
			System.out.println("pwd= " + Password);
			// loginScreen.isLoginScreenDisplayed();
			loginScreen.Login(Entity, Username, Password);
			Thread.sleep(4000);	
			
			gmr.AllRadioBtn.click();
			Thread.sleep(2000);
			gmr.GmrHydRadioOKBtn.click();
			Thread.sleep(2000);
			
			Actions action = new Actions(driver);
			action.moveToElement(gmr.BusinessLoginFF).perform();
			Thread.sleep(1000);
			
			gmr.CustomBrokerInAadhya.click();
			
			//Select aadhyacustombroker = new Select(driver.findElement(By.id("ctl00_rptOrganizationTypeList_ctl00_lnkOrganizationTypeName")));  
			//aadhyacustombroker.selectByVisibleText("Customs Broker");Thread.sleep(2000);
			
			gmr.AddSB();
			gmr.SBDetails();
			gmr.EDocket();
			wm.JavascriptExecutorClick(driver, gmr.SBDetailsAadhya);Thread.sleep(4000);
			gmr.TSP();
			gmr.VehicleToken();
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogoutArrow);Thread.sleep(2000);
			
			wm.JavascriptExecutorClick(driver, gmr.AirlineLogout);Thread.sleep(2000);
			
			}*/
		

		//Tc 3
		/*@Then("^To verify user able to create 2 different direct AWB in ACS_GMR Negative and Practice$")
		public void To_verify_user_able_to_create_2_different_direct_AWB_in_ACS_GMR_Negative_and_Practice() throws InterruptedException, AWTException{ 
	
			gmr.QuickASIForAdvik();
			//gmr.QuickASITab();;
			//gmr.QuickASIForAadhya();
			gmr.MAWBInput();
			gmr.MAWBASI();
			gmr.CO();
			wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
			Thread.sleep(8000);
		}
		
		@Then("^To verify user can fill all the airline details ACS_GMR Negative and Practice$")
		public void To_verify_user_can_fill_all_the_airline_details_ACS_GMR_Negative_and_Practice() throws InterruptedException{
			
			gmr.Airline();

}
			@Then("^Able to generate single VT for 2 different AWB or not ACS_GMR Negative and Practice$")
			public void able_to_generate_single_VT_for_2_different_AWB_or_not_ACS_GMR_Negative_and_Practice() throws InterruptedException, AWTException{ 
			gmr.MAWBInput();
			gmr.AddSB();
		   	gmr.SBDetails();
		   	gmr.EDocket();
		   	gmr.TSP();Thread.sleep(2000);
		   	//gmr.VehicleToken.click();Thread.sleep(2000);
		   	wm.JavascriptExecutorClick(driver, gmr.AddShipment);Thread.sleep(2000);
		   	//gmr.AddShipment.click();Thread.sleep(2000);
		   	driver.switchTo().frame(0);Thread.sleep(1000);
		   	wm.JavascriptExecutorClick(driver, gmr.SBCheckBox);Thread.sleep(2000);
		   	//gmr.SBCheckBox.click();Thread.sleep(2000);
		   	wm.JavascriptExecutorClick(driver, gmr.AddBtnSBCheckBox);Thread.sleep(2000);
		   //	gmr.AddBtnSBCheckBox.click();Thread.sleep(2000);
		   	wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
			gmr.VehicleNumber.sendKeys("23456");
			wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
			gmr.DriverLicenseNo.sendKeys("MH12-3036");
			wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
			gmr.DriverName.sendKeys("Jordhen");
			wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
			gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
			wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
			gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
			wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
			wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(2000); 
		   	
			gmr.AdvikLogout();Thread.sleep(1000);
		}*/
			//TC 4
			@Then("^To verify user able to create Direct AWB and generate multiple VT ACS_GMR Negative and Practice$")
			public void To_verify_user_able_to_create_Direct_AWB_and_generate_multiple_VT_ACS_GMR_Negative_and_Practice() throws InterruptedException, AWTException{ 
				
				wm.JavascriptExecutorClick(driver, gmr.QuickASIMAWBNoPrefix);Thread.sleep(2000);
				gmr.QuickASIMAWBNoPrefix.sendKeys("999");Thread.sleep(2000);
				gmr.QuickASIMAWBNo.sendKeys(AWB_ACSGMR_04);
				Thread.sleep(2000);
				gmr.QuickASIForAdvik();
				gmr.MAWBListInput.sendKeys(AWB_ACSGMR_04);
				Thread.sleep(2000);
				gmr.MAWBInput();
				gmr.MAWBASI();
				gmr.CO();
				wm.driver.get("https://acsdemo.upliftindia.com/ACS_GMR_STG/UI/UpliftLogin.aspx");
				Thread.sleep(8000);
				
			}@Then("^To verify user can fill all the airline details ACS_GMR Negative and Practice$")
			public void To_verify_user_can_fill_all_the_airline_details_ACS_GMR_Negative_and_Practice() throws InterruptedException{
				
				gmr.Airline();
				gmr.CartingOrderShipmentMAWBNo.sendKeys("999" + AWB_ACSGMR_04);
				Thread.sleep(2000);
				gmr.AirlineApprove();
			
			
	}
			@Then("^for single Shipping bill or not ACS_GMR Negative and Practice$")
			public void for_single_Shipping_bill_or_not_ACS_GMR_Negative_and_Practice() throws InterruptedException, AWTException{ 
				gmr.MAWBListInput.sendKeys(AWB_ACSGMR_04);
				Thread.sleep(2000);  
				gmr.MAWBInput();
				gmr.AddSB();
			   	gmr.SBDetails();
			   	gmr.EDocket();
			   	gmr.TSP();Thread.sleep(2000);
			   	
			   	
				wm.JavascriptExecutorClick(driver, gmr.VehicleNumber);Thread.sleep(2000);
				gmr.VehicleNumber.sendKeys("23456");
				wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
				gmr.DriverLicenseNo.sendKeys("MH12-3036");
				wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
				gmr.DriverName.sendKeys("Jordhen");
				wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
				gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
				wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
				gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
				
				gmr.VTNoP.clear();Thread.sleep(1000);
				wm.JavascriptExecutorClick(driver, gmr.VTNoP);Thread.sleep(2000);
				gmr.VTNoP.sendKeys("6");Thread.sleep(2000);
				gmr.VehicleTokenAddBtn.click();Thread.sleep(2000);
				
				//------2nd VT------------------------
				
				wm.JavascriptExecutorClick(driver, gmr.VehicleTokenAddBtn);Thread.sleep(2000);
				  
				gmr.VehicleNumber2Row.click();Thread.sleep(2000);gmr.VehicleNumber.click();Thread.sleep(2000);
				gmr.VehicleNumber2Row.sendKeys("23456");Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.DriverLicenseNo);Thread.sleep(2000);
				gmr.DriverLicenseNo.sendKeys("MH12-3036");
				wm.JavascriptExecutorClick(driver, gmr.DriverName);Thread.sleep(2000);
				gmr.DriverName.sendKeys("Jordhen");
				wm.JavascriptExecutorClick(driver, gmr.DriverMobileNo);Thread.sleep(2000);
				gmr.DriverMobileNo.sendKeys(cm.RandomNo(10));
				wm.JavascriptExecutorClick(driver, gmr.AgentMobileNo);Thread.sleep(2000);
				gmr.AgentMobileNo.sendKeys(cm.RandomNo(10));
				gmr.VTNoP.clear();Thread.sleep(1000);
				wm.JavascriptExecutorClick(driver, gmr.VTNoP);Thread.sleep(2000);
				gmr.VTNoP.sendKeys("6");Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.GenerateToken);Thread.sleep(2000);
				wm.JavascriptExecutorClick(driver, gmr.VehicleTokenConfimationOkBtn);Thread.sleep(2000); 
			   	
				gmr.AdvikLogout();Thread.sleep(1000);
				
			}
		
}