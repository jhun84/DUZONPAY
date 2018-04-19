
package com.duzonpay.testapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.duzonpay.testapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CardBINCheckServiceResponse_QNAME = new QName("http://testapi.duzonpay.com/", "CardBINCheckServiceResponse");
    private final static QName _CardBINCheckService_QNAME = new QName("http://testapi.duzonpay.com/", "CardBINCheckService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.duzonpay.testapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardBINCheckServiceResponse }
     * 
     */
    public CardBINCheckServiceResponse createCardBINCheckServiceResponse() {
        return new CardBINCheckServiceResponse();
    }

    /**
     * Create an instance of {@link CardBINCheckService }
     * 
     */
    public CardBINCheckService createCardBINCheckService() {
        return new CardBINCheckService();
    }

    /**
     * Create an instance of {@link CardBINCheckResult }
     * 
     */
    public CardBINCheckResult createCardBINCheckResult() {
        return new CardBINCheckResult();
    }

    /**
     * Create an instance of {@link CardBINCheckModel }
     * 
     */
    public CardBINCheckModel createCardBINCheckModel() {
        return new CardBINCheckModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardBINCheckServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "CardBINCheckServiceResponse")
    public JAXBElement<CardBINCheckServiceResponse> createCardBINCheckServiceResponse(CardBINCheckServiceResponse value) {
        return new JAXBElement<CardBINCheckServiceResponse>(_CardBINCheckServiceResponse_QNAME, CardBINCheckServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardBINCheckService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testapi.duzonpay.com/", name = "CardBINCheckService")
    public JAXBElement<CardBINCheckService> createCardBINCheckService(CardBINCheckService value) {
        return new JAXBElement<CardBINCheckService>(_CardBINCheckService_QNAME, CardBINCheckService.class, null, value);
    }

}
