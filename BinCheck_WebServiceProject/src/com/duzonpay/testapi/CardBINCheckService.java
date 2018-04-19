
package com.duzonpay.testapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CardBINCheckService complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CardBINCheckService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://testapi.duzonpay.com/}cardBINCheckModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBINCheckService", propOrder = {
    "arg0"
})
public class CardBINCheckService {

    protected CardBINCheckModel arg0;

    /**
     * arg0 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CardBINCheckModel }
     *     
     */
    public CardBINCheckModel getArg0() {
        return arg0;
    }

    /**
     * arg0 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBINCheckModel }
     *     
     */
    public void setArg0(CardBINCheckModel value) {
        this.arg0 = value;
    }

}
