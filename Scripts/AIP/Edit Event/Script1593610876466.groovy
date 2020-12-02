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

    WebUI.setText(findTestObject('Core/Event Catalog/Search'), findTestData('Event').getValue(2, 1))

    WebUI.enhancedClick(findTestObject('Core/Event Catalog/Edit_btn'))

/*    WebUI.setText(findTestObject('Core/Event Catalog/Edit_heading'), 'test123')

    WebUI.setText(findTestObject('Core/Event Catalog/Edit_category'), '')

    WebUI.setText(findTestObject('Core/Event Catalog/Edit_eventSchema'), '{"DGDF":""}')
*/
    WebUI.setText(findTestObject('Core/Event Catalog/Edit_Description'), findTestData('Event').getValue(3, 4) )

 //   WebUI.setText(findTestObject('Core/Event Catalog/Edit_Logo Path'), '')

    WebUI.enhancedClick(findTestObject('Core/Event Catalog/Edit_Save'))

    WebUI.enhancedClick(findTestObject('Core/Event Catalog/Edit_Ok'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('edited successfully', false, FailureHandling.STOP_ON_FAILURE)

    // WebUI.enableSmartWait()
    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('AIP/Event/Page_Digital Experience Orchestration/img (1)'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Event editing is not successful')
} 

