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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}meta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}subselect-element" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}synchronize" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}comment" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}tuplizer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}property"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}many-to-one"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}one-to-one"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}component"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}dynamic-component"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}properties"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}any"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}map"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}set"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}list"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}bag"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}idbag"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}array"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}primitive-array"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}union-subclass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}loader" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}fetch-profile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}resultset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}query"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-query"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.union-subclass"/>
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
    "synchronize",
    "comment",
    "tuplizer",
    "propertyOrManyToOneOrOneToOne",
    "unionSubclass",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "fetchProfile",
    "resultset",
    "queryOrSqlQuery"
})
@XmlRootElement(name = "union-subclass")
public class UnionSubclass {

    protected java.util.List<Meta> meta;
    @XmlElement(name = "subselect-element")
    protected String subselectElement;
    protected java.util.List<Synchronize> synchronize;
    protected String comment;
    protected java.util.List<Tuplizer> tuplizer;
    @XmlElements({
        @XmlElement(name = "idbag", type = Idbag.class),
        @XmlElement(name = "one-to-one", type = OneToOne.class),
        @XmlElement(name = "list", type = kepler.hibernate3.List.class),
        @XmlElement(name = "bag", type = Bag.class),
        @XmlElement(name = "primitive-array", type = PrimitiveArray.class),
        @XmlElement(name = "properties", type = Properties.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "property", type = Property.class),
        @XmlElement(name = "map", type = Map.class),
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "component", type = Component.class),
        @XmlElement(name = "any", type = Any.class),
        @XmlElement(name = "dynamic-component", type = DynamicComponent.class),
        @XmlElement(name = "many-to-one", type = ManyToOne.class)
    })
    protected java.util.List<Object> propertyOrManyToOneOrOneToOne;
    @XmlElement(name = "union-subclass")
    protected java.util.List<UnionSubclass> unionSubclass;
    protected Loader loader;
    @XmlElement(name = "sql-insert")
    protected SqlInsert sqlInsert;
    @XmlElement(name = "sql-update")
    protected SqlUpdate sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected SqlDelete sqlDelete;
    @XmlElement(name = "fetch-profile")
    protected java.util.List<FetchProfile> fetchProfile;
    protected java.util.List<Resultset> resultset;
    @XmlElements({
        @XmlElement(name = "sql-query", type = SqlQuery.class),
        @XmlElement(name = "query", type = Query.class)
    })
    protected java.util.List<Object> queryOrSqlQuery;
    @XmlAttribute(name = "entity-name")
    @XmlSchemaType(name = "anySimpleType")
    protected String entityName;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "proxy")
    @XmlSchemaType(name = "anySimpleType")
    protected String proxy;
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
    @XmlAttribute(name = "dynamic-update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dynamicUpdate;
    @XmlAttribute(name = "dynamic-insert")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dynamicInsert;
    @XmlAttribute(name = "select-before-update")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectBeforeUpdate;
    @XmlAttribute(name = "extends")
    @XmlSchemaType(name = "anySimpleType")
    protected String _extends;
    @XmlAttribute(name = "lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lazy;
    @XmlAttribute(name = "abstract")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _abstract;
    @XmlAttribute(name = "persister")
    @XmlSchemaType(name = "anySimpleType")
    protected String persister;
    @XmlAttribute(name = "check")
    @XmlSchemaType(name = "anySimpleType")
    protected String check;
    @XmlAttribute(name = "batch-size")
    @XmlSchemaType(name = "anySimpleType")
    protected String batchSize;
    @XmlAttribute(name = "node")
    @XmlSchemaType(name = "anySimpleType")
    protected String node;

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
    public java.util.List<Meta> getMeta() {
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
    public java.util.List<Synchronize> getSynchronize() {
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
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tuplizer }
     * 
     * 
     */
    public java.util.List<Tuplizer> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<Tuplizer>();
        }
        return this.tuplizer;
    }

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
     * {@link Idbag }
     * {@link OneToOne }
     * {@link kepler.hibernate3.List }
     * {@link Bag }
     * {@link PrimitiveArray }
     * {@link Properties }
     * {@link Set }
     * {@link Property }
     * {@link Map }
     * {@link Array }
     * {@link Component }
     * {@link Any }
     * {@link DynamicComponent }
     * {@link ManyToOne }
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
     * Gets the value of the unionSubclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unionSubclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnionSubclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnionSubclass }
     * 
     * 
     */
    public java.util.List<UnionSubclass> getUnionSubclass() {
        if (unionSubclass == null) {
            unionSubclass = new ArrayList<UnionSubclass>();
        }
        return this.unionSubclass;
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
     * Gets the value of the fetchProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fetchProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFetchProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FetchProfile }
     * 
     * 
     */
    public java.util.List<FetchProfile> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<FetchProfile>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the resultset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resultset }
     * 
     * 
     */
    public java.util.List<Resultset> getResultset() {
        if (resultset == null) {
            resultset = new ArrayList<Resultset>();
        }
        return this.resultset;
    }

    /**
     * Gets the value of the queryOrSqlQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryOrSqlQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOrSqlQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqlQuery }
     * {@link Query }
     * 
     * 
     */
    public java.util.List<Object> getQueryOrSqlQuery() {
        if (queryOrSqlQuery == null) {
            queryOrSqlQuery = new ArrayList<Object>();
        }
        return this.queryOrSqlQuery;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
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
     * Gets the value of the proxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Sets the value of the proxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxy(String value) {
        this.proxy = value;
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
     * Gets the value of the dynamicUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicUpdate() {
        if (dynamicUpdate == null) {
            return "false";
        } else {
            return dynamicUpdate;
        }
    }

    /**
     * Sets the value of the dynamicUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicUpdate(String value) {
        this.dynamicUpdate = value;
    }

    /**
     * Gets the value of the dynamicInsert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicInsert() {
        if (dynamicInsert == null) {
            return "false";
        } else {
            return dynamicInsert;
        }
    }

    /**
     * Sets the value of the dynamicInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicInsert(String value) {
        this.dynamicInsert = value;
    }

    /**
     * Gets the value of the selectBeforeUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectBeforeUpdate() {
        if (selectBeforeUpdate == null) {
            return "false";
        } else {
            return selectBeforeUpdate;
        }
    }

    /**
     * Sets the value of the selectBeforeUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectBeforeUpdate(String value) {
        this.selectBeforeUpdate = value;
    }

    /**
     * Gets the value of the extends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtends() {
        return _extends;
    }

    /**
     * Sets the value of the extends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtends(String value) {
        this._extends = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLazy() {
        return lazy;
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLazy(String value) {
        this.lazy = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
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
