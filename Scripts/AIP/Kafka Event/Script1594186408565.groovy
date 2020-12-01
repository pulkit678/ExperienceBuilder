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
    WebUI.click(findTestObject('Core/Event Catalog/a_Event Catalog'))

    WebUI.click(findTestObject('Core/Event Catalog/New Event'))

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input_New Event_isKafkaAsSource'))

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/kafkaHost'), 'kafka:9001')

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/kafkaTopic'), '1234567:crash')

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/category'), 'dcbhdh')

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/eventSchema'), '{"sdfcsdvc":"","dfcdsc":""}')

    WebUI.click(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/refresh'))

    WebUI.click(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/Event Sources'))

    WebUI.selectOptionByLabel(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/Event Sources'), '$.sdfcsdvc', 
        false)

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/eventName'), 'crash')

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/Description'), 'tsting')

    WebUI.setText(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/Logo Path'), 'sdhxjska')

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/button_Save'))

    WebUI.verifyTextPresent('created successfully!', false)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/cancel'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('kafka Event Creation is not successful')
} 

