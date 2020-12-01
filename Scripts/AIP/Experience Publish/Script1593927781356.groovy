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
	WebUI.callTestCase(findTestCase('AIP/AIP-Lgin'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('AIP/AIP Search Project and launch'), [:], FailureHandling.STOP_ON_FAILURE)
	
    WebUI.click(findTestObject('Core/Experience/link_Experiences'))

    WebUI.setText(findTestObject('Core/Event Catalog/Search'), findTestData('Expereince').getValue(2,1))

	WebUI.delay(3)
	
    WebUI.doubleClick(findTestObject('Core/Experience publish/div_Back_loading'))

    WebUI.waitForAngularLoad(30)

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Object Repository/AIP/experience/Page_Digital Experience Orchestration/li_1 e'), 
        findTestObject('Object Repository/AIP/experience/Page_Digital Experience Orchestration/div_Publish_col-sm-12 engmnt-container'))

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Object Repository/AIP/experience/Page_Digital Experience Orchestration/li_recipe'), 
        findTestObject('Object Repository/AIP/experience/Page_Digital Experience Orchestration/div_e_first-moment-box moment-img'))

    WebUI.click(findTestObject('Core/Experience publish/button_Publish'))

    WebUI.click(findTestObject('Core/Experience publish/button_Ok'))

    WebUI.enableSmartWait()

    WebUI.verifyTextPresent('Successfully submited choregraphy api', false)

    WebUI.verifyTextPresent('Edit Mapper is Successful', false)

    WebUI.verifyTextPresent('Journey Saved Successfully!', false)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('AIP/experience/Page_Digital Experience Orchestration/button_Back'))
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/experience/Page_Digital Experience Orchestration/button_Back'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Experience publish is not successful')
} 

