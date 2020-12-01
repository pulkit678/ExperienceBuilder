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

WebUI.click(findTestObject('Core/Recipe/li_RecipesAmazon Web ServicesS3LambdaStep F_09b7c4'))

WebUI.click(findTestObject('Core/Recipe/span_New Recipe'))

WebUI.setText(findTestObject('Core/Recipe/input_(max 35 chars)_recipename'), 'Recipe')

WebUI.setText(findTestObject('Core/Recipe/input__recipedescription'), 'testing')

WebUI.click(findTestObject('Core/Recipe/label_dscnjdk'))

WebUI.click(findTestObject('Core/Recipe/label_sixjnmks'))

WebUI.click(findTestObject('Core/Recipe/label_RIG Response'))

WebUI.click(findTestObject('Core/Recipe/label_SMS'))

WebUI.click(findTestObject('Core/Recipe/button_Save'))

WebUI.waitForPageLoad(0)

WebUI.takeScreenshot()

