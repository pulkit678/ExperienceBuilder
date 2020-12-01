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

WebUI.click(findTestObject('Core/Experience/link_Experiences'))

WebUI.setText(findTestObject('Core/Event Catalog/Search'), 'echgfh')

WebUI.click(findTestObject('Core/Experience/edit_experience'))

WebUI.setText(findTestObject('Core/Experience/edit_experienceName'), 'echgfhjkhgfc')

WebUI.setText(findTestObject('Core/Experience/Edit_Description'), 'jkhgf')

WebUI.setText(findTestObject('Core/Experience/Edit_engagements'), 'enghgjhghg')

WebUI.setText(findTestObject('Core/Experience/Edit_momentName1'), 'ugyjgjghhjgj')

WebUI.setText(findTestObject('Core/Experience/Edit_momentName2'), 'kjhjgjghjg')

WebUI.waitForElementPresent(findTestObject('Core/Experience/Exp created successfully'), 30)

WebUI.click(findTestObject('Core/Experience/Exp created successfully'))

WebUI.click(findTestObject('Core/Context Catalog/button_Ok'))

WebUI.waitForPageLoad(0)

WebUI.takeScreenshot()

