<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.duzonpay.testapi.*" %>    
<%@ page import="java.io.File" %>
<%@ page import="java.net.MalformedURLException" %>
<%@ page import="java.net.URL" %>
<%@ page import="javax.xml.namespace.QName" %>
<%@ page import="javax.jws.WebMethod" %>
<%@ page import="javax.jws.WebParam" %>
<%@ page import="javax.jws.WebResult" %>
<%@ page import="javax.jws.WebService" %>
<%@ page import="javax.xml.bind.annotation.XmlSeeAlso" %>
<%@ page import="javax.xml.ws.Service" %>
<%@ page import="javax.xml.ws.RequestWrapper" %>
<%@ page import="javax.xml.ws.ResponseWrapper" %>
<%@ page import="javax.xml.namespace.QName"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%><html>  
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%!
 //공통함수로 빼버린다.
 private static Map<String, QName> QNAME_MAP = new HashMap<String, QName>();
 private static Object o = new Object();
 
 public static QName getQName(String nameSpace, String implServiceNm){
  synchronized(o){
   if(!QNAME_MAP.containsKey(implServiceNm)){
    QName q = new QName(nameSpace, implServiceNm);
    QNAME_MAP.put(implServiceNm, q);
   }
  }
     return (QName)QNAME_MAP.get(implServiceNm);
 }
 public static URL getWsdlURL(URL url){
     String protocol = "https://";
     String server = "testapi.duzonpay.com:8143"; //추후에 컨피그레이션으로뺀다.
     String URL = url.toString().substring(7);
     URL = URL.substring(URL.indexOf('/'));
  try{
         return (new URL(protocol + server + URL));
  }catch(Exception e){
         e.printStackTrace();
   return null;
  }
 }
%>
<body>
<h3>테스트 </h3>
<%
CardBINCheckModel bin = new CardBINCheckModel();
 bin.setAPIKEY("apitest1234567800001111222233330");
 bin.setCARDNO("5433330523823315");
 bin.setSITECD("T0060");
 
 try{
  QName serviceName = getQName("http://testapi.duzonpay.com/", "DuzonPayWebService");
  URL wsdlURL = DuzonPayWebService.WSDL_LOCATION;
        
        DuzonPayWebService ss = new DuzonPayWebService(wsdlURL, serviceName);
        APIWebservice port = ss.getAPIWebserviceImplPort();

        CardBINCheckResult result = port.cardBINCheckService(bin);
        
        System.out.println("CARDNO= "+result.getCARDNO());
        System.out.println("CARDCD= "+result.getCARDCD());
        System.out.println("CARDNM= "+result.getCARDNM());
        System.out.println("CARDTYPE= "+result.getCARDTYPE());
        System.out.println("CARDOWNER= "+result.getCARDONWER());
        System.out.println("RESULT MSG= "+result.getRESULTMSG());

 }catch(Exception e){
  e.printStackTrace();
 }
%>
</BODY>
</html>