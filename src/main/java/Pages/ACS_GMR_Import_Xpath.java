package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACS_GMR_Import_Xpath extends Pages.BasePage {

	public ACS_GMR_Import_Xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id='ctl00_btnimp']")
	public WebElement Imports;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_BtnLoadFromFile1']")
	public WebElement AddHAWBMAWBBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAirlinePrefix']")
	public WebElement MAWBNoPrefix;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtMAWBNumber']")
	public WebElement AWBNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[2]/td[4]/img")
	public WebElement MAWBCalendar;
	
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr[4]/td[2]/a")
	public WebElement MAWBDate;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[4]/td[4]/img")
	public WebElement FlightCalendar;
	
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr[4]/td[2]/a")
	public WebElement FlightDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_GenericAutoFillCityDeparture_txtCode']")
	public WebElement OrgAirportCode;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtIGMNo']")
	public WebElement IGMNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/fieldset/table/tbody/tr[5]/td[4]/img")
	public WebElement IGMCalendar;
	
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr[4]/td[2]/a")
	public WebElement IGMDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtFlightNo']")
	public WebElement FlightNo;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtNumberOfPackages']")
	public WebElement NoOfPckg;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtGrossWeight']")
	public WebElement GrossWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtChargeableWeight']")
	public WebElement ChrgWt;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumber']")
	public WebElement HAWBNo;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[1]/table/tbody/tr[1]/td/fieldset/div[2]/span/table/tbody/tr[2]/td[2]/img")
	public WebElement HAWBDetailsCalendar;
	
	@FindBy(xpath = "/html/body/div[5]/table/tbody/tr[4]/td[2]/a")
	public WebElement HAWBDetailsDate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtOrigin']")
	public WebElement origin;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBNumberOfPackages']")
	public WebElement Package;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBGrossWeight']")
	public WebElement GrossWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBChargeableWeight']")
	public WebElement ChargeWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBNumberOfPackages']")
	public WebElement ReceivedPckgOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBGrossWeight']")
	public WebElement ReceivedGrossWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtRcvdHAWBChargeableWeight']")
	public WebElement ReceivedChrgWtOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rptHAWB_ctl01_txtHAWBDescription']")
	public WebElement DescriptionOfHAWBDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnSaveMAWB']")
	public WebElement HAWBDetailsSaveBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div/div[3]/input")
	public WebElement MAWBDetailsSuccessPoupMsgBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnGenerateToken']")
	public WebElement GenerateTokenBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rblCTOTokenList_1']")
	public WebElement CTOKaleGHA1;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnCTOTokenProceed']")
	public WebElement CTOKaleGHA1Proceed;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl02_HyperLink1']")
	public WebElement TrackTrace;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl13_HyperLink1']")
	public WebElement GSTInfo;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_HyperLink1']")
	public WebElement Reports;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl01_HyperLink2']")
	public WebElement TransactionReports;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement ExportToExcelTransactionReport;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl02_HyperLink2']")
	public WebElement DwellTimeReport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcel']")
	public WebElement DwellTimeReportExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl15_Repeater1_ctl03_HyperLink2']")
	public WebElement TonnageReport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_txtAirport']")
	public WebElement TonnageReportAirport;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_Button1']")
	public WebElement TonnageReportExportToExcel;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl16_HyperLink1']")
	public WebElement Ecustom;
	
	@FindBy(xpath = "//*[@id='txtVehNo']")
	public WebElement VehicleNo;
	
	@FindBy(xpath = "//*[@id='txtDriverLicNo']")
	public WebElement DriverLicenseNo;
	
	@FindBy(xpath = "//*[@id='txtDriverName']")
	public WebElement DriverName;
	
	@FindBy(xpath = "//*[@id='txtDriverMobNo']")
	public WebElement DriverMobileNo;
	
	@FindBy(xpath = "//*[@id='txtAgentMobNo']")
	public WebElement AgentMobileNo;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement NumberOfPieces;
	
	@FindBy(xpath = "//*[@id='txtGrossWt']")
	public WebElement GrossWtForVehicleDetails;
	
	@FindBy(xpath = "//*[@id='AddRow']")
	public WebElement VehicleDetailsAdd;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl01_txtFilter8']")
	public WebElement MAWBNOInShipmentDetails;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[2]/div/div[2]/div/div[2]/fieldset/div[2]/div[2]/div/table/tbody/tr[1]/th[6]/table/tbody/tr/td[1]/input")
	public WebElement MAWBNOInShipmentDetailsDownArrow;
	
	@FindBy(xpath = "//*[@id='filterMenucontains']")
	public WebElement Contains;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnAirlineDO']")
	public WebElement AirlinrDo;
	
	@FindBy(xpath = "//*[@id='ctl00_siteWide_topmenucontainer_ctl05_HyperLink1']")
	public WebElement ShipmentDetails;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdADO_ctl02_chkSelectADO']")
	public WebElement ShipmentDetailscheckbox;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnApprovedADO']")
	public WebElement ApproveDeliveryOredr;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[10]/div/div/div[3]/input")
	public WebElement ApproveDeliveryOredrpopup;
	
	@FindBy(xpath = "//*[@id='ctl00_btnimp']")
	public WebElement ImportsForAirline;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnwtVerification']")
	public WebElement WeightVerification;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadDocument']")
	public WebElement WeightVerificationUploadDocs;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_rdbuttonhouse']")
	public WebElement UploadHAWBDocRadioBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdWTVerificationDetails_ctl02_fuctlUploadDocs1']")
	public WebElement UploadHAWBDocchoosefile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadfile']")
	public WebElement UploadBtn;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[2]/div/div[2]/div[5]/div/div/div[3]/button")
	public WebElement UploadBtnPopup;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnClosePopup']")
	public WebElement UploadBtnPopupClose;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnChrgWtExcepUpload']")
	public WebElement ChargWtExcelUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuuploadexcel']")
	public WebElement ChargWtExcelUploadChooseFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_lbDownloadExcelDownload']")
	public WebElement DownloadSampleExcelTemplate;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnExcelUpload']")
	public WebElement ChargeWtpopupUpload;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnwtSubmit']")
	public WebElement wtVerificationsubmit;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[4]/div/div[2]/div[6]/div[1]/div[4]/div/div/div[3]/input")
	public WebElement wtVerificationsubmitpopup;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[8]/div/div/div[3]/input")
	public WebElement ConsoleDopoup;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_btnConsolDO']")
	public WebElement ConsoleDoRevoke;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnDOSubmit']")
	public WebElement ConsoleDoSubmit;
	
	@FindBy(xpath = "/html/body/form/div[4]/div[8]/div/div/div[3]/input")
	public WebElement ConsoleDoSubmittedSuccessfully;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_grdMAWB_ctl02_HyperLinkSB']")
	public WebElement BoE;
	
	@FindBy(xpath = "//*[@id='txtSBNumber']")
	public WebElement BoENumber;
	
	@FindBy(xpath = "//*[@id='txtSBDate']")
	public WebElement BoEDate;
	
	@FindBy(xpath = "//*[@id='txtCAV']")
	public WebElement CAVValue;
	
	@FindBy(xpath = "//*[@id='txtNOP']")
	public WebElement NoPForBoE;
	
	@FindBy(xpath = "//*[@id='btnSaveAWB']")
	public WebElement BillEntryDetailsSaveBtn;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_ShippingBill_HyperLinkSB']")
	public WebElement UploadBoE;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_fuctlUploadDocs']")
	public WebElement UploadBoEChooseFile;
	
	@FindBy(xpath = "//*[@id='ctl00_hldPage_btnUploadSave']")
	public WebElement UploadBoEBtnChooseFile;
	
	@FindBy(xpath = "/html/body/form/div[10]/div[3]/div/button")
	public WebElement UploadBoEBtnChooseFileCloseBtn;
	
	
}

