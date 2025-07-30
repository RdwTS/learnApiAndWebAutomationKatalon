<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create User full</name>
   <tag></tag>
   <elementGuidId>58018a00-8ebf-479a-ba19-4269ed955a97</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;title\&quot; \t\t: \&quot;${title}\&quot;,\n\t\&quot;firstName\&quot; \t: \&quot;${firstName}\&quot;,\n\t\&quot;lastName\&quot; \t\t: \&quot;${lastName}\&quot;,\n    \&quot;gender\&quot; \t\t: \&quot;${gender}\&quot;,\n    \&quot;email\&quot; \t\t: \&quot;${email}\&quot;,\n    \&quot;dateOfBirth\&quot;\t: \&quot;${dateOfBirth}\&quot;,\n    \&quot;phone\&quot; \t\t: \&quot;${phone}\&quot;,\n    \&quot;registerDate\&quot;\t: \&quot;${registerDate}\&quot;, \n    \&quot;updatedDate\&quot;\t: \&quot;${updatedDate}\&quot;, \n    \&quot;location\&quot; \t\t: {\n                       \&quot;street\&quot; \t: \&quot;${street}\&quot;,\n                       \&quot;city\&quot; \t\t: \&quot;${city}\&quot;,\n                       \&quot;state\&quot; \t\t: \&quot;${state}\&quot;,\n                       \&quot;country\&quot; \t: \&quot;${country}\&quot;,\n                       \&quot;timezone\&quot;\t: \&quot;${timezone}\&quot;\n                      }\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>app-id</name>
      <type>Main</type>
      <value>63a804408eb0cb069b57e43a</value>
      <webElementGuid>6313513a-4b48-4903-9d0a-56857d4c1f43</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>7ec32c25-23a6-4ef7-aae9-5d10a5373951</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>6102c814-4a9f-49cc-a54e-83d8a3b4ba07</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${URL}/data/v1/user/create</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>be16e831-202f-4255-ab90-ccdc1d5b5635</id>
      <masked>false</masked>
      <name>URL</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f3ba29a7-b5de-4a17-abf7-11520b677577</id>
      <masked>false</masked>
      <name>title</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>9f8f242f-e3a6-4595-88e4-8d55c71176fd</id>
      <masked>false</masked>
      <name>firstName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5e0c8075-2b29-4c2b-bb67-e22eaf4df0bf</id>
      <masked>false</masked>
      <name>lastName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>2e947e4a-ab96-44e7-85bd-fae6518246f6</id>
      <masked>false</masked>
      <name>gender</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e61d7aa6-b77e-4164-9fa9-b68157b0a363</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>896d06ff-f53c-4ffc-9e24-b45e6d83d8d5</id>
      <masked>false</masked>
      <name>dateOfBirth</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>862b74dd-706f-4f18-b855-28d43fb0e88d</id>
      <masked>false</masked>
      <name>phone</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d86d2d4d-8bb5-405b-ba8f-4696989a41b1</id>
      <masked>false</masked>
      <name>registerDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6b6e5bbb-cd03-4bf7-bd3f-6683c6345f8b</id>
      <masked>false</masked>
      <name>updatedDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f08a2bc0-0155-443c-b73b-5c842a545f8d</id>
      <masked>false</masked>
      <name>street</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3be07231-a4cc-41f2-a150-6d411976ca39</id>
      <masked>false</masked>
      <name>city</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>80cbcafa-26a6-472e-9fd8-90e79400c1d7</id>
      <masked>false</masked>
      <name>state</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7a27b2f7-8e34-4a29-8592-bc35d3f3a607</id>
      <masked>false</masked>
      <name>country</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>097e1833-8d6c-4392-b180-615a5ba051b8</id>
      <masked>false</masked>
      <name>timezone</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
