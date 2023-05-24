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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.216.1.84:8083/authentication/account/login')

WebUI.setText(findTestObject('Object Repository/Page_Zamupay   Login/input_Hello there_Username (1)'), 'su')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zamupay   Login/input_Hello there_Password (1)'), 'Z1mGK8R6HqqGQODP3KzlLEv1hP7JtXh0')

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Login/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/span_Transactions'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_Money Out'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/td_10052023 094939'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_Money In'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/i_Single transfer_fa fa-bank fa-fw center'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_UGANDA'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/a_Bank Transfers'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_Download'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/a_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/div_Download_dt-button-background'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/a_Reversals'))

