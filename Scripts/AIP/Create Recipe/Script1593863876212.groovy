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
	
	WebUI.click(findTestObject('Object Repository/Core/Recipe/Recipe_Catalog'))

    WebUI.click(findTestObject('Core/Recipe/span_New Recipe'))

    WebUI.setText(findTestObject('Core/Recipe/input_(max 35 chars)_recipename'), findTestData('Recipe').getValue(2,1))

    WebUI.setText(findTestObject('Core/Recipe/input__recipedescription'), findTestData('Recipe').getValue(2,1))

	String eventName = findTestData('Event').getValue(2,1)
	CustomKeywords.'dnd.DragAndDropHelper.objectSelect'(eventName)
	
	String objContext = findTestData('Context').getValue(2,1)
	CustomKeywords.'dnd.DragAndDropHelper.objectSelect'(objContext)
	
	String action = findTestData('Action').getValue(2,1)
	CustomKeywords.'dnd.DragAndDropHelper.objectSelect'(action)

    WebUI.click(findTestObject('Core/Recipe/button_Save'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('created successfully!', false, FailureHandling.STOP_ON_FAILURE)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/recipe/Page_Digital Experience Orchestration/img'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Recipe Creation is not successful')
} 

