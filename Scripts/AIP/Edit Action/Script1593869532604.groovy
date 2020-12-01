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
    WebUI.enhancedClick(findTestObject('Core/Action Catalog/a_Action Catalog'))

    WebUI.setText(findTestObject('Core/Event Catalog/Search'), 'Action')

    WebUI.click(findTestObject('Core/Action Catalog/Edit_btn'))

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_heading'), 'Action123')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Category'), 'dhcjs133')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Description'), 'udhuecf123')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Logo Path'), 'iedje1233')

    WebUI.click(findTestObject('Core/Action Catalog/button_Next_1'))

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Edit_Select URL Method'), 'Gateway URL', true)

    WebUI.setText(findTestObject('Core/Action Catalog/Edit__url'), 'https://jhdjf23')

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Edit_Request Method'), 'GET', true)

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Request JSON Schema'), '{"SDFCD":"","":""}')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit__responseSchema'), '{"SFDCSD":"","":""}')

    WebUI.click(findTestObject('Core/Action Catalog/button_Next_1'))

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Configuration URL'), 'https://jfdkfhcddf')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Configuration Request JSON Schema'), '{"dfcdc":"","":""}')

    WebUI.setText(findTestObject('Core/Action Catalog/Edit_Configuration Response JSON'), '{"ADFC":"","":""}')

    WebUI.selectOptionByValue(findTestObject('Core/Action Catalog/Edit_Config Request Method'), 'POST', true)

    WebUI.click(findTestObject('Core/Action Catalog/button_Next_1'))

    WebUI.setText(findTestObject('AIP/Action/Edit_Adding header'), 'dsjkdhsjwsdef')

    WebUI.enhancedClick(findTestObject('AIP/Action/Edit_Save'))

    WebUI.enhancedClick(findTestObject('Core/Action Catalog/button_Ok'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('edited successfully', false, FailureHandling.STOP_ON_FAILURE)

    //WebUI.enableSmartWait()
    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('AIP/Action/img (1)'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Action Editing is not successful')
} 

