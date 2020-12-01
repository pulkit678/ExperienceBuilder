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

    WebUI.setText(findTestObject('Core/Event Catalog/Search'), 'crash')

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/img_Kafka_actionimages'))

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input__editkafkaHost'), 
        'kafka:9002')

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input__editkafkaTopic'), 
        '1234567:crash1')

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input_Category_category'), 
        'dcbhdhsacds')

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/textarea__eventSchema'), 
        '{"sdfcsdvc":"","dfcdsc":"","asfds":""}')

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/span__glyphicon glyphicon-refresh'))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/select_Event Sourcesdfcsdvcdfcdscasfds'), 
        '$.asfds', false)

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input__editeventName'), 
        'crash1')

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/textarea_Description_description'), 
        'testing')

    WebUI.setText(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/input_Logo Path_logo'), 
        'sdhxjskasdkcnsjc')

    WebUI.click(findTestObject('AIP/kafka event/Page_Digital Experience Orchestration/button_Save (1)'))

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/button_Ok'))

    WebUI.enableSmartWait()

    WebUI.verifyTextPresent('edited successfully', false, FailureHandling.OPTIONAL)

    WebUI.takeScreenshot()
}
catch (Exception e) {
    WebUI.takeScreenshot()

    WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/AIP/kafka event/Page_Digital Experience Orchestration/cancel'))

    //WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
    println('kafka Event editing is not successful')
} 

