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
	
    WebUI.enhancedClick(findTestObject('Core/Event Catalog/a_Event Catalog'))

    WebUI.clearText(findTestObject('Core/Event Catalog/Search'), FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('Core/Event Catalog/New Event'))

    WebUI.setText(findTestObject('Core/Event Catalog/create_heading'), findTestData('Event').getValue(2, 1))

    WebUI.setText(findTestObject('Core/Event Catalog/Create_category'), findTestData('Event').getValue(2, 2))

    WebUI.setText(findTestObject('Core/Event Catalog/Create__eventSchema'), findTestData('Event').getValue(2, 3))

    WebUI.setText(findTestObject('Core/Event Catalog/Create_Description'),findTestData('Event').getValue(2, 4))

    WebUI.setText(findTestObject('Core/Event Catalog/Create_Logo Path'), findTestData('Event').getValue(2, 5))

    WebUI.enhancedClick(findTestObject('Core/Event Catalog/Create_Save'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('created successfully!', false, FailureHandling.STOP_ON_FAILURE)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/Event/Page_Digital Experience Orchestration/img'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Event Creation is not successful')
} 

