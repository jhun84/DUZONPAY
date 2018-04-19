
package com.duzonpay.testapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cardBINCheckResult complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="cardBINCheckResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="API_KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_NM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_ONWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESULT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESULT_MSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SITE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardBINCheckResult", propOrder = {
    "apikey",
    "cardcd",
    "cardnm",
    "cardno",
    "cardonwer",
    "cardtype",
    "resultcode",
    "resultmsg",
    "sitecd"
})
public class CardBINCheckResult {

    @XmlElement(name = "API_KEY")
    protected String apikey;
    @XmlElement(name = "CARD_CD")
    protected String cardcd;
    @XmlElement(name = "CARD_NM")
    protected String cardnm;
    @XmlElement(name = "CARD_NO")
    protected String cardno;
    @XmlElement(name = "CARD_ONWER")
    protected String cardonwer;
    @XmlElement(name = "CARD_TYPE")
    protected String cardtype;
    @XmlElement(name = "RESULT_CODE")
    protected String resultcode;
    @XmlElement(name = "RESULT_MSG")
    protected String resultmsg;
    @XmlElement(name = "SITE_CD")
    protected String sitecd;

    /**
     * apikey �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIKEY() {
        return apikey;
    }

    /**
     * apikey �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIKEY(String value) {
        this.apikey = value;
    }

    /**
     * cardcd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDCD() {
        return cardcd;
    }

    /**
     * cardcd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDCD(String value) {
        this.cardcd = value;
    }

    /**
     * cardnm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNM() {
        return cardnm;
    }

    /**
     * cardnm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNM(String value) {
        this.cardnm = value;
    }

    /**
     * cardno �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNO() {
        return cardno;
    }

    /**
     * cardno �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNO(String value) {
        this.cardno = value;
    }

    /**
     * cardonwer �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDONWER() {
        return cardonwer;
    }

    /**
     * cardonwer �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDONWER(String value) {
        this.cardonwer = value;
    }

    /**
     * cardtype �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDTYPE() {
        return cardtype;
    }

    /**
     * cardtype �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDTYPE(String value) {
        this.cardtype = value;
    }

    /**
     * resultcode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTCODE() {
        return resultcode;
    }

    /**
     * resultcode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTCODE(String value) {
        this.resultcode = value;
    }

    /**
     * resultmsg �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESULTMSG() {
        return resultmsg;
    }

    /**
     * resultmsg �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESULTMSG(String value) {
        this.resultmsg = value;
    }

    /**
     * sitecd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITECD() {
        return sitecd;
    }

    /**
     * sitecd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITECD(String value) {
        this.sitecd = value;
    }

}
