package hu.me.iit.szakdolgozat.Service;

import hu.me.iit.szakdolgozat.Repository.SzakdolgozatEntity;
import hu.me.iit.szakdolgozat.Repository.SzakdolgozatRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SzakdolgozatServiceImpl implements SzakdolgozatService {
    private final SzakdolgozatRepository szakdolgozatRepository;

    public SzakdolgozatServiceImpl(SzakdolgozatRepository szakdolgozatRepository) {
        this.szakdolgozatRepository = szakdolgozatRepository;
    }

    @Override
    public SzakdolgozatServiceDTO createSzakdolgozat(SzakdolgozatServiceDTO toSzakdolgozatServiceDTO) {
        return new SzakdolgozatServiceDTO(szakdolgozatRepository.save(toSzakdolgozatServiceDTO.toEntity()));
    }

    @Override
    public void updateSzakdolgozat(SzakdolgozatServiceDTO szakdolgozatDTO) {
        Optional<SzakdolgozatEntity> szakdolgozatEntity= szakdolgozatRepository.findById(szakdolgozatDTO.getId());
        if(szakdolgozatEntity.isEmpty()){
            throw new NoSuchElementException();
        }else {
            szakdolgozatRepository.save(szakdolgozatDTO.toEntity());
        }
    }

    @Override
    public void deleteByIdSzakdolgozat(Long id) {
        try {
            szakdolgozatRepository.deleteById(id);
        }catch (EmptyResultDataAccessException E){
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<SzakdolgozatServiceDTO> findAllSzakdolgozat() {
        List<SzakdolgozatServiceDTO> szakdolgozatok = new ArrayList<>();
        for(SzakdolgozatEntity szakdolgozatEntity : szakdolgozatRepository.findAll()){
            szakdolgozatok.add(new SzakdolgozatServiceDTO(szakdolgozatEntity));
        }
        return szakdolgozatok;
    }

    @Override
    public List<SzakdolgozatServiceDTO> findByCimEquals(String cim) {
        List<SzakdolgozatServiceDTO> szakdolgozatok = new ArrayList<>();
        for(SzakdolgozatEntity szakdolgozatEntity : szakdolgozatRepository.findByCimEquals(cim)){
            szakdolgozatok.add(new SzakdolgozatServiceDTO(szakdolgozatEntity));
        }
        return szakdolgozatok;
    }
}
