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
    WebUI.setText(findTestObject('AIP/Project/Search'), 'auto')

    WebUI.click(findTestObject('AIP/Project/edit-project-btn'))

    WebUI.setText(findTestObject('AIP/Project/Edit_projectName'), 'autotesting')

    WebUI.setText(findTestObject('AIP/Project/Edit__projectDes'), 'autotesting')

    WebUI.setText(findTestObject('AIP/Project/Edit_projectLogo'), 'https://afdeseds')

    WebUI.click(findTestObject('AIP/Project/button_Save - Copy'))

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

    WebUI.verifyTextPresent('Project edited successfully', false)

    WebUI.takeScreenshot()

    println('Project editing is  successful')
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('AIP/Project/Edit Project-cancel'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('Project editing is not successful')
} 

