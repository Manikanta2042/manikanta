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

import org.apache.commons.lang.RandomStringUtils as RandomStringUtils


//def PhoneNumber = "91" + RandomStringUtils.randomNumeric(8)
//println ("PhoneNumber: ${PhoneNumber}")
//
//def Email = "test" + RandomStringUtils.randomNumeric(3) + "@gmail.com"
//println ("Email: ${Email}")

//boolean alert ;

WebUI.openBrowser('https://www.flightstats.com/v2/flight-tracker/search')

WebUI.maximizeWindow()

WebUI.click(findTestObject('flight-tracker/Accept Cookies'))

WebUI.setText(findTestObject('flight-tracker/Arline'), 'AA')

WebUI.sendKeys(findTestObject('flight-tracker/Arline'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('flight-tracker/Arline'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('flight-tracker/Flight Number'), '200')

WebUI.selectOptionByIndex(findTestObject('flight-tracker/Dates'), 5)

WebUI.click(findTestObject('flight-tracker/Search Button'))

WebUI.verifyElementVisible(findTestObject('flight-tracker/New Ticket'))

WebUI.verifyElementVisible(findTestObject('flight-tracker/Map'))