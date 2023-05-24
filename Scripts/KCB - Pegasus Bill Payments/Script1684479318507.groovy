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

WebUI.selectOptionByValue(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/select_Select UtilityURANSSF'), 
    'NSSF', true)

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_CustomerRef'), 
    'NSSF8991509300')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_ctl04'))


WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_SUCCESS'), 
    'SUCCESS')


WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_746325'))

WebUI.verifyElementPresent(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_TestCustomer'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_746325'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'), 
    0)

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_TextBox2'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_ctl07'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_PENDING'), 
    'PENDING')

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_TextBox3'), 
    'NSSF8991509300')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_ctl09'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_FAILED'), 
    'FAILED')

WebUI.verifyElementClickable(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_ctl10'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_ctl10'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_ctl08'))

WebUI.selectOptionByValue(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/select_Select UtilityURANSSF'), 
    'URA', true)

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_CustomerRef'), 
    '123456')

WebUI.verifyElementClickable(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_ctl04'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_ctl04'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_Error INVALID PRN'), 
    'Error: INVALID PRN')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.pegasus.co.ug:8019/NewerBillPaymentsPortal/PegasusUATs.aspx')

WebUI.selectOptionByValue(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/select_Select UtilityURANSSF'), 
    'URA', true)

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_CustomerRef'), 
    '7230000118629')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_ctl04'))

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_Error RECEIVED AND CREDITED'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_Error RECEIVED AND CREDITED'), 
    'Error: RECEIVED AND CREDITED')

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_CustomerRef'), 
    '2230000118634')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Provide PRNTRN_ctl04'))

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_SUCCESS'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_SUCCESS'), 
    'SUCCESS')

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_DAMBAK ENTERPRISES LIMITED'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_SUCCESS'), 
    'SUCCESS')

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_40000'), '40000')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'))

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Amount_TextBox1'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_TextBox2'))

WebUI.waitForElementVisible(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_TextBox2'), 
    0)

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_TextBox2'), 
    'tEST')

WebUI.verifyElementClickable(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_ctl07'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_Vendor Ref_ctl07'))

WebUI.rightClick(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_PENDING'))

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/div_PENDING'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_PENDING'), 
    'PENDING')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/div_Query Transaction Status               _50fb6a'))

WebUI.setText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_TextBox3'), 
    '2230000118634')

WebUI.click(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/input_VendorRef_ctl09'))

WebUI.verifyElementText(findTestObject('Object Repository/KCB - PEGASUS Bill Payments/Page_Pegasus Tests/span_FAILED'), 
    'FAILED')

