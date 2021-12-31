package hu.me.iit.szakdolgozat.Service;

import java.util.List;

public interface SzakdolgozatService {

    SzakdolgozatServiceDTO createSzakdolgozat(SzakdolgozatServiceDTO toSzakdolgozatServiceDTO);

    void updateSzakdolgozat(SzakdolgozatServiceDTO szakdolgozatDTO);

    void deleteByIdSzakdolgozat(Long id);

    List<SzakdolgozatServiceDTO> findAllSzakdolgozat();

    List<SzakdolgozatServiceDTO> findByCimEquals(String cim);
}
