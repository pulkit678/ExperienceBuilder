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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://claimswidget.experiencebuilder.accenture.com/?phonenumber=919742735089&name=swathi')

WebUI.click(findTestObject('Core/Page_Insurance online Application/Chat_button'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes'))

WebUI.click(findTestObject('Core/Page_Insurance online Application/Collision with motor vehicle'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes - Photo of dmg vehicle'))

//WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Front End Damage Vehicle'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Take a photo'))

Robot robot = new Robot();
// Creates the delay of 5 sec so that you can open notepad before
// Robot start writting
robot.delay(2000);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_ENTER);

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Take a photo'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Take a photo'))


WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Driver Side'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Driver Side'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Rear End'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Rear End'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Passenger Side'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Passenger Side'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Specific Dmg Parts'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Specific Dmg Parts'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes - Witnesses'))

WebUI.setText(findTestObject('Object Repository/Core/Page_Insurance online Application/input_First and last name_name'), 
    'Pulkit')

WebUI.setText(findTestObject('Object Repository/Core/Page_Insurance online Application/input_Phone number_phone'), '9789273580')

WebUI.setText(findTestObject('Object Repository/Core/Page_Insurance online Application/textarea_Address_address'), 'Gurgaon')

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Submit'))

//WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_No - Other Witnesses'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes - Submit_Doc'))

// WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/div_Would you like to submit this now Yes No'))

// WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Vehicle Reg'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Vehicle Reg'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Insurance Card'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - Insurance Card'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - DL'))
WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Skip - DL'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/input_Recommended repair shop_Recommended r_22a5f1'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/img_concat(Next let  s select a repair shop_94ef20'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes - Book Rental'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/img_concat(Ok here  s a list of our rental _613f26'))

WebUI.click(findTestObject('Object Repository/Core/Page_Insurance online Application/button_Yes - Any Other help'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Core/Page_Insurance online Application/Thankyou for using InsureMe'), 20)

//WebUI.closeBrowser()

