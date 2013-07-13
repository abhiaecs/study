//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.11 at 06:17:31 PM CST 
//


package juno.hibernate3;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}identifier-generator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}typedef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}filter-def" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}import" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}class"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}subclass"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}joined-subclass"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}union-subclass"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}resultset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}query"/>
 *           &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}sql-query"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}fetch-profile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.hibernate.org/xsd/hibernate-mapping}database-object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/hibernate-mapping}attlist.hibernate-mapping"/>
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
    "identifierGenerator",
    "typedef",
    "filterDef",
    "_import",
    "clazzOrSubclassOrJoinedSubclass",
    "resultset",
    "queryOrSqlQuery",
    "fetchProfile",
    "databaseObject"
})
@XmlRootElement(name = "hibernate-mapping")
public class HibernateMapping {

    protected List<Meta> meta;
    @XmlElement(name = "identifier-generator")
    protected List<IdentifierGenerator> identifierGenerator;
    protected List<Typedef> typedef;
    @XmlElement(name = "filter-def")
    protected List<FilterDef> filterDef;
    @XmlElement(name = "import")
    protected List<Import> _import;
    @XmlElements({
        @XmlElement(name = "class", type = Class.class),
        @XmlElement(name = "union-subclass", type = UnionSubclass.class),
        @XmlElement(name = "joined-subclass", type = JoinedSubclass.class),
        @XmlElement(name = "subclass", type = Subclass.class)
    })
    protected List<Object> clazzOrSubclassOrJoinedSubclass;
    protected List<Resultset> resultset;
    @XmlElements({
        @XmlElement(name = "sql-query", type = SqlQuery.class),
        @XmlElement(name = "query", type = Query.class)
    })
    protected List<Object> queryOrSqlQuery;
    @XmlElement(name = "fetch-profile")
    protected List<FetchProfile> fetchProfile;
    @XmlElement(name = "database-object")
    protected List<DatabaseObject> databaseObject;
    @XmlAttribute(name = "schema")
    @XmlSchemaType(name = "anySimpleType")
    protected String schema;
    @XmlAttribute(name = "catalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String catalog;
    @XmlAttribute(name = "default-cascade")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultCascade;
    @XmlAttribute(name = "default-access")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultAccess;
    @XmlAttribute(name = "default-lazy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultLazy;
    @XmlAttribute(name = "auto-import")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoImport;
    @XmlAttribute(name = "package")
    @XmlSchemaType(name = "anySimpleType")
    protected String _package;

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
     * Gets the value of the identifierGenerator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifierGenerator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifierGenerator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierGenerator }
     * 
     * 
     */
    public List<IdentifierGenerator> getIdentifierGenerator() {
        if (identifierGenerator == null) {
            identifierGenerator = new ArrayList<IdentifierGenerator>();
        }
        return this.identifierGenerator;
    }

    /**
     * Gets the value of the typedef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typedef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypedef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Typedef }
     * 
     * 
     */
    public List<Typedef> getTypedef() {
        if (typedef == null) {
            typedef = new ArrayList<Typedef>();
        }
        return this.typedef;
    }

    /**
     * Gets the value of the filterDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterDef }
     * 
     * 
     */
    public List<FilterDef> getFilterDef() {
        if (filterDef == null) {
            filterDef = new ArrayList<FilterDef>();
        }
        return this.filterDef;
    }

    /**
     * Gets the value of the import property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the import property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Import }
     * 
     * 
     */
    public List<Import> getImport() {
        if (_import == null) {
            _import = new ArrayList<Import>();
        }
        return this._import;
    }

    /**
     * Gets the value of the clazzOrSubclassOrJoinedSubclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzOrSubclassOrJoinedSubclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzOrSubclassOrJoinedSubclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * {@link UnionSubclass }
     * {@link JoinedSubclass }
     * {@link Subclass }
     * 
     * 
     */
    public List<Object> getClazzOrSubclassOrJoinedSubclass() {
        if (clazzOrSubclassOrJoinedSubclass == null) {
            clazzOrSubclassOrJoinedSubclass = new ArrayList<Object>();
        }
        return this.clazzOrSubclassOrJoinedSubclass;
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
    public List<Resultset> getResultset() {
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
    public List<Object> getQueryOrSqlQuery() {
        if (queryOrSqlQuery == null) {
            queryOrSqlQuery = new ArrayList<Object>();
        }
        return this.queryOrSqlQuery;
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
    public List<FetchProfile> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<FetchProfile>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the databaseObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseObject }
     * 
     * 
     */
    public List<DatabaseObject> getDatabaseObject() {
        if (databaseObject == null) {
            databaseObject = new ArrayList<DatabaseObject>();
        }
        return this.databaseObject;
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
     * Gets the value of the defaultCascade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCascade() {
        if (defaultCascade == null) {
            return "none";
        } else {
            return defaultCascade;
        }
    }

    /**
     * Sets the value of the defaultCascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCascade(String value) {
        this.defaultCascade = value;
    }

    /**
     * Gets the value of the defaultAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAccess() {
        if (defaultAccess == null) {
            return "property";
        } else {
            return defaultAccess;
        }
    }

    /**
     * Sets the value of the defaultAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAccess(String value) {
        this.defaultAccess = value;
    }

    /**
     * Gets the value of the defaultLazy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLazy() {
        if (defaultLazy == null) {
            return "true";
        } else {
            return defaultLazy;
        }
    }

    /**
     * Sets the value of the defaultLazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLazy(String value) {
        this.defaultLazy = value;
    }

    /**
     * Gets the value of the autoImport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoImport() {
        if (autoImport == null) {
            return "true";
        } else {
            return autoImport;
        }
    }

    /**
     * Sets the value of the autoImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoImport(String value) {
        this.autoImport = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

}
