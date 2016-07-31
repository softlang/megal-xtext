package org.softlang.megal.acme;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Test {

	static final private String SCHEMA_LOCATION = "./input/org/softlang/megal/acme/acme.xsd";
	
	static private Schema createSchema (JAXBContext context) throws SAXException, IOException {
		
		File file = new File(SCHEMA_LOCATION);
		
		context.generateSchema(new SchemaOutputResolver(){

			@Override
			public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException {
		        
		        StreamResult result = new StreamResult(file);
		        result.setSystemId(file.toURI().toURL().toString());
		        return result;
		        
		    }
			
		});
		
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = factory.newSchema(file);
		
		return schema;
		
	}
	
	static private Company createSampleCompany () {
		
		Company c = new Company();
		c.setName("ACME");
		
		Department d = new Department();
		d.setName("Research");
		
		c.addDepartment(d);
		
		return c;
		
	}
	
	static public void main(String[] args) {
		
		try {
			
			JAXBContext companyContext = JAXBContext.newInstance(Company.class);
			
			Schema schema = createSchema(companyContext);
			
			Marshaller m = companyContext.createMarshaller();
			m.setSchema(schema);
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, SCHEMA_LOCATION);
			
			m.marshal(createSampleCompany(), System.out);
			
			
		} catch (JAXBException | IOException | SAXException e) {

			e.printStackTrace();

		}

	}

}
