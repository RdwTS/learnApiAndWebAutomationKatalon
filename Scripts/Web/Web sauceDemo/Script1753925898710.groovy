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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Web/Page_Swag Labs/login Page/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Web/Page_Swag Labs/login Page/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Web/Page_Swag Labs/login Page/input_Swag Labs_login-button'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Home Page/span_Products'), 'Products')

WebUI.selectOptionByValue(findTestObject('Web/Page_Swag Labs/Home Page/Filter'), 'lohi', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Web/Page_Swag Labs/Home Page/button_Add to cart'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Home Page/chart'), '1')

WebUI.click(findTestObject('Web/Page_Swag Labs/Home Page/chart'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Chart Page/Label_Your Cart'), 'Your Cart')

WebUI.verifyElementVisible(findTestObject('Web/Page_Swag Labs/Chart Page/countainer_product'))

WebUI.click(findTestObject('Web/Page_Swag Labs/Chart Page/button_Checkout'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Checkout/Label_Checkout Your Information'), 'Checkout: Your Information')

WebUI.setText(findTestObject('Web/Page_Swag Labs/Checkout/input_Checkout Your Information_firstName'), 'Ridwan')

WebUI.setText(findTestObject('Web/Page_Swag Labs/Checkout/input_Checkout Your Information_lastName'), 'Tegar')

WebUI.setText(findTestObject('Web/Page_Swag Labs/Checkout/input_Checkout Your Information_postalCode'), '12070')

WebUI.click(findTestObject('Web/Page_Swag Labs/Checkout/button_continue'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Checkout/Label_Checkout Overview'), 'Checkout: Overview')

WebUI.click(findTestObject('Web/Page_Swag Labs/Checkout/button_Finish'))

WebUI.verifyElementText(findTestObject('Web/Page_Swag Labs/Checkout/Label_Thank you for your order'), 'Thank you for your order!')

WebUI.closeBrowser()