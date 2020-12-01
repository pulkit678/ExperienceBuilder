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

WebUI.click(findTestObject('Core/Context Catalog/link_Context Catalog'))

WebUI.setText(findTestObject('Core/Event Catalog/Search'), 'context')

WebUI.click(findTestObject('Core/Context Catalog/Context_Edit'))

WebUI.setText(findTestObject('Core/Context Catalog/Edit_heading'), 'context123')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Category'), 'kdjcdasd')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Description'), 'jdncjadfcsdc')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Logo Path'), 'jkkkdhcnsdfcds')

WebUI.click(findTestObject('Core/Context Catalog/Edit_Next'))

WebUI.setText(findTestObject('Core/Context Catalog/edit_url'), 'https://sdfcds/jhgh')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Query Parameters'), '{"dcds":"","":""}')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_resParam'), '{"":"","":""}')

WebUI.click(findTestObject('Core/Context Catalog/Edit_Next - Copy'))

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Configuration URL'), 'https://jdcbn/jghjh')

WebUI.selectOptionByValue(findTestObject('Core/Context Catalog/Edit_Configselect method'), 
    'POST', true)

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Configuration Request JSON Schema'), 
    '{"sdczsd":"","":""}')

WebUI.setText(findTestObject('Core/Context Catalog/Edit_Configuration Response JSON Schema'), 
    '{"":"","":""}')

WebUI.click(findTestObject('Core/Context Catalog/Edit_Previous'))

WebUI.click(findTestObject('Core/Context Catalog/Edit_Previous'))

WebUI.click(findTestObject('Core/Context Catalog/Edit_Next'))

WebUI.click(findTestObject('Core/Context Catalog/Edit_Next - Copy'))

WebUI.click(findTestObject('Core/Context Catalog/Edit_Next - Copy'))

WebUI.setText(findTestObject('Core/Context Catalog/Adding_header text - Copy'), 'sjdkshkughjgj')

WebUI.click(findTestObject('Core/Context Catalog/button_Save - Copy'))

WebUI.click(findTestObject('Core/Context Catalog/button_Ok'))

WebUI.waitForPageLoad(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.takeScreenshot()

