package eclipse.mapping;

import hbm.ColumnElement;
import hbm.HibernateMapping;
import hbm.Property;
import hbm.Query;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

import db.Column;
import db.Table;

public class JavaToHbm {
	public void marshalXMLDocument(File xmlDocument) {
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(HibernateMapping.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output",
					Boolean.valueOf(true));

			String declaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n";
			String docType = "<!DOCTYPE hibernate-mapping PUBLIC \r\n \"-//Hibernate/Hibernate Mapping DTD 3.0//EN\" \r\n \"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd\">\r\n";

			marshaller.setProperty("jaxb.encoding", "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

			// marshaller.setProperty("com.sun.xml.bind.xmlHeaders", declaration
			// + docType);

			marshaller.setProperty(CharacterEscapeHandler.class.getName(),
					new CharacterEscapeHandler() {
						@Override
						public void escape(char[] ac, int i, int j,
								boolean flag, Writer writer) throws IOException {
							writer.write(ac, i, j);
						}

					});

			HibernateMapping hbm = new HibernateMapping();
			List<Object> clazz = new ArrayList();

			hbm.Class mappingClass = new hbm.Class();

			String tableName = "EVENT";
			DbToJava db2XML = new DbToJava();
			Table eventTable = db2XML.reverseTable(tableName);

			mappingClass.setName("dto.Event");
			mappingClass.setTable(eventTable.getName());

			List<Object> properties = new ArrayList();
			Property p = null;
			ColumnElement ce = null;
			for (Column c : eventTable.getColumns()) {
				p = new Property();
				ce = new ColumnElement();

				p.setName(c.getName());
				p.setType(c.getType());

				ce.setName(c.getName());
				ce.setLength(String.valueOf(c.getSize()));
				ce.setPrecision(String.valueOf(c.getDecimalDigits()));

				p.getColumnElementOrFormulaElement().add(ce);
				properties.add(p);
			}			

			mappingClass.getPropertyOrManyToOneOrOneToOne().addAll(properties);

			clazz.add(mappingClass);

			List<Object> queryOrSqlQuery = new ArrayList();
			Query query1 = new Query();
			query1.setName("hqlGetEventById");
			// query1.setContent("<![CDTATA[from Event as e where e.id = :id]]>");
			query1.setContent("from Event as e where e.id = :id");
			queryOrSqlQuery.add(query1);

			hbm.setClazzOrSubclassOrJoinedSubclass(clazz);
			hbm.setQueryOrSqlQuery(queryOrSqlQuery);

			FileOutputStream fos = new FileOutputStream(xmlDocument);
			OutputStreamWriter out = new OutputStreamWriter(fos, "UTF-8");
			out.write(declaration);
			out.write(docType);
			// marshaller.marshal(hbm, new OutputStreamWriter(fos, "UTF-8"));
			marshaller.marshal(hbm, out);
		} catch (IOException e) {
			System.err.println(e.toString());
		} catch (PropertyException e) {
			System.err.println(e.toString());
		} catch (JAXBException e) {
			System.err.println(e.toString());
		}
	}

	public static void main(String[] argv) {
		String xmlDocument = "src/event.hbm.xml";
		JavaToHbm javaToHbm = new JavaToHbm();
		javaToHbm.marshalXMLDocument(new File(xmlDocument));
	}
}
