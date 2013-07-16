//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.12 at 07:12:54 PM CST 
//


package kepler.hibernate3;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}property"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}one-to-one"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}component"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}dynamic-component"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}any"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}map"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}set"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}list"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}bag"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}array"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}primitive-array"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.dynamic-component"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyOrManyToOneOrOneToOne"
})
@XmlRootElement(name = "dynamic-component")
public class DynamicComponent {

    @XmlElements({
        @XmlElement(name = "bag", type = Bag.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "component", type = Component.class),
        @XmlElement(name = "primitive-array", type = PrimitiveArray.class),
        @XmlElement(name = "many-to-one", type = ManyToOne.class),
        @XmlElement(name = "dynamic-component", type = DynamicComponent.class),
        @XmlElement(name = "property", type = Property.class),
        @XmlElement(name = "one-to-one", type = OneToOne.class),
        @XmlElement(name = "map", type = Map.class),
        @XmlElement(name = "any", type = Any.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "list", type = kepler.hibernate3.List.class)
    })
    protected java.util.List<Object> propertyOrManyToOneOrOneToOne;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "unique")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unique;
    @XmlAttribute(name = "update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String update;
    @XmlAttribute(name = "insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String insert;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

    /**
     * Gets the value of the propertyOrManyToOneOrOneToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOrManyToOneOrOneToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOrManyToOneOrOneToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bag }
     * {@link Set }
     * {@link Component }
     * {@link PrimitiveArray }
     * {@link ManyToOne }
     * {@link DynamicComponent }
     * {@link Property }
     * {@link OneToOne }
     * {@link Map }
     * {@link Any }
     * {@link Array }
     * {@link kepler.hibernate3.List }
     * 
     * 
     */
    public java.util.List<Object> getPropertyOrManyToOneOrOneToOne() {
        if (propertyOrManyToOneOrOneToOne == null) {
            propertyOrManyToOneOrOneToOne = new ArrayList<Object>();
        }
        return this.propertyOrManyToOneOrOneToOne;
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
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique() {
        if (unique == null) {
            return "false";
        } else {
            return unique;
        }
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdate() {
        if (update == null) {
            return "true";
        } else {
            return update;
        }
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdate(String value) {
        this.update = value;
    }

    /**
     * Gets the value of the insert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsert() {
        if (insert == null) {
            return "true";
        } else {
            return insert;
        }
    }

    /**
     * Sets the value of the insert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsert(String value) {
        this.insert = value;
    }

    /**
     * Gets the value of the optimisticLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptimisticLock() {
        if (optimisticLock == null) {
            return "true";
        } else {
            return optimisticLock;
        }
    }

    /**
     * Sets the value of the optimisticLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptimisticLock(String value) {
        this.optimisticLock = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

}