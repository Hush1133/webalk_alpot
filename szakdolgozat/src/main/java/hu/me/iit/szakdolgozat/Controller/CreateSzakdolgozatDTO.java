package hu.me.iit.szakdolgozat.Controller;

import hu.me.iit.szakdolgozat.Service.SzakdolgozatServiceDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateSzakdolgozatDTO {
    @NotEmpty
    private String szerzo;
    @NotEmpty
    private String cim;
    @NotNull
    private int terjedelem;
    @NotEmpty
    private String tema;

    public CreateSzakdolgozatDTO(String szerzo, String cim, int terjedelem, String tema) {
        this.szerzo = szerzo;
        this.cim = cim;
        this.terjedelem = terjedelem;
        this.tema = tema;
    }

    public CreateSzakdolgozatDTO() {
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

    public SzakdolgozatServiceDTO toService() {return new SzakdolgozatServiceDTO(null,szerzo,cim,terjedelem,tema);}
}
