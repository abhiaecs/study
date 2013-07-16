//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.12 at 07:12:54 PM CST 
//


package kepler.hibernate3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}return-scalar"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}return"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}return-join"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}load-collection"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}synchronize"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}query-param"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.sql-query"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "sql-query")
public class SqlQuery {

    @XmlElementRefs({
        @XmlElementRef(name = "synchronize", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = Synchronize.class, required = false),
        @XmlElementRef(name = "return-scalar", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = ReturnScalar.class, required = false),
        @XmlElementRef(name = "load-collection", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = LoadCollection.class, required = false),
        @XmlElementRef(name = "return-join", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = ReturnJoin.class, required = false),
        @XmlElementRef(name = "query-param", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = QueryParam.class, required = false),
        @XmlElementRef(name = "return", namespace = "http://www.hibernate.org/xsd/hibernate-mapping", type = Return.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "resultset-ref")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultsetRef;
    @XmlAttribute(name = "flush-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flushMode;
    @XmlAttribute(name = "cacheable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cacheable;
    @XmlAttribute(name = "cache-region")
    @XmlSchemaType(name = "anySimpleType")
    protected String cacheRegion;
    @XmlAttribute(name = "fetch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String fetchSize;
    @XmlAttribute(name = "timeout")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeout;
    @XmlAttribute(name = "cache-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cacheMode;
    @XmlAttribute(name = "read-only")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String readOnly;
    @XmlAttribute(name = "comment")
    @XmlSchemaType(name = "anySimpleType")
    protected String comment;
    @XmlAttribute(name = "callable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String callable;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Synchronize }
     * {@link ReturnScalar }
     * {@link LoadCollection }
     * {@link ReturnJoin }
     * {@link String }
     * {@link QueryParam }
     * {@link Return }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the resultsetRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsetRef() {
        return resultsetRef;
    }

    /**
     * Sets the value of the resultsetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsetRef(String value) {
        this.resultsetRef = value;
    }

    /**
     * Gets the value of the flushMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlushMode() {
        return flushMode;
    }

    /**
     * Sets the value of the flushMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlushMode(String value) {
        this.flushMode = value;
    }

    /**
     * Gets the value of the cacheable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheable() {
        if (cacheable == null) {
            return "false";
        } else {
            return cacheable;
        }
    }

    /**
     * Sets the value of the cacheable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheable(String value) {
        this.cacheable = value;
    }

    /**
     * Gets the value of the cacheRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheRegion() {
        return cacheRegion;
    }

    /**
     * Sets the value of the cacheRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheRegion(String value) {
        this.cacheRegion = value;
    }

    /**
     * Gets the value of the fetchSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchSize() {
        return fetchSize;
    }

    /**
     * Sets the value of the fetchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchSize(String value) {
        this.fetchSize = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the cacheMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheMode() {
        return cacheMode;
    }

    /**
     * Sets the value of the cacheMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheMode(String value) {
        this.cacheMode = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the callable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallable() {
        if (callable == null) {
            return "false";
        } else {
            return callable;
        }
    }

    /**
     * Sets the value of the callable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallable(String value) {
        this.callable = value;
    }

}