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
	
    WebUI.click(findTestObject('Core/Action Catalog/a_Action Catalog'))

    WebUI.clearText(findTestObject('Core/Event Catalog/Search'), FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/New Action'))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_heading'), findTestData('Action').getValue(2, 1))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Description'), findTestData('Action').getValue(2, 2))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Logo Path'), findTestData('Action').getValue(2, 3))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Category'), findTestData('Action').getValue(2, 4))

    WebUI.enhancedClick(findTestObject('AIP/Action/button_Next'))

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Create_select URL Type'), findTestData('Action').getValue(2, 5), true)

    WebUI.setText(findTestObject('Core/Action Catalog/Create__url'), findTestData('Action').getValue(2, 6))

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Create_Select Method'), findTestData('Action').getValue(2, 7), true)

    WebUI.setText(findTestObject('Core/Action Catalog/Create__requestSchema'), findTestData('Action').getValue(2, 8))

    WebUI.setText(findTestObject('Core/Action Catalog/Create__responseSchema'), findTestData('Action').getValue(2, 9))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/Create_button_Next_1'))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Configuration URL'), findTestData('Action').getValue(2, 10))

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Create_Config Request Method'), findTestData('Action').getValue(2, 11), true)

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Configuration Request JSON Schema'), findTestData('Action').getValue(2, 12))

    WebUI.setText(findTestObject('Core/Action Catalog/Create_Configuration Response JSON Schema'), findTestData('Action').getValue(2, 13))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/Create_button_Next_1'))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/Add_header'))

    WebUI.setText(findTestObject('AIP/Action/Create_Adding header'), findTestData('Action').getValue(2, 14))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/button_Previous'))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/Create_button_Next_1'))

    WebUI.click(findTestObject('Core/Action Catalog/button_Save'))

    WebUI.enableSmartWait()

    WebUI.verifyTextPresent('created successfully!', false, FailureHandling.STOP_ON_FAILURE)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/Action/img'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Action Creation is not successful')
} 

