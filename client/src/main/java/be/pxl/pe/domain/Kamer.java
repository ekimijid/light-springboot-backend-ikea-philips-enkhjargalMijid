package be.pxl.pe.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement
public class Kamer implements Serializable {

    private Long id;


    private String naam;


    private Set<Light> lights = new HashSet<Light>();

    public Kamer() {
    }

    public Kamer(long l, String naam) {
        this.id = l;
        this.naam = naam;
    }

    public Kamer(String naam) {
        this.naam = naam;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Set<Light> getLights() {
        return lights;
    }

    public void setLights(Set<Light> lights) {
        this.lights = lights;
    }

    public void addLight(Light light){
        lights.add(light);
    }



   @Override
    public String toString() {
        return "Kamer{" + "Id"+ id+ '\''+
                ", naam='" + naam + '\''+ lights+
                '}';
    }

}

