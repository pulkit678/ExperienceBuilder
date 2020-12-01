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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
try {
WebUI.click(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/a_Recipe Execution'))

WebUI.setText(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/input__url'), 
    'https://native-dev-scrum-42-1535030459-wso2is-sit.cpaas-accenture.com/xaas/enabler/producer/1.0.0/publish')

WebUI.setText(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/input__header'), 
    '{"Content-Type":"application/json"}')

WebUI.click(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/button_Format'))

WebUI.click(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/button_Save'))

WebUI.click(findTestObject('Object Repository/AIP/Recipe execution/Page_Digital Experience Orchestration/button_Trigger Event'))

WebUI.enableSmartWait()

WebUI.takeScreenshot()
}
catch (Exception e) {
	WebUI.takeScreenshot()

	WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
	
	println('Recipe Ecexution is not successful')
}
