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

def inpTitle = inputData.getValue('title',1)
def inpFirstName = inputData.getValue('firstName',1)
def inpLastName = inputData.getValue('lastName',1)
def inpGender = inputData.getValue('gender',1)
def inpEmail = inputData.getValue('email',1)
def inpDateOfBirth = inputData.getValue('dateOfBirth',1)
def inpPhone = inputData.getValue('phone',1)
def inpRegisterDate = inputData.getValue('registerDate',1)
def inpUpdatedDate = inputData.getValue('updatedDate',1)
def inpStreet = inputData.getValue('street',1)
def inpCity = inputData.getValue('city',1)
def inpState = inputData.getValue('state',1)
def inpCountry = inputData.getValue('country',1)
def inpTimezone = inputData.getValue('timezone',1)

RequestObject createUser = findTestObject('Object Repository/Postman/Create User full', [
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

//get single user by id
def idDynamis = "60d0fe4f5311236168a109e2"

RequestObject singleUserById = findTestObject('Object Repository/Postman/Get single user by id dynamis',[
		"id" : idDynamis
	])

ResponseObject singleUserByIdResp =WS.sendRequestAndVerify(singleUserById, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo('HEADER\n' + singleUserByIdResp.getHeaderFields() + "\n\nBODY\n" + singleUserByIdResp.getResponseBodyContent())



