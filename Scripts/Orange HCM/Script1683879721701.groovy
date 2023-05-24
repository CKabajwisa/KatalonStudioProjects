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

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.selectOptionByValue(findTestObject('null'), 
    'NSSF', true)

WebUI.setText(findTestObject('null'), 
    '123456')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Pegasus PEGASUS Tests\n \n Error: Transaction not found.\n \n \n \n \n \n Validate Customer\n \n \n\tSelect Utility:\n\tURA\n\tNSSF\n\n\n \n Provide PRN/TRN')

WebUI.verifyElementText(findTestObject('null'), 
    'Error: Transaction not found.')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.selectOptionByValue(findTestObject('null'), 
    'URA', true)

WebUI.setText(findTestObject('null'), 
    'NSSF8991509300')

WebUI.click(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Pegasus PEGASUS Tests\n \n Error: INVALID PRN\n \n \n \n \n \n Validate Customer\n \n \n\tSelect Utility:\n\tURA\n\tNSSF\n\n\n \n Provide PRN/TRN')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.selectOptionByValue(findTestObject('null'), 
    'NSSF', true)

WebUI.setText(findTestObject('null'), 
    'NSSF8991509300')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 
    'Pegasus PEGASUS Tests\n \n SUCCESS\n \n \n \n \n \n Make Payment\n Customer Name:   TestCustomer\n Amount Balanace:   746325\n Payment Number:   NSSF8991509300\n \n\tSelect Utility\n\tURA\n\tNSSF\n\n\n \n Amount\n \n Vendor Ref')

WebUI.rightClick(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'SUCCESS')

WebUI.rightClick(findTestObject('null'))

WebUI.rightClick(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), '746325')

WebUI.verifyElementText(findTestObject('null'), 
    '')

WebUI.verifyElementClickable(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'PENDING')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'NSSF8991509300')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('Page_Pegasus Tests/span_FAILED'), 'SUCCESS')

