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
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject


//create user full info
TestData inputData = findTestData("Data Files/Post")
for(int i= 1; i <= inputData.getRowNumbers() ; i++) {
	def firstName = inputData.getValue('firstName',i)
	def lastName = inputData.getValue('lastName',i)
	def email = inputData.getValue('email',i)

	
	KeywordUtil.logInfo("Data ke-" + i +
		", First Name: " + firstName +
		", Last Name: " + lastName +
		", Email: " + email)
}

String inpFirstName = inputData.getValue('firstName',1)
String inpLastName = inputData.getValue('lastName',1)
String inpEmail = inputData.getValue('email',1)


	KeywordUtil.logInfo("Data input" +		
		", First Name: " + inpFirstName +
		", Last Name: " + inpLastName +
		", Email: " + inpEmail)
	
RequestObject createUser = findTestObject('Object Repository/Postman/Create User Dynamis',
	[
		('email') : inpEmail,
		('firstName'): inpFirstName,
		('lastName'): inpLastName
	])
//	[
//		"firstName"    : inpFirstName,
//		"lastName"     : inpLastName,
//		"email"        : inpEmail
//	])

ResponseObject createUserResp = WS.sendRequestAndVerify(createUser, FailureHandling.STOP_ON_FAILURE)
KeywordUtil.logInfo('HEADER\n' + createUserResp.getHeaderFields() + "\n\nBODY\n" + createUserResp.getResponseBodyContent())
