package hu.me.iit.szakdolgozat.Service;

import hu.me.iit.szakdolgozat.Repository.SzakdolgozatEntity;

public class SzakdolgozatServiceDTO {

    private Long id;
    private String szerzo;
    private String cim;
    private int terjedelem;
    private String tema;

    public SzakdolgozatServiceDTO(Long id, String szerzo, String cim, int terjedelem, String tema) {
        this.id = id;
        this.szerzo = szerzo;
        this.cim = cim;
        this.terjedelem = terjedelem;
        this.tema = tema;
    }

    public SzakdolgozatServiceDTO() {
    }

    public SzakdolgozatServiceDTO(SzakdolgozatEntity szakdolgozat) {
        this.id = szakdolgozat.getId();
        this.szerzo = szakdolgozat.getSzerzo();
        this.cim = szakdolgozat.getCim();
        this.terjedelem = szakdolgozat.getTerjedelem();
        this.tema = szakdolgozat.getTema();
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

    public SzakdolgozatEntity toEntity(){return  new SzakdolgozatEntity(id,szerzo,cim,terjedelem,tema);}
}
