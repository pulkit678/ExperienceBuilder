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

WebUI.click(findTestObject('Core/Recipe Publish/li_RecipesAmazon Web ServicesS3LambdaStep F_09b7c4'))

WebUI.doubleClick(findTestObject('Core/missalanious/div_ikujyhg'))

WebUI.click(findTestObject('Core/missalanious/label_Event'))

CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Core/missalanious/li_test'), 
    findTestObject('Core/missalanious/div_Operators_event-box'))

CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Core/missalanious/li_Recipe Container'), 
    findTestObject('Core/missalanious/div_Operators_event-box'))

WebUI.click(findTestObject('Core/missalanious/label_Context Objects'))

WebUI.click(findTestObject('Core/missalanious/li_sixjnmks'))

CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Core/missalanious/li_sixjnmks'), 
    findTestObject('Core/missalanious/ul_test_tree-node-ul-9416f726-6af5-4f8a-9af2-93e78311bd2f'))

WebUI.click(findTestObject('Core/missalanious/ul_test_tree-node-ul-9416f726-6af5-4f8a-9af2-93e78311bd2f'))

CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Core/missalanious/Page_Digital Experience Orchestration/img_Operators_rhs-object-image'), 
    findTestObject('Core/missalanious/ul_test_tree-node-ul-9416f726-6af5-4f8a-9af2-93e78311bd2f'))

WebUI.click(findTestObject('Core/Recipe Publish/button_Publish'))

WebUI.click(findTestObject('Core/Recipe Publish/button_Ok'))

WebUI.waitForAngularLoad(30)

WebUI.waitForElementClickable(findTestObject('Core/missalanious/ul_test_tree-node-ul-9416f726-6af5-4f8a-9af2-93e78311bd2f'), 
    10)

WebUI.takeScreenshot()

