package dnd

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
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




public class DragAndDropHelper {
	private static String getJsDndHelper() {
		return '''
function simulateDragDrop(sourceNode, destinationNode) {
var EVENT_TYPES = {
DRAG_END: 'dragend',
DRAG_START: 'dragstart',
DROP: 'drop'
}
 
function createCustomEvent(type) {
var event = new CustomEvent("CustomEvent")
event.initCustomEvent(type, true, true, null)
event.dataTransfer = {
data: {
},
setData: function(type, val) {
this.data[type] = val
},
getData: function(type) {
return this.data[type]
}
}
return event
}
 
function dispatchEvent(node, type, event) {
if (node.dispatchEvent) {
return node.dispatchEvent(event)
}
if (node.fireEvent) {
return node.fireEvent("on" + type, event)
}
}
 
var event = createCustomEvent(EVENT_TYPES.DRAG_START)
dispatchEvent(sourceNode, EVENT_TYPES.DRAG_START, event)
 
var dropEvent = createCustomEvent(EVENT_TYPES.DROP)
dropEvent.dataTransfer = event.dataTransfer
dispatchEvent(destinationNode, EVENT_TYPES.DROP, dropEvent)
 
var dragEndEvent = createCustomEvent(EVENT_TYPES.DRAG_END)
dragEndEvent.dataTransfer = event.dataTransfer
dispatchEvent(sourceNode, EVENT_TYPES.DRAG_END, dragEndEvent)
}
 
''';
	}

	@Keyword
	def dragAndDrop(TestObject sourceObject, TestObject destinationObject) {
		WebElement sourceElement = WebUiBuiltInKeywords.findWebElement(sourceObject);
		WebElement destinationElement = WebUiBuiltInKeywords.findWebElement(destinationObject);
		WebDriver webDriver = DriverFactory.getWebDriver();
		((JavascriptExecutor) webDriver).executeScript(getJsDndHelper() + "simulateDragDrop(arguments[0], arguments[1])", sourceElement, destinationElement)
	}
	
	@Keyword
	def objectSelect(String ObjectName) {
		TestObject toN = new TestObject()
		String ValueXpath = "//li/label[contains(text(),'"+ObjectName+"')]"
		toN.addProperty('xpath', ConditionType.EQUALS, ValueXpath)
		WebUI.click(toN)
	}
}
