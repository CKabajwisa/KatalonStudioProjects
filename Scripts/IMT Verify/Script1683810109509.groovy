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

WebUI.setText(findTestObject('Object Repository/Page_Zamupay   Login/input_Hello there_Username (2)'), 'su')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Zamupay   Login/input_Hello there_Password (2)'), 'Z1mGK8R6HqqGQODP3KzlLEv1hP7JtXh0')

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Login/button_Sign in (2)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_Money Out (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/span_Download'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/a_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/span_Transactions (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Index/span_Transfers'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/a_Bank Transfers (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_Download (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/div_Download_dt-button-background (1)'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/i_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Last 7 days_start'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Last 7 days'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/i_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Status_checkboxValues'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/i_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Status_checkboxValues'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Successful_checkboxValues'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/i_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Successful_checkboxValues'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Pending_checkboxValues'))

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/button_Apply'))

WebUI.rightClick(findTestObject('Object Repository/Page_Zamupay   Transfers/div_Mobile Transfers                       _56c341'))

WebUI.rightClick(findTestObject('Object Repository/Page_Zamupay   Transfers/div_Mobile Transfers                       _56c341'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Zamupay   Transfers/div_nav-tooltip .tooltiptext         visibi_7c17d4'), 
    '.nav-tooltip .tooltiptext {\n visibility: hidden;\n width: 120px;\n font-family: "Rubik", sans-serif;\n background-color: #2F4050;\n font-size: 13px;\n color: #ffffff;\n text-align: center;\n border-radius: 6px;\n padding: 5px 0;\n position: absolute;\n z-index: 1;\n left: 110%;\n }\n\n .nav-tooltip .tooltiptext::after {\n content: "";\n position: absolute;\n right: 100%;\n border-width: 5px;\n border-style: solid;\n border-color: transparent black transparent transparent;\n }\n\n .mini-navbar .nav-tooltip:hover .tooltiptext {\n visibility: visible;\n }\n\n customer-container-flex-div {\n display: flex;\n padding: 10px 12px 6px;\n font-size: 15px;\n line-height: 1.46668;\n font-weight: 400;\n line-height: 1.2;\n -webkit-user-select: text;\n -moz-user-select: text;\n -ms-user-select: text;\n user-select: text;\n }\n\n .customer-container-icon {\n margin-right: 12px;\n flex-shrink: 0;\n }\n\n .customer-icon {\n background-size: 100%;\n background-repeat: no-repeat;\n display: inline-block;\n position: relative;\n border-radius: 3px;\n }\n\n .customer-container-right {\n display: flex;\n flex-direction: column;\n justify-content: space-around;\n flex: 1 1 auto;\n min-width: 0;\n }\n\n #scrollable {\n overflow: hidden;\n overflow-y: scroll;\n }\n\n\n\n \n \n \n \n\n \n \n \n\n \n\n \n \n \n \n \n \n Zamupay ™\n \n \n \n Zamupay ™\n \n \n \n Overview\n Overview \n \n\n\n\n \n Transactions\n Transactions \n \n \n Transfers \n \n\n \n Awaiting Approval \n \n\n \n Payment Links \n \n\n \n Utility Bills \n \n\n \n Airtime Purchases \n \n \n \n Card Transfers \n \n \n \n Collections \n \n \n \n \n\n \n Maker-Checker\n Maker Checker \n \n \n Entities\n Entities \n \n\n \n Enable Maker-Checker \n \n \n Approval Requests \n \n\n \n\n \n \n Registry\n Customers \n \n \n Registry \n \n\n \n Customer Accounts \n \n\n \n Agent Accounts \n \n \n \n Industries \n \n\n \n \n \n\n Notification Alerts\n Notification Alerts \n \n \n Notification Alerts\n Recipients \n \n \n \n \n Accounting\n Accounting \n \n Chart of Accounts\n GL Determination\n Products\n \n \n \n Administration\n Settings \n \n Roles\n User Management\n Charges\n Static Settings\n Transaction Settings\n Ip Whitelist\n\n \n Audit Logs\n Audit Logs\n \n \n \n\n\n \n Reports & Analytics\n Reports & Analytics\n \n\n \n\n\n\n\n \n \n\n \n \n\n\n\n\n\n\n .border-bottom {\n transition: transform 0.2s ease;\n box-shadow: 0 4px 6px 0 rgba(22, 22, 26, 0.18);\n border-radius: 0;\n border: 0;\n margin-bottom: 0em;\n }\n\n .mHidden {\n display: none !important;\n }\n\n .tour-image {\n height: 20em;\n }\n\n .tour-image img {\n width: 100%\n }\n\n .explore-modal {\n max-width: 48%;\n }\n\n .exploreButtons {\n display: contents;\n }\n\n .button-holder {\n float: none;\n margin: auto;\n padding-top: 1em;\n }\n\n .button-holder button {\n background: #2c0d63;\n color: #ffffff;\n font-weight: 700;\n border: none;\n float: none;\n margin: auto;\n line-height: 32px;\n }\n\n .button-holder span {\n border-bottom: 2px solid #ffffff;\n padding: 3px\n }\n\n .exploreHeader {\n justify-content: center;\n border-bottom: none;\n }\n\n .exploreBody {\n /*padding: 0 1.5rem;*/\n padding: 0;\n }\n\n .explorer {\n margin: 0 1.5rem;\n }\n\n .customer-logo .customer-switch-div {\n color: #fff;\n font-weight: 600;\n padding: 14px 12px 14px 12px;\n display: flex !important;\n }\n\n .customer-logo .customers-list {\n left: 0;\n transform: translate3d(12px, 62px, 0px);\n }\n\n\n\n \n \n \n \n \n Bank Transfers\n \n \n\n \n\n \n \n \n \n \n \n Zamupay ™\n \n \n \n Zamupay ™\n \n \n \n \n \n \n \n\n \n\n \n \n \n  | \n \n \n \n \n \n \n \n \n \n \n \n \n\n  | \n \n \n \n \n Super\n \n\n \n \n \n \n \n Profile\n \n \n \n \n \n Explore Dashboard\n \n \n \n \n \n Change Password\n \n \n \n \n \n FAQs\n \n \n \n \n \n Log out\n \n \n \n \n\n \n \n \n \n\n \n\n\n\n \n \n \n \n Welcome to Zamupay\n \n \n \n \n \n \n\n \n \n We are so happy you are here!\n \n\n \n This digital payments platform is created to solve payment-processing problems that enable IMTs, Corporates, SMEs and Merchants to make online and offline payments.\n \n\n \n To get the most out of your account,\n\n Click on the \'Explore Dashboard\' button below.\n \n\n \n Reach out: support@zamupay.co.ke\n \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n Explore Dashboard\n \n \n Skip this\n \n \n \n \n \n\n\n\n \n \n \n Customer List\n \n \n Select the customer you want to login with\n \n \n \n \n \n \n \n \n \n \n \n Login As\n \n \n \n\n\n\n\n\n\n\n\n var pageURL = window.location.pathname.split("/");\n var pageName = typeof pageURL[2] === \'undefined\' ? \'Overview\' : pageURL[2];\n\n if (pageName === \'Overview\' || pageName === \'DashboardV2\' || pageName === \'dashboardv2\' || pageName === \'Dashboard\') {\n $(\'.customer-logo\').removeClass(\'hidden\');\n $(\'.navbar-header\').addClass(\'hidden\');\n } else {\n $(\'.customer-logo\').addClass(\'hidden\');\n $(\'.navbar-header\').removeClass(\'hidden\');\n }\n\n switch (pageName) {\n case \'approvableentities\':\n pageName = \'Maker-Checker Configurations\';\n break;\n case \'approvalrequests\':\n pageName = \'Approval Requests\';\n break;\n case \'accountmanagers\':\n pageName = checkUserAccountManager(pageURL[2]);\n break;\n case \'customerrouteslist\':\n pageName = \'Customer Routes List\';\n break;\n case \'apisettings\':\n pageName = \'API Settings\';\n break;\n case \'customerroutemappings\':\n pageName = \'Customer Route Mappings\';\n break;\n case \'customers\':\n pageName = checkCustomerAccounts(pageURL[3]);\n break;\n case \'transactions\':\n pageName = \'Transfers\'\n break;\n case \'pendingtransfers\':\n pageName = \'Awaiting Approval\'\n break;\n case \'manualtopup\' :\n pageName = \'Manual Topup\'\n break;\n case \'customerbillrequests\':\n pageName = \'Utility Bills\'\n break;\n case \'departments\':\n pageName = \'Departments\'\n break;\n case \'settings\':\n pageName = \'Users\'\n break;\n case \'settlementaccounts\':\n pageName = \'Settlement Accounts\'\n break;\n case \'transactionsettings\':\n pageName = \'Transaction Settings\'\n break;\n case \'transactiontypes\':\n pageName = \'Transaction Types\'\n break;\n case \'PendingTransfers\':\n pageName = \'Awaiting Approval\'\n break;\n case \'messagealerts\':\n pageName = \'Message Alerts\'\n break;\n case \'staticsettings\':\n pageName = \'Static Settings\'\n break;\n case \'businessTransfers\':\n pageName = \'Transfers Details\'\n break;\n case \'bankTransfers\':\n pageName = \'Transfers Details\'\n break;\n case \'mobileTransfers\':\n pageName = \'Transfers Details\'\n break;\n case \'interAccountTransfers\':\n pageName = \'Inter-Account Transfers Details\'\n break;\n case \'customerchargemappings\':\n pageName = \'Charge Override\'\n break;\n case \'addcustomeraccount\':\n pageName = \'Customer Account\'\n break;\n case \'transactionsreports\':\n pageName = checkReports(pageURL[3]);\n break;\n case \'myaccounts\':\n pageName = \'My Accounts\'\n break;\n case \'usermanagement\':\n pageName = \'User Management\'\n break;\n case \'collections\':\n pageName = \'Collections\'\n break;\n case \'systementity\':\n pageName = \'System Entities\'\n break;\n case \'paymentlinks\':\n pageName = \'Payment Links\'\n break;\n case \'airtimepurchaserequests\':\n pageName = \'Airtime Purchase\';\n break;\n case \'blacklistpaybill\' :\n pageName = \'Blacklist Paybill\';\n break;\n case \'quickBooks\':\n pageName = checkCharts(pageURL[3]);\n break;\n case \'customertransactionsetting\':\n pageName = \'Self Approval Setting\';\n break;\n\n case \'customerstatementsetting\':\n pageName = \'Customer Statement Setting\';\n break;\n\n case \'expressrequests\':\n pageName = \'Express Requests\';\n break; \n \n case \'chartofaccounts\':\n pageName = \'Chart of Accounts\';\n break;\n \n case \'dashboard_1\': \n case \'country_dashboard\':\n case \'agent_dashboard\':\n pageName = \'Dashboard\';\n break; \n\n case \'auditlog\':\n pageName = \'Audit Logs\'\n break;\n \n case \'c2bwebhooksettings\':\n pageName = \'C2B Webhook Settings\'\n break; \n \n case \'cardtransfers\':\n pageName = \'Card Transfers\'\n break;\n default:\n pageName = pageName;\n }\n\n if (pageName.startsWith(\'usersinrole\')) {\n pageName = \'Users in Role\';\n }\n\n function checkReports(pageUrl) {\n\n var reportsHeader = \'Reports\';\n\n switch (pageUrl) {\n case \'mobilewallettransfers\':\n reportsHeader = \'Mobile Wallet Transfers\'\n break;\n case \'airtimepurchases\':\n reportsHeader = \'Airtime Purchases\'\n break;\n case \'billpayments\':\n reportsHeader = \'Bill Payments\'\n break;\n case \'threesixtydegrees\':\n reportsHeader = \'360\' + \'&#176\' + \' Report\'\n break;\n default:\n reportsHeader = \'Reports\';\n break;\n }\n\n return reportsHeader\n }\n\n function checkCustomerAccounts(pageUrl) {\n switch (pageUrl)\n {\n case "statement":\n return "Accounts Statement";\n case "addcustomeraccount":\n case "customeraccountlist":\n return "Customer Accounts";\n case "settlementbysettlementaccountid":\n return "Settlement Transactions";\n default:\n return "Customers";\n }\n }\n\n function checkUserAccountManager(pageUrl) {\n\n if (pageUrl == "accountmanagers" && \'False\' === \'True\') {\n\n return "Users";\n\n } else {\n\n return "Account Managers";\n\n }\n\n }\n\n function checkMyAccounts(pageurl) {\n switch (pageurl) {\n case \'my-accounts\':\n return "My Accounts";\n case \'chargeaccounts\':\n return "Charge Accounts"\n default:\n return "My Accounts"\n }\n }\n\n function checkCharts(pageUrl) {\n\n var header;\n\n switch (pageUrl) {\n case \'linktransaction\':\n header = \'Link Transaction\'\n break;\n default:\n header = \'Chart of Accounts\';\n break;\n }\n\n return header;\n }\n\n document.getElementById("pageHeader").innerHTML = pageName;\n\n function selectCustomers(e) {\n var customerId = $("input[name=\'Customer\']:selected").val();\n $("#CustomerId").val(customerId);\n $("#CustomerName").val($("#" + customerId).html());\n $("#submit").removeAttr("disabled");\n }\n\n function logOutClick() {\n Swal.fire({\n template: \'#my-template\'\n });\n }\n\n $(document).ready(function () {\n $("#searchString").autocomplete({\n minLength:4,\n source: function (request, response) {\n $.ajax({\n url: "/lookup/threesixtydegrees",\n type: "POST",\n dataType: "json",\n data: { SearchString: $("#searchString").val().trim() },\n success: function (data) {\n response($.map(data,\n function (item) {\n transactionGuid = item.Id;\n return {\n label: item.RouteTransactionTypeTransactionTypeTypeDescription + \' \' + item.RecipientPrimaryAccountNumber + \' \' + item.RouteTransactionTypeTransactionTypeChannelTypeDescription,\n value: item.RecipientPrimaryAccountNumber,\n id: item.Id\n };\n }));\n },\n error: function (XMLHttpRequest, textStatus, errorThrown) {\n alert("Error: " + errorThrown + "Status: " + textStatus);\n }\n });\n },\n select: function (event, ui) {\n event.preventDefault();\n window.location.href = \'/transactionsreports/transactionsreports/threesixtydegrees/\' + ui.item.id;\n }\n });\n\n $(\'#searchString\').focusout(function () {\n customerguid = "";\n });\n });\n\n\n\n\n \n \n\n\n .modal:nth-of-type(odd) {\n z-index: 1052 !important;\n }\n\n .modal-backdrop.show:nth-of-type(odd) {\n z-index: 1051 !important;\n }\n\n #OrderLines_0__RecipientPhoneNumber {\n width: 477px;\n }\n\n .select2-container {\n width: 100% !important;\n padding: 0;\n }\n\n .bd-example-modal-lg .modal-dialog {\n display: table;\n position: relative;\n margin: 0 auto;\n top: calc(50% - 24px);\n }\n\n .submitted {\n background-color: rgb(226 255 204);\n }\n\n .pending {\n background-color: #c2dcf6;\n }\n\n .failed {\n background-color: rgb(255, 233, 216);\n }\n\n .queued {\n background-color: rgb(211,211,211);\n }\n\n .nocharge {\n background-color: #fff3cd;\n }\n\n .bd-example-modal-lg .modal-dialog .modal-content {\n background-color: transparent;\n border: none;\n }\n\n .input-group-addon {\n background-color: rgb(82, 124, 189) !important;\n }\n\n .mobile-input-group-addon .fa {\n color: whitesmoke !important;\n }\n\n .bank-input-group-addon .fa {\n color: whitesmoke !important;\n }\n\n .search-btn, .search-btn:hover, .search-btn:focus {\n cursor: pointer;\n background: rgb(82, 124, 189) !important;\n border-color: rgb(82, 124, 189) !important;\n }\n\n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n KENYA  UGANDA  NIGERIA  RWANDA  SOUTH AFRICA  BURUNDI  TANZANIA  ERITREA  ETHIOPIA  GHANA  USA  \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n\n \n ×\n Info! Customer account for the selected country is locked. Please contact the Super admin\n \n\n \n \n\n \n \n Total Transferred\n KES\n \n22,102,931.00 \n \n\n \n Successful Transfers\n \n824 \n \n\n \n Total Pending Transfers\n \n840 \n \n\n \n Total Failed Transfers\n \n1,101 \n \n \n\n \n \n\n \n \n \n \n \n Mobile Transfers\n \n \n Bank Transfers\n \n \n Business Transfers\n \n \n Reversals\n \n \n\n \n \n \n \n Show 102550100 entriesSearch:\n \n\n Customer NameCreated onPayeeMobile No.AmountTransaction StatusCharge wallet statusCharge AmountCredit PartyTxn IDThird Party Txn IDResult DescriptionAction\n \n \n Customer Test05/05/2023 10:48:24Suneel Yadav+254704667738680.00CompletedProcessing0.00254704667738 - David N NjengaBFICNUQSRE591PDBLDThe service request is processed successfully.Actions View DetailsView BatchManual Status UpdateCustomer Test05/05/2023 10:22:44DERRICK WESTLAND+2547059126451,600.00FailedProcessing0.00254705912645 - NICHOLAS Nicholas SONGOKH5O3XBE2RE541PDBAYDeclined due to limit rule: would exceed the maximum balance.Actions View DetailsView BatchManual Status UpdateCustomer Test05/05/2023 09:29:18DERRICK WESTLAND+2547059126451,600.00FailedProcessing0.00254705912645 - NICHOLAS Nicholas SONGOKG3L31IHXRE541PDAE6Declined due to limit rule: would exceed the maximum balance.Actions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 11:01:47Anne +2547046677381,000.00FailedNo Charge0.00KES1403899990001UHIR6E7PError posting transactionActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:22:17Anne +2547046677381,000.00CompletedProcessing0.00254704667738 - David N NjengaGZ1CWLHFRE931PM5B9The service request is processed successfully.Actions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 09:53:23Anne +2547223435571,000.00FailedNo Charge0.00JQX8Z5GGRE90000000The CreditParty is in an invalid state.Actions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 09:46:15Anne +2547223764681,000.00FailedNo Charge0.005VK5MS2KRE90000000The CreditParty is in an invalid state.Actions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 09:43:53Anne +2547046677381,000.00FailedNo Charge0.00KES1403899990001JUN64YXNError posting transactionActions View DetailsView BatchManual Status UpdateTerra Pay09/05/2023 09:04:59David Mugi+254705912645123.00FailedNo Charge0.00KES14038999900017UOFJALYError posting transactionActions View DetailsView BatchManual Status UpdateTerra Pay05/05/2023 09:56:51David Mugi+254705912645123.00FailedProcessing0.00C4TWKKXPThe element SenderDOB is invalid.Actions View DetailsView BatchManual Status Update\n Showing 1 to 10 of 10 entriesPrevious1Next\n \n \n\n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n   Filter Download Search:Processing...\n \n\n Customer NameCreated OnPayeeA/C No.AmountTransaction StatusCharge wallet statusCharge AmountCredit PartyTrx IDThird Party Trx IDResult DescriptionAction\n \n \n Global Pay09/05/2023 11:25:15Bad Bunny1103105655151,000.00CompletedBy Passed0.00UTPPCGNTRecipient payment successActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:54:02Bad Bunny100011610843,000.00FailedNo Charge0.0010001161084BHTJAMFVError posting transactionActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:32:23Bad Bunny100011610842,500.00CompletedBy Passed0.00N8ZUSMB9Recipient payment successActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:30:16Mario Bunny38028235317502,000.00CompletedBy Passed0.00G6XD4AEKRecipient payment successActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:29:12Mario Bunny1028205912501,500.00CompletedBy Passed0.00J2HBRDMTRecipient payment successActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:17:33super mario1701920382591,500.00CompletedBy Passed0.00JVB2CYLFRecipient payment successActions View DetailsView BatchManual Status UpdateGlobal Pay09/05/2023 10:15:27super mario1702782162735,000.00CompletedBy Passed0.00QTKBV8E3Recipient payment successActions View DetailsView BatchManual Status UpdateCustomer Test09/05/2023 09:13:45Suneel Yadav11031056552,040.00CompletedBy Passed0.001103105655PW8DOUZZFT22062WB5LZRecipient payment successActions View DetailsView BatchManual Status UpdateCustomer Test08/05/2023 13:07:24Suneel Yadav11031056552,040.00FailedNo Charge0.0011031056555H1EKWI5Error posting transactionActions View DetailsView BatchManual Status UpdateCustomer Test08/05/2023 11:47:28Suneel Yadav11031056552,040.00CompletedBy Passed0.001103105655SJRXGHK5FT22062D9M22Recipient payment successActions View DetailsView BatchManual Status Update\n Showing 1 to 10 of 10,279 entriesShow 1025501002505001,000 entriesFirstPrevious12345…1028NextLast\n \n \n\n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n\n \n \n \n \n Loading data from server\n \n \n \n \n \n \n\n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n\n \n \n \n \n Loading data from server\n \n \n \n \n \n \n\n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n\n \n \n\n\n\n \n \n \n Filter Emails\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n Close\n Apply Filter\n \n \n \n\n\n\n\n \n \n \n Start a New \n \n ×\n \n \n \n \n \n \n \n Single Transfer\n Allows transfer to one account at a time.\n \n \n \n \n \n Bulk Transfer \n Allows transfer to multiple accounts at a time.\n \n \n \n\n\n \n \n \n\n\n\n\n \n \n \n Single Transfer\n \n ×\n \n \n\n \n \n \n Select Network\n\n \n \n \n \n Select Account\n \n \n \n \n \n Account Balance : \n \n \n Top up Wallet \n \n \n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n Select mode of transfer\n \n \n \n \n Mode\n \n Select mode of transfer\n \n \n \n \n \n \n Recipient Phone Number (+254).\n\n \n Search Beneficiary\n \n\n\n \n\n \n \n \n \n \n \n \n Recipient Name\n\n \n Search Beneficiary\n \n\n\n \n \n \n \n \n \n \n Bank\n Select Bank\n\n \n \n \n \n \n Short Code\n \n \n \n \n \n \n A/C Number\n \n \n \n Validate Account\n \n \n \n \n Save As Beneficiary\n \n \n Amount\n \n \n \n The transaction charge will be \n \n Reference\n \n \n \n \n Reference Image (Image / PDF accepted - optional)\n \n \n \n \n Go back\n Cancel\n Confirm\n \n \n \n \n\n\n\n\n\n \n \n \n Manually Post Transaction\n \n ×\n \n \n \n \n \n Download the sample file here\n \n\n Bulk File\n \n \n \n \n\n Remarks : \n \n \n \n \n \n\n \n \n Submit\n \n \n\n \n \n\n\n\n\n \n\n\n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n\n \n \n \n \n \n \n \n\n\n \n \n \n \n \n \n \n \n \n\n \n \n Dismiss\n \n \n \n \n\n\n\n \n \n \n \n \n Date\n \n\n \n Today\n Last 7 days\n 30 Days\n 1 Year\n\n \n \n\n \n\n \n\n \n \n \n \n\n \n\n \n Status\n \n \n \n Successful\n \n \n \n Pending\n \n \n \n Failed\n \n\n \n\n \n \n \n\n \n Close\n Clear\n Apply\n \n \n \n \n\n\n\n \n \n \n Super User\n just now.\n \n \n \n Hello, world! This is feature is not yet complete.\n \n \n\n\n\n \n \n \n Text Alert\n \n \n \n \n \n \n \n\n \n\n \n \n \n \n \n \n \n \n \n Dismiss\n \n \n \n \n\n\n\n \n \n \n Email\n \n \n \n\n \n \n \n \n\n \n\n \n \n \n \n\n \n \n \n\n \n \n Dismiss\n \n \n \n \n\n\n\n \n \n\n \n\n \n \n \n Zamupay ™\n Copyright © 2012-2023. All rights reserved.')

WebUI.setText(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Search_form-control form-control-sm'), '256785132117')

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/a_Bank Transfers (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Search_form-control form-control-sm'), 'milicent')

WebUI.click(findTestObject('Object Repository/Page_Zamupay   Transfers/label_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Zamupay   Transfers/input_Search_form-control form-control-sm'), '')
