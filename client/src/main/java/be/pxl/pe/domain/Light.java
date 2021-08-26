package be.pxl.pe.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Light implements Serializable {

    private Long id;


    private String naam;


    private Kamer kamer;


    private String isAan;

    public Light(){

    }

    public Light(String naam, Kamer kamer, String isAan) {
        this.naam = naam;
        this.isAan=isAan;
        this.kamer=kamer;
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public String getIsAan() {
        return isAan;
    }

    public void setIsAan(String isAan) {
        this.isAan = isAan;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Kamer getKamer() {
        return kamer;
    }

    public void setKamer(Kamer kamer) {
        this.kamer = kamer;
    }

    public String isAan() {
        return isAan;
    }

    public void setAan(String aan) {
        isAan = aan;
    }


    public void woonkamerLightAaan(Kamer kamer){
        if(kamer.getNaam().equals(("Woonkamer"))){
            setIsAan("aan");
        }

    }

    @Override
    public String toString() {
        return "Light{" +id +" "+  naam + ' ' + isAan+ " " +kamer.getId()+ '}';
    }

}
