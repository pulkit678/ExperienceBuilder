import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
	
    WebUI.click(findTestObject('Core/Recipe Publish/li_RecipesAmazon Web ServicesS3LambdaStep F_09b7c4'))

    WebUI.setText(findTestObject('Core/Event Catalog/Search'), findTestData('Recipe').getValue(2,1))

	TestObject toR = new TestObject()
	String RecipeName = findTestData('Recipe').getValue(2,1)
	String Recipe = "//span[@title='"+RecipeName+"']"
	toR.addProperty('xpath', ConditionType.EQUALS, Recipe)
    WebUI.doubleClick(toR)

    WebUI.enhancedClick(findTestObject('AIP/recipe/Page_Digital Experience Orchestration/label_Event'))

	TestObject toE = new TestObject()
	String EventName = findTestData('Event').getValue(2,1)
	String Event = "//img[@alt='"+EventName+"']"
	toE.addProperty('xpath', ConditionType.EQUALS, Event)
	
	TestObject toC = new TestObject()
	String ContextName = findTestData('Context').getValue(2,1)
	String Context = "//img[@alt='"+ContextName+"']"
	toC.addProperty('xpath', ConditionType.EQUALS, Context)
	
	TestObject toA = new TestObject()
	String ActionName = findTestData('Action').getValue(2,1)
	String Action = "//img[@alt='"+ActionName+"']"
	toA.addProperty('xpath', ConditionType.EQUALS, Action)
	
    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(toE, 
        findTestObject('AIP/recipe/Page_Digital Experience Orchestration/div_Operators_event-box'))

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Core/missalanious/li_Recipe Container'), findTestObject(
            'Core/missalanious/div_Operators_event-box'))

    WebUI.enhancedClick(findTestObject('Core/missalanious/label_Context Objects'))

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(toC, 
        findTestObject('Object Repository/AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'))

    WebUI.waitForElementClickable(findTestObject('AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'), 
        30)

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Object Repository/AIP/recipe/Page_Digital Experience Orchestration/img_Operators_rhs-object-image xh-highlight'), 
        findTestObject('Object Repository/AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'))

    WebUI.waitForElementClickable(findTestObject('AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'), 
        30)

    WebUI.enhancedClick(findTestObject('Object Repository/AIP/recipe/label_Actions'))

    CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(toA, findTestObject(
            'Object Repository/AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'))

    WebUI.waitForElementClickable(findTestObject('AIP/recipe/Page_Digital Experience Orchestration/div_test_box0 recipe-container'), 
        30)

    WebUI.click(findTestObject('Core/Recipe Publish/button_Publish'))

    WebUI.click(findTestObject('Core/Recipe Publish/button_Ok'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('Recipe Published Successfully!', false)

    //WebUI.waitForElementClickable(findTestObject('Core/missalanious/ul_test_tree-node-ul-9416f726-6af5-4f8a-9af2-93e78311bd2f'), 
    //  10)
    WebUI.takeScreenshot()

    WebUI.enhancedClick(findTestObject('Object Repository/AIP/recipe/Page_Digital Experience Orchestration/button_Back'))
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('Object Repository/AIP/recipe/Page_Digital Experience Orchestration/button_Back'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Recipe publish is not successful')
} 

