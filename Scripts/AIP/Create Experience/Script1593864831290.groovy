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
	
	WebUI.click(findTestObject('Object Repository/Core/Experience/link_Experiences'))
	
    WebUI.clearText(findTestObject('Core/Event Catalog/Search'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Core/Experience/Create_New Experience'))

    WebUI.setText(findTestObject('Core/Experience/Create_experienceName'), findTestData('Experience').getValue(2, 1) )

    WebUI.setText(findTestObject('Core/Experience/Create_Engagementname'), findTestData('Experience').getValue(2, 2))

    WebUI.setText(findTestObject('Core/Experience/Create_momentName1'), findTestData('Experience').getValue(2, 3))

    WebUI.setText(findTestObject('Core/Experience/Create__momentName2'), findTestData('Experience').getValue(2, 4))

    WebUI.click(findTestObject('Core/Experience/button_Save'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/Core/Experience/Exp created successfully'), 5)

    WebUI.verifyTextPresent('created successfully!', false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/experience/Page_Digital Experience Orchestration/cancel'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Experience Creation is not successful')
} 

