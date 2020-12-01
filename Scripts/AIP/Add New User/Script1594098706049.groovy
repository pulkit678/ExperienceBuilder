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
    WebUI.enhancedClick(findTestObject('AIP/Add New User/Page_Digital Experience Orchestration/img'))

    WebUI.setText(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/input__userName'), 
        Username)

    WebUI.setText(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/input_Name_name'), 
        FirstName)

    WebUI.setText(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/input_Surname_surname'), 
        Surname)

    WebUI.setText(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/input__emailId'), 
        Emailaddress)

    WebUI.selectOptionByValue(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/select_Role  Admin  Developer  Business Owner'), 
        'admin', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/select_Offering  BuildYourOwnOffering  Conn_d33419'), 
        '1: Object', true, FailureHandling.OPTIONAL)

    WebUI.enhancedClick(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/input__terms'))

    WebUI.enhancedClick(findTestObject('Object Repository/AIP/Add New User/Page_Digital Experience Orchestration/button_Add User'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('Success: New user Added', false)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.enhancedClick(findTestObject('AIP/Add New User/Page_Digital Experience Orchestration/button_Cancel'), FailureHandling.OPTIONAL)

    println('Add new user is not successful')
} 

