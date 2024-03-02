package emsi.miage;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class Test2 {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("RIB :" + releve.rib);
        System.out.println("Solde :" + releve.solde);
        System.out.println("dateReleve :" + releve.dateReleve);
        releve.operationList.forEach(op->{
            System.out.println(op.getType()+"\t"+op.getMontant()+"\t"+op.getDate()+"\t"+op.getDescription());
        });
    }
}
