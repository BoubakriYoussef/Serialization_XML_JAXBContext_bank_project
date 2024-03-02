package emsi.miage;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Releve {
    public String rib;
    public Date dateReleve;

    public double solde;

    @XmlElement(name="operation")
    public List<Operation> operationList = new ArrayList<>();
}
