package emsi.miage;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws JAXBException {
        Releve releve = new Releve();
        releve.rib="4232";
        releve.dateReleve=new Date();
        releve.solde=7600;
        releve.operationList.add(new Operation("DEBIT", new Date(), 288, "Desc"));
        releve.operationList.add(new Operation("CREDIT", new Date(), 5400, "Asc"));
        releve.operationList.add(new Operation("DEBIT", new Date(), 988, "Desc"));

        // Initialize an object of the class Operation
        //Define which class will get serialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        //Serialization or Convert a Java Object to XML
        Marshaller marshaller = jaxbContext.createMarshaller();
        //Activate well done output format
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve, new File("releve.xml"));
    }
}
