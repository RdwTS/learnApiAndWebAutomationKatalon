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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper


//create user full info
TestData inputData = findTestData("Data Files/Post")
for(int i= 1; i <= inputData.getRowNumbers() ; i++) {
	def title = inputData.getValue('title',i)
	def firstName = inputData.getValue('firstName',i)
	def lastName = inputData.getValue('lastName',i)
	def gender = inputData.getValue('gender',i)
	def email = inputData.getValue('email',i)
	def dateOfBirth = inputData.getValue('dateOfBirth',i)
	def phone = inputData.getValue('phone',i)
	def registerDate = inputData.getValue('registerDate',i)
	def updatedDate = inputData.getValue('updatedDate',i)
	def street = inputData.getValue('street',i)
	def city = inputData.getValue('city',i)
	def state = inputData.getValue('state',i)
	def country = inputData.getValue('country',i)
	def timezone = inputData.getValue('timezone',i)
	
	KeywordUtil.logInfo("Data ke-" + i +
		" => Title: " + title +
		", First Name: " + firstName +
		", Last Name: " + lastName +
		", Gender: " + gender +
		", Email: " + email +
		", DOB: " + dateOfBirth +
		", Phone: " + phone +
		", Register Date: " + registerDate +
		", Updated Date: " + updatedDate +
		", Street: " + street +
		", City: " + city +
		", State: " + state +
		", Country: " + country +
		", Timezone: " + timezone)
}

String inpTitle = inputData.getValue('title',1)
String inpFirstName = inputData.getValue('firstName',1)
String inpLastName = inputData.getValue('lastName',1)
String inpGender = inputData.getValue('gender',1)
String inpEmail = inputData.getValue('email',1)
String inpDateOfBirth = inputData.getValue('dateOfBirth',1)
String inpPhone = inputData.getValue('phone',1)
String inpRegisterDate = inputData.getValue('registerDate',1)
String inpUpdatedDate = inputData.getValue('updatedDate',1)
String inpStreet = inputData.getValue('street',1)
String inpCity = inputData.getValue('city',1)
String inpState = inputData.getValue('state',1)
String inpCountry = inputData.getValue('country',1)
String inpTimezone = inputData.getValue('timezone',1)

	KeywordUtil.logInfo("Data input" +
		" => Title: " + inpTitle +
		", First Name: " + inpFirstName +
		", Last Name: " + inpLastName +
		", Gender: " + inpGender +
		", Email: " + inpEmail +
		", DOB: " + inpDateOfBirth +
		", Phone: " + inpPhone +
		", Register Date: " + inpRegisterDate +
		", Updated Date: " + inpUpdatedDate +
		", Street: " + inpStreet +
		", City: " + inpCity +
		", State: " + inpState +
		", Country: " + inpCountry +
		", Timezone: " + inpTimezone)
	
RequestObject createUser = findTestObject('Object Repository/Postman/Create User full', 
	[
		('title')        : inpTitle,
		('firstName')    : inpFirstName,
		('lastName')     : inpLastName,
		('gender')       : inpGender,
		('email')        : inpEmail,
		('dateOfBirth')  : inpDateOfBirth,
		('phone')        : inpPhone,
		('registerDate') : inpRegisterDate,
		('updatedDate')  : inpUpdatedDate,
		('street')       : inpStreet,
		('city')         : inpCity,
		('state')        : inpState,
		('country')      : inpCountry,
		('timezone')     : inpTimezone
	])

ResponseObject createUserResp = WS.sendRequestAndVerify(createUser, FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.logInfo('HEADER\n' + createUserResp.getHeaderFields() + "\n\nBODY\n" + createUserResp.getResponseBodyContent())

// set parameter idStatic
JsonSlurper jsonSluper = new JsonSlurper()
def jsonResp = jsonSluper.parseText(createUserResp.getResponseText())
	KeywordUtil.logInfo('RESPONSE jsonResp: ' + jsonResp.toString())
def idDynamis = jsonResp.id //declare at variables testcase
	KeywordUtil.logInfo('idDynamis : ' + idDynamis)

//get single user by id
	
//def idDynamis = "60d0fe4f5311236168a109e2"
RequestObject singleUserById = findTestObject('Object Repository/Postman/Get single user by id dynamis',[
		"id" : idDynamis
	])

ResponseObject singleUserByIdResp =WS.sendRequestAndVerify(singleUserById, FailureHandling.STOP_ON_FAILURE)

	KeywordUtil.logInfo('HEADER\n' + singleUserByIdResp.getHeaderFields() + "\n\nBODY\n" + singleUserByIdResp.getResponseBodyContent())

// update User by id
def updLastName = "tegar"
def updPhone = "081122334455"

RequestObject updateUserById =  findTestObject('Object Repository/Postman/Update User Dynamis' ,[
	('id')			: idDynamis,
	('lastName')	: updLastName,
	('phone')		: updPhone
	])
ResponseObject updateUserByIdResp = WS.sendRequestAndVerify(updateUserById, FailureHandling.STOP_ON_FAILURE)

	KeywordUtil.logInfo('HEADER\n' + updateUserByIdResp.getHeaderFields() + "\n\nBODY\n" + updateUserByIdResp.getResponseBodyContent())

// delete User by id
	
RequestObject deleteUserById =findTestObject('Object Repository/Postman/Delete User dynamis' ,[
	('id')	: idDynamis
	])

ResponseObject deleteUserByIdResp = WS.sendRequestAndVerify(deleteUserById, FailureHandling.STOP_ON_FAILURE)
	KeywordUtil.logInfo('HEADER\n' + deleteUserByIdResp.getHeaderFields() + "\n\nBODY\n" + deleteUserByIdResp.getResponseBodyContent())
	
	