<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>IMT TO KCB UG</name>
   <tag></tag>
   <elementGuidId>6201ff2b-cc0c-4786-97e2-334c696b3bd8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJSUzI1NiIsImtpZCI6IkY2OEUzNEMyQkFBQkRFODQ0ODQxNzk5RTAyNDJENDhDIiwidHlwIjoiYXQrand0In0.eyJuYmYiOjE2ODM3OTE4MzYsImV4cCI6MTY4Mzc5NTQzNiwiaXNzIjoiaHR0cDovLzEwLjIxNi4xLjg0OjgwODciLCJhdWQiOiJQeVBheV9hcGkiLCJjbGllbnRfaWQiOiJQeVBheV9hcGkiLCJjbGllbnRfd2Vic2l0ZSI6Imh0dHA6Ly93d3cucHljcy5jby5rZSIsImNsaWVudF9jdXN0b21lcl9pZCI6ImNkY2Q2YTUzLTdiMGEtZWMxMS04ZDdkLTAwNTA1NmEzMWRkYyIsImNsaWVudF9jdXN0b21lcl90eXBlIjoiTVRPIiwiY2xpZW50X2N1c3RvbWVyX2NhdGVnb3J5IjoiU3lzdGVtTWFuYWdlZCIsImp0aSI6IjZERjI1NjA2MTQ3RDQ4Q0ExQzkzN0IzRTI3MUZDMUY1IiwiaWF0IjoxNjgzNzkxODM2LCJzY29wZSI6WyJQeVBheV9hcGkiXX0.Lk6haKpV6WGI6hOp7F5wbfnKQlkam3soeSkCdpBVEk9_mOKVvAKa-D4cGMNaDy5fGCk-ZkoRkX1NMEwLAARIuP3oDQJ0uJDXr8SwFcmkmFYxw3fLm7sob_uKtuCw4BVk_PsX_zv5QA3S054DkmqddbjYZy92FgZTWf45bKJ2PeRHtExCX31Pd6fpy30TiUDzWHIHfmCRJTfvRdRxNXLr3WVa-kmMp6PaiE2Zyq1pfhnEutL3VdhelzWoHRG1QJWXUXnHMOcGoWki_fpS3vQirH0-8LKNyfreQ76E8w68tYbMIPJAMisrW8etGlvIrLVVlgDmsxoEgpTWYNAkAa2K_w</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;originatorConversationId\&quot;: \&quot;SITUG029\&quot;,\n  \&quot;paymentNotes\&quot;: \&quot;Bank Transactions\&quot;,\n  \&quot;paymentOrderLines\&quot;: [\n    {\n      \&quot;remitter\&quot;: {\n        \&quot;name\&quot;: \&quot;Jayden Kamuntu\&quot;,\n        \&quot;address\&quot;: \&quot;UGANDA\&quot;,\n        \&quot;phoneNumber\&quot;: \&quot;190099398333\&quot;,\n        \&quot;DateOfBirth\&quot;: \&quot;1431993\&quot;,\n         \&quot;Nationality\&quot;: \&quot;Ugandan\&quot;,\n        \&quot;idType\&quot;: \&quot;National ID\&quot;,\n        \&quot;idNumber\&quot;: \&quot;CM30234567UYWA\&quot;,\n        \&quot;country\&quot;: \&quot;UG\&quot;,\n        \&quot;ccy\&quot;: 800,\n        \&quot;financialInstitution\&quot;: \&quot;Bank\&quot;,\n        \&quot;sourceOfFunds\&quot;: \&quot;Business\&quot;,\n        \&quot;principalActivity\&quot;: \&quot;Business\&quot;\n      },\n      \&quot;recipient\&quot;: {\n        \&quot;name\&quot;: \&quot;Kiara Jones\&quot;,\n        \&quot;address\&quot;: \&quot;Westlands\&quot;,\n        \&quot;emailAddress\&quot;: \&quot;bkarungo@kcbgroup.com\&quot;,\n        \&quot;phoneNumber\&quot;: \&quot;+256757755635\&quot;,\n        \&quot;idType\&quot;: \&quot;National ID\&quot;,\n        \&quot;idNumber\&quot;: \&quot;CM30234567UYWA\&quot;,\n        \&quot;financialInstitution\&quot;: \&quot;Bank\&quot;,\n        \&quot;institutionIdentifier\&quot;: \&quot;KCBLUGKA\&quot;, //KENYA KCBLKENX, UG: KCBLUGKA TZ: KCBLTZTZ SS:KCBLSSJB, EQBLKENA\n        \&quot;primaryAccountNumber\&quot;: \&quot;2302225236\&quot;,//SS-5500155318 TZ-3390613072,3390171916//CUSTOMER ACCOUNT\n        \&quot;ccy\&quot;: 800, //KES 404, UG 800 , :TZ:834 SS:729 \n        \&quot;country\&quot; : \&quot;UG\&quot;, //UG, TZ, SS\n        \&quot;purpose\&quot;: \&quot;KCB UG TEST \&quot;\n      },\n      \&quot;transaction\&quot;: {\n        \&quot;routeId\&quot;: \&quot;0a3bb6f8-18e0-ec11-8d85-005056a31ddc\&quot;,\n        \&quot;ChannelType\&quot;: 4, //EFT:3 RTGS:4 IFT - Uses Swiftcode\n        \&quot;amount\&quot;: 11000,\n        \&quot;reference\&quot;: \&quot;SITUG029\&quot;,\n        \&quot;customerAccountNo\&quot;: \&quot;2291998021\&quot;,//UG , TZ-3390613072,3390534415 KE:1234835215 //IMT PARTNER ACCOUNT\n        \&quot;systemTraceAuditNumber\&quot;: \&quot;SITUG029\&quot;\n      }\n    }\n  ]\n}\n\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkY2OEUzNEMyQkFBQkRFODQ0ODQxNzk5RTAyNDJENDhDIiwidHlwIjoiYXQrand0In0.eyJuYmYiOjE2ODM3OTE4MzYsImV4cCI6MTY4Mzc5NTQzNiwiaXNzIjoiaHR0cDovLzEwLjIxNi4xLjg0OjgwODciLCJhdWQiOiJQeVBheV9hcGkiLCJjbGllbnRfaWQiOiJQeVBheV9hcGkiLCJjbGllbnRfd2Vic2l0ZSI6Imh0dHA6Ly93d3cucHljcy5jby5rZSIsImNsaWVudF9jdXN0b21lcl9pZCI6ImNkY2Q2YTUzLTdiMGEtZWMxMS04ZDdkLTAwNTA1NmEzMWRkYyIsImNsaWVudF9jdXN0b21lcl90eXBlIjoiTVRPIiwiY2xpZW50X2N1c3RvbWVyX2NhdGVnb3J5IjoiU3lzdGVtTWFuYWdlZCIsImp0aSI6IjZERjI1NjA2MTQ3RDQ4Q0ExQzkzN0IzRTI3MUZDMUY1IiwiaWF0IjoxNjgzNzkxODM2LCJzY29wZSI6WyJQeVBheV9hcGkiXX0.Lk6haKpV6WGI6hOp7F5wbfnKQlkam3soeSkCdpBVEk9_mOKVvAKa-D4cGMNaDy5fGCk-ZkoRkX1NMEwLAARIuP3oDQJ0uJDXr8SwFcmkmFYxw3fLm7sob_uKtuCw4BVk_PsX_zv5QA3S054DkmqddbjYZy92FgZTWf45bKJ2PeRHtExCX31Pd6fpy30TiUDzWHIHfmCRJTfvRdRxNXLr3WVa-kmMp6PaiE2Zyq1pfhnEutL3VdhelzWoHRG1QJWXUXnHMOcGoWki_fpS3vQirH0-8LKNyfreQ76E8w68tYbMIPJAMisrW8etGlvIrLVVlgDmsxoEgpTWYNAkAa2K_w</value>
      <webElementGuid>0f1748e5-28f9-458d-86b3-eaedf1d92f2d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://10.216.1.84:8084/v1/payment-order/new-order</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
