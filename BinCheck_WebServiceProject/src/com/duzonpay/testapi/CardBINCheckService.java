
package com.duzonpay.testapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CardBINCheckService complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * arg0 �Ӽ��� ���� �����ɴϴ�.
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
     * arg0 �Ӽ��� ���� �����մϴ�.
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
