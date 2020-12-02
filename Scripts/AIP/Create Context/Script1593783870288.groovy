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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

try {
	WebUI.callTestCase(findTestCase('AIP/AIP-Lgin'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('AIP/AIP Search Project and launch'), [:], FailureHandling.STOP_ON_FAILURE)
		
    WebUI.click(findTestObject('Core/Context Catalog/link_Context Catalog'))

    WebUI.click(findTestObject('Core/Context Catalog/New Context'))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_heading'), findTestData('Context').getValue(2, 1))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Category'), findTestData('Context').getValue(2, 2))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Description'), findTestData('Context').getValue(2, 3))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Logo Path'), findTestData('Context').getValue(2, 4))

    WebUI.click(findTestObject('Core/Context Catalog/button_Next'))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Runtime url'), findTestData('Context').getValue(2, 6))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Query Parameters'), findTestData('Context').getValue(2, 8))

    WebUI.setText(findTestObject('Core/Context Catalog/Create__resParam'), findTestData('Context').getValue(2, 9))

    WebUI.click(findTestObject('Core/Context Catalog/button_Next - Copy'))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Configuration URL'), findTestData('Context').getValue(2, 10))

    WebUI.selectOptionByValue(findTestObject('Core/Context Catalog/Create_Config select method'), findTestData('Context').getValue(
            2, 11), true)

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Configuration Request JSON Schema'), findTestData('Context').getValue(
            2, 12))

    WebUI.setText(findTestObject('Core/Context Catalog/Create_Configuration Response JSON Schema'), findTestData('Context').getValue(
            2, 13))

    WebUI.click(findTestObject('Core/Context Catalog/button_Previous'))

    WebUI.click(findTestObject('Core/Context Catalog/button_Previous'))

    WebUI.click(findTestObject('Core/Context Catalog/button_Next'))

    WebUI.click(findTestObject('Core/Context Catalog/button_Next - Copy'))

    WebUI.click(findTestObject('Core/Context Catalog/button_Next - Copy'))

	WebUI.click(findTestObject('Core/Context Catalog/button_Next - Copy'))
	
    WebUI.click(findTestObject('Core/Context Catalog/button_Save'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('created successfully', false, FailureHandling.STOP_ON_FAILURE)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/context/cancel'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('context Creation is not successful')
} 

