package hu.me.iit.szakdolgozat.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SzakdolgozatEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String szerzo;
    private String cim;
    private int terjedelem;
    private String tema;

    public SzakdolgozatEntity(Long id, String szerzo, String cim, int terjedelem, String tema) {
        this.id = id;
        this.szerzo = szerzo;
        this.cim = cim;
        this.terjedelem = terjedelem;
        this.tema = tema;
    }

    public SzakdolgozatEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getTerjedelem() {
        return terjedelem;
    }

    public void setTerjedelem(int terjedelem) {
        this.terjedelem = terjedelem;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
