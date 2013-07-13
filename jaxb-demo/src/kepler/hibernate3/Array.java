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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}meta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}subselect-element" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}cache" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}synchronize" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}key"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}index"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}list-index"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}element"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}one-to-many"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-many"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}composite-element"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-any"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}loader" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete-all" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.array"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meta",
    "subselectElement",
    "cache",
    "synchronize",
    "comment",
    "key",
    "index",
    "listIndex",
    "element",
    "oneToMany",
    "manyToMany",
    "compositeElement",
    "manyToAny",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "sqlDeleteAll"
})
@XmlRootElement(name = "array")
public class Array {

    protected List<Meta> meta;
    @XmlElement(name = "subselect-element")
    protected String subselectElement;
    protected Cache cache;
    protected List<Synchronize> synchronize;
    protected String comment;
    @XmlElement(required = true)
    protected Key key;
    protected Index index;
    @XmlElement(name = "list-index")
    protected ListIndex listIndex;
    protected Element element;
    @XmlElement(name = "one-to-many")
    protected OneToMany oneToMany;
    @XmlElement(name = "many-to-many")
    protected ManyToMany manyToMany;
    @XmlElement(name = "composite-element")
    protected CompositeElement compositeElement;
    @XmlElement(name = "many-to-any")
    protected ManyToAny manyToAny;
    protected Loader loader;
    @XmlElement(name = "sql-insert")
    protected SqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected SqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected SqlDelete sqlDelete;
    @XmlElement(name = "sql-delete-all")
    protected SqlDeleteAll sqlDeleteAll;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "access")
    @XmlSchemaType(name = "anySimpleType")
    protected String access;
    @XmlAttribute(name = "table")
    @XmlSchemaType(name = "anySimpleType")
    protected String table;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "subselect")
    @XmlSchemaType(name = "anySimpleType")
    protected String subselect;
    @XmlAttribute(name = "inverse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inverse;
    @XmlAttribute(name = "mutable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mutable;
    @XmlAttribute(name = "element-class")
    @XmlSchemaType(name = "anySimpleType")
    protected String elementClass;
    @XmlAttribute(name = "cascade")
    @XmlSchemaType(name = "anySimpleType")
    protected String cascade;
    @XmlAttribute(name = "where")
    @XmlSchemaType(name = "anySimpleType")
    protected String where;
    @XmlAttribute(name = "batch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String batchSize;
    @XmlAttribute(name = "outer-join")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outerJoin;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetch;
    @XmlAttribute(name = "persister")
    @XmlSchemaType(name = "anySimpleType")
    protected String persister;
    @XmlAttribute(name = "collection-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String collectionType;
    @XmlAttribute(name = "check")
    @XmlSchemaType(name = "anySimpleType")
    protected String check;
    @XmlAttribute(name = "optimistic-lock")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String optimisticLock;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;
    @XmlAttribute(name = "embed-xml")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embedXml;

    /**
     * Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meta }
     * 
     * 
     */
    public List<Meta> getMeta() {
        if (meta == null) {
            meta = new ArrayList<Meta>();
        }
        return this.meta;
    }

    /**
     * Gets the value of the subselectElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselectElement() {
        return subselectElement;
    }

    /**
     * Sets the value of the subselectElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselectElement(String value) {
        this.subselectElement = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link Cache }
     *     
     */
    public Cache getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cache }
     *     
     */
    public void setCache(Cache value) {
        this.cache = value;
    }

    /**
     * Gets the value of the synchronize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Synchronize }
     * 
     * 
     */
    public List<Synchronize> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<Synchronize>();
        }
        return this.synchronize;
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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKey(Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Index }
     *     
     */
    public Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Index }
     *     
     */
    public void setIndex(Index value) {
        this.index = value;
    }

    /**
     * Gets the value of the listIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ListIndex }
     *     
     */
    public ListIndex getListIndex() {
        return listIndex;
    }

    /**
     * Sets the value of the listIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListIndex }
     *     
     */
    public void setListIndex(ListIndex value) {
        this.listIndex = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setElement(Element value) {
        this.element = value;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * @return
     *     possible object is
     *     {@link OneToMany }
     *     
     */
    public OneToMany getOneToMany() {
        return oneToMany;
    }

    /**
     * Sets the value of the oneToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneToMany }
     *     
     */
    public void setOneToMany(OneToMany value) {
        this.oneToMany = value;
    }

    /**
     * Gets the value of the manyToMany property.
     * 
     * @return
     *     possible object is
     *     {@link ManyToMany }
     *     
     */
    public ManyToMany getManyToMany() {
        return manyToMany;
    }

    /**
     * Sets the value of the manyToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManyToMany }
     *     
     */
    public void setManyToMany(ManyToMany value) {
        this.manyToMany = value;
    }

    /**
     * Gets the value of the compositeElement property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeElement }
     *     
     */
    public CompositeElement getCompositeElement() {
        return compositeElement;
    }

    /**
     * Sets the value of the compositeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeElement }
     *     
     */
    public void setCompositeElement(CompositeElement value) {
        this.compositeElement = value;
    }

    /**
     * Gets the value of the manyToAny property.
     * 
     * @return
     *     possible object is
     *     {@link ManyToAny }
     *     
     */
    public ManyToAny getManyToAny() {
        return manyToAny;
    }

    /**
     * Sets the value of the manyToAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManyToAny }
     *     
     */
    public void setManyToAny(ManyToAny value) {
        this.manyToAny = value;
    }

    /**
     * Gets the value of the loader property.
     * 
     * @return
     *     possible object is
     *     {@link Loader }
     *     
     */
    public Loader getLoader() {
        return loader;
    }

    /**
     * Sets the value of the loader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loader }
     *     
     */
    public void setLoader(Loader value) {
        this.loader = value;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link SqlInsert }
     *     
     */
    public SqlInsert getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlInsert }
     *     
     */
    public void setSqlInsert(SqlInsert value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link SqlUpdate }
     *     
     */
    public SqlUpdate getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlUpdate }
     *     
     */
    public void setSqlUpdate(SqlUpdate value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link SqlDelete }
     *     
     */
    public SqlDelete getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlDelete }
     *     
     */
    public void setSqlDelete(SqlDelete value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the sqlDeleteAll property.
     * 
     * @return
     *     possible object is
     *     {@link SqlDeleteAll }
     *     
     */
    public SqlDeleteAll getSqlDeleteAll() {
        return sqlDeleteAll;
    }

    /**
     * Sets the value of the sqlDeleteAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlDeleteAll }
     *     
     */
    public void setSqlDeleteAll(SqlDeleteAll value) {
        this.sqlDeleteAll = value;
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
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the subselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Sets the value of the subselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Gets the value of the inverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverse() {
        if (inverse == null) {
            return "false";
        } else {
            return inverse;
        }
    }

    /**
     * Sets the value of the inverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverse(String value) {
        this.inverse = value;
    }

    /**
     * Gets the value of the mutable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutable() {
        if (mutable == null) {
            return "true";
        } else {
            return mutable;
        }
    }

    /**
     * Sets the value of the mutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutable(String value) {
        this.mutable = value;
    }

    /**
     * Gets the value of the elementClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementClass() {
        return elementClass;
    }

    /**
     * Sets the value of the elementClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementClass(String value) {
        this.elementClass = value;
    }

    /**
     * Gets the value of the cascade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascade(String value) {
        this.cascade = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchSize(String value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the outerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterJoin() {
        return outerJoin;
    }

    /**
     * Sets the value of the outerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterJoin(String value) {
        this.outerJoin = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetch(String value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the persister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersister() {
        return persister;
    }

    /**
     * Sets the value of the persister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersister(String value) {
        this.persister = value;
    }

    /**
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionType(String value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(String value) {
        this.check = value;
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

    /**
     * Gets the value of the embedXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbedXml() {
        if (embedXml == null) {
            return "true";
        } else {
            return embedXml;
        }
    }

    /**
     * Sets the value of the embedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbedXml(String value) {
        this.embedXml = value;
    }

}
