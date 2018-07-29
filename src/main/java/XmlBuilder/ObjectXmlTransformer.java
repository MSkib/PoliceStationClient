package XmlBuilder;

import clientservice.Citizen;
import clientservice.PoliceClient;
import org.w3c.dom.Document;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

public class ObjectXmlTransformer {

    private JAXBContext context;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    private Object obj;
    private String xml;
    StringWriter sw;

    public String objectToXml(Object obj) {
        try {
            // ?????????
            context = JAXBContext.newInstance(obj.getClass());
            marshaller = context.createMarshaller();

            sw = new StringWriter();
            marshaller.marshal(obj, sw);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return sw.toString();
    }

    public Object xmlToObject(String xml, Class clazz) {
        try {
            context = JAXBContext.newInstance(clazz);
            unmarshaller = context.createUnmarshaller();

            this.obj = JAXB.unmarshal(new StringReader(xml), clazz);


        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return obj;
    }
}