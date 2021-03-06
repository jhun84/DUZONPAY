package com.duzonpay.testapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-04-19T13:29:56.696+09:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://testapi.duzonpay.com/", name = "APIWebservice")
@XmlSeeAlso({ObjectFactory.class})
public interface APIWebservice {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "CardBINCheckService", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.CardBINCheckService")
    @WebMethod(operationName = "CardBINCheckService")
    @ResponseWrapper(localName = "CardBINCheckServiceResponse", targetNamespace = "http://testapi.duzonpay.com/", className = "com.duzonpay.testapi.CardBINCheckServiceResponse")
    public com.duzonpay.testapi.CardBINCheckResult cardBINCheckService(
        @WebParam(name = "arg0", targetNamespace = "")
        com.duzonpay.testapi.CardBINCheckModel arg0
    );
}
