import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://hutech.edu.vn')

ChromeOptions options = new ChromeOptions()
options.addArguments('--headless')
options.addArguments('--no-sandbox')
options.addArguments('--disable-dev-shm-usage')

WebDriver driver = new ChromeDriver(options)
DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('http://e-graduate.hutech.edu.vn/portal')

WebUI.setText(findTestObject('Object Repository/Page_E-LEARNING HUTECH  elearning - i Hc Cn_f0801a/input_Ti khon_eid'), 
    account)

WebUI.setText(findTestObject('Object Repository/Page_E-LEARNING HUTECH  elearning - i Hc Cn_f0801a/input_Mt khu_pw'), password)

WebUI.click(findTestObject('Object Repository/Page_E-LEARNING HUTECH  elearning - i Hc Cn_f0801a/input_Mt khu_submit'))

WebUI.click(findTestObject('Object Repository/Page_E-LEARNING HUTECH  My Workspace  Trang ch/a_H s'))

