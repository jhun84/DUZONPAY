
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.duzonpay.testapi;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2018-04-19T13:29:56.684+09:00
 * Generated source version: 2.6.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "DuzonPayWebService",
                      portName = "APIWebserviceImplPort",
                      targetNamespace = "http://testapi.duzonpay.com/",
                      wsdlLocation = "https://testapi.duzonpay.com:8143/webservice/duzonpay?wsdl",
                      endpointInterface = "com.duzonpay.testapi.APIWebservice")
                      
public class APIWebserviceImpl implements APIWebservice {

    private static final Logger LOG = Logger.getLogger(APIWebserviceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.duzonpay.testapi.APIWebservice#cardBINCheckService(com.duzonpay.testapi.CardBINCheckModel  arg0 )*
     */
    public com.duzonpay.testapi.CardBINCheckResult cardBINCheckService(com.duzonpay.testapi.CardBINCheckModel arg0) { 
        LOG.info("Executing operation cardBINCheckService");
        System.out.println(arg0);
        try {
            com.duzonpay.testapi.CardBINCheckResult _return = new com.duzonpay.testapi.CardBINCheckResult();
            _return.setAPIKEY("APIKEY-1136915900");
            _return.setCARDCD("CARDCD-649395355");
            _return.setCARDNM("CARDNM-1311764180");
            _return.setCARDNO("CARDNO1687023536");
            _return.setCARDONWER("CARDONWER-1239649121");
            _return.setCARDTYPE("CARDTYPE-2136017622");
            _return.setRESULTCODE("RESULTCODE1965817592");
            _return.setRESULTMSG("RESULTMSG-1416137310");
            _return.setSITECD("SITECD2016916227");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
