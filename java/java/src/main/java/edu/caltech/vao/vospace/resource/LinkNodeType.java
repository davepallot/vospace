//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.09 at 02:27:32 PM PST 
//


package edu.caltech.vao.vospace.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A node that points to another resource.
 *       
 * 
 * <p>Java class for LinkNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/VOSpace/v2.0}NodeType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkNodeType", propOrder = {
    "target"
})
public class LinkNodeType
    extends NodeType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

}
